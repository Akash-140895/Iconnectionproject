 Feature: Login data driven with excel
  Scenario Outline: Login Data Driven Excel
  Given The user navigates to login page
  Then the user should be redirected to investor screen by passing email and password with excel row "<row_index>"
  
   Examples: 
   
   | row_index |
   |          1|
   |          2|
   |          3|
   |          4|

   