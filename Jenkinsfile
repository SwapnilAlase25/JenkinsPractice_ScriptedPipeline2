pipelineJob('pipelinejob1'){
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






/*
pipelineJob('example') {
    definition {
        cps {
            script(readFileFromWorkspace('build.groovy'))
            sandbox()
        }
    }
}


pipelineJob('job-name') {
  definition {
    cps {
      script('''
  node {
        stage('build1') {
                 echo "Building C files ...."
              }
		
	stage('build2') {
                 echo "Building C++ files ...."            
        	}
		
	stage('build3') {
                 echo "Building Java files ...."
              }
     }
      ''')
      sandbox()     
    }
  }
}
*/
/*
pipelineJob('Testing-job'){

node {
        stage('test1') {
                 echo "Testing C files ...."
              }
		
		stage('test2') {
                 echo "Testing C++ files ...."            
        	}
		
		stage('test3') {
                 echo "Testing Java files ...."
              }
  	 }
}



pipelineJob('Deloying-job'){

node {
        stage('deploy1') {
                 echo "Deploying C files ...."
              }
		
		stage('deploy2') {
                 echo "Deploying C++ files ...."            
        	}
		
		stage('deploy3') {
                 echo "Deploying Java files ...."
              }
  	 }
}
*/
