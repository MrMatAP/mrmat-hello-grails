node {
    checkout scm
    stage('Preparation') {
        gradleHome = tool 'gradle-3.5'
    }
    stage('Build') {
      sh "'${gradleHome}/bin/gradle' build"
    }
    stage('Results') {
      junit 'build/test-results/TEST-*.xml'
      archive '/build/libs/*.war'
    }
}