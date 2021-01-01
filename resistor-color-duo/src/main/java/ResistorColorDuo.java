package main.java;

public class ResistorColorDuo {
    public int value(String[] colors) {
        int colorValOne = getColorVal(colors[0]);
        int colorValTwo = getColorVal(colors[1]);
        int concatResult = Integer.parseInt(Integer.toString(colorValOne) + Integer.toString(colorValTwo));
        return concatResult;
    }

    private int getColorVal(String color){
        switch (color){
            case "black":
                return 0;
            case "brown":
                return 1;
            case "red":
                return 2;
            case "orange":
                return 3;
            case "yellow":
                return 4;
            case "green":
                return 5;
            case "blue":
                return 6;
            case "violet":
                return 7;
            case "grey":
                return 8;
            case "white":
                return 9;
        }
        return -1;
    }
}
