def call(){
  withSonarQubeEnv('sonar-server'){
    sh '''$SONNAR_HOME/bin/sonar-scanner -Dsonar.projectName youtube -Dsonar.projectKey youtube'''
  }

}
