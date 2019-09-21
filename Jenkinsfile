pipeline {
    agent any
    tools {
     maven "Maven_home"
    }
    stages {
        stage('clean-old-files') {
            steps {
                sh "rm -rf simple-maven-jenkins"
            }
        }
        stage('download-src') {
            steps {
                sh "git clone https://github.com/vpradeepkumar94/simple-maven-jenkins.git"
            }
        }
        stage('run test') {
            steps {
                sh "mvn test -f simple-maven-jenkins"
            }
        }
        stage('install') {
            steps {
                sh "mvn install"
            }
        }
    }
}
