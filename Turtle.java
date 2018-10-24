import greenfoot.*; 

public class Turtle extends Animal
{
    public void act()
    {

        move(4);
        checkKeys();
        turnAtLion();

        trytoEatlettuce();
        trytoEatknife();
        trytoEatsheild();
        if("space".equals(Greenfoot.getKey())){
            Shoot();

        }
    }

    /**
     * check if a key is pressed the left cursour key turn left and right cursor key turns right all other keys are ignored
     */ 

    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }

    }

    /**
     * this controls the random turning of the characther
     */
    public void randomturn()
    {

        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(40)-20);

        }
    }

    /**
     * check if at world edge and turn small amount.
     */
    public void turnAtedge()
    {
        if(atWorldEdge())    
        {

            turn(4);
        }
    }

    public void turnAtLion()
    {
        if(canSee(Obstruction.class))
        {
            turn(5);
        }

    }

    /**
     * check whether can see spear if can eat spear
     */
    public void trytoEatlettuce()
    {
        if(canSee(lettuce.class))
        {
            Greenfoot.playSound("slurp.wav");
            eat(lettuce.class);

        }
    }

    /**
     * check whether can see kinfe if can eat knife
     */
    void trytoEatknife()
    {
        if(canSee(knife.class))
        {
            Greenfoot.playSound("slurp.wav");
            eat(knife.class);
        }

    }

    /**
     * cheaks whether can see sheild and eats it
     */
    void trytoEatsheild()
    {
        if(canSee(sheild.class))
        {
            Greenfoot.playSound("slurp.wav");
            eat(sheild.class);
        }
    }

    /**
     * this shoot a projectile from the zulu player
     */
    public void Shoot()
    {Projectile projectile = new Projectile();
        getWorld().addObject(projectile,getX(), getY());
        projectile.setRotation(getRotation());
    }
}

 