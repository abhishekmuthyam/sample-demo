pipeline {
    agent any
    stages {
        stage('Package') { 
            steps {
                sh "mvn package -DskipTests" 
            }
        }
	stage('DEPLOY') { 
            steps {
                 sh " https://api.run.pivotal.io -o myapplications -s development -u abhishekmuthyam -p Chinna23* --skip-ssl-validation"
		 sh "cf push"
            }
        }
    }
}

