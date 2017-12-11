#!/usr/bin/env groovy

def call(test = 'false') {
  
    
  sh '#!/usr/bin/env bash /usr/local/bin/mvn clean install'
    
   
}

