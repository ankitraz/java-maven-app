pipeline{
    agent any

    tools{
        maven 'maven-3.8.7'
    }
    

    stages{
        stage("Build jar"){
            steps{
                echo "Building the application..."
                sh 'mvn package'
            }
        }

        stage("Build docker image"){
            steps{
                echo "Building the docker image..."
                withCredentials([usernamePassword(credentialsId: 'af5367d3-fa1c-4d74-8d24-89f3e39aa3c8', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]){
                    sh 'docker login -u $DOCKER_USER -p $DOCKER_PASS'
                    sh 'docker build -t ankitraz/myapp:ank-1.0 .'
                    sh 'docker push ankitraz/myapp:ank-1.0'
                }
            }
        }

        stage("Test"){
            steps{
                echo "Testing the application..."
            }
        }

        stage("Deploy"){
            steps{
                echo "Deploying the application..."
                echo "Version: anki-1.0"
            }
        }
    }
}