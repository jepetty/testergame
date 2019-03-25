package game;

public class App 
{
    public static void main( String[] args )
    {
        Interactive block = new GameObject(10,10);
        block.interact();
        System.out.println("I've interacted with one object");
        
        Interactive dialog = new Dialog();
        dialog.interact();
    }
}
