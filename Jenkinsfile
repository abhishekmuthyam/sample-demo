pipeline {
    agent any
	tools {
        maven 'MAVEN_HOME'
	jdk 'Java'	
    }	
    stages {
		stage ('Initialize') {
			steps {
                		bat 'mvn --version'
				
            }			     
        }
        stage('Package') { 
            steps {
			echo "Dev Build"
			bat "mvn clean compile package -DskipTests"
            }
        }
	/*   stage('DEPLOY TO PCF') { 
            steps {
                echo 'pivotal'
                bat "cf login -a api.run.pivotal.io -o myapplications -s dev1 -u abhishekmuthyam@gmail.com -p Chinna23* --skip-ssl-validation"
		bat "cf push sample-demo"
            }
        } */
	stage('DEPLOY to Artifactory') { 
            steps {
                echo 'Deploy Artifact'
                bat "mvn deploy -DskipTests"
            }
        } 
	stage('Download an Artifact') { 
            steps {
                echo 'Download Artifact'
                bat "mvn dependency:get -DrepoUrl=http://localhost:8081/artifactory/libs-snapshot-local  -Dartifact=com.sample:sample-demo:0.0.1-SNAPSHOT"    
	        bat "mvn dependency:copy -Dartifact=com.sample:sample-demo:0.0.1-SNAPSHOT  -DoutputDirectory=C:/artifactLoc -Dmdep.useBaseVersion=true"
            } 
        }
    }
}
