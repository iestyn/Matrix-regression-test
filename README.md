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
* Test case names begin with the test plan section, a double dash, then the name of the test. eg: test-section--test-name.case

Test writing conventions
------------------------
* Always relate a test back to a section of the test plan. The test plan is the source of truth.
* Add test plan references to the top of the test case, and just above the tests themselves to differentiate b/w housekeeping and teardown script actions etc. See an existing test case for syntax.
* Add the test case name to the test plan so you can cross reference b/w test plan and test suite effectively.
* Make tests as idempotent as possible. Big complex tests are difficult to maintain and more confusing for others.
* Use parameters where possible - tests quickly become unmaintainable without them
* Use specific DOM identifiers such as css=#someid where possible. This makes a test more robust against dynamic DOM structures such as that found in Edit+.
* If you use the inbuilt test recording tool to create a test, go back and refactor the DOM identifiers. The recorder tool is not very smart and doesn't always pick the most specific identifier.

Tips
----
* Don't run the test suite at full speed - some tests start before others have finished at full speed, causing false failures
* In pages that use AJAX, you will need to watch for changes in the page to tell when the AJAX call has returned. A good strategy to use is to watch for the progress bar to appear and complete.
* Assert versus Verify. Only use assert if there is no point continuing the current test, and you don't need to do teardown tasks etc.
