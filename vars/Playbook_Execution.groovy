def call() {
    stage('playbook execution') {
        sh '''
        ansible-playbook -i Docker_role/Docker/tests/inventory Docker_role/Docker/tests/test.yml 
        
        '''
    }
}
