import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet2 extends Bullets
{
    public int speed; 
    public int direction;
    /**
     * Constructor for Player 2's bullet
     */
    public Bullet2(int dir){
        direction = dir;
        speed = -20;
    }

    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY());  
        checkBoundaries();  
        setRotation(direction);
        move(speed);
    }  
    
    /**
     * Destorys bullets that are off screen
     */public void checkBoundaries()  
    {  
        if(getX() > getWorld().getWidth() - 5) {  
            getWorld().removeObject(this);  
            return;
        }
        else if(getX() < 5){   
            getWorld().removeObject(this);  
            return;
        }
        if(getY() > getWorld().getHeight() - 5){   
            getWorld().removeObject(this);  
            return;
        }
        else if(getY() < 5){   
            getWorld().removeObject(this); 
            return;
        }
    }  
}
