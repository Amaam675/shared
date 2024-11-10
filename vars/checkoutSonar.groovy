def call(String sonar){
  withSonarQubeEnv(sonar){
    sh '''$sonar/bin/sonar -Dsonar.projectName youtube -Dsonar.projectKey youtube'''
  }

}
