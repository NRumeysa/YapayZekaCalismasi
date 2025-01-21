Feature: Blog Anasayfa Fonksiyonları

  Background:
    Given kullanıcı blog anasayfasında

  Scenario: Anasayfadaki kişisel bilgilerin doğrulanması
    Then kullanıcı "Nazife Rumeysa Kısacık" ismini görmeli
    And kullanıcı "Full Stack Automation Test Engineer" ünvanını görmeli

  Scenario: Navigasyon linklerinin doğrulanması
    Then kullanıcı aşağıdaki navigasyon linklerini görmeli
      | Ana Sayfa |
      | Hakkımda  |
      | Blog      |
      | İletişim  |

  Scenario: Sosyal medya linklerinin doğrulanması
    Then kullanıcı LinkedIn profil linkini görmeli
    And kullanıcı GitHub profil linkini görmeli

  Scenario: Hakkımda bölümü içeriğinin doğrulanması
    When kullanıcı Hakkımda bölümüne gider
    Then kullanıcı yetenekler bölümünü görmeli
    And kullanıcı deneyim bölümünü görmeli
    And kullanıcı eğitim bölümünü görmeli
