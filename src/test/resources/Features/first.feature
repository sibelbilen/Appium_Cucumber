@ilkFeature
Feature: Api demos

  Scenario: api demos
    Given app yuklenir
    And kullanici "api demos" butonuna tiklanir
    And kullanici "preference" butonuna tiklanir
    And kullanici "Wifi check box" secmis olacak
    And kullanici "WiFi Settings" tikladi
    And wifi setting popup geldi
    And kullanici "text" yazar
    And kullanici "okbutonuna" tiklanir



