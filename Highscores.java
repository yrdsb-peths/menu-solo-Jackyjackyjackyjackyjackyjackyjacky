import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Highscores extends World
{
    Label scores;
    Map<String, Integer> map = new HashMap<>();

    public Highscores()
    {    
        super(600, 400, 1);

        Button navButton = new Button("nav", "right");
        addObject(navButton, 300, 325);

        map.put("Olivia", 300);
        map.put("Noah", 250);
        map.put("Liam", 200);

        String text = "Name: Score \n \n";

        for(String name : map.keySet()) {
            text = text + name + ": " + map.get(name) + "\n";
        }

        scores = new Label(text, 30);

        addObject(scores, 300, 150);
    }

}
