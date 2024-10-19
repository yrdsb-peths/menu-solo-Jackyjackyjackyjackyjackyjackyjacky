import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Avatar extends Actor
{
    public void setAvatar(String id) {
        GreenfootImage image = new GreenfootImage(id);
        image.scale(100, 100);
        setImage(image);
    }
}