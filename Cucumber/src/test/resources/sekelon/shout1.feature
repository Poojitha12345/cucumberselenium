Feature: shout Features
Scenario: sean shouts
Given sean is 10 meters away from lucian
When sean shouts "Free COffee"
Then lucian listens to the message


Scenario: sean shouts away from lucian
Given sean is 200 meters away from lucian
When sean shouts "Free COffee"
Then lucian "cannot listen" to the message