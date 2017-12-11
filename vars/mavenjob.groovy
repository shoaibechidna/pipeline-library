#!/usr/bin/env groovy

def call(test = 'false') {
  
    
  maven {
    goals('clean')
    goals('install')
  }
    
   
}

