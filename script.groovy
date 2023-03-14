def buildJar() {
    echo 'building the aplication'
    sh 'mvn package'
}

def buildImage() {
    echo 'building the docker image'
    withCredentials ([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
            sh 'docker build -t 33base/myrepo:jma-2.0 .'
            sh "echo $PASS | docker login -u $USER --password-stdin"
            sh 'docker push 33base/myrepo:jma-2.0'
    }
}
def testApp() {
    echo 'testing the aplication'
}


def deployApp() {
    echo 'Hello learning jenkins is cool!!'
}

return this
