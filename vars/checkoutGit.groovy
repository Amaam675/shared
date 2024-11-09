def call(String gitUrl, String gitBranch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: refs/heads/gitBranch]]
        userRemoteConfigs: [[url: gitUrl]]

}

