Feature: CreateLead functionlity
@sanity
Scenario Outline: TC003- Create lead with company,firstname and lastname

And enter the username as DemoCSR
And enter the password as crmsfa
When click login button
Then Homepage should be displayed 
And click CRM/SFA link 
And click on Leads link
And click on Create Lead link
And enter company as <companyname> 
And enter firstname as <firstname> 
And enter lastname as <lastname>
When click on submit button 

Examples:
|companyname|firstname|lastname|
|TestLeaf|Divya|N|
|TestLeaf|Dhivya|R|



