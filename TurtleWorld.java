import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

public class TurtleWorld extends World
{
    /**
     * Create the turtle world. Our world has a size 
     * of 600x480 cells, where every cell is just 1 pixel.
     */
    public TurtleWorld() 
    {
        super(1500, 500, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        lettuce lettuce = new lettuce();
        addObject(lettuce, 423, 127);
        lettuce lettuce2 = new lettuce();
        addObject(lettuce2, 272, 90);
        lettuce lettuce3 = new lettuce();
        addObject(lettuce3, 459, 316);
        lettuce lettuce4 = new lettuce();
        addObject(lettuce4, 238, 289);
        lettuce lettuce5 = new lettuce();
        addObject(lettuce5, 325, 188);
        lettuce lettuce6 = new lettuce();
        addObject(lettuce6, 121, 107);
        lettuce lettuce7 = new lettuce();
        addObject(lettuce7, 391, 56);
        lettuce lettuce8 = new lettuce();
        addObject(lettuce8, 352, 403);
        lettuce lettuce9 = new lettuce();
        addObject(lettuce9, 484, 199);
        lettuce lettuce10 = new lettuce();
        addObject(lettuce10, 166, 205);
        lettuce lettuce11 = new lettuce();
        addObject(lettuce11, 125, 391);
        lettuce lettuce12 = new lettuce();
        addObject(lettuce12, 149, 49);
        lettuce lettuce13 = new lettuce();
        addObject(lettuce13, 537, 401);
        lettuce lettuce14 = new lettuce();
        addObject(lettuce14, 398, 280);
        lettuce lettuce15 = new lettuce();
        addObject(lettuce15, 94, 266);
        lettuce lettuce16 = new lettuce();
        addObject(lettuce16, 21, 26);
        lettuce lettuce17 = new lettuce();
        addObject(lettuce17, 580, 52);
        lettuce lettuce18 = new lettuce();
        addObject(lettuce18, 473, 84);
        lettuce lettuce19 = new lettuce();
        addObject(lettuce19, 541, 273);
        lettuce lettuce20 = new lettuce();
        addObject(lettuce20, 253, 383);
        lettuce lettuce21 = new lettuce();
        addObject(lettuce21, 233, 449);
        lettuce lettuce22 = new lettuce();
        addObject(lettuce22, 61, 152);
        Turtle turtle = new Turtle();
        addObject(turtle, 54, 334);
        snake snake = new snake();
        addObject(snake, 433, 195);
        Turtle turtle2 = new Turtle();
        addObject(turtle2, 1155, 90);
        snake snake2 = new snake();
        addObject(snake2, 917, 181);
        removeObject(snake);
        removeObject(turtle);
        turtle2.setLocation(36, 312);
        turtle2.setLocation(56, 434);
        lettuce11.setLocation(1057, 337);
        lettuce13.setLocation(843, 431);
        lettuce19.setLocation(689, 456);
        lettuce3.setLocation(739, 194);
        lettuce9.setLocation(610, 277);
        lettuce14.setLocation(1376, 100);
        lettuce18.setLocation(1376, 329);
        lettuce17.setLocation(1163, 88);
        lettuce.setLocation(438, 125);
        lettuce.setLocation(501, 403);
        lettuce8.setLocation(589, 63);
        lettuce5.setLocation(384, 226);
        lettuce4.setLocation(1158, 205);
        lettuce2.setLocation(272, 90);
        lettuce2.setLocation(272, 90);
        lettuce2.setLocation(272, 90);
        lettuce2.setLocation(272, 90);
        lettuce2.setLocation(272, 90);
        lettuce2.setLocation(272, 90);
        lettuce2.setLocation(272, 90);
        lettuce2.setLocation(272, 90);
        lettuce2.setLocation(272, 90);
        lettuce2.setLocation(272, 90);
        lettuce2.setLocation(272, 90);
        lettuce2.setLocation(1297, 422);
        lettuce10.setLocation(307, 109);
        lettuce6.setLocation(886, 318);
        lettuce15.setLocation(996, 48);
        lettuce22.setLocation(849, 69);
        lettuce16.setLocation(58, 230);
        lettuce20.setLocation(219, 248);
        lettuce6.setLocation(1093, 466);
        lettuce13.setLocation(872, 320);
        lettuce6.setLocation(1018, 440);
        turtle2.setLocation(82, 384);
        snake snake3 = new snake();
        addObject(snake3, 1060, 240);
        snake snake4 = new snake();
        addObject(snake4, 806, 129);
        snake3.setLocation(961, 314);
        snake2.setLocation(1039, 169);
        snake4.setLocation(940, 143);
        snake3.setLocation(968, 284);
        snake2.setLocation(1065, 190);
        snake3.setLocation(221,122);
        snake2.setLocation(1065,190);
        snake2.setLocation(1065,190);
        snake2.setLocation(1065,190);
        snake2.setLocation(1065,190);
        snake2.setLocation(1218,411);
        snake4.setLocation(716,338);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1218,411);
        snake2.setLocation(1306,77);
        knife knife = new knife();
        addObject(knife,1156,278);
        knife knife2 = new knife();
        addObject(knife2,934,201);
        knife knife3 = new knife();
        addObject(knife3,1368,435);
        knife knife4 = new knife();
        addObject(knife4,91,75);
        knife knife5 = new knife();
        addObject(knife5,566,167);
        knife knife6 = new knife();
        addObject(knife6,405,429);
        knife knife7 = new knife();
        addObject(knife7,1094,39);
        knife knife8 = new knife();
        addObject(knife8,297,332);
        knife knife9 = new knife();
        addObject(knife9,1374,209);
        knife.setLocation(858,469);
        knife8.setLocation(160,268);
        knife knife10 = new knife();
        addObject(knife10,646,353);
        knife knife11 = new knife();
        addObject(knife11,687,43);
        sheild sheild = new sheild();
        addObject(sheild,490,299);
        sheild sheild2 = new sheild();
        addObject(sheild2,1157,431);
        sheild sheild3 = new sheild();
        addObject(sheild3,1060,142);
        sheild sheild4 = new sheild();
        addObject(sheild4,497,66);
        sheild sheild5 = new sheild();
        addObject(sheild5,100,165);
        sheild sheild6 = new sheild();
        addObject(sheild6,1444,301);
        sheild sheild7 = new sheild();
        addObject(sheild7,293,443);
        Obstruction obstruction = new Obstruction();
        addObject(obstruction,47,481);
        Obstruction obstruction2 = new Obstruction();
        addObject(obstruction2,46,53);
        Obstruction obstruction3 = new Obstruction();
        addObject(obstruction3,833,250);
        Obstruction obstruction4 = new Obstruction();
        addObject(obstruction4,1466,53);
        Obstruction obstruction5 = new Obstruction();
        addObject(obstruction5,1465,478);
    }
}