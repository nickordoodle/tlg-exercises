package main.java;

public class RnaTranscription {

    public String transcribe(String dnaStrand) {
        if (dnaStrand.isEmpty())
            return dnaStrand;
        StringBuilder result = new StringBuilder();
        for (char currChar : dnaStrand.toCharArray()) {
            // add to result after conversion
            result.append(convertToRna(currChar));
        }
        return result.toString();
    }

    private char convertToRna(char c){
        switch (c) {
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            case 'T':
                return 'A';
            case 'A':
                return 'U';
        }
        return 'C';
    }

}
