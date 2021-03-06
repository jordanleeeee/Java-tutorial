package exercise;

import java.util.Scanner;

enum GameState {processing, winning, draw}

public class TicTacToe {

    private String player1;
    private String player2;
    private int dimension;
    private char[][] gamePane;
    private int round = 0;
    private GameState state = GameState.processing;

    /**
     *  initialize all the variable
     */
    private TicTacToe(String player1, String player2, int dimension) {
        // todo add your code here
    }

    /**
     * print the tic tac toe gamePane in the following format
     * the following are example
     *
     * o|o|x        if the dimension is 3
     * ------       <---- you should print 2*dimension number of - to separate each row
     * o| |x        <---- you should print | to separate each col
     * ------       <---- you should print 2*dimension number of - to separate each row
     *  | |x        <----each grid can be a 'x' or a 'o' or a space
     *
     * o| |x| |    if the dimension is 5
     * ----------   <---- you should print 2*dimension number of - to separate each row
     *  |o| | |
     * ----------
     *  | | | |
     * ----------
     *  | |x|o|
     * ----------
     *  | |x| |
     *
     */
    private void displayGamePane(){
        // todo add your code here
    }

    /**
     * let the game start and make it keep loop until someone win
     *
     * each round of the game include:
     *      display the gamePane
     *      tell who is going to take turn
     *      let the user select row and col and place the symbol to the gamePane
     *          (you can assume user always choose empty grid)
     *      player1 use 'o', player2 use 'x' as the symbol
     *
     * when the game end with someone win, display the gamePane and say Congratulation to the winner
     * when the game end with draw, display the gamePane and say It is a draw
     */
    private void startGame(){
        System.out.println("Game Start");
        Scanner scanner = new Scanner(System.in);
        // todo add your code here (the beginning of the game)

        // todo add your code here (the main loop of the game)

        // todo add your code here (the ending of the game i.e. when someone win or a draw)
    }

    /**
     * update the game state
     *
     * have any row that is all 'o' ?
     * have any row that is all 'x' ?
     *
     * have any col that is all 'o' ?
     * have any col that is all 'x' ?
     *
     * from the top left to bottom right is all 'x' ?
     * from the top left to bottom right is all 'o' ?
     *
     * from the top right to bottom left is all 'x' ?
     * from the top right to bottom left is all 'o' ?
     *
     * if either one of the above is true, game state will become winning
     * if it is a draw, draw state will become draw
     */
    private void updateGameStatus() {
        // todo add your code here

        // someone win?
            // horizontal

            // vertical

            // top left to bottom right

            // top right to bottom left

        // the game draw?

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first player name");
        String player1 = sc.next();
        System.out.println("please enter second player name");
        String player2 = sc.next();
        System.out.println("please enter dimension (it must be integer > 1!)");
        int dimension = sc.nextInt();

        TicTacToe game = new TicTacToe(player1, player2, dimension);
        game.startGame();
    }
}

/*
 you can do extra task when you complete the assignment
 1) no longer assume player always choose empty grid in each round, let the user choose another grid
        when the user choose a non-empty grid
 2) add robot player mode:
        if player name contain "robot", that player will automatically choose any random grid
            and will go the next player turn
 */


/*

the following is example output:

please enter first player name
Jordan
please enter second player name
Carolyn
please enter dimension (it must be an odd number > 1!)
3
Game Start
 | |
------
 | |
------
 | |
Jordan's turn, please select which row
0
please select which col
0
o| |
------
 | |
------
 | |
Carolyn's turn, please select which row
0
please select which col
1
o|x|
------
 | |
------
 | |
Jordan's turn, please select which row
1
please select which col
1
o|x|
------
 |o|
------
 | |
Carolyn's turn, please select which row
2
please select which col
2
o|x|
------
 |o|
------
 | |x
Jordan's turn, please select which row
1
please select which col
0
o|x|
------
o|o|
------
 | |x
Carolyn's turn, please select which row
2
please select which col
0
o|x|
------
o|o|
------
x| |x
Jordan's turn, please select which row
1
please select which col
2
o|x|
------
o|o|o
------
x| |x
Congratulation! Jordan you win the game

*/

