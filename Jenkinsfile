pipeline {
    agent any 
    stages {
        stage('Checkout') { 
            steps {
                sh 'echo checkout'
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'ba84ca1f-cbe4-48f7-83f7-d99f79c7f000', url: 'https://github.com/devopszhaw/DevOps-03-DevOpsDemo']])
            }
        }
        stage('Test') { 
            steps {
                sh 'echo test'
            }
        }
        stage('Deploy') { 
            steps {
                sh 'echo deploy'
            }
        }
    }
}