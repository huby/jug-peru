pipeline {
  agent {
    docker {
      image 'jboss/wildfly'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh '''cd demo1
./gradlew test'''
      }
    }
    stage('Test') {
      steps {
        sh './gradlew build'
      }
    }
  }
}