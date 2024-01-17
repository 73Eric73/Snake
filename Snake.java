public class Snake {

    //position of head
    protected int positionX;
    protected int positionY;
    protected char headSymbol = '<';

    //the body
    protected int length = 1;
    protected char bodySymbol = '-';
    protected int[][] body = new int[100][2];;

    public Snake(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
        body[0] = new int[]{positionX + 1, positionY};
    }

    public void move(char in){

        for (int i = length; i > 0; i--) {
            body[i][0] = body[i - 1][0];
            body[i][1] = body[i - 1][1];
        }

        body[0][0] = positionX;
        body[0][1] = positionY;

        switch (in){
            case 'w' -> positionY--;
            case 's' -> positionY++;
            case 'd' -> positionX ++;
            case 'a' -> positionX --;
        }

    }

    public boolean checkCrash (Board board) {
        return positionX >= board.sizeX || positionY >= board.sizeY || positionX < 0 || positionY < 0;
    }

    public boolean eat() {
        if(positionY == Food.y && positionX == Food.x){
            length++;
            return true;
        }
        return false;
    }

}

