@ilkFeature
Feature: Api demos

  Background:
    Given app yuklenir
    And kullanici "api demos" butonuna tiklanir
    And kullanici api demos ekraninda olduguna dair dogrulama

  Scenario: api demos
    And kullanici "preference" butonuna tiklanir
    And kullanici prefrence ekranina giris yaptigini dair dogrulama
    And kullanici "Wifi check box" secmis olacak
    And kullanici "WiFi Settings" tikladi
    And "wifi setting" popup geldi
    And kullanici "text" yazar
    And kullanici "okbutonuna" tiklanir



