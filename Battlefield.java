import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Battlefield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Battlefield extends World
{
    private int spawnCounter;
    /**
     * Constructor for objects of class Battlefield.
     * 
     */
    public Battlefield()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 600, 1); 

        prepare();

        Player2HP scoreCounter = new Player2HP("P2 HP: ");  
        addObject(scoreCounter, 600, 50); 

        Player1HP scoreCounter2 = new Player1HP("P1 HP: ");  
        addObject(scoreCounter2, 60, 50); 

         
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Player1 player1 = new Player1();
        addObject(player1, 19, 105);
        Player2 player2 = new Player2();
        addObject(player2, 23, 503);
        player1.setLocation(68, 126);
        player2.setLocation(46, 499);
        player2.setLocation(620, 255);
        player1.setLocation(23, 253);
        player2.setLocation(625, 255);

        Player2HP player2hp = new Player2HP();
        addObject(player2hp, 638, 459);
        player2hp.setLocation(597, 459);
        player2hp.setLocation(563, 458);
        removeObject(player2hp);

        player2.setLocation(625, 301);
    }

    public void act(){
        Random r = new Random();
        int result = r.nextInt(1500);       
        if (result == 813) {  
            addObject(new SpeedBoost(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));  
        }  
    }
}
