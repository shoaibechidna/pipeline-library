#!/usr/bin/env groovy

    echo "running for test false"
    stages {
      stage ('install') {
        steps {
          withMaven(maven : 'maven_3_5_0') {
          sh 'mvn clean install -Dskiptest'
          }
        }   
      }  
    }
