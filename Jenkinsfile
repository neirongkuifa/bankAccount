pipeline{
    agent any
    stages{
        stage("Source"){
            steps{
                sh "/usr/local/bin/mvn clean"
                sh "git clone https://github.com/neirongkuifa/bankAccount.git"
            }
        }

        stage("Package"){
            steps{
                sh "/usr/local/bin/mvn package"
            }
        }
    }
}