@Reservasi
Feature: Reservasi Sub Page
  Background:
    Given Student at "Detail Page Teacher (murid POV)"
    When Student click "Reservasi" button


  Scenario:
    When pop up "Reservasi" sub page is shown
    Then show 'X' button