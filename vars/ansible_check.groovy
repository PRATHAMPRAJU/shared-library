def call() {
    stage('Clone Repository') {
        git branch: 'main', url: 'https://github.com/PRATHAMPRAJU/Docker_role.git'
    }
}
