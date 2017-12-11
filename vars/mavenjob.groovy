def call() {
  stage('installl') {
    steps {
      sh 'mvn clean install -DskipTests=true'
    }
  }
}

