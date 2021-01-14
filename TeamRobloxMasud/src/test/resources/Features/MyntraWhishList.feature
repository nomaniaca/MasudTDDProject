
@Sanity5
Feature: Verify add product on Wishlist
customer wants to add preferable product on Wishlist

Scenario: Verifying customer able to add product on Wishlist successfully
Given Customer land on Myntra homepage <" https://www.myntra.com/">
When Customer mousehover to men
And Customer click on T-shirt
And Customer click on wishlist btn
And Customer click on wishlist manubar
Then Customer should be able to see product appears on Wishlist page