def call() {
    stage('notify') {
          emailext body: 'success', subject: 'Status', to: 'prathamkukudkar@gmail.com'
          slackSend channel: '#jenkins', message: 'successfull '
    }
}
