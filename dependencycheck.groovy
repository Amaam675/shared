def call(){
dependencyCheck additionalArguments: '--scan ./ --format HTML' ,odcInstallation: 'owasp' \
dependencyCheckPublisher pattern: '**/dependency-check.html'

}
