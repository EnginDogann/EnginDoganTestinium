
Feature: Lc Waikiki Web Otomasyon

  Scenario: Adding and deleting products to the cart

    Given lcwaikiki sitesi açılır.
    And Ana sayfanın açıldığı kontrol edilir.
    And login butonuna tıklanır.
    And eposta secenegi secilir.
    And eposta girilir.
    And sifre girilir.
    And Giris yap butonuna tıklanır.
    And Login işlemi kontrol edilir.
    And Arama kutucuğuna pantolan kelimesi girilir.
    And Arama butonuna basılır.
    And Sayfanın sonuna scroll edilir.
    And Daha fazla ürün gör butonuna tıklanır.
    And Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.
    And Seçilen ürün sepete eklenir.
    And Sepete gidilir.
    And Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.
    And Ürün Adedi Artırılır.
    And ürün adedinin iki olduğu doğrulanır.
    And Ürün sepetten silinir.
    When Sepetin boş olduğu kontrol edilir.