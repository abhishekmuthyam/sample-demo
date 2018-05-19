pipeline {
    agent any
   environment {
        MAVEN_HOME = tool('MAVEN_HOME')
    }
    stages {
	stage ('Initialize') {
            steps {
                bat '''
                  echo "MAVEN_HOME = ${MAVEN_HOME}"
                    ''' 
            }
        }
        stage('Package') { 
            steps {
		echo "Dev Build"
		bat "mvn clean compile package -DskipTests"
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
