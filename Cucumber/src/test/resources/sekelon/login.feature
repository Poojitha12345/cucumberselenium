Feature: Login Feature
Scenario Outline:: Valid user scenario
Given The URL of TestMe App
When user enters <username> as username
And user enters <password> as password
Then user is in <page>
Examples:
|username |  password      | page |
|Lalitha  |  password123   | Home|
|admin    |password456     | Admin Home|


@invalid
Scenario: invalid Scenario
Given The URL OF TESTME APP
When  user enters invalid data 
|abcxyz|password123|
|lalitha|abc1223|
|abc123|abc123| 

Then user is in login
|bdc|
|dbc|
|hdc|

