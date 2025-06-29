def call(Map config = [:]){
	def appName = config.appName ?: 'default-app'
	def dockerImage = config.dockerImage ?: 'noImage'
	def version = config.version ?: 'latest'

	pipeline{
		agent any

		stages {
			stage('Build'){
				echo "building ${appName}"
			}
			stage('Test'){
				echo "Testing Docker image ${dockerImage}"
			}
			stage('Deploy'){
				echo "Deployed version ${version}"
			}
		}
	}
}
