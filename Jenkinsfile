pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "mvn -version"
                sg "mvn clean install"
            }
        }
    }
}
