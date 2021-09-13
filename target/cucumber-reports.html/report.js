$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 1,
  "name": "Booking a hotel in marritto website",
  "description": "",
  "id": "booking-a-hotel-in-marritto-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Landing on Home page",
  "description": "",
  "id": "booking-a-hotel-in-marritto-website;landing-on-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on our brands in Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Verify the logo in list whether it is displayed or not",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User navigate to another page",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingpageStepfeiniton.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 42104594001,
  "status": "passed"
});
formatter.match({
  "location": "LandingpageStepfeiniton.click_on_our_brands_in_Homepage()"
});
formatter.result({
  "duration": 2371121999,
  "status": "passed"
});
formatter.match({
  "location": "LandingpageStepfeiniton.verify_the_logo_in_list_whether_it_is_displayed_or_not()"
});
formatter.result({
  "duration": 10959593000,
  "status": "passed"
});
formatter.match({
  "location": "LandingpageStepfeiniton.user_navigate_to_another_page()"
});
formatter.result({
  "duration": 638573601,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Search for hotels",
  "description": "",
  "id": "booking-a-hotel-in-marritto-website;search-for-hotels",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "click on destination",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Enter the \"Bangalore\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click on search",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User navigate to results",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingpageStepfeiniton.click_on_destination()"
});
formatter.result({
  "duration": 336680401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bangalore",
      "offset": 11
    }
  ],
  "location": "LandingpageStepfeiniton.enter_the(String)"
});
formatter.result({
  "duration": 448829700,
  "status": "passed"
});
formatter.match({
  "location": "LandingpageStepfeiniton.click_on_search()"
});
formatter.result({
  "duration": 339732600,
  "status": "passed"
});
formatter.match({
  "location": "LandingpageStepfeiniton.user_navigate_to_results()"
});
formatter.result({
  "duration": 12696911700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Member verifications",
  "description": "",
  "id": "booking-a-hotel-in-marritto-website;member-verifications",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "click on member benefits",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Verify the text \"Mobile Check-In and Mobile Key\"",
  "keyword": "And "
});
formatter.match({
  "location": "LandingpageStepfeiniton.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 45730138601,
  "status": "passed"
});
formatter.match({
  "location": "LandingpageStepfeiniton.click_on_member_benefits()"
});
formatter.result({
  "duration": 14605492200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobile Check-In and Mobile Key",
      "offset": 17
    }
  ],
  "location": "LandingpageStepfeiniton.verify_the_text(String)"
});
formatter.result({
  "duration": 930016800,
  "status": "passed"
});
});