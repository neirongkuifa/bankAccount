pipeline{
    agent any
    tools{
        maven 'maven' 
    }
    stages{
        stage("Source"){
            steps{
                mvn "clean"
                sh "git clone https://github.com/neirongkuifa/bankAccount.git"
            }
        }

        stage("Package"){
            steps{
                mvn "package"
            }
        }
    }
}