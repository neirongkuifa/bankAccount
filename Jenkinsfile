pipeline{
    agent any
    tools{
        maven 'apache-maven-3.0.1' 
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