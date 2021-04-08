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
        stage('Test2') {
            steps {
                echo 'Executing a test that should fail'
                sh 'python3 -m unittest test_2s_fail.py'
            }
        }
        stage('Deploy') {
            steps {
                echo 'in deployment'
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'Everything went well'
        }
        failure {
            echo 'Something failed'
        }
        unstable {
            echo 'Build marked unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}
