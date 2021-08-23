pipeline {
	agent any
	stages{
		stage("build"){
			steps{
				echo 'build stage'
				sh 'mvn package'
				archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
				
			}
		}
	}
}
