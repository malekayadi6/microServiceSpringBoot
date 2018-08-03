pipeline {
    agent any
    tools { 
        maven 'maven' 
        jdk 'jdk8' 
    }
    stages {
        stage ('Initialize') {
            steps {
                bat '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }
        stage('run-parallel-install') {
          steps {
            parallel(
              a: {
                 bat 'mvn -f config/pom.xml install'
              },
              b: {
                 bat 'mvn -f taches/pom.xml install'
              },
              c: {
                 bat 'mvn -f service-eureka/pom.xml install'
              }
            )
          }
        }
    }
}