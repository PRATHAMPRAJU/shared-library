def call() {
    stage('playbook execution') {
        sh '''
        ansible-playbook -i /home/ubuntu/Docker_role/Docker/tests/inventory /home/ubuntu/Docker_role/Docker/tests/test.yml 
        
        '''
    }
}
