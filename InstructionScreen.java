import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionScreen extends World
{
    Stack<String> unread = new Stack<String>();
    Stack<String> read = new Stack<String>();
    Label text;
    String oldRemoved;
    int numInstructions = 10;

    public InstructionScreen()
    {
        super(600, 400, 1);
        for(int i = numInstructions; i > 0; i--) {
            unread.add("Instructions " + i);
        }

        Button navButton = new Button("nav", "right");
        addObject(navButton, 300, 325);

        text = new Label("", 30);
        addObject(text, 300, 200);

        forwards();

        Button leftButton = new Button("instructions", "left");
        Button rightButton = new Button("instructions", "right");

        addObject(leftButton, 250, 250);
        addObject(rightButton, 350, 250);
    }

    public void forwards() {
        if(unread.getLength() > 0) {
            String removed = unread.pop();
            text.setValue(removed);
            if(oldRemoved != null) {
                read.add(oldRemoved);
            }
            oldRemoved = removed;
        }
    }

    public void backwards() {
        if(read.getLength() > 0) {
            String removed = read.pop();
            text.setValue(removed);
            if(oldRemoved != null) {
                unread.add(oldRemoved);
            }
            oldRemoved = removed;
        }
    }
}
