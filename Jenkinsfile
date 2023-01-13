#!/usr/bin/env groovy
@Library('jenkins-shared-library')
//note : if you don't have a def then you will have to add _ after closing bracket of @library
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
                    gv = load "script.groovy"
                }
                
            }
        }

        stage("Build"){
            steps{
                script{
                    buildJar()
                }
            }
        }

        stage("Build and push Image"){
            steps{
                script{
                    buildImage 'ankitraz/myapp:1.0'
                    dockerLogin()
                    dockerPush 'ankitraz/myapp:1.0'
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