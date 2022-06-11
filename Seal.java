import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Seal.
 * 
 * @author Lynn 
 * @version June 2022
 */
public class Seal extends Actor
{
    GreenfootSound crunchSound = new GreenfootSound("sounds/crunchsound.mp3");
    /**
     * Act - do whatever the Seal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        
        // Add your action code here.
        if(Greenfoot.isKeyDown("Left"))
        {
            move(-2);
        }
        else if(Greenfoot.isKeyDown("Right"))
        {
            move(2);
        }
        
        eat();
    }    
    
    /**
     * Eat the cake and spawn a new cake
     */
    public void eat()
    {
        if(isTouching(Cake.class))
        {
            crunchSound.play();
            removeTouching(Cake.class);
            MyWorld world = (MyWorld) getWorld();
            world.createCake();
            world.increaseScore();
        }
    }
}
