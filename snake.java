import greenfoot.*; 

public class snake extends Animal
{
    public void act()
    {

        move(4);
        if(Greenfoot.getRandomNumber(20)==1)
        {
            setRotation(Greenfoot.getRandomNumber(360));
        }

        turnAtedge(); 

        trytoEatTurtle();
        die();
    }

    /**
     * check if at world edge and turn small amount.
     */
    public void turnAtedge()
    {
        if(atWorldEdge())    
        {

            turn(5);
        }
    }

    /**
     * check whether can see zulu and destroys it
     */
    void trytoEatTurtle()
    {
        if(canSee(Turtle.class))
        {
            eat(Turtle.class);

        }
    }

    /**
     * this makes the enemy be obstructed when encoutering a lion
     */
    public void urnAtLion()
    {
        if(canSee(Obstruction.class))
        {
            turn(5);
        }

    }
    /**
     * this makes the enemy die when it meets the projectile
     */
  public void die()
  {
      Actor Projectile = getOneIntersectingObject(Projectile.class);
      if(Projectile!=null)
      {
        getWorld().removeObject(Projectile);
        getWorld().removeObject(this);
        }
   
    }


}

