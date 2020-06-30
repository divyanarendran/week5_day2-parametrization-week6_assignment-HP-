Feature: Edit Lead functionlity
@regression
Scenario Outline: TC004- Editing the existing lead-phnum, company
And enter the username as DemoCSR
And enter the password as crmsfa
When click login button
Then Homepage should be displayed 
And click CRM/SFA link 
And click on Leads link
And click on Find leads
And click on Phone tab
And in phonenumber field enter as <phnum>
Then click on Findleads button
And click on the first element in the table
And click on Edit button
Then update the companyname as <company> 
And click on update button

Examples:
|phnum|company|
|9|Tcs|
|99|Amazon|


