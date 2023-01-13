#!/usr/bin/env groovy
@Library('jenkins-shared-library')
//note : if you don't have a def then you will have to add _ after closing bracket of @library
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
                    buildJar()
                }
            }
        }

        stage("Build Image"){
            steps{
                script{
                    buildImage()
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