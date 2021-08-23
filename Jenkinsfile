pipeline {
	agent any
	stages{
		stage("build"){
			steps{
				echo 'build stage'
				sh 'mvn build'
				archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
				
			}
		}
	}
}
