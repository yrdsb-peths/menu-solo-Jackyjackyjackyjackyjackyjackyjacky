import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor {
    String purpose;
    public Button(String purpose) {
        this.purpose = purpose;
        GreenfootImage image = new GreenfootImage("images/leftArrow.png");
        image.scale(50,50);
        image.mirrorHorizontally();
        setImage(image);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            if(purpose.equals("nav")) {
                Greenfoot.setWorld(new InstructionScreen());
            }
            if(purpose.equals("avatar")) {
                MenuScreen currentWorld = (MenuScreen) getWorld();
                currentWorld.cycleAvatar();
            }
        }
    }


}