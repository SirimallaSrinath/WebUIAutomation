Feature: SwagLabs Login

Scenario: LoginSwag
Given user launch url
When user provide login password and click submit
Then user check Homepage title
And  click on profile and logout 

Scenario: LoginSwagParameter
Given user launch url
When user provide "standard_user" "secret_sauce" and click submit
Then user check Homepage title
And  click on profile and logout

Scenario Outline: LoginSwagDataDriven
Given user launch url
When user provide "<username>" "<password>" and click submit
Then user check Homepage title
And  click on profile and logout

Examples:
|username     |password|
|standard_user|secret_sauce|
|problem_user |secret_sauce|


