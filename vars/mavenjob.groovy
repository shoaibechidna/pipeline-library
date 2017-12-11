#!/usr/bin/env groovy

def call(test = 'false') {
  
    
      sh '/usr/local/bin/mvn clean install -DskipTests=true'
    
   
}

