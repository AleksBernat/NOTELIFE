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
3 [System Requirements](#system_requirements) <br>
  3.1 [Functional requirements](#functional_requirements) <br>
    3.1.1 [Basic Functions](#main_functions) <br>
      3.1.1.1 [Add Note](#user_logon_to_the_application) <br>
      3.1.1.2 [Note Sorting](#setting_up_the_profile_of_the_active_user) <br>
      3.1.1.3 [Edit Note](#download_news) <br>
      3.1.1.4 [Note Search](#view_information_about_an_individual_newsletter) <br>
      3.1.1.5 [Delete Note](#active_user_change) <br>
    3.1.2 [Limitations and Exceptions](#restrictions_and_exclusions) <br>
  3.2 [Non-functional requirements](#non-functional_requirements) <br>
    3.2.1 [Quality Attributes](#quality_attributes) <br>
      3.2.1.1 [Usability Requirements](#requirements_for_ease_of_use) <br>
      3.2.1.2 [Security Requirements](#security_requirements) <br>
    3.2.2 [Restrictions](#restrictions) <br>

<a name="intro"/>

# 1. Introduction

<a name="appointment"/>

## 1.1 Purpose
This document describes the functional and non-functional requirements for the NOTELIFE application for Windows 8.10. This document is intended for people who want to improve their lives, as well as competently manage their time.

<a name="business_requirements"/>

## 1.2 Business Requirements

<a name="initial_data"/>

### 1.2.1 Baseline
Nowadays, people live in a rapidly changing flow of events. Throughout life, people do something. They have to combine study, work, family and many other things. Almost no free time. And many really important things are forgotten. Therefore, people have come up with ways to memorize such information: colored stickers, notes on paper, etc. However, these options have many drawbacks. In addition, they may not always be at hand. Most people are forced to adapt to the frantic pace of modern life. So how to keep all the important thoughts in your head? How not to forget something really important? How to keep everything under control? To solve this problem, the idea was to create an application that allows you to record all the necessary information.

<a name="business_opportunities"/>

### 1.2.2 Business Opportunities
Many people want to have an application that will allow better control of their lives: daily routine, upcoming events, important events. Such an application will allow them to always remember all the important things and always be ready for all occasions. The interface, designed taking into account all the features of people of different age categories, allows you to increase the number of people using this application.

<a name="project_boundary"/>

### 1.2.3 Project Borders
The NOTELIFE application will allow users to add records of important events, edit and view this information, selected according to their preferences. When adding a record, the date of recording will be automatically added. Outdated or extra entries can be removed from the application. The application allows the user to personally select a place to store records.

<a name="analogues"/>

## 1.3 Analogs
The main analogues of the project being developed are:

1. [LeaderTask](https://www.leadertask.ru/) - is the best application among analogues. It has a huge range of additional features. As a result, it has a highly specialized audience of users.
2. [Todoist](https://ru.todoist.com) - Has the ability to work on multiple platforms. However, it is rather difficult to use for users with minimal technical literacy.
3. [Wunderlist](https://www.wunderlist.com/ru/) - Despite the simplified functionality, it has a much overestimated cost compared to peers.

<a name="user_requirements"/>

# 2 User Requirements

<a name="software_interfaces"/>

## 2.1 Program Interfaces
The project uses the Swing library to create the GUI of the application and does not interact with external systems and services.
 In project:
  - It must be possible to view added records;
  - Must be implemented search system records;
  - It must be possible to save the added entries on the computer.

<a name="user_interface"/>

## 2.2 User Interface
- Login window to the application.

![Main](https://github.com/AleksBernat/NOTELIFE/blob/master/Mockups/MainWindow.png)
- Record creation window.

![CreateNote](https://github.com/AleksBernat/NOTELIFE/blob/master/Mockups/CreateNote.png)
- Add new record window.

![AddNote](https://github.com/AleksBernat/NOTELIFE/blob/master/Mockups/AddNote.png)
- Window successfully added entry.

![NoteAdded](https://github.com/AleksBernat/NOTELIFE/blob/master/Mockups/NoteAdded.png)
- Delete record window.

![DeleteNote](https://github.com/AleksBernat/NOTELIFE/blob/master/Mockups/DeleteNote.png)

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

<a name="system_requirements"/>

# 3 System Requirements

<a name="functional_requirements"/>

## 3.1 Functional Requirements

<a name="main_functions"/>

### 3.1.1 Basic Functions

<a name="user_logon_to_the_application"/>

#### 3.1.1.1 Add Note
**Description.** The user has the ability to add a new entry.

| Function | Requirements |
|:---|:---|
| Add record | The application should provide the user with the opportunity to create a record, as well as 2 fields for entering the main topic (name) of the record and its brief description. The user must either fill in all the fields and confirm the action, or cancel it |


<a name="setting_up_the_profile_of_the_active_user"/>

#### 3.1.1.2 Note Sorting
**Description.** User has the ability to sort existing Notes.

| Function | Requirements |
|:---|:---|
| Sort new Note | The application must provide the user with criteria for sorting the Note (by size, by date of addition). |

<a name="download_news"/>

#### 3.1.1.3 Edit Note
**Description.** The user should be able to change the added Note.

| Function | Requirements |
|:---|:---|
| Editing a record | The application should provide the user with the ability to edit individual elements of a post: title, description |


<a name="view_information_about_an_individual_newsletter"/>

#### 3.1.1.4 Note Search
**Description.** The user must be able to search his Notes.

| Function | Requirements |
|:---|:---|
| Note Search | The user has the ability to search for Notes by title and description. The application must sort the existing Notes according to the search results |

<a name="active_user_change"/>

#### 3.1.1.5 Delete Note
**Description.** The user should be able to delete unwanted Notes.

| Function | Requirements |
|:---|:---|
| Delete Note | The user has the ability to delete an extra Note. The application should display a window to confirm the deletion of the selected Note and give the user one last chance before choosing |


<a name="restrictions_and_exclusions"/>

### 3.1.2 Limitations and Exceptions

<a name="non-functional_requirements"/>

## 3.2 Non-functional requirements

<a name="quality_attributes"/>

### 3.2.1 Quality Attributes

<a name="requirements_for_ease_of_use"/>

#### 3.2.1.1 Usability Requirements

1. Convenient location of the table with entries and buttons to perform basic functions.
2. It takes only a few seconds to launch a project.
3. The interface should be clear and easy to use.

<a name="security_requirements"/>

#### 3.2.1.2 Security Requirements

1. The application should provide reliable information storage until it is deleted by the user. <br>
2. The application should display a message confirming the removal operations. <br>
3. The application should not restrict user access to files with records. <br>
 
<a name="restrictions"/>

### 3.2.2 Restrictions
The application is implemented in the Java programming language.
