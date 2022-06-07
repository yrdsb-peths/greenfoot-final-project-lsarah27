import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world where the Seal lives in.
 * 
 * @author Lynn 
 * @version June 2022
 */
public class MyWorld extends World
{
    private boolean lose = false;
    public int score = 0;
    Label scoreLabel;
    int level = 1;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        // Create a seal object
        Seal s  = new Seal();
        addObject(s, 525, 300);
        
        //Create a barrel object
        Barrel b = new Barrel();
        addObject(b, 200, 0);
        
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
        lose = true;
    }
    
  
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    
    /**
     * Create new cake at a random location at the top of the screen
     */
    public void createCake()
    {
        if (lose == false)
        {
            Cake c = new Cake();
            c.setSpeed(level);
            int x = Greenfoot.getRandomNumber(600);
            int y = 0;
            addObject(c, x, y);
        }
    }
}
