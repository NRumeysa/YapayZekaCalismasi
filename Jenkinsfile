pipeline {
    agent any
    
    environment {
        // Projenin GitHub repository bilgileri
        GITHUB_REPO = 'YapayZekaCalismasi'
        BRANCH_NAME = 'main'
    }
    
    stages {
        stage('Checkout') {
            steps {
                // GitHub'dan kodu çek
                checkout scm
            }
        }
        
        stage('Install Dependencies') {
            steps {
                // Maven bağımlılıklarını yükle
                bat 'mvn clean install -DskipTests'
            }
        }
        
        stage('Test') {
            steps {
                // Testleri çalıştır ve raporları oluştur
                bat 'mvn test'
            }
            post {
                always {
                    // JUnit test sonuçlarını topla
                    junit '**/target/surefire-reports/*.xml'
                    
                    // Cucumber raporlarını oluştur
                    cucumber buildStatus: 'UNSTABLE',
                        reportTitle: 'Cucumber Report',
                        fileIncludePattern: '**/cucumber.json',
                        trendsLimit: 10,
                        classifications: [
                            [
                                'key': 'Browser',
                                'value': 'Chrome'
                            ]
                        ]
                }
            }
        }
        
        stage('Build') {
            steps {
                // Projeyi derle
                bat 'mvn package -DskipTests'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
    
    post {
        always {
            // Test sonuçlarını arşivle
            archiveArtifacts artifacts: 'target/**/*.jar', fingerprint: true
            archiveArtifacts artifacts: 'target/cucumber-reports/**/*', fingerprint: true
        }
        success {
            echo 'Pipeline başarıyla tamamlandı!'
        }
        failure {
            echo 'Pipeline başarısız oldu!'
        }
    }
}
