
library identifier: 'jenkins-shared-library@master', retriever: modernSCM(
    [$class: 'GitSCMSource',
    remote: 'https://gitlab.com/ankit241/jenkins-shared-library.git',
    credentialsId: 'gitlab-id-pass'
    ]
)



pipeline{
    agent any

    tools{
        maven 'maven-3.8.7'
    }

    stages{

        stage("Build"){
            steps{
                script{
                    buildJar()
                }
            }
        }

        stage("build docker image"){
            steps{
                script{
                    buildImage 'ankitraz/myapp:1.0'
                    dockerLogin()
                    dockerPush 'ankitraz/myapp:1.0'
                }
            }
        }

        stage("Deploy"){
            steps{
                script{
                    deploytoec2()
                    //fixed shared library
                }
            }
        }
    }
}