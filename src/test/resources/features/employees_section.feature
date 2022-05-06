@stories
  Feature: I, as a quality analyst, wish to enter the choucair testing
    page to verify the operation of the employment section

  Background:

    Given Into in the page choucair testing

    @EmployeeSectionBehavior
    Scenario: Operation of the employment section
      When Page functionality
      Then Field Verification

    @LookForJobOffer
    Scenario: Enter choucair job offers
      When Go to employment page
      Then View jobs






