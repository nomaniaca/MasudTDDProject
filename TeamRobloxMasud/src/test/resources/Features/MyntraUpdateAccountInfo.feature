
@tag
Feature: Verify update account information

As a user customer wants to update account information

Scenario: Verifying Update on account information
Given Customer lands on Myntra homepage
When Customer mousehover to profile
And Customer clicks on Edit profile from dropdown
And Customer put correct Email "nomani@yahoo.com"
And Customer clicks on save details
Then Customer information will update successfully