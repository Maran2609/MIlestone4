@first
Feature: Booking a flight ticket

Scenario Outline: Search flight in homepage
Given Launch the browser and enter the url
When Click on one way option in the homepage
When Enter  the <depart> place and <going to> place 
And Enter the which date you want to booking
And Click on search flight button
Then User navigate to another page

Examples:
|depart| |going to|
|Bangalore| |Mumbai|


Scenario: Verifies the highlighted option
When Click on offers
And verifies the highlighted option

Scenario: Verify the title in child windows
When Click on travelguru in bottom of the page
Then verify the title in the child window "Travelguru: Book Homestays, Vacation Rentals, Hotels & More"