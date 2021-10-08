pipeline{
  agent any
  tools{
  maven 'mvn'
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
