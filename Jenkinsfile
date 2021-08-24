pipeline {
	agent any
	stages{
		stage("build"){
			steps{
				echo 'build stage'
				echo "running ${env.BUILD_ID} on ${env.JENKINS_URL}"
				sh 'mvn -B -DskipTests clean package'
				archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
				
			}
		}
		stage("test"){
			steps{
				echo 'test stage'
				sh 'mvn test'
			
			}
		}
		stage('deploy'){
			when {
				expression {
					currentBuild.result==null || currentBuild.result=='SUCCESS'
				}
			}
			steps {
				echo 'Deloyment ready'
		}
	}
}
}
