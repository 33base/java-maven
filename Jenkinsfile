pipeline {
  agent any
  environment {
    NEW_VERSION = '1.4.0'
  }
  parameters {
    
    choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
    booleanParam(name: 'executeTests', defaultValue: true, description: '')
  }
  stages{

      stage("build") {

        steps{
        echo 'building the aplication'
        echo "building the version ${NEW_VERSION}"
        }
      }

      stage("test"){
        when {
          expression {
            params.executeTests == true
          }
        }
        
        steps{
          echo 'testing the aplication'
        }
      }

      stage ("deploy"){
        steps{
          echo 'Hello learning jenkins is cool!!'
          echo "deploying version ${VERSION}"
        }
      }
      
  }

  post {
    
    success {
      echo 'Cool!'
    }
    failure {
      echo 'Ups!'
    }

  }

}