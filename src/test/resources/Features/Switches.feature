@swich
  Feature: API Demos Switches
    Background: Switch screen test
      Given app yuklenir
      And kullanici "api demos" butonuna tiklanir
      And kullanici "preference" butonuna tiklanir
      And kullanici "Switches" butununa tikladi


    Scenario: Switch test
      And kullanici check box tikladi
      And kulanici switch butonuna tikladi
      Then screenshot al

    Scenario: Switch button checks
      And check box secili olmali
      And ilk switch butonu kapali
      And ikici switch butonu acik
      Then screenshot al



