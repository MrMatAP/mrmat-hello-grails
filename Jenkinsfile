node {
    stage('Preparation') {
        gradleHome = tool 'gradle-3.5'
    }
    stage('Build') {
      sh "'${gradleHome}/bin/gradle' build"
    }
    stage('Results') {
      junit 'build/test-reports/TEST-*.xml'
      archive 'build/libs/*.war'
   }
}}