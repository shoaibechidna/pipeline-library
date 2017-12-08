#!/usr/bin/env groovy

def any(String test = 'false') {
  echo "received test=${test}"
  if (test.equalsIgnoreCase('false')) {
    echo "running for test false"
    steps {
    maven {
      goals('clean install -DskipTests')
    }
    }
  } else{
    echo "running for test true"
    maven {
      goals('clean install')
    }
  }
}
