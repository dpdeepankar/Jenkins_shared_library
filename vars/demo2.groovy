def call(Map config = [:]){
	def appName = config.appName ?: 'default-app'
	def dockerImage = config.dockerImage ?: 'noImage'
	def version = config.version ?: 'latest'

	pipeline{
		agent any

		stages {
			stage('Build'){
				steps {
					echo "building ${appName}"
				}
			}
			stage('Test'){
				steps{
					echo "Testing Docker image ${dockerImage}"
				}
			}
			stage('Deploy'){
				steps{
					echo "Deployed version ${version}"
				}
			}
		}
	}
}
