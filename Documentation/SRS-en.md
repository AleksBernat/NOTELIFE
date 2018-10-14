#Project Requirements
---

# Content
1 [Introduction](#intro) <br>
  1.1 [Appointment](#appointment) <br>
  1.2 [Business Requirements](#business_requirements) <br>
    1.2.1 [Source Data](#initial_data) <br>
    1.2.2 [Business Opportunities](#business_opportunities) <br>
    1.2.3 [Project Boundaries](#project_boundary) <br>
  1.3 [Analogs](#analogues) <br>
2 [User Requirements](#user_requirements) <br>
  2.1 [Software Interfaces](#software_interfaces) <br>
  2.2 [User Interface](#user_interface) <br>
  2.3 [User Features](#user_specifications) <br>
    2.3.1 [User Classes](#user_classes) <br>
    2.3.2 [Application audience](#application_audience) <br>
      2.3.2.1 [Target audience](#target_audience) <br>
      2.3.2.2 [Secondary audience](#collateral_audience) <br>
  2.4 [Assumptions and Dependencies](#assumptions_and_dependencies) <br>
3 [System Requirements](#system_requirements) <br>
  3.1 [Functional requirements](#functional_requirements) <br>
    3.1.1 [Basic Functions](#main_functions) <br>
      3.1.1.1 [Create Note](#user_logon_to_the_application) <br>
      3.1.1.2 [Add Note](#setting_up_the_profile_of_the_active_user) <br>
      3.1.1.3 [Edit post](#download_news) <br>
      3.1.1.4 [Save Note](#view_information_about_an_individual_newsletter) <br>
      3.1.1.5 [Delete Note](#active_user_change) <br>
    3.1.2 [Limitations and Exceptions](#restrictions_and_exclusions) <br>
  3.2 [Non-functional requirements](#non-functional_requirements) <br>
    3.2.1 [Quality Attributes](#quality_attributes) <br>
      3.2.1.1 [Usability Requirements](#requirements_for_ease_of_use) <br>
      3.2.1.2 [Security Requirements](#security_requirements) <br>
    3.2.2 [External Interfaces](#external_interfaces) <br>
    3.2.3 [Restrictions](#restrictions) <br>

<a name="intro"/>

# 1. Introduction

<a name="appointment"/>

## 1.1 Purpose
This document describes the functional and non-functional requirements for the NOTELIFE application for Windows 10. This document is intended for people who want to improve their lives.

<a name="business_requirements"/>

## 1.2 Business Requirements

<a name="initial_data"/>

### 1.2.1 Baseline
Nowadays, people live in a rapidly changing flow of events. Throughout life, people do something. They have to combine study, work, family and many other things. Almost no free time. And many really important things are forgotten. Therefore, people have come up with ways to memorize such information: colored stickers, notes on paper, etc. However, these options have many drawbacks. In addition, they may not always be at hand. Most people are forced to adapt to the frantic pace of modern life. So how to keep all the important thoughts in your head? How not to forget something really important? How to keep everything under control?

<a name="business_opportunities"/>

### 1.2.2 Business Opportunities
Many people want to have an application that will allow better control of their lives: daily routine, upcoming events, important events. Such an application will allow them to always remember all the important things and always be ready for all occasions. The interface, designed taking into account all the features of people of different age categories, allows you to increase the number of people using this application.
<a name="project_boundary"/>

### 1.2.3 Project Borders
The NOTELIFE app will allow users to add records of important events, edit and view this information about news, selected according to their preferences. When adding a record, the date of creation of the record will be automatically added.

<a name="analogues"/>

## 1.3 Analogs
The main analogues of the project being developed are:

1. [LeaderTask](https://www.leadertask.ru/) - is the best application among analogues. It has a huge range of additional features. As a result, it has a highly specialized audience of users.
2. [Todoist](https://ru.todoist.com) - Has the ability to work on 12 platforms.
3. [Wunderlist](https://www.wunderlist.com/ru/) - Despite the simplified functionality, it has a much overestimated cost compared to peers.

<a name="user_requirements"/>

# 2 User Requirements

<a name="software_interfaces"/>

## 2.1 Program Interfaces
  - The ability to view added entries must be implemented.
  - A record search system must be implemented.
  - It must be possible to save the added entries on the computer

<a name="user_interface"/>

## 2.2 User Interface
- Login window to the application.

![Main](https://github.com/AleksBernat/NOTELIFE/blob/master/Mockups/Main.png)
- Record creation window.

![CreateNote](https://github.com/AleksBernat/NOTELIFE/blob/master/Mockups/CreateNote.png)
- Add new record window.

![AddNote](https://github.com/AleksBernat/NOTELIFE/blob/master/Mockups/AddNote.png)
- Window successfully added entry.

![NoteAdded](https://github.com/AleksBernat/NOTELIFE/blob/master/Mockups/NoteAdded.png)
- Delete record window.

![DeleteNote](https://github.com/AleksBernat/NOTELIFE/blob/master/Mockups/DeleteNote.png)
- Window to select the path to save the record.

![Settings](https://github.com/AleksBernat/NOTELIFE/blob/master/Mockups/Settings.png)

<a name="user_specifications"/>

## 2.3 User Specifications

<a name="user_classes"/>

### 2.3.1 User Classes

All users have access to the full functionality of the application.

<a name="application_audience"/>

### 2.3.2 Application Audience

<a name="target_audience"/>

#### 2.3.2.1 Target Audience
Middle-aged people with secondary or higher secondary education, with minimal technical literacy.

<a name="collateral_audience"/>

#### 2.3.2.2 Secondary audience
People of any age category with the above qualities.

<a name="assumptions_and_dependencies"/>

## 2.4 Assumptions and Dependencies
1. The application works in the absence of an Internet connection;


<a name="system_requirements"/>

# 3 System Requirements

<a name="functional_requirements"/>

## 3.1 Functional Requirements

<a name="main_functions"/>

### 3.1.1 Basic Functions

<a name="user_logon_to_the_application"/>

#### 3.1.1.1 Create Note
**Description.** The user has the ability to create an entry.

| Function | Requirements |
|:--- |:---|
| Create Note | The application must provide the user the ability to create a record |


<a name="setting_up_the_profile_of_the_active_user"/>

#### 3.1.1.2 Add Note
**Description.** User has the option to add a new entry.

| Function | Requirements |
|:---|:---|
| Add Note | The application should provide the user with a field to enter the main topic (name) of the entry, as well as a brief description of the topic of the entry. The user must either fill in all the fields and confirm the action, or cancel it |

<a name="download_news"/>

#### 3.1.1.3 Edit Note
**Description.** The user should be able to change the added entry.

| Function | Requirements |
|:---|:---|
| Edit Note | The application should provide the user with the ability to edit individual elements of a post: subject, description |


<a name="view_information_about_an_individual_newsletter"/>

#### 3.1.1.4 Save Note
**Description.** The user should be able to save their records.

| Function | Requirements |
|:---|:---|
| Save Note | The user has the opportunity to choose the path to save their records. The application should display the path for storing records, selected by default, and also provide the ability to select another path |


<a name="active_user_change"/>

#### 3.1.1.5 Delete Note
**Description.** The user should be able to delete unwanted entries.

| Function | Requirements |
|:---|:---|
| Delete Note | The user has the ability to delete an extra entry. The application should display a window to confirm the deletion of the selected entry and give the user one last chance before choosing |


<a name="restrictions_and_exclusions"/>

### 3.1.2 Limitations and Exceptions

<a name="non-functional_requirements"/>

## 3.2 Non-functional requirements

<a name="quality_attributes"/>

### 3.2.1 Quality Attributes

<a name="requirements_for_ease_of_use"/>

#### 3.2.1.1 Usability Requirements
1. Access to the main functions of the application for no more than two operations;
2. All functional elements of the user interface have names that describe the action that will occur when an element is selected.


<a name="security_requirements"/>

#### 3.2.1.2 Security Requirements


<a name="external_interfaces"/>

### 3.2.2 External Interfaces
Application windows are convenient for use by visually impaired users:
  * font size at least 14pt;
  * Functional elements are contrasting with the window background.

<a name="restrictions"/>

### 3.2.3 Restrictions
1. The application is implemented on the Java platform.
