def call() {
  node('master') {
  stage('installl') {
    steps {
      sh 'mvn clean install -DskipTests=true'
    }
   }
  }
}

