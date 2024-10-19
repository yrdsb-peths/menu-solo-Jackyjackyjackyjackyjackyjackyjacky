import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MenuScreen extends World {
    Queue<String> queue = new Queue<String>();
    Avatar avatar;

    public MenuScreen() {
      super(600, 400, 1);

      queue.add("images/broccoli.png");
      queue.add("images/carrot.png");
      queue.add("images/bellPepper.png");

      Button navButton = new Button("nav");
      Button avButton = new Button("avatar");
      avatar = new Avatar();

      cycleAvatar();

      addObject(avatar, 300, 100);
      addObject(avButton, 300, 250);
      addObject(navButton, 300, 325);
    }

    public void cycleAvatar() {
      String id = queue.pop();
      avatar.setAvatar(id);
      queue.add(id);
    }

    public void cycleNav() {
        
    }
}