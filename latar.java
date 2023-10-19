import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class latar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class latar extends World
{

    /**
     * Constructor for objects of class latar.
     * 
     */
    public latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        prepare();
    }
    public void act()
    {
        {
            addmusuh1();
            addmusuh2();
        }
    }
    public void addmusuh1()
    {
        if(Greenfoot.getRandomNumber(130)<1)
        {
        addObject(new musuh1(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    public void addmusuh2()
    {
        if(Greenfoot.getRandomNumber(100)<1)
        {
        addObject(new musuh2(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bird bird = new bird();
        addObject(bird,530,528);
        bird.setLocation(201,288);
        bird.setLocation(500,562);
        bird.setLocation(310,560);
    }
}
