import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor {

    public Button() {
        GreenfootImage image = new GreenfootImage("images/leftArrow.png");
        image.scale(50,50);
        image.mirrorHorizontally();
        setImage(image);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {

        }
    }
}