node{
    stage('SCM Checkout'){
        git 'https://github.com/IIS-ZPI/ZPI_2019_Dzienni_IO5_EEIAPany'
    }
    stage('Compile-Package'){
        sh 'mvn package'
    }
}
