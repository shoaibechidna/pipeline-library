def call(test = 'false') {
  sh('cd target \n
     curl -v -u admin:admin123 --upload-file *.jar http://35.224.19.212/repository/mvnjars/japp.jar \n
     cd ..')

}
