Feature: Js Alerts

	Scenario: TO handle java script alerts
		Given user launch the browser 
		When user navigates to the herokkuapp
		And user will  click on the javascript alert
		Then click in the java script alert button
		And click on the java script alert popup ok button
		And close the currently opened browser

	Scenario: To handle java script alerts
		Given user launch the browser 
		When user navigates to the herokkuapp
		And user will  click on the javascript alert
		Then click in the java script confirm button
		And click on the java script confirm popup ok button
		And close the currently opened browser
		
	Scenario: TO handle Java script alerts
		Given user launch the browser 
		When user navigates to the herokkuapp
		And user will  click on the javascript alert
		Then click in the java script prompt button
		And send some user input text to the popup java script prompt 
		Then Click on the  Js prompt alert ok
		And verify the user input is entered is displayed in the console is correct or not
		And close the currently opened browser
		


