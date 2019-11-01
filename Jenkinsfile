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
        sh '''./gradlew build
./gradlew build
$JBOSS_HOME/bin/jboss-cli.sh -c --user=admin --password=Admin#70365 --command="deploy ./build/libs/demo1-0.0.1-SNAPSHOT.war --force"
'''
      }
    }
  }
}