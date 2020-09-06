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
