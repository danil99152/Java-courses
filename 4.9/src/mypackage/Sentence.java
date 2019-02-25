package mypackage;

import java.util.HashSet;
import java.util.Set;

public class Sentence {

    String value;
    Set<Word> wordsOfSentence;

    public Sentence(String string) {
        value = string;
    }

    public Set<Word> getWords(){
        if (wordsOfSentence != null ) return wordsOfSentence;
        else {
            wordsOfSentence = new HashSet<>();
            if (value != null && value.length() > 0) {
                int startPosition = 0;
                int index;
                for (index = startPosition; index < value.length(); index++) {
                    for (Punctuation punctuation : Text.allPunctuation) {
                        if (value.charAt(index) == punctuation.getSign()) {
                            if (startPosition < index) {
                                Word buffer = new Word(value.substring(startPosition, index));
                                wordsOfSentence.add(buffer);
                            }
                            startPosition = index + 1;
                        }
                    }
                }
                if (startPosition < index){
                    Word buffer = new Word(value.substring(startPosition, index));
                    wordsOfSentence.add(buffer);
                }
            }
            return wordsOfSentence;
        }
    }

    @Override
    public String toString() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;

        Sentence sentence = (Sentence) o;

        if (!value.equals(sentence.value)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
