import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tittle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tittle extends Actor
{
    public void act()
    {
        click();
    }

    /**
     *this starts the game when clicked
     */
    public void click() 
    { 
        if(Greenfoot.mouseClicked(this))

        {
            Greenfoot.setWorld(new TurtleWorld());
        }
        // Add your action code here.
    }    
}
