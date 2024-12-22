package S08Ex02;

import java.util.HashMap;

public class Dictionary {

    HashMap<String,String> dictionary = new HashMap<String,String>();

    public Dictionary(){}

    public void put(String german, String english) {
        german = german.toLowerCase();
        english = english.toLowerCase();

        dictionary.put(german, english);
    }

    public String translate(String word) throws WordNotFoundException{
        word = word.toLowerCase();
        if(!this.dictionary.containsKey(word)) {
            throw new WordNotFoundException(word);
        } else {
            return dictionary.get(word);
        }
    }

    public String toString() {
        String output = "";
        for(String k : this.dictionary.keySet()) {
            output += k+ ": " + this.dictionary.get(k) + "\n";
        }
        return output;
    }

}
