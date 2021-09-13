Feature: Booking a hotel in marritto website

Scenario: Landing on Home page
Given Launch the browser and enter the url
When Click on our brands in Homepage
And Verify the logo in list whether it is displayed or not
Then User navigate to another page


Scenario: Search for hotels
Given click on destination
When Enter the "Bangalore" 
And click on search
Then User navigate to results

Scenario: Member verifications
Given Launch the browser and enter the url
When click on member benefits
And Verify the text "Mobile Check-In and Mobile Key"
