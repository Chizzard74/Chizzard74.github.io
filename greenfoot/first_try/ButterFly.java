import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class butter_fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButterFly extends Flitter
{
    /**
     * Act - do whatever the butter_fly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        
        List<Bee> targets = getObjectsInRange(50,Bee.class);
        
        if (targets.size() > 0) {
            Bee bee = targets.get(0);
            int x = bee.getX();
            int y = bee.getY();
            
            int myX = getX();
            int myY = getY();
            
            int newX = myX + (x - myX);
            int newY = myY + (y - myY);
            turnTowards(newX, newY);
            move(Greenfoot.getRandomNumber(15) + 3);
            
        }
        int makeBaby = Greenfoot.getRandomNumber(100);
        
        if(makeBaby < 5) {  // 5% of the time
            
        
        World world = getWorld();
        ButterFly bf = new ButterFly();
        world.addObject(bf, getX(), getY());
    }
    }
    
    
    void sampleCode()  {
        int act_odds = Greenfoot.getRandomNumber(100); // 0 .. 99
        int number2 = Greenfoot.getRandomNumber(10) + 1; // 1 .. 10
        //   45.. 55 inclusive 0..9 ten numbers
        int number3 = Greenfoot.getRandomNumber(10) + 45; 
        // -10 .. - 5 inclusive six numbers
        int number4 = Greenfoot.getRandomNumber(6) - 10; 
        
        if (act_odds <= 39) {
        int value = Greenfoot.getRandomNumber(20) + 4; // 4..23
        int turn_amt = Greenfoot.getRandomNumber(40) - 10; // 4..23
        move(value);
        turn(turn_amt);
       }
       int locationX = getX();
       
        
       if(isAtEdge()) {
           turn(180);
           move(5);
       
       
       
    }
    }
}
