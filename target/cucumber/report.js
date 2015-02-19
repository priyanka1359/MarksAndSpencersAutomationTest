$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features\\MandS.feature");
formatter.feature({
  "line": 3,
  "name": "As a customer, I wish to view the contents of my bag prior to checkout",
  "description": "",
  "id": "as-a-customer,-i-wish-to-view-the-contents-of-my-bag-prior-to-checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@firstTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Add shirt to bag and view bag",
  "description": "",
  "id": "as-a-customer,-i-wish-to-view-the-contents-of-my-bag-prior-to-checkout;add-shirt-to-bag-and-view-bag",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have added a shirt to my bag",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I view the contents of my bag",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I can see the contents of the bag include a shirt",
  "keyword": "Then "
});
formatter.match({
  "location": "MandStest.I_have_added_a_shirt_to_my_bag()"
});
formatter.result({
  "duration": 51357431048,
  "status": "passed"
});
formatter.match({
  "location": "MandStest.I_view_the_contents_of_my_bag()"
});
formatter.result({
  "duration": 600137199,
  "status": "passed"
});
formatter.match({
  "location": "MandStest.I_can_see_the_contents_of_the_bag_include_a_shirt()"
});
formatter.result({
  "duration": 45158,
  "status": "passed"
});
});