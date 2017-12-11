

    
      
        steps {
          withMaven(maven : 'maven_3_5_0') {
          sh 'mvn clean install -Dskiptest'
          }
        }   


