def buildApp() {
    echo 'building the aplication'
}


def testApp() {
    echo 'testing the aplication'
}


def deployApp() {
    echo 'Hello learning jenkins is cool!!'
    echo "deploying version ${params.VERSION}"
}

return this
