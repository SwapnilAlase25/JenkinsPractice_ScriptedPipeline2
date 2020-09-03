
pipelineJob('pipelinejob1'){
  triggers {
    upstream('seed_job', 'SUCCESS')
  }
  
definition { cps {script("""

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


""")
   sandbox(true)
 }}
}

pipelineJob('pipelinejob2'){
  triggers {
    upstream('seed_job', 'SUCCESS')
  }
  
definition { cps {script("""

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
""")
  sandbox(true)               
  }}
}

pipelineJob('pipelinejob3'){
  triggers {
    upstream('seed_job', 'SUCCESS')
  }
  
definition { cps {script("""
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
""")
 sandbox(true)               
 }}
}
