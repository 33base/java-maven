def buildApp() {
    echo 'building the aplication'
}

return this 

def testApp() {
    echo 'testing the aplication'
}

return this 

def deployApp() {
    echo 'Hello learning jenkins is cool!!'
    echo "deploying version ${params.VERSION}"

return this 
