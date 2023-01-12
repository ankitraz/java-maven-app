pipeline{
    agent any

    tools{
        maven 'maven-3.8.7'
    }
    parameters{
        choice(name: 'version', choices: ['1.1.0','1.1.1','1.1.2'], description: 'Select the version to deploy')
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
                withCredentials([usernamePassword(credentialsId: 'c8addfe9-3636-48da-9bdd-9583c2034825', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]){
                    sh 'docker login -u $DOCKER_USER -p $DOCKER_PASS'
                    sh 'docker build -t mymavenapp:${params.version} .'
                    sh 'docker push mymavenapp:${params.version}'
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
                echo "Version: ${params.version}"
            }
        }
    }
}