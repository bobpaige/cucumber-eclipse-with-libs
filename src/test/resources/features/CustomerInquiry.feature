Feature: Customer inquiry
  As a user, I want to perform an inquiry

  Scenario Outline: Query Individual Customer by SSN "<ssn>"
    When performing a Customer inquiry with "<ssn>" and "<inquirytype>"
    Then the response contains all of these:
      | <ownerfield> | <owner> |

    Examples: 
      | ssn       | owner  | ownerfield | inquirytype |
      | 888818888 | PUBLIC | lastname   | SS_NUMBER   |
