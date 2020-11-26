import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class beeZapper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class beeZapper extends Actor
{
    public beeZapper() {
               GreenfootImage img = getImage();
        int height = img.getHeight();
        int width = img.getWidth();
        
        img.scale(width / 2 , height / 2);
        setImage(img);
    }
    
    /**
     * Act - do whatever the beeZapper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int moveAmount = 5;
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - moveAmount);
    }    
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() - moveAmount);
    } 
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX()- moveAmount, getY() );
    } 
        if(Greenfoot.isKeyDown("right")) {
            setLocation(getX() + moveAmount, getY());
    } 
    

}
}
