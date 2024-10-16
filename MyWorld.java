import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        addObject(balloon, 100, 100);
    }
    Balloon balloon = new Balloon();
}