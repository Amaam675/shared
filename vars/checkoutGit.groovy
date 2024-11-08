def call(String gitUrl, String gitBranch){
  checkout([
       $class: 'GitSCM',
       branches: [[name: gitBranch]],
       userRemoteConfigs: [[name: gitUrl]]

}

