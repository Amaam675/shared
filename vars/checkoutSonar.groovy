def call(String sonar){
  withSonarQubeEnv('sonar-server'){
    sh '''$sonar/bin/sonar-scanner -Dsonar.projectName youtube -Dsonar.projectKey youtube'''
  }

}
