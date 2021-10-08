pipeline{

  agent {
    label 'Slave2'
  }
  tools{
  maven 'mvn'
  }
    stages{
      
      stage("Parallel Build"){
        parallel{
            stage("Compile")
            {
              agent{
                label 'Slave1'
              }
              steps{
                sh 'mvn clean compile'
              }
            }
            stage("Install"){
              agent{
                label 'Slave2'
              }
              steps{
                sh 'mvn package'
                sh 'pwd'
                
              }
            }
            
        }
        
      }
      
    }
    post{
      always{
        
        archiveArtifacts artifacts: '/home/ubuntu/Slave2/workspace/parallel-build@2/target/*.jar'
        sh '''
        ls "$WORKSPACE"
        '''
      }
    }
}