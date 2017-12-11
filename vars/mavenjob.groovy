

def call(test = 'false') {
  if (test=='false') {
    echo "for test=$test"
    sh 'mvn clean install -DskipTests=true'
  } else {
    echo "for test=$test"
    sh 'mvn clean install'
  } 
}

