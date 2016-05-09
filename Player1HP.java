import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;  
import java.awt.Graphics;

/**
 * Write a description of class Player1HP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * Thanks to Danpost on Greenfoot for assistance. 
 */
public class Player1HP extends Counters
{
    private static final Color textColor = new Color(0, 0, 0);  
      
    private int value = 100;  
    private int target = 100;  
    private String text;  
    private int stringLength;  
  
    public Player1HP()  
    {  
        this("");  
    }  
  
    public Player1HP(String scoreText)  
    {  
        text = scoreText;  
        stringLength = (text.length() + 2) * 10;  
  
        setImage(new GreenfootImage(stringLength, 16));  
        GreenfootImage image = getImage();  
        image.setColor(textColor);  
  
        updateImage();  
    }  
      
    public void act() {  
        if(value < target) {  
            value++;  
            updateImage();  
        }  
        else if(value > target) {  
            value--;  
            updateImage();  
        }  
    }  
  
    public void add(int score)  
    {  
        target += score;  
    }  
  
    public int getValue()  
    {  
        return value;  
    }  
  
    /** 
     * Make the image 
     */  
    private void updateImage()  
    {  
        GreenfootImage image = getImage();  
        image.clear();  
        image.drawString(text + value, 1, 12);  
    }     
}
