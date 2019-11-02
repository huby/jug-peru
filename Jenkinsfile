pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''cd demo1
./gradlew test'''
      }
    }
    stage('Test') {
      steps {
        sh '''cd demo1
./gradlew build
'''
      }
    }
    stage('deploy') {
      steps {
        sh './opt/wildfly-18.0.0.Final/bin/jboss-cli.sh -c --controller=172.18.0.3:9990 --user=admin --password=Admin#70365 --command="deploy ./build/libs/demo1-0.0.1-SNAPSHOT.war --force"'
      }
    }
  }
}