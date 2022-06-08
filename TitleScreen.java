 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Lynn
 * @version June 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Feed the Seal", 75);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 180);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Seal seal = new Seal();
        addObject(seal,92,313);
        seal.setLocation(114,314);

        Label label = new Label("Press <space> to Start", 40);
        addObject(label,282,243);
        label.setLocation(306,230);

        seal.setLocation(94,370);
        seal.setLocation(85,297);

        Cake cake = new Cake();
        addObject(cake,509,85);

        Barrel barrel = new Barrel();
        addObject(barrel,373,190);

        cake.setLocation(547,270);
        seal.setLocation(89,303);
        cake.setLocation(547,269);
        barrel.setLocation(430, 285);
        barrel.setLocation(450,307);
    }
}
