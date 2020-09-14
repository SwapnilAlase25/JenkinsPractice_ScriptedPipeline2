
//try{
node
{
	try{
      		stage('build1') {
                 echo "Building C files ...."
              }
	} catch(e){
		echo "Building C files Failed"	
	}		
		stage('build2') {
                 echo "Building C++ files ...."            
        	}
		
		stage('build3') {
                 echo "Building Java files ...."
              }
   }
/*}catch(e){
	//currentBuild.result = 'FAILURE'
}finally{
	if(!currentBuild.result)
		currentBuild.result = currentBuild.currentResult
	
}
*/
