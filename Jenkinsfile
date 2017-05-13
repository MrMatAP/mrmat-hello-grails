node {
    checkout scm
    stage('Preparation') {
        gradleHome = tool 'gradle-3.5'
    }
    stage('Build') {
      sh "'${gradleHome}/bin/gradle' build"
    }
    stage('Results') {
      junit '${env.WORKSPACE}/build/test-reports/TEST-*.xml'
      archive '${env.WORKSPACE}/build/libs/*.war'
    }
}