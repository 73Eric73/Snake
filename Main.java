import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        Board board = new Board(10,10);
        Snake snake = new Snake(4,4);
        Food.makeFood();

        System.out.println("Press w,a,s,d and enter for start!");

        while (true){

            //move the snake
            snake.move(Entrada.nextLine().charAt(0));

            //check if the snake crash
            if (snake.checkCrash(board)){
                System.out.println("Game Over");
                return;
            }

            //check if the snake eats
            if (snake.eat()){
                //position new food
                Food.makeFood();
            }

            //print the board
            cleanConsole();
            board.updateBoard(snake);
            board.printBoard();

        }

    }

    public static void cleanConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
