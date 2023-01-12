def gv

pipeline{
    agent any


    stages{
        stage("init"){
            steps{
                gv = load "script.groovy"
            }
        }

        stage("Build"){
            steps{
                echo "Building the application..."
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