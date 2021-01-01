package main.java;

import java.util.HashMap;

public class SumOfMultiples {
    private int maxNum;
    private int[] multiples;
    private HashMap<Integer, Boolean> valuesAdded;

    public SumOfMultiples(int maxNum, int[] multiples) {
        this.maxNum = maxNum;
        this.multiples = multiples;
        this.valuesAdded = new HashMap<Integer, Boolean>();
    }

    public int getSum() {
        int result = 0;
        //for each multiple....
        for(int multiple: multiples){
            if(multiple == 0)
                continue;
            int calculatedMultiple = multiple;
            //check if its less than max, check if its in hashmap
            int i = 1;
            while(calculatedMultiple < maxNum){
                if(valuesAdded.get(calculatedMultiple) == null){
                    //new value found, add to result
                    result += calculatedMultiple;
                    valuesAdded.put(calculatedMultiple, true);
                }
                calculatedMultiple = calculatedMultiple * i;
                i++;
            }
        }

        return result;
    }

}
