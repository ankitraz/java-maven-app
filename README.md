# Java Maven Demo CICD
This repository contains a Java web application that has a simple UI and a CI/CD pipeline set up using Jenkins. The src/main directory contains the source code for the application, including the Java files, HTML templates, and resources such as images and stylesheets.

* The `Dockerfile` is used to build a Docker image for the application, which can then be deployed to a web server. 
* The `Jenkinsfile` defines the pipeline stages for building, testing, and deploying the application, and can be run automatically whenever changes are made to the source code.

* The `script.groovy` file contains additional scripts for the pipeline, such as for logging into a Docker registry and pushing the Docker image to the registry.

Overall, this project demonstrates how to set up a simple CI/CD pipeline for a Java web application using popular tools such as Jenkins and Docker.
