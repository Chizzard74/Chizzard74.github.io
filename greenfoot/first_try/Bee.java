import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    /**
     * Bee constructor, called when 'new' is used
     */
    public Bee() {
        GreenfootImage img = getImage();
        int height = img.getHeight();
        int width = img.getWidth();
        
        img.scale(width / 2 , height / 2);
        setImage(img);
    }
    
    public void act() 
    {
        List<Actor> targets = getObjectsInRange (100, Actor.class);
        
        if (targets.size() > 0) {
           |DDDFASDFbutterFly = targets.get(0);
            int x = butterFly.getx();
            int y = butterFly.getY();
            turnTowards(x,y);
            move(8);
        }
    }    
}
