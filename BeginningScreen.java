import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeginningScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeginningScreen extends World
{

    /**
     * Constructor for objects of class BeginningScreen.
     * 
     */
    public BeginningScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 600, 1); 
    }
    
    public void act(){
        if (Greenfoot.isKeyDown ("c")){
            Greenfoot.setWorld(new Battlefield());
        }
    }
}
