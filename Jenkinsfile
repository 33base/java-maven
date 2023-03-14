
pipeline {
  agent any
  tools {
      maven 'maven-3.9'
  }

  stages{
      
      stage("build jar") {
        steps{
          script{
            echo 'building the aplication'
            sh 'mvn package'

          }
        }
      }
      
      stage("build image") {
        steps{
          script{
            echo 'building the docker image'
            withCredentials ([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
              sh 'docker build -t 33base/myrepo:jma-2.0 .'
              sh "docker login -u $USER --password-stdin <(echo $PASS)"
              sh 'docker push 33base/myrepo:jma-2.0'
            }
          }
        }
      }
    

      stage ("deploy"){
        steps{
          script{
            echo 'deploying the aplication'
          }
        }     
      }

  }
}
