pipeline {
	agent any
	stages{
		stage("build"){
			echo 'build stage'
			sh 'make'
			archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
		}
	}
}
