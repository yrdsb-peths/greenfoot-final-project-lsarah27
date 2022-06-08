import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for the Seal.
 * 
 * @author Lynn
 * @version June 2022
 */
public class Cake extends Actor
{
    int speed = 1;

    public Cake()
    {
        getImage().scale(70,70);
    }
    
    /**
     * Act - do whatever the Cake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Remove cake and draw game over when cake gets to bottom
        if(getWorld() instanceof MyWorld){
            MyWorld world = (MyWorld) getWorld();

            // cake falling
            int x = getX();
            int y = getY() + speed;
            setLocation(x, y);
            
            if(getY() >= world.getHeight())
            {
                world.gameOver();
                world.removeObject(this);
            }
        }
    }    

    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
