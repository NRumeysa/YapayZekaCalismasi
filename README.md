# 🌟 Kişisel Blog ve Test Otomasyon Projesi

Bu proje iki ana bölümden oluşmaktadır:
1. 🎨 Kişisel Blog Web Sitesi
2. 🤖 Test Otomasyon Framework'ü

## 🎨 Blog Web Sitesi

Kişisel blog web sitesi sıfırdan, modern web teknolojileri kullanılarak geliştirilmiştir.

### Kullanılan Teknolojiler

- 🌐 HTML5
- 🎨 CSS3
- 📱 Responsive Tasarım
- 🔍 SEO Uyumlu Semantik Markup
- 📊 Font Awesome Icons
- 💻 Modern ve Temiz Kod Yapısı

### Web Sitesi Özellikleri

- 🏠 Ana Sayfa
  - Kişisel tanıtım
  - Profesyonel unvan
  - Sosyal medya bağlantıları (LinkedIn, GitHub)
  
- 👤 Hakkımda Bölümü
  - Profesyonel özgeçmiş
  - Teknik yetenekler
  - Uzmanlık alanları
  
- 📝 Blog Bölümü
  - Teknik makaleler
  - Deneyim paylaşımları
  
- 📞 İletişim Bölümü
  - İletişim formu
  - Sosyal medya bağlantıları

## 🤖 Test Otomasyon Framework'ü

Bu proje, kişisel blog web sitesinin otomatik testlerini içeren bir test otomasyon framework'üdür. Cucumber BDD, Selenium WebDriver ve Page Object Model kullanılarak geliştirilmiştir.

## 📋 İçindekiler

- [🚀 Özellikler](#-özellikler)
- [⚙️ Gereksinimler](#️-gereksinimler)
- [💻 Kurulum](#-kurulum)
- [🎯 Testleri Çalıştırma](#-testleri-çalıştırma)
- [📁 Proje Yapısı](#-proje-yapısı)
- [🔍 Test Senaryoları](#-test-senaryoları)
- [📝 Raporlama](#-raporlama)
- [👥 Katkıda Bulunma](#-katkıda-bulunma)

## 🚀 Özellikler

- ✨ Cucumber ile BDD (Behavior Driven Development) yaklaşımı
- 🎯 Page Object Model tasarım deseni
- 📝 Türkçe Gherkin senaryoları
- 🔄 Selenium WebDriver entegrasyonu
- 📊 Detaylı test raporlaması
- 🔍 Otomatik screenshot alma
- 📝 SLF4J ile detaylı loglama
- ⚡ Explicit Wait mekanizması
- 🏷️ Test kategorileri ve önceliklendirme

## ⚙️ Gereksinimler

- Java JDK 11 veya üzeri
- Maven 3.6.3 veya üzeri
- Chrome/Firefox web tarayıcısı
- Git (opsiyonel)

## 💻 Kurulum

1. Projeyi klonlayın:
```bash
git clone https://github.com/kullaniciadi/blog-automation.git
cd blog-automation
```

2. Maven bağımlılıklarını yükleyin:
```bash
mvn clean install
```

3. WebDriver'ı yapılandırın:
```java
// WebDriver otomatik olarak WebDriverManager tarafından yapılandırılacaktır
```

## 🎯 Testleri Çalıştırma

### Tüm Testleri Çalıştırma
```bash
mvn test
```

### Belirli Tag'lere Göre Çalıştırma
```bash
mvn test -Dcucumber.filter.tags="@smoke"
```

### Belirli Bir Feature Dosyasını Çalıştırma
```bash
mvn test -Dcucumber.features="src/test/resources/features/homepage.feature"
```

## 📁 Proje Yapısı

```
src
├── test
│   ├── java
│   │   └── com
│   │       └── rumeysablog
│   │           ├── annotations
│   │           │   └── TestInfo.java
│   │           ├── pages
│   │           │   ├── BasePage.java
│   │           │   └── HomePage.java
│   │           ├── steps
│   │           │   └── HomePageSteps.java
│   │           └── utils
│   │               └── DriverManager.java
│   └── resources
│       └── features
│           └── homepage.feature
└── main
    └── webapp
        ├── index.html
        ├── css
        │   └── style.css
        └── js
            └── script.js
```

## 🔍 Test Senaryoları

### Ana Sayfa Testleri
- ✅ Kişisel bilgilerin doğrulanması
- ✅ Navigasyon menüsü kontrolü
- ✅ Sosyal medya bağlantıları kontrolü
- ✅ Hakkımda bölümü içerik kontrolü

## 📝 Raporlama

Test raporları `target/cucumber-reports` dizininde oluşturulur:
- 📊 HTML raporlar
- 📈 JSON raporlar
- 📑 XML raporlar

## 👥 Katkıda Bulunma

1. Fork'layın
2. Feature branch oluşturun (`git checkout -b feature/amazing-feature`)
3. Değişikliklerinizi commit edin (`git commit -m 'feat: amazing new feature'`)
4. Branch'inizi push edin (`git push origin feature/amazing-feature`)
5. Pull Request oluşturun

## 📦 Kullanılan Teknolojiler

### Web Sitesi
- 🌐 HTML5
- 🎨 CSS3
- 📱 Responsive Design
- 🔍 SEO-friendly markup
- 📊 Font Awesome 6.0.0

### Test Otomasyonu
- 🥒 Cucumber (v7.14.0)
- 🌐 Selenium WebDriver (v4.16.1)
- 🚗 WebDriverManager (v5.6.2)
- 📋 JUnit (v4.13.2)
- 📝 SLF4J (v2.0.9)
- 📊 Extent Reports (v5.1.1)

## ⚠️ Önemli Notlar

- Test çalıştırmadan önce Chrome/Firefox tarayıcısının yüklü olduğundan emin olun
- Testler varsayılan olarak Chrome tarayıcısında çalışır
- Paralel test çalıştırma için thread sayısını `pom.xml` dosyasından ayarlayabilirsiniz

## 📫 İletişim

Rumeysa - [@LinkedIn](https://linkedin.com/in/nrumeysaksck) - [GitHub](https://github.com/NRumeysa)

Proje Linki: [https://github.com/NRumeysa/blog-automation](https://github.com/NRumeysa/blog-automation)
