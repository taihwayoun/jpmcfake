pipeline {
	agent any
	stages{
		stage("compile"){
			steps{
				echo 'build stage'
				sh 'mvn compile'
				archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
				
			}
		}
		stage("test"){
			echo 'test stage'
			sh 'mvn test'
		}
	}
}
