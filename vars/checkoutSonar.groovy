def call(){
  withSonarQubeEnv('sonar-server'){
    sh '''sonar-scanner/bin/sonar-scanner -Dsonar.projectName youtube -Dsonar.projectKey youtube'''
  }

}
