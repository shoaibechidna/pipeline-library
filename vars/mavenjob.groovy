#!/usr/bin/env groovy

def any(String test = 'false') {
  echo "received test=${test}"
  @Library('utils')_ import org.foo.Utilities
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
