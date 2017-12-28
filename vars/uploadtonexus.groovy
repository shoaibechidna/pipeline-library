def call() {
  sh('cd target && curl -v -u admin:admin123 --upload-file *.jar http://35.224.19.212/repository/mvnjars/japp.jar')

}
