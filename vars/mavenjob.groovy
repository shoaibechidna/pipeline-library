#!/usr/bin/env groovy

def call() {
  
    steps {
      sh 'mvn clean install -DskipTests=true'
    }
   
}

