public class Food {

    protected static int x;
    protected static int y;
    protected static char symbol = 'X';

    protected static void makeFood(){
        x = (int) (Math.random()*10);
        y = (int) (Math.random()*10);
    }

}
