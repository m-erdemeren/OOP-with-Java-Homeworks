import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * A program to implement the game Tic Tac Toe.
 * 
 * @author Erdem Eren
 * @version 04.25.2020
 */
public class TicTacToe
{
    private String[][] board = new String[3][3];

    /**
     * Constructor for objects of class TicTacToe
     */
    public TicTacToe()
    {
        for(int i = 0; i<3; i++)
            for(int j = 0; j<3; j++)
                board[i][j] = "_";
    }

    /**
     * Prints the coordinates of the board and the current board 
     */
    public void printBoard()
    {
        System.out.println("COORDINATES ON THE BOARD");
        for(int i = 0; i<3; i++)
        {
           for(int j = 0; j<3; j++)
               System.out.print("("+i + ","+ j+")"+ "  ");
           System.out.println();
           System.out.println();
        }
        System.out.println("CURRENT BOARD");
        for(int i = 0; i<3; i++)
        {
           for(int j = 0; j<3; j++)
               System.out.print(board[i][j]+ "  ");
           System.out.println();
           System.out.println();
        }
    }
    
    /**
     * Prints the available coordinates on the board
     */
    public void printAvailableCoordinates()
    {
       System.out.println("AVAILABLE COORDINATES ON THE BOARD");
       for(int i = 0; i<3; i++)
       {
          for(int j = 0; j<3; j++)
          {
              if(board[i][j]=="_")
                System.out.print("("+i + ","+ j+")"+ ", ");
          }
       }
       System.out.println();
    }

    /**
     * Checks whether the game is still on or over
     * 
     * @return 1 if game still continues, -1 if game is over
     */
    public int checkWinDrawn()
    { 
       JOptionPane f = new JOptionPane();
       for(int i = 0; i < 3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                if((board[i][0]).equals("O")){
                    f.showMessageDialog(f, "FIRST PLAYER WINS");
                    return -1;
                }else if((board[i][0]).equals("X")){
                    f.showMessageDialog(f, "SECOND PLAYER WINS");
                    return -1;
                }
            }
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                if((board[0][i]).equals("O")){
                    f.showMessageDialog(f, "FIRST PLAYER WINS");
                    return -1;
                }else if((board[0][i]).equals("X")){
                    f.showMessageDialog(f, "SECOND PLAYER WINS");
                    return -1;
                }
            }
       }
       if((board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] == board[1][1] && board[1][1] == board[2][0])){
           if((board[1][1]).equals("O")){
               f.showMessageDialog(f, "FIRST PLAYER WINS");
               return -1;
           }else if((board[1][1]).equals("X")){
               f.showMessageDialog(f, "SECOND PLAYER WINS");
               return -1;
           }
       }
       boolean b = false;
       for(int i = 0; i<3; i++)
       {
          for(int j = 0; j<3; j++)
          {
              if(board[i][j]=="_")
                b = true;
          }
       }
       if(!b){
           f.showMessageDialog(f, "DRAW");
           return -1;
       }
       return 1 ;
    }
    
    /**
     * Starts the game TicTacToe
     */
    public void playGame()
    {
       JOptionPane frame = new JOptionPane();
       int turn = 0;
       String player;
       printBoard();
       printAvailableCoordinates();
       while(checkWinDrawn() == 1){
           if(turn == 0){
               player = "FIRST PLAYER";
               frame.showMessageDialog(frame, "It is " + player + " turn");
               
               String[] target = frame.showInputDialog(frame, "Please enter the "
                      + "coordinates of the place you would like to mark:").split(",");
               int row = Integer.parseInt(target[0]);
               int column = Integer.parseInt(target[1]);
               board[row][column] = "O";
               
               turn++;
           }else{
               player = "SECOND PLAYER";
               frame.showMessageDialog(frame, "It is " + player + " turn");
               
               String[] target = frame.showInputDialog(frame, "Please enter the "
                      + "coordinates of the place you would like to mark:").split(",");
               int row = Integer.parseInt(target[0]);
               int column = Integer.parseInt(target[1]);
               board[row][column] = "X";
               
               turn = 0;
           }
           printBoard();
           printAvailableCoordinates();
       }
                                        
    }
   
}
