pipeline {
  agent {
    docker {
      image 'node:10-alpine'
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