import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrel extends Actor
{
    /**
     * Act - do whatever the Barrel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + 2;
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        
        if (getY() >= world.getHeight())
        {
            int a = Greenfoot.getRandomNumber(600);
            int b = 0;
            setLocation(a, b);
        }
        
        if (isTouching(Seal.class))
        {
            removeTouching(Seal.class);
            world.gameOver();
            world.removeObject(this);
        }
    }    
}
