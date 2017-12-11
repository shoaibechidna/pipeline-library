#!/usr/bin/env groovy

def call(test = 'false') {
  
    
  sh '#!/bin/bash /usr/local/bin/mvn clean install'
    
   
}

