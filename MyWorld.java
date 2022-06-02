import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world where the Seal lives in.
 * 
 * @author Lynn 
 * @version June 2022
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        // Create the seal object
        Seal s  = new Seal();
        addObject(s, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createCake();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
  
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    
    /**
     * Create new cake at a random location at the top of the screen
     */
    public void createCake()
    {
        Cake c = new Cake();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(c, x, y);
    }
}
