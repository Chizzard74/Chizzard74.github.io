import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class DragonFly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonFly extends Actor
{
    private boolean toggle = true;
    /**
     * Act - do whatever the DragonFly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int act_odds = Greenfoot.getRandomNumber(100); // 0 .. 99
        
        eatBees();
      
        if (act_odds <= 39)
       {
        int value = Greenfoot.getRandomNumber(20) + 4; // 4..23
        int turn_amt = Greenfoot.getRandomNumber(11) - 5; // 4..23
        move(value);
        turn(turn_amt);
       }

       if(isAtEdge())
       {
           turn(180);
           move(5);      
       }    
    } 
    public void eatBees() {
        List<Bee> targets = getObjectsInRange(200,Bee.class);
        //are there any bees near by?
        if (targets.size() > 0) 
        {
           Bee bee = targets.get(0);
           int x = bee.getX();
            int y = bee.getY();
            turnTowards(x,y);
            move(Greenfoot.getRandomNumber(7) + 4);
            
            if (isTouching(Bee.class)){
                
            removeTouching(Bee.class);
            
                if (toggle) {
                    World world = getWorld();
                    bee = new Bee();
                    world.addObject(bee, getX(), getY());
                 
                }
        toggle = !toggle;
    }     
    
} 
    }
}
