import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Players
{
    public double lastShot;
    private int health = 5;
    private boolean boost;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkSpeed();
        boostedMove();
        moveAndTurn();
        shoot();  
        checkTouching();
        checkDeath();
    }  
    
    /**
     * Checks if the boost powerup is on
     */
    public void checkSpeed(){
        if (isTouching(SpeedBoost.class)){
            boost = true;
            removeTouching(SpeedBoost.class);
        }
    }
    
    /**
     * If boost is on, movement follows this code
     */
    public void boostedMove(){
        if (boost == true){
            if (Greenfoot.isKeyDown("w")){
                move (4);
            }
            if (Greenfoot.isKeyDown("s")){
                move(-4);
            }
            if (Greenfoot.isKeyDown("a")){
                turn (-4);
            }
            if (Greenfoot.isKeyDown("d")){
                turn (4);
            }
        }
    }
     
    /**
     * Spawns a bullet and checks delay
     */
    public void shoot()  
    {  
        if(Greenfoot.isKeyDown("0") && System.currentTimeMillis()>lastShot+350)   {  
            getWorld().addObject(new Bullet2(getRotation()), getX(), getY());  
            lastShot = System.currentTimeMillis();  
            Greenfoot.playSound("gunshot.mp3");
        }
    }    

    /**
     * Regular movement code
     */
    public void moveAndTurn(){
        if (Greenfoot.isKeyDown("up")){
            move (-3);
        }
        if (Greenfoot.isKeyDown("down")){
            move(3);
        }
        if (Greenfoot.isKeyDown("left")){
            turn (-4);
        }
        if (Greenfoot.isKeyDown("right")){
            turn (4);
        }
    }

    /**
     * Takes away health if hit by bullet; dies if health goes to 0
     */
    public void checkTouching(){
        World one = (Battlefield)getWorld();
        if (isTouching(Bullet.class)){
            health -= 1;
            ((Player2HP)getWorld().getObjects(Player2HP.class).get(0)).add(-20);  
            removeTouching(Bullet.class);
            return;
        }
        if (health <= 0)
        {
            one.removeObject(this);
            return;
        }
    }

    /**
     * Loads ending screen if dead
     */
    public void checkDeath(){
        if (health <=0){
            Greenfoot.setWorld(new EndingScreenP1());
        }
    }
} 

