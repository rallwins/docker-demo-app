pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
    publishChecks 
    	name: 'example', 
    	title: 'Pipeline Check', 
    	summary: 'check through pipeline', 
    	text: 'you can publish checks in pipeline script', 
    	detailsURL: 'https://github.com/jenkinsci/checks-api-plugin#pipeline-usage'
    
}