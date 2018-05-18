pipeline {
    agent any
	stage('Preparation') { 
             
      mvnHome = tool 'Maven 3.5.3'
   }
    stages {
        stage('Package') { 
            steps {
		echo "Dev Build"
		
		$PATH = "C:/MyTools/apache-maven-3.5.3/bin:$PATH"
		echo "PATH is: $PATH"
              //  bat "mvn package -DskipTests"
		     bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
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

