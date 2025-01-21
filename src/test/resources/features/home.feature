@ui @regression
Feature: Blog Anasayfa Testleri

  @smoke
  Scenario: Kullanıcı blog anasayfasındaki temel bilgileri görebilmeli
    Given kullanıcı blog anasayfasında
    Then kullanıcı "Nazife Rumeysa Kısacık" ismini görmeli
    And kullanıcı "Full Stack Automation Test Engineer" ünvanını görmeli
    And kullanıcı aşağıdaki navigasyon linklerini görmeli
      | Ana Sayfa |
      | Hakkımda  |
      | Blog      |
      | İletişim  |

  @smoke
  Scenario: Kullanıcı sosyal medya linklerini görebilmeli
    Given kullanıcı blog anasayfasında
    Then kullanıcı LinkedIn profil linkini görmeli
    And kullanıcı GitHub profil linkini görmeli

  Scenario: Kullanıcı hakkımda bölümünü görüntüleyebilmeli
    Given kullanıcı blog anasayfasında
    When kullanıcı Hakkımda bölümüne gider
    Then kullanıcı yetenekler bölümünü görmeli
    And kullanıcı deneyim bölümünü görmeli
    And kullanıcı eğitim bölümünü görmeli 