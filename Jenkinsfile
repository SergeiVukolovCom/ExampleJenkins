pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "mvn -version"
                sg "mvn clean install"
            }
        }

        stage('Test') {
            steps {
                // Ваши шаги тестирования
            }
        }
    }
}