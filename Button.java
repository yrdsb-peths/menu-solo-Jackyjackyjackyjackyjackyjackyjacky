import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor {
    String purpose, direction;
    static boolean menuScreenSet = false;
    static World[] order = {new MenuScreen(), new InstructionScreen(), new Highscores()};
    static int current = 0;

    public Button(String purpose, String direction) {
        this.purpose = purpose;
        this.direction = direction;
        GreenfootImage image = new GreenfootImage("images/leftArrow.png");
        if(direction == "right") {
            image.mirrorHorizontally();
        }
        image.scale(50,50);
        setImage(image);
    }

    public void act() {
        if(menuScreenSet == false) {
            menuScreenSet = true;
            Greenfoot.setWorld(order[0]);
            current = 0;
        }
        if (Greenfoot.mouseClicked(this)) {
            if(purpose.equals("nav")) {
                changeWorld();
            }

            if(purpose.equals("avatar")) {
                changeAvatar();
            }

            if(purpose.equals("instructions")) {
                changeInstructions();
            }
        }
    }

    public void changeAvatar() {
        MenuScreen menu = (MenuScreen) getWorld();
        menu.cycleAvatar();
    }

    public void changeInstructions() {
        InstructionScreen instructions = (InstructionScreen) getWorld();
        if(direction.equals("left")) {
            instructions.backwards();
        }
        else {
            instructions.forwards();
        }
    }

    public void changeWorld() {
        if(current == order.length - 1) {
            current = 0;
        }
        else {
            current += 1;
        }
        Greenfoot.setWorld(order[current]);
    }
}