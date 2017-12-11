#!/usr/bin/env groovy

def call() {
  
    
      sh 'mvn clean install -DskipTests=true'
    
   
}

