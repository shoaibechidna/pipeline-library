#!/usr/bin/env groovy

def call(String test = 'false') {
  echo "received test=${test}"
  if (test.equalsIgnoreCase('false')) {
    echo "running for test false"
    steps {
      shell('cd spring-petclinic')
    }
    mavenJob('mavenjob') {
      goals('clean install -DskipTests')
    }
  } else{
    echo "running for test true"
    mavenJob('mavenjob') {
      goals('clean install')
    }
  }
}
