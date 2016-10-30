$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchInGoogle.feature");
formatter.feature({
  "id": "search-text-in-google-page",
  "tags": [
    {
      "name": "@Browser",
      "line": 1
    }
  ],
  "description": "",
  "name": "Search text in google page",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "search-text-in-google-page;search-text-in-google-page-of-chrome",
  "description": "",
  "name": "Search text in google page of chrome",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "User is on google page of chrome",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "User types \"Sachin\" in google page",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "Hit enter key or click on search",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "searched text should match with \"Sachin\"",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "close the browser",
  "keyword": "And ",
  "line": 9
});
formatter.match({
  "location": "TestStep.user_is_on_google_page_of_chrome()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sachin",
      "offset": 12
    }
  ],
  "location": "TestStep.user_types_in_google_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestStep.hit_enter_key_or_click_on_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sachin",
      "offset": 33
    }
  ],
  "location": "TestStep.searched_text_should_match_with(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestStep.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("SearchInIE.feature");
formatter.feature({
  "id": "search-text-in-google-page",
  "tags": [
    {
      "name": "@Browser",
      "line": 1
    }
  ],
  "description": "",
  "name": "Search text in google page",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "search-text-in-google-page;search-text-in-google-page-of-ie",
  "description": "",
  "name": "Search text in google page of IE",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "User is on google page of IE",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "User types \"Sachin\" in google page",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "Hit enter key or click on search",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "searched text should match with \"Sachin\"",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "close the browser",
  "keyword": "And ",
  "line": 9
});
formatter.match({
  "location": "TestStep.user_is_on_google_page_of_IE()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sachin",
      "offset": 12
    }
  ],
  "location": "TestStep.user_types_in_google_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestStep.hit_enter_key_or_click_on_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sachin",
      "offset": 33
    }
  ],
  "location": "TestStep.searched_text_should_match_with(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestStep.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});