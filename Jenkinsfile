pipeline{
    agent any


    stages{
        stage("Build"){

            when{
                expression{
                    BRANCH_NAME == 'master'
                }
            }

            steps{
                echo "Building the application..."
            }
        }

        stage("Test"){
            steps{
                echo "Testing the application..."
                echo "Executing pipeline for branch ${BRANCH_NAME}"
            }
        }

        stage("Deploy"){
            when{
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            
            steps{
                echo "Deploying the application..."
            }
        }
    }
}