node {
    checkout scm
    stage('Preparation') {
        gradleHome = tool 'gradle-3.5'
    }
    try {
        stage('Build') {
          sh "'${gradleHome}/bin/gradle' build"
        }
        stage('QA') {
            sh "'${gradleHome}/bin/gradle' sonarqube"
        }
    } finally {
        junit '${WORKSPACE}/build/test-results/test/TEST-*.xml'
        archive '${WORKSPACE}//build/libs/*.war'
        deleteDir()
    }
}