//tried the logic behind the game rock paper scissor
import java.util.*;

public class App{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Random random=new Random();
       

       String[] choices={"rock","paper","scissor"};

       boolean playAgain=true;

       while(playAgain){
           System.out.println("Enter your choice rock/paper/scissor:");
           String userchoice= sc.nextLine().toLowerCase();

           if(!userchoice.equals("rock")&&!userchoice.equals("paper")&&!userchoice.equals("scissor"))
          {
            System.out.println("Invalid Choice");
            continue;
          }
          
          int computerIndex= random.nextInt(3);
          String computerChoice=choices[computerIndex];
          System.out.println("Computer Choice:"+computerChoice);

          if (userchoice.equals(computerChoice)){
            System.out.println("It's a Draw");
          }
          else if (
            (userchoice.equals("rock")&&userchoice.equals("scissor"))||
            (userchoice.equals("scissor")&&userchoice.equals("paper"))||
            (userchoice.equals("paper")&&userchoice.equals("rock"))
          )
          {
            System.out.println("You Win");
          }
          else{
            System.out.println("Computer wins");
          }
          System.out.println("Do you want to play again?? yes/no");
          String again = sc.nextLine().toLowerCase();

          playAgain= again.equals("yes");
       }
       System.out.println("Thanks for playing");
       sc.close();
   }
}