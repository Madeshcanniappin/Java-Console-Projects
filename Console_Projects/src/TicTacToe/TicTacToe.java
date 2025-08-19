import java.util.*;

public class TicTacToe{
     
     static char[][] board= {{' ',' ',' '},
                             {' ',' ',' '},
                             {' ',' ',' '}};

    static char currentPlayer='x';

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe....!!!");
        printboard();
        Scanner sc=new Scanner(System.in);
        boolean gameEnded=false;

        while(!gameEnded)
        {
            
            System.out.println("Player "+currentPlayer+" enter your move :");
            int row=sc.nextInt();
            int col=sc.nextInt();

            if(row<0 || row >2 || col<0 || col>2 || board[row][col]!=' '){
                System.out.println("Invalid Move Try Again ....");
                continue;
            }

            board[row][col]=currentPlayer;
            printboard();

            if(checkWin())
            {
                printboard();
                System.out.println("Player "+currentPlayer+" Wins!!!");
                gameEnded=true;
            }
            else if(checkDraw())
            {
                printboard();
                System.out.println("It's a Draw...");
                gameEnded=true;
            }
            else{
                currentPlayer= (currentPlayer=='x')?'o':'x';
            }

        }
        sc.close();
    }

    static void printboard()
    {
        for(int i=0;i<3;i++)
        {
            System.out.print("|");
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+(board[i][j])+"|");
            }
            System.out.println();
            System.out.println("---------");
        }
    }

    static boolean checkWin()
    {
         
        //rows and columns
          for(int i=0;i<3;i++)
          {
            if((board[i][0]==currentPlayer && board[i][1]==currentPlayer && board[i][2]==currentPlayer )        
               ||( board[0][i]==currentPlayer && board[1][i]==currentPlayer && board[2][i]==currentPlayer))    
               {
                    return true;
               }
          }
        //diagnols
        if((board[0][2]==currentPlayer && board[1][1]==currentPlayer && board[2][0]==currentPlayer)
              || (board[2][0]==currentPlayer && board[1][1]==currentPlayer && board[0][2]==currentPlayer))
              {
                return true;
              }
        return false;      
    }

    static boolean checkDraw()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j]==' ')
                {
                    return false;
                }
            }
        }
        return true;
    }
}