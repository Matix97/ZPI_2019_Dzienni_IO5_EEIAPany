


pipeline { 
    agent { docker { image 'maven:3.3.3' } } 

    stages { 
        stage('build') { 
            steps { 
                sh 'mvn --version' 
            } 
        } 
        stage('test'){
            steps{
                sh 'echo "Hello Tests"'
                //sh 'mvn clean test'
            }
        }
    } 
    agent any
    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew check'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
            junit 'build/reports/**/*.xml'
        }
    }
}
