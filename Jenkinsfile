pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '10'))
    }

    tools {
        gradle 'gradle-3.5'
    }

    stages {

        stage('Build') {
            steps {
                sh "./gradlew build"
            }
        }

        stage('QA') {
            steps {
                withSonarQubeEnv {
                    sh "./gradlew clean sonarqube"
                }
            }
        }

    }

    post {
        always {
            junit '${env.WORKSPACE}/build/test-results/test/TEST-*.xml'
            archive '${env.WORKSPACE}//build/libs/*.war'
            deleteDir()
        }
    }
}