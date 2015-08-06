Matrix regression test
======================

Test suite for running regression testing on Squiz Matrix.

This test suite runs in Selenium IDE (http://www.seleniumhq.org/download/) a free Firefox browser plugin.

Dependencies
============

These tests use looping provided by Sideflow extension (https://github.com/73rhodes/sideflow).
Add the sideflow.js file (also found in this repo) into the test suite folder, and add a reference to the file from the Selenium IDE Options dialog (under the General tab -> Selenium Core Extensions field)

Conventions
===========

File naming convention
----------------------
* Suite files end in .suite
* Test case files end in .case
* Test case names begin with the test plan section, a double dash, then the name of the test. 
eg: test-section--test-name.case

Test writing conventions
------------------------
* Make tests as idempotent as possible
* Use parameters where possible - tests become unmaintainable without them
* Always relate a test back to a section of the test plan. The test plan is the source of truth for testing details
* Use specific DOM identifiers such as css=#someid where possible
* If you use the inbuilt test recording tool to create a test, go back and refactor the DOM identifiers as the recorder is not very smart and doesn't always pick the most specific identifier

Tips
----
* Don't run the test suite at full speed - some tests start before others have finished at full speed, causing false failures
