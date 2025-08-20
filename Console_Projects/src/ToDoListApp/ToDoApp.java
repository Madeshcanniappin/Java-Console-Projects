package ToDoListApp;
import java.io.*;
import java.util.*;

public class ToDoApp {
    private static final String FILE_NAME = "tasks.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Task> tasks = loadTasksFromFile(); 

        while (true) {
            System.out.println("------------ToDo List----------");
            System.out.println("1. Add Tasks");
            System.out.println("2. View All Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit App");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task Description: ");
                    String desc = sc.nextLine();
                    tasks.add(new Task(desc));
                    saveTasksToFile(tasks); 
                    System.out.println("Task added...");
                    break;

                case 2:
                    System.out.println("Your Tasks....");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet...");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            Task t = tasks.get(i);
                            String status = t.isDone() ? "[+]" : "[ ]";
                            System.out.println((i + 1) + ". " + status + " " + t.getDescription());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the Task Number to mark as done: ");
                    int num = sc.nextInt();
                    if (num >= 1 && num <= tasks.size()) {
                        tasks.get(num - 1).setDone(true);
                        saveTasksToFile(tasks); 
                        System.out.println("Task Marked As Done...");
                    } else {
                        System.out.println("Invalid Task Number...");
                    }
                    break;

                case 4:
                    System.out.print("Enter the Task Number to remove: ");
                    int rm = sc.nextInt();
                    if (rm >= 1 && rm <= tasks.size()) {
                        tasks.remove(rm - 1);
                        saveTasksToFile(tasks); 
                        System.out.println("Task removed...");
                    } else {
                        System.out.println("Invalid Task Number...");
                    }
                    break;

                case 5:
                    System.out.println("Exiting.... Bye Bye");
                    return;

                default:
                    System.out.println("Invalid option...");
            }
        }
    }

    
    private static void saveTasksToFile(List<Task> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Task task : tasks) {
                writer.write(task.isDone() + "::" + task.getDescription());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    
    private static List<Task> loadTasksFromFile() {
        List<Task> tasks = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) return tasks;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("::", 2);
                if (parts.length == 2) {
                    boolean done = Boolean.parseBoolean(parts[0]);
                    String description = parts[1];
                    tasks.add(new Task(description, done));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }

        return tasks;
    }
}
