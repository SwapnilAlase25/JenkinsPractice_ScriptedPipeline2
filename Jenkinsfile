
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
                lookupStrategy: 'SEED_JOB',
                targets: targets: ['jobs/build_job.groovy'].join('\n')
        }
    }
}



