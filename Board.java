public class Board {

    protected int sizeX;
    protected int sizeY;
    protected char[][] board;

    public Board(int sizeX, int sizeY){
        this.sizeY = sizeY;
        this.sizeX = sizeX;
        this.board = new char[sizeX][sizeY];
    }

    public void updateBoard(Snake snake) {

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                board[i][j] = 'O';
            }
        }

        board[Food.y][Food.x] = Food.symbol;

        board[snake.positionY][snake.positionX] = snake.headSymbol;

        for (int i = 0; i < snake.length; i++) {
            board[snake.body[i][1]][snake.body[i][0]] = snake.bodySymbol;
        }

    }

    public void printBoard(){

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
