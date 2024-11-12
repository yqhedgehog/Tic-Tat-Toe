package Small_Project;
import java.util.Scanner;

public class TicTatToe {

    private static char[][] board = new char[5][5];
    private static int count=8;

    // player label
    private static final char PLAYERA='X';
    private static final char PLAYERB='O';

    // board label
    private static final char[] ROWLABEL={' ', '1', ' ', '2', ' ', '3'};
    private static final char[] COLUMNLABEL={'A', ' ', 'B', ' ', 'C'};

    public static void settingUpTheBoard() {

        board[0][1]='|';
        board[0][3]='|';
        board[1][0]='-';
        board[1][1]='+';
        board[1][2]='-';
        board[1][3]='+';
        board[1][4]='-';
        board[2][1]='|';
        board[2][3]='|';
        board[3][0]='-';
        board[3][1]='+';
        board[3][2]='-';
        board[3][3]='+';
        board[3][4]='-';
        board[4][1]='|';
        board[4][3]='|';

        for (int i = 0; i < 6; i++) {
            if (i < 5) {
                System.out.print(TicTatToe.ROWLABEL[i]);
            } else {
                System.out.println(TicTatToe.ROWLABEL[i]);
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(TicTatToe.COLUMNLABEL[i]);
            for (int j = 0; j < 5; j++) {
                if (j < 4) {
                    if (board[i][j] == '|' || board[i][j] == '-' || board[i][j] == '+' || board[i][j] == 'X' || board[i][j] == 'O') {
                        System.out.print(board[i][j]);
                    } else {
                        board[i][j]=' ';
                        System.out.print(board[i][j]);
                    }
                } else {
                    if (board[i][j] == '|' || board[i][j] == '-' || board[i][j] == '+' || board[i][j] == 'X' || board[i][j] == 'O') {
                        System.out.println(board[i][j]);
                    } else {
                        board[i][j]=' ';
                        System.out.println(board[i][j]);
                    }
                }   
            }
        }
    }

    public static void displayBoard() {
        for (int i = 0; i < 6; i++) {
            if (i < 5) {
                System.out.print(TicTatToe.ROWLABEL[i]);
            } else {
                System.out.println(TicTatToe.ROWLABEL[i]);
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(TicTatToe.COLUMNLABEL[i]);
            for (int j = 0; j < 5; j++) {
                if (j < 4) {
                    if (board[i][j] == '|' || board[i][j] == '-' || board[i][j] == '+' || board[i][j] == 'X' || board[i][j] == 'O') {
                        System.out.print(board[i][j]);
                    } else {
                        board[i][j]=' ';
                        System.out.print(board[i][j]);
                    }
                } else {
                    if (board[i][j] == '|' || board[i][j] == '-' || board[i][j] == '+' || board[i][j] == 'X' || board[i][j] == 'O') {
                        System.out.println(board[i][j]);
                    } else {
                        board[i][j]=' ';
                        System.out.println(board[i][j]);
                    }
                }   
            }
        }
    }

    public static String checkingResult(char player) {
        String result = null;
        if ((board[0][0] == player && board[0][2] == player && board[0][4] == player)
        || (board[2][0] == player && board[2][2] == player && board[2][4] == player)
        || (board[4][0] == player && board[4][2] == player && board[4][4] == player)
        || (board[0][0] == player && board[2][0] == player && board[4][0] == player)
        || (board[0][2] == player && board[2][2] == player && board[4][2] == player)
        || (board[0][4] == player && board[2][4] == player && board[4][4] == player)
        || (board[0][0] == player && board[2][2] == player && board[4][4] == player)
        || (board[0][4] == player && board[2][2] == player && board[4][0] == player)) {
            result="Win";
        }
        return result;
    }

    public static void input(String humanInput, char player){
        char firstLetter=humanInput.charAt(0);
        char secondLetter=humanInput.charAt(1);
        switch (firstLetter)
        {
            case 'A' :
                if (secondLetter == '1') {
                    if (board[0][0] != ' '){
                        System.out.println("The space has been filled by your opponent");
                    } else {
                        board[0][0]=player;
                    }
                } else if (secondLetter == '2') {
                    if (board[0][2] != ' '){
                        System.out.println("The space has been filled by your opponent");
                    } else {
                        board[0][2]=player;
                    }
                } else if (secondLetter == '3') {
                    if (board[0][4] != ' '){
                        System.out.println("The space has been filled by your opponent");
                    } else {
                        board[0][4]=player;
                    }
                }
                displayBoard();
                break;
            case 'B' :
                if (secondLetter == '1') {
                    if (board[2][0] != ' '){
                        System.out.println("The space has been filled by your opponent");
                    } else {
                        board[2][0]=player;
                    }
                } else if (secondLetter == '2') {
                    if (board[2][2] != ' '){
                        System.out.println("The space has been filled by your opponent");
                    } else {
                        board[2][2]=player;
                    }
                } else if (secondLetter == '3') {
                    if (board[2][4] != ' '){
                        System.out.println("The space has been filled by your opponent");
                    } else {
                        board[2][4]=player;
                    }
                }
                displayBoard();
                break;
            case 'C' :
                if (secondLetter == '1') {
                    if (board[4][0] != ' '){
                        System.out.println("The space has been filled by your opponent");
                    } else {
                        board[4][0]=player;
                    }
                } else if (secondLetter == '2') {
                    if (board[4][2] != ' '){
                        System.out.println("The space has been filled by your opponent");
                    } else {
                        board[4][2]=player;
                    }
                } else if (secondLetter == '3') {
                    if (board[4][4] != ' '){
                        System.out.println("The space has been filled by your opponent");
                    } else {
                        board[4][4]=player;
                    }
                }
                displayBoard();
                break;
            default :
                System.out.println("Input is invalid");
                displayBoard();
                break;   
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Tic-Tat-Toe Match!");
        System.out.println("");
        settingUpTheBoard();
        System.out.println("");

        Scanner s = new Scanner(System.in);
        while (count>0) {
            if (count%2 == 0) {
                System.out.println("Opponent A, you are 'X'. Please provide your position on the board (for e.g. A1).");
                String userInput = s.next();
                input(userInput, TicTatToe.PLAYERA);
                String decision = checkingResult(TicTatToe.PLAYERA);
                if (decision != null) {
                    System.out.println("Player A is the winner!");
                    break;
                }
                count--;
            } else {
                System.out.println("Opponent B, you are 'O'. Please provide your position on the board (for e.g. A2).");
                String userInput = s.next();
                input(userInput, TicTatToe.PLAYERB);
                String decision = checkingResult(TicTatToe.PLAYERB);
                if (decision != null) {
                    System.out.println("Player B is the winner!");
                    break;
                }
                count--;
            }
        }
        s.close();
    }
}
