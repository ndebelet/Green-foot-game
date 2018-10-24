import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{

    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 500, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        MenuButton menubutton = new MenuButton();
        addObject(menubutton, 268, 406);
        Tittle tittle2 = new Tittle();
        addObject(tittle2, 544, 422);
        Exit exit2 = new Exit();
        addObject(exit2, 863, 427);
        tittle2.setLocation(545, 401);
        exit2.setLocation(848, 414);
        tittle2.setLocation(545, 411);
    }
}
