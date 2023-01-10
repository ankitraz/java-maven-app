pipeline{
    agent any

    parameters{
        choice(name: 'version', choices: ['1.1.0','1.1.1','1.1.2'], description: 'Select the version to deploy')
    }

    stages{
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