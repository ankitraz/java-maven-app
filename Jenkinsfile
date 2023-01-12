def gv

pipeline{
    agent any


    stages{
        stage("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
                
            }
        }

        stage("Build"){
            steps{
                script{
                    gv.Build()
                }
            }
        }

        stage("Test"){
            steps{
                script{
                    gv.Test()
                }
            }
        }

        stage("Deploy"){
            steps{
                script{
                    gv.Deploy()
                }
            }
        }
    }
}