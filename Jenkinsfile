pipeline {
    agent any
    stages {
        stage('Package') { 
            steps {
		echo "Dev Build"
		
		PATH = "C:\MyTools\apache-maven-3.5.3\bin:$PATH"
		echo "PATH is: $PATH"
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

