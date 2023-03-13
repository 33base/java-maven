pipeline {

  agent any

  stages{

      stage("build") {

        steps{
        echo 'building the aplication'
        }
      }

      stage("test"){
        when {
          expression {
              env.BRANCH_NAME == 'dev' || env.BRANCH_NAME == 'main'
          }
        }
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