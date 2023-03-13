pipeline {
  agent any
  environment {
    NEW_VERSION = '1.4.0'
  }
  stages{

      stage("build") {

        steps{
        echo 'building the aplication'
        echo "building the version ${NEW_VERSION}"
        }
      }

      stage("test"){
        
        steps{
          echo 'testing the aplication'
        }
      }

      stage ("deploy"){
        steps{
          echo 'Hello learning jenkins is cool!!'
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