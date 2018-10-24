import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButton extends Actor
{
    /**
     * Act - do whatever the MenuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }  
    /**
     * this allows the user to go to the startScreen by clicking this button.
     */
    public void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new StartScreen());
        }
    }
}
