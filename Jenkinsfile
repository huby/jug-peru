pipeline {
  agent {
    docker {
      image 'jboss/wildfly'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh '''node --version
npm install'''
      }
    }
    stage('Test') {
      steps {
        sh '''npm run acceptance:tests
'''
      }
    }
  }
}