def call(){
sh 'trivy fs . --skip-update > trivy.txt'

}
