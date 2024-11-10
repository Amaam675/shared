def call(){
  withSonarQubeEnv('sonar-server'){
    sh '''$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName youtube -Dsonar.projectKey youtube'''
  }

}
