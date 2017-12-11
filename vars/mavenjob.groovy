#!/usr/bin/env groovy

def call(String test = 'false') {
  echo "received test=${test}"
  @Library('utils') 
  def utils = new Utilities(this)
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
