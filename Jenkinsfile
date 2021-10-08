pipeline{

  agent any
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
            stage("Test"){
              agent{
                label 'Slave2'
              }
              steps{
                sh 'mvn test'
              }
            }
            
            }
        }
        stage("Package"){
              steps{
                agent{
                  label 'Slave1'
                }
                sh 'mvn package'
              }
      }
    }
}