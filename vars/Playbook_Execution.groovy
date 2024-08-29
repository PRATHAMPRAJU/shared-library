def call() {
    stage('playbook execution') {
        sh "ansible-playbook -i Docker/tests/inventory /Docker/tests/test.yml"
    }
}
