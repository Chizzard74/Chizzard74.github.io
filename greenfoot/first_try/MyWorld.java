import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        setBackground("images/scratch_pic.jpg");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ButterFly Butterfly = new ButterFly();
        addObject(Butterfly,51,81);
        ButterFly Butterfly2 = new ButterFly();
        addObject(Butterfly2,125,117);
        Bee bee = new Bee();
        addObject(bee,408,194);
        Dolphin dolphin = new Dolphin();
        addObject(dolphin,364,329);
        DragonFly dragonFly = new DragonFly();
        addObject(dragonFly,248,236);
        beeZapper beeZapper = new beeZapper();
        addObject(beeZapper,596,310);
    }
}
