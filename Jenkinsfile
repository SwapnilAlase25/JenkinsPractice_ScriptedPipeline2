//Jenkinsfile for seed job

 

properties([
    pipelineTriggers([pollSCM('H/5 * * * *')])
])

 

node() {
    timestamps {
            ansiColor('xterm') {
                  checkout scm
            
            jobDsl ignoreExisting: true, 
                additionalClasspath: 'utils', 
                lookupStrategy: 'SEED_JOB', targets: 'build.groovy'
        }
    }
}




/*
pipelineJob('build-job') {
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
