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
                // Eğer npm paketleri eklenirse burada yüklenecek
                echo 'Installing dependencies...'
                // sh 'npm install'
            }
        }
        
        stage('Lint') {
            steps {
                // HTML ve CSS dosyalarının kontrolü
                echo 'Linting code...'
                // HTML ve CSS linting araçları eklenebilir
            }
        }
        
        stage('Test') {
            steps {
                // Test aşaması - ileride test eklendiğinde kullanılacak
                echo 'Running tests...'
            }
        }
        
        stage('Build') {
            steps {
                // Statik dosyaları build et
                echo 'Building project...'
                // Minification ve optimizasyon işlemleri eklenebilir
            }
        }
        
        stage('Deploy') {
            steps {
                // Deployment aşaması
                echo 'Deploying to web server...'
                // Örnek deployment komutları:
                // sh 'rsync -avz --delete ./dist/ user@server:/var/www/html/'
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline başarıyla tamamlandı!'
        }
        failure {
            echo 'Pipeline başarısız oldu!'
        }
    }
}
