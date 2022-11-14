## Getting Started


This program compares a user input password to common password validation rules, and compares
the input to a list of most commonly used passwords, returning to the user if the password is 
considered valid, and if not it gives the user the reasons why/what requirements are not met. 

## Packages

- App: the main method for the program
- PasswordChecker: contains methods for getting user input, displaying result outputs, 
  and calls on comparison methods to validate user input
- Compare: contains the methods for comparing user input to password requirements, 
  and comparing with common password list (found in txt file)
- OutputDisplay: misc output formmating methods, also incluse method for running again
- PasswordList: contains methods for reading passwordlist.txt, and adding to the list.
  Instructions to access these methods included in comments at begining of App.java
- passwordlist.txt: text file containing the list of most commonly used passwords

## Folder Structure


- `src`: the folder to maintain sources. Contains main App.java
  - `files`: folder containing the packages for the app. 
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin`.

> `.vscode/settings.json` contains folder structure related settings.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
