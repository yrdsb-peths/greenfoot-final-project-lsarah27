 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
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
        Label label2 = new Label("press <space> to start", 35);
        addObject(label2,323,300);
        label.setLocation(362,243);
        label.setLocation(372,231);
        removeObject(label);
        label2.setLocation(310,246);
        seal.setLocation(84,313);
        cake.setLocation(567,101);
        barrel.setLocation(494,308);
        cake.setLocation(556,220);
        Label label3 = new Label("use arrow keys to move", 35);
        addObject(label3,302,283);
        label3.setLocation(312,280);
        cake.setLocation(529,60);
        barrel.setLocation(441,80);
        Label label4 = new Label("(avoid the barrel!)", 40);
        addObject(label4,308,221);
        label3.setLocation(405,343);
        label2.setLocation(483,308);
        label2.setLocation(450,308);
        label2.setLocation(491,307);
        label2.setLocation(347,320);
        label2.setLocation(510,306);
        label2.setLocation(428,309);
        label4.setLocation(428,240);
        label4.setLocation(308,227);
        label2.setLocation(388,316);
        label2.setLocation(451,316);
        label2.setLocation(465,311);
        label2.setLocation(462,308);
        label2.setLocation(480,306);
        label2.setLocation(348,316);
        label2.setLocation(333,316);
    }
}
