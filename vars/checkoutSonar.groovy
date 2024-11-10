def call(String SCANNER_HOME){
  withSonarQubeEnv('sonar-server'){
    sh '''$SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName youtube -Dsonar.projectKey youtube'''
  }

}
