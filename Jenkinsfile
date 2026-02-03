pipeline {
    agent any

    tools {
        maven-'3.9.12'
    }

    stages {
        stage('Clean & Compile') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }
}
