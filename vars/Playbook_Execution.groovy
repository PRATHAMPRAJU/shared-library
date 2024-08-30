def call() {
    stage('Playbook Execution') {
        // Set the PATH variable to include the location of ansible-playbook
        withEnv(["PATH+AN=/opt/homebrew/bin"]) {
            sh "ansible-playbook -i /home/ubuntu/Docker_role/Docker/tests/inventory /home/ubuntu/Docker_role/Docker/tests/test.yml"
        }
    }
}
