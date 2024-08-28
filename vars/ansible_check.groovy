def call() {
    stage('Clone Repository') {
        git branch: 'main', url: 'git@github.com:PRATHAMPRAJU/jenkin_Assignment_6.git'
    }
}
