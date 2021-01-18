Feature: Verifying Gift Card show preview Page
This feature will verify all the steps of Gift Card show preview page

Scenario: Verifying gift card show preview page launch successfully

Given Customer lands on Myntra homepage
When Customer mousehover to profile
And Customer click on Gift Cards
And Customer click on send gift card
And Customer click on birthday
And customer click on next
And Customer put correct phonenumber '8076159467'
And Customer clicks on continue Btn
And Customer clicks on password Btn
And Customer put correct password "Meeta@1010"
And Customer clicks on LogIn button
And customer click on choose amount
And customer put receipent email
And customer put receipent name "nomani"
And customer click on show preview 
Then Customer should able to see show preview page 