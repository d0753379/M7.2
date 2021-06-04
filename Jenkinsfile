pipeline {
    agent any
    /* insert Declarative Pipeline here */
    stages {
        stage('run-test') {
            /* when {
                anyOf {
                    branch 'master'
                    branch 'dev'
                }
            } */
            steps {
                sh 'chmod +x ./gradlew'
                sh './gradlew test'
                jacoco(
                    classPattern: 'app/build/classes',
                    inclusionPattern: '**/*.class',
                    exclusionPattern: '**/*Test*.class',
                    execPattern: 'app/build/jacoco/**/*.exec'
                )
            }
        }
        stage('sonarqube'){
            environment{
                SONAR_TOKEN = credentials('d0753379_swimming-pool')
            }
            steps{
                sh '''./gradlew sonarqube \
                  -Dsonar.projectKey=d0753379_swimming-pool \
                  -Dsonar.host.url=http://140.134.26.54:10990 \
                  -Dsonar.login=3dbb6feb1959116adc486635c85c6d436c1a1eba
                  '''
            }
            
          }
   
    }
}