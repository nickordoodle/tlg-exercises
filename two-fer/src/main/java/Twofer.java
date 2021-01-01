package main.java;

public class Twofer {
    public String twofer(String name) {
        String baseLeft = "One for ";
        String baseRight = ", one for me.";
        String defaultName = "you";
        if(name == null)
            return baseLeft + defaultName + baseRight;
        else if(name.isEmpty())
            return baseLeft + baseRight;
        else
            return baseLeft + name + baseRight;
    }
}
