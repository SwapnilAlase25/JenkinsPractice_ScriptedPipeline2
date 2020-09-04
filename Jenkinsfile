//Jenkinsfile for seed job

 
/*
properties([
    pipelineTriggers([pollSCM('H/5 * * * *')])
])

 */
/*
node {
    timestamps {
            ansiColor('xterm') {
                  checkout scm
            
            jobDsl ignoreExisting: true, 
                additionalClasspath: 'utils', 
                lookupStrategy: 'SEED_JOB', targets: 'build.groovy'
        }
    }
}
*/

//#!groovy

node() {
     checkout scm
        
        jobDsl ignoreExisting: true,
               lookupStrategy: 'SEED_JOB',
               targets: 'build.groovy'
}


