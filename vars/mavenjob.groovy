#!/usr/bin/env groovy

def call(test = 'false') {
  
    
  sh '#!/usr/bin/env bash \n \
      mvn clean install'
    
   
}

