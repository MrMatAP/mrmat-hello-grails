pipeline {
    agent any

    options {
        buildDiscarder(logRotator(umToKeepStr: '10'))
    }

    tools {
        gradle 'gradle-3.5'
    }

    stages {

        stage('Build') {
            steps {
                sh "gradle build"
            }
        }

        stage('QA') {
            steps {
                sh "gradle sonarqube"
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