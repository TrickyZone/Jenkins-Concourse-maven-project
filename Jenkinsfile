pipeline{

  agent {
    label 'Slave2'
  }
  tools{
  maven 'mvn'
  }
    stages{
      stage("Cleanup"){
        steps{
          echo "Build"
           sh 'mvn clean '
        }
      }
      stage("Parallel Build"){
        parallel{
            stage("Compile")
            {
              agent{
                label 'Slave1'
              }
              steps{
                sh 'mvn compile'
              }
            }
            stage("Install"){
              agent{
                label 'Slave2'
              }
              steps{
                sh 'mvn package'
                sh '''
                scp target/*.jar ubuntu@3.136.233.251:/home/ubuntu
                '''
              }
            }
            
        }
        
      }
      
    }
    post{
      success{
        
        sh 'ls'

      }
    }
}