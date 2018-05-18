pipeline {
    agent any
    stages {
        stage('Package') { 
            steps {
                bat "mvn package -DskipTests" 
            }
        }
	   stage('DEPLOY TO PCF') { 
            steps {
                echo 'pivotal'
                bat "cf login -a api.run.pivotal.io -o myapplications -s dev -u abhishekmuthyam@gmail.com -p Chinna23* --skip-ssl-validation"
		    	bat "cf push sample-demo"
            }
        }
    }
}

