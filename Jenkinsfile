pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        //maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get code from repository 
                git 'https://github.com/GeorgiaKoenig/SpringBoot-Jenkins-Docker.git'
            

                // Run Maven on a Unix agent.
                //sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
            
            
            stage ("test") {
        	
        		steps {
        			echo 'testing the application ...'
        		}
        	}
        	
        	stage ("deploy") {
        		steps {
        			echo 'deploying the application ...'
        		}
        	}
        	

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                
                // always {}
                // failure {}
                
                
                //success {
                    //junit '**/target/surefire-reports/TEST-*.xml'
                    //archiveArtifacts 'target/*.jar'
                //}
            }
        }
    }
}