import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author Raquel Frankel
 * @version 4/19/20
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * narration
     */
    public void act() 
    {
     if(Greenfoot.mouseClicked(this))
      {
           Greenfoot.playSound("monster.wav");
      }
    }   
}
