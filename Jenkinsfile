//Jenkinsfile for seed job


//#!groovy 

properties([
    pipelineTriggers([pollSCM('H/5 * * * *')])
])

 

node() {
    timestamps {
            ansiColor('xterm') {
                  checkout scm
            
            jobDsl ignoreExisting: true, 
                additionalClasspath: 'utils', 
                lookupStrategy: 'SEED_JOB',
                targets: 'jobs/build_job.groovy'
        }
    }
}



