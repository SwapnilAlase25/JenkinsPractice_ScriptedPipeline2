//#!/usr/bin/env groovy

try{
node
{
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
}catch(e){
	//currentBuild.result = 'FAILURE'
	//sh 'echo "FAILURE CATCHED"'
}finally{
	/*if(!currentBuild.result)
		currentBuild.result = currentBuild.currentResult*/
	
}
