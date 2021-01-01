package main.java;

public class Acronym {
    private String phrase;
    public Acronym(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        String noAposPhrase = phrase.replaceAll("'", "");
        String spacesForDashes = noAposPhrase.replaceAll("-", " ");
        String alphNumPhrase = spacesForDashes.replaceAll("[^A-Za-z0-9 ]", " ");
        String[] words = alphNumPhrase.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word: words){
            if(word.length() > 0)
                result.append(word.charAt(0));
        }
        return result.toString().toUpperCase().trim();
    }

}
