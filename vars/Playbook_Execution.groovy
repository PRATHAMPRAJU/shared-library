def call() {
    stage('playbook execution') {
        sh "/home/ubuntu/ansible-playbook -i Docker/tests/inventory /Docker/tests/test.yml"
    }
}
