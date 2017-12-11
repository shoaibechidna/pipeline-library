

def call(test = 'false') {
  pipeline {
                stages {
                    stage('install123') {
                        sh 'mvn clean install -DskipTests=true'
                    }
                }
            }   
}

