

def call(test = 'false') {
  
    
  sh 'mvn clean install -DskipTests=true'
    
   
}

