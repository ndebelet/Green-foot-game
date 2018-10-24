import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Actor
{
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }   
    /**
     * this allows the user to go to the help screen by clicking this button.
     */

    public void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HelpScreen());
        }
    }
}
