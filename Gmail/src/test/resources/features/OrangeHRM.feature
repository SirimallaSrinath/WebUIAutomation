Feature: HRM Application Automation using Cucumber

  Scenario: login
    Given open browser and enter application url
    When enter username,password and click on login
    Then verification for homepage
    When click on profile icon and logout
    And close browser

  Scenario: loginWithParameters
    Given open browser and enter application url
    When enter "Admin","admin123" and click on login
    Then verification for homepage
    When click on profile icon and logout
    And close browser

  Scenario Outline: Datadriven
    Given open browser and enter application url
    When enter "<username>","<password>" and click on login
    Then verification for homepage
    When click on profile icon and logout
    And close browser

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin123 |

  Scenario: AddEmployee
    When addEmployee

  Scenario: EditEmployee
    When editEmployee

  Scenario: DeleteEmployee
    When deleteEmployee
