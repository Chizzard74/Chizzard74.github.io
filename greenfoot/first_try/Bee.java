import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Flitter
{
    private boolean toggle;
    private int butterFlyCounter = 0;
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
        super.act();
        
        List<ButterFly> targets = getObjectsInRange(170,ButterFly.class);
        //are there any bees near by?
        if (targets.size() > 0) {
            ButterFly butterFly = targets.get(0);
            int x = butterFly.getX();
            int y = butterFly.getY();
            turnTowards(x,y);
            move(Greenfoot.getRandomNumber(7) + 4);
            
            if (isTouching(ButterFly.class)){
                
            removeTouching(ButterFly.class);
            butterFlyCounter++;
            
            if (butterFlyCounter >= 6) {
                World world = getWorld();
                Bee bee = new Bee();
                world.addObject(bee, getX(), getY());
                butterFlyCounter = 0;
             
        }
        toggle = !toggle;
    }     
    
} 
}

}
