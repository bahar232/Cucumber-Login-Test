Feature: Giris Kontrolu
  Scenario: Başarılı Giris
    Given siteye git
    And giris sayfası basarili
    And sepete ekle
    And sepet butonuna bas
    And sepetten cıkar

    When urun sepetten cikarildi
    Then basarili mesajini gor

