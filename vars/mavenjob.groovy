#!/usr/bin/env groovy

def call(String test = 'false') {
  echo "received test=${test}"

  if (test.equalsIgnoreCase('false')) {
    echo "running for test false"
    node {
      utils.mvn 'clean install -DskipTests'
    }
  } else{
    echo "running for test true"
    maven {
      goals('clean install')
    }
  }
}
