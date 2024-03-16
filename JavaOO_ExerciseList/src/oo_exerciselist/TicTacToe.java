package oo_exerciselist;

/*
EXERCISE 2
Write a complete program to play tic-tac-toe. To do so, create a class
TicTacToe:
• The class must contain as private data a 3x3 two-dimensional array to represent the
game grid;
• Create a list to represent the possibilities of occupying a house in the
grid (empty, 1 or player 2);
• The constructor must initialize the grid as empty;
• Provide a method for displaying the grid;
• Allow two human players;
• Provide a method for playing the game; all movement must take place in an empty square;
After the move, determine whether there was a loss or a draw.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    private Position[][] grid;
    private Player currentPlayer;

    enum Position {
        E, X, O
    }

    enum Player {
        P1, P2
    }

    public TicTacToe() {
        grid = new Position[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = Position.E;
            }
        }
        currentPlayer = Player.P1;
    }

    public void showGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

    public boolean victoryVerify(Position player) {
        // Verify lines and columns
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == player && grid[i][1] == player && grid[i][2] == player
                    || grid[0][i] == player && grid[1][i] == player && grid[2][i] == player) {
                return true;
            }
        }
        // Verify diagonals
        if ((grid[0][0] == player && grid[1][1] == player && grid[2][2] == player)
                || (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player)) {
            return true;
        }
        return false;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showGrid();
            System.out.println("\nPlayer " + currentPlayer + ", choose the line (1-3): ");
            int line = readValidInput(scanner);
            System.out.println("Player " + currentPlayer + ", choose the column (1-3): ");
            int column = readValidInput(scanner);

            if (line >= 0 && line < 3 && column >= 0 && column < 3 && grid[line][column] == Position.E) {
                grid[line][column] = currentPlayer == Player.P1 ? Position.X : Position.O;
                if (victoryVerify(currentPlayer == Player.P1 ? Position.X : Position.O)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                } else if (allMovementsMade()) {
                    System.out.println("Draw!");
                    break;
                }
                currentPlayer = (currentPlayer == Player.P1) ? Player.P2 : Player.P1;
            } else {
                System.out.println("Invalid movement, try again.");
            }
        }
    }

    private int readValidInput(Scanner scanner) {
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                if (input < 1 || input > 3) {
                    System.out.println("Input must be between 1 and 3. Try again:");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a valid number.");
                scanner.next();
            }
        }
        return input - 1;
    }

    public boolean allMovementsMade() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == Position.E) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
