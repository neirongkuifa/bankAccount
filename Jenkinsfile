pipeline{
    agent any
    stages{
        stage("Source"){
            sh "mvn clean"
            sh "git clone https://github.com/neirongkuifa/bankAccount.git"
        }

        stage("Package"){
            sh "mvn package"
        }
    }
}