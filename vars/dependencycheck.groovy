def call(){
dependencyCheck additonalArguments: '--scan ./ --format HTML' , odcInstallation: 'owasp'
dependencyCheckPublisher pattern: '**/dependenc-check-report.html'
}
