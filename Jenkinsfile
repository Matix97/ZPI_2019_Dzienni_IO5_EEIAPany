


pipeline { 
    agent { docker { image 'maven:3.3.3' } } 
   
    stages { 
        stage('build') { 
            steps { 
                sh 'mvn --version' 
            } 
        } 
     //   stage('test'){
       //     steps{
         //       sh 'echo "Hello Tests"'
                //sh 'mvn clean test'
           // }
        //}
        stage('Test') {
            steps {
                sh 'javac "src\test\app\command\Test.java"'
                
                sh 'java "src\test\app\command\Test"'
            }
             //post {
       // always {
           // archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
          //  junit 'build/reports/**/*.xml'
       // }
       // }
       
    } 



   
    }
}
