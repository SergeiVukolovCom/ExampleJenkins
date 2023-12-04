pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "mvn -version"
                sh "mvn clean install"
            }
        }

        stage('Test') {
            steps {
                sh "mvn test"
            }
        }

        stage('Allure Report') {
            steps {
                script {
                    sh "mvn allure:report"
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'target/allure-results']]
                    ])
                }
            }
        }
    }
}
