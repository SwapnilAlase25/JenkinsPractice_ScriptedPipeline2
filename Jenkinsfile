
pipelineJob('scriptedpipelinejob1'){
  triggers {
    upstream('ScriptedPipeline_with_Git_SCM2', 'SUCCESS')
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

pipelineJob('scriptedpipelinejob2'){
  triggers {
    upstream('ScriptedPipeline_with_Git_SCM2', 'SUCCESS')
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

pipelineJob('scriptedpipelinejob3'){
  triggers {
    upstream('ScriptedPipeline_with_Git_SCM2', 'SUCCESS')
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
