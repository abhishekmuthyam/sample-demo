pipeline {
    agent any
	tools { 
        MAVEN_HOME 'Maven 3.3.9'
    }
    stages {
	stage ('Initialize') {
            steps {
                bat '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }
        stage('Package') { 
            steps {
		echo "Dev Build"
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
