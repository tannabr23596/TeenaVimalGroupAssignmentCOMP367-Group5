pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven3"
    }
	environment {
        DEPLOY_ENVIRONMENT = 'dev' 
    } 

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
               // git 'https://github.com/jglick/simple-maven-project-with-tests.git'
                git branch: 'main', url: 'https://github.com/tannabr23596/TeenaVimalGroupAssignmentCOMP367-Group5.git'
                // Run Maven on a Unix agent.
              //  sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                 bat "mvn clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
		stage('Test') {
            steps {
               
                bat "mvn test"
                
            }
            post {
			  success {
                junit '**/target/surefire-reports/TEST-*.xml'
				archiveArtifacts 'target/*.jar'
			   }
            }
        }
		stage('Delivery') {
            steps {
                script {
                 def mvnCmd = tool "Maven3" // Maven executable
				 def mvnCmdBin = "${mvnCmd}/bin/mvn"

            // Print Maven tool path for debugging
            echo "Maven executable path: ${mvnCmd}"
			 echo "${mvnCmdBin} release:prepare release:perform"
                 }
            }
		}
		stage('Development Env') {
          when {
             expression { env.DEPLOY_ENVIRONMENT == 'dev' }
             }
            steps {
               script {
                   if (env.DEPLOY_ENVIRONMENT == 'dev') {
                     echo "Deploying to Dev environment"
                     // Deployment steps for Dev environment
                  } else {
                        echo "Skipping deployment to Dev environment"
                      }
               }
             }
           }
		   stage('QA Env') {
          when {
             expression { env.DEPLOY_ENVIRONMENT == 'qa' }
             }
            steps {
               script {
                   if (env.DEPLOY_ENVIRONMENT == 'qa') {
                     echo "Deploying to QA environment"
                     // Deployment steps for QA environment
                  } else {
                        echo "Skipping deployment to QA environment"
                      }
               }
             }
           }
		    stage('Staging Env') {
          when {
             expression { env.DEPLOY_ENVIRONMENT == 'staging' }
             }
            steps {
               script {
                   if (env.DEPLOY_ENVIRONMENT == 'staging') {
                     echo "Deploying to Staging environment"
                     // Deployment steps for Staging environment
                  } else {
                        echo "Skipping deployment to Staging environment"
                      }
               }
             }
           }
		      stage('Production Env') {
          when {
             expression { env.DEPLOY_ENVIRONMENT == 'production' }
             }
            steps {
               script {
                   if (env.DEPLOY_ENVIRONMENT == 'production') {
                     echo "Deploying to Production environment"
                     // Deployment steps for Production environment
                  } else {
                        echo "Skipping deployment to Production environment"
                      }
               }
             }
           }
    }
}
