

pipelineJob('pipelinejob1'){
  triggers {
    upstream('seed_job', 'SUCCESS')
  }
  
definition { cps {script("""
pipeline {
    agent any
    stages {
        stage('Hey') {
              steps {
               sh 'echo Hey!!'
              }
        	}
		
		stage('Hello') {
              steps {
               sh 'echo hello!!'
              }
        	}
		
		stage('Hii') {
              steps {
               sh 'echo hii!!'
              }
        	}
		}
	 }

""")
   sandbox(true)
 }}
}

pipelineJob('pipelinejob2'){
  triggers {
    upstream('seed_job', 'SUCCESS')
  }
  
definition { cps {script("""
pipeline {
    agent any
    stages {
        stage('whatsup') {
              steps {
               sh 'echo Whatsup'
              }
        	}				
		stage('How are you') {
              steps {
               sh 'echo how are you?'
              }
        	}
		
		stage('whats your name') {
              steps {
               sh 'echo whats your name?'
              }
        	}
		
		}
	}
""")
  sandbox(true)               
  }}
}

pipelineJob('pipelinejob3'){
  triggers {
    upstream('seed_job', 'SUCCESS')
  }
  
definition { cps {script("""
pipeline {
    agent any
    stages {
        stage('nice meeting you') {
              steps {
               sh 'echo nice meeting you'
              }
        	}
		stage('Take care') {
              steps {
               sh 'echo take care'
              }
        	}
		
		stage('bye') {
              steps {
               sh 'echo bye'
              }
        	}
		
		}
	}
""")
 sandbox(true)               
 }}
}
