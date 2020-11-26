import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends ButterFly
{
    /**
     * Act - do whatever the dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        super.act();
        turn(30);
        
        World world = getWorld();
        ButterFly bf = new ButterFly();
        world.addObject(bf, getX(), getY());
        
        
    }    
}
