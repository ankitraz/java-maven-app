#!/usr/bin/env groovy
library identifier: 'jenkins-shared-library@master', retriever: modernSCM(
    [$class: 'GitSCMSource',
    remote: 'https://gitlab.com/ankit241/jenkins-shared-library.git',
    credentialsId: 'gitlab-id-pass'
    ]
)

def gv

pipeline{
    agent any

    tools{
        maven 'maven-3.8.7'
    }

    stages{

        stage("init"){
            steps{
                script{
                    gv = load 'script.groovy'
                }
            }
        }

        stage("Build Jar"){
            steps{
                script{
                    buildJar()
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

        stage("Build Docker image"){
            steps{
                script{
                    buildImage 'ankitraz/myapp:1.0'
                    dockerLogin()
                    dockerPush 'ankitraz/myapp:1.0'
                }
            }
        }

        stage("Deploy to EC2"){
            steps{
                script{
                    deploytoec2()
                }
            }
        }
    }
}