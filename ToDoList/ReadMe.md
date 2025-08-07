# To-Do List Application (Java Console App)

This is a simple console-based To-Do List application developed using Java. The goal of this project is to help users manage tasks through a basic command-line interface. It is designed for beginners who want to practice object-oriented programming and file handling in Java.

## About the Project

The application allows users to:
- Add new tasks
- View all existing tasks
- Mark tasks as completed
- Remove tasks
- Save and load tasks from a file

## Versions

### Previous Version (Basic Console App)
- Tasks could be added, marked as done, viewed, and removed.
- However, all data was stored only in memory. Once the program closed, the tasks were lost.
- This version helped understand the structure of classes, methods, and simple user interaction via console.

### Current Version (With File Handling)
- Introduced persistent storage using `BufferedReader` and `BufferedWriter`.
- Tasks are now saved to a file (`tasks.txt`) and reloaded every time the application runs.
- Improved error handling and data consistency.
- Closer to how real-world applications manage data persistence.

## How to Run

1. Make sure Java is installed.
2. Clone this repository or download the files.
3. Compile the code using:

   ```bash
   javac ToDoApp.java
4. Run the Application
   
   ```bash
   java ToDoApp.java
