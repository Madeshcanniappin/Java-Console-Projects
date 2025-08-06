
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class ToDoApp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List <Task> tasks=new ArrayList<>();
        boolean running=true;

        while(running)
        {
            System.out.println("------------ToDo List----------");
            System.out.println("1. Add Tasks");
            System.out.println("2. View All Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit App");
            System.out.println("Choose an option: ");
            int choice=sc.nextInt();
            sc.nextLine();


            switch(choice)
            {
                case 1:
                    System.out.println("Enter task Description: ");
                    String desc=sc.nextLine();
                    
                    tasks.add(new Task(desc));
                    System.out.println("Task added...");
                    break;
                case 2:
                    System.out.println("Your Tasks....");
                    if(tasks.isEmpty())
                    {
                        System.out.println("No tasks yet...");
                    }
                    else{
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i+1)+"."+tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the Task Number to mark as done: ");
                    int doneIndex=sc.nextInt()-1;
                    if(doneIndex>=0 && doneIndex<tasks.size())
                    {
                        tasks.get(doneIndex).markAsDone();
                        System.out.println("Task Marked As Done...");
                    }
                    else{
                        System.out.println("Invalid task number");
                    }
                    break;
                case 4:
                    System.out.println("Enter task number to delete :");
                    int delIndex=sc.nextInt()-1;
                    if (delIndex>=0 && delIndex<tasks.size())
                    {
                        tasks.remove(delIndex);
                        System.out.println("Task removed...");
                    }
                    else{
                        System.out.println("Invalid Task number");
                    }
                    break;
                case 5:
                    running=false;
                    System.out.println("Exiting.... Bye Bye ");
                    break;
                default:
                    System.out.println("Inavlid Option.... Try Again!!");
            }       
        }
    }
}