/* groovylint-disable CompileStatic */
/*
Just a basic jenkins file to practive CI/CD with jenkins
*/
pipeline {
    agent any
    stages {
        /*
        - The build stage is where all the work begins
        - This is where the code is assmbled, compiled or packaged
        */
        stage('Build') {
            steps {
                echo 'building'
            }
        }
        stage('Test') {
            steps {
                echo 'testing'
                sh 'python3 -m unittest test_two_sum.py'
            }
        }
        stage('Deploy') {
            steps {
                echo 'in deployment'
            }
        }
    }
}
