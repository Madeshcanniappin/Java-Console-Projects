import java.util.*;
public class CookieClicker
{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc =new Scanner(System.in);
        int cookies=0;
        int autoClicker=0;
        int autoClickerCost=10;
        boolean running=true;

        //game loop
        while(running)
        {
            //displaying the menu
            System.out.println("========Cookies Clicker !!=======");
            System.out.println("Cookies "+cookies);
            System.out.println("Auto-Clickers "+autoClicker);
            System.out.println("Auto-Clicker Cost "+autoClickerCost);
            System.out.println("---------------------------");

            //options for the player
            System.out.println("1. Click Cookies");
            System.out.println("2. Buy Auto Clicker");
            System.out.println("3. Wait(simulate Time)");
            System.out.println("4. Show Status");
            System.out.println("5. Exit");
            System.out.println("Choose an option:");
            int choice= sc.nextInt();

            //switch case for the options

            switch (choice) {
                case 1:
                    cookies++;
                    break;
                case 2:
                    if(cookies>=autoClickerCost)
                    {
                        autoClicker++;
                        cookies-=autoClickerCost;
                        autoClickerCost*=2;
                        System.out.println("Auto Clicker Purchased!!");
                    }
                    else{
                        System.out.println("Not Enough Cookies");
                    }
                    break;
                case 3:
                    if(autoClicker>0)
                    {
                        System.out.println("Generating Cookies...");
                        Thread.sleep(1000);
                        cookies+=autoClicker;
                        System.out.println("Auto Clickers added "+autoClicker+" cookies");

                    }
                    else{
                        System.out.println("You dont have any auto clickers yet!");
                    }
                    break;
                case 4:
                    System.out.println("-----Status-----");
                    System.out.println("Cookies: "+cookies);
                    System.out.println("Auto-Clickers: "+autoClicker);
                    System.out.println("Next Auto-Clicker Cost: "+autoClickerCost);
                    break;
                case 5:
                    System.out.println("Exiting the Game! Good Bye");
                    running=false;
                    break;
                default:
                    System.out.println("Invalid Choice... please try again");
            }

        }
        sc.close();

    }
}