import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuh extends Actor
{
    /**
     * Act - do whatever the musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void movemusuh()
    {
        setLocation(getX(),getY()+3);    
    }
    public void removemusuh()
    {
        if (getY()==0)
        {
            getWorld().removeObject(this);
        }
    }
}
