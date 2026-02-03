pipeline {
  agent any {
    tools {
      maven "3.9.12"
    }
    stages {
      stage('Clean and install'){
        steps {
          bat 'mvn clean install'
        }
      }
      stage('Package')
      {
        steps {
          bat 'mvn package'
        }
      }
    }
  }
}
