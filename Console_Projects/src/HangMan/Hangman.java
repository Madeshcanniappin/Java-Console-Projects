import java.util.*;
import java.io.*;

public class Hangman{
    public static void main(String[] args)
    {
        Console console=System.console();
        Scanner sc=new Scanner(System.in);
        if(console==null)
        {
            System.out.println("No Console Available please run it in the console...");
            return;
        }

        char[] hiddenInput=console.readPassword("Player 1 enter the secret word: ");
        String secretWord=new String(hiddenInput).toLowerCase();

        StringBuilder maskedWord=new StringBuilder();
        for(int i=0;i<secretWord.length();i++)
        {
            if(secretWord.charAt(i)==' '){
                maskedWord.append(' ');
            }
            else{
                maskedWord.append('*');
            }
        }

        int attempts=secretWord.length() -1;
        boolean wordGuessed=false;

        System.out.println("Word to Guess: "+maskedWord);

        while(attempts>0 && !wordGuessed)
        {
            System.out.println("Enter a letter: ");
            char guess=sc.next().toLowerCase().charAt(0);

            boolean found=false;
            for(int i=0;i<secretWord.length();i++)
            {
                if(secretWord.charAt(i)==guess)
                {
                    maskedWord.setCharAt(i, guess);
                    found=true;
                }
            }

            if(!found){
                attempts--;
                System.out.println("Wrong Guess!! Attempts left: "+attempts);
            }
            System.out.println("Current Word: "+ maskedWord);

            if(maskedWord.toString().equals(secretWord))
            {
                wordGuessed=true;
                System.out.println("Congrats!! You Guessed the word!!");
            }
        }

        if(!wordGuessed)
        {
            System.out.println("You Lost and the word was: "+secretWord);
        }
        sc.close();
    }
}