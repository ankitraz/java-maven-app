def build(){
    echo "Building the application..."
    sh 'mvn package'
}

def Buildimage(){
    echo "Building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub-id-pass', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]){
        sh 'docker login -u $DOCKER_USER -p $DOCKER_PASS'
        sh 'docker build -t ankitraz/myapp:ank-1.0 .'
        sh 'docker push ankitraz/myapp:ank-1.0'
    }

def test(){
    echo "Testing the application..."
}

def deploy(){
    echo "Deploying the application..."
}

return this