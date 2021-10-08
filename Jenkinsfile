pipeline{
  agent any
  tools{
  maven 'maven'
  }
    stages{
      stage("Build"){
        steps{
          echo "Build"
           sh 'mvn clean compile'
        }
      }
      stage("Deploy"){
        steps{
          echo "Deploy"
        }
      }
    }
} 
