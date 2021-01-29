package com.epam.task.second.logic;

import com.epam.task.second.record.RecordError;

public class RemoverWords {

    private final String DELIMETER = " ";
    private final RecordError recordError = new RecordError();

    public String removerWords(String text, int lengthWord) {
        recordError.recordError(text);

        StringBuilder stringBuilder = new StringBuilder();

        String[] words = text.split(DELIMETER);

        for(String word : words) {

            char firstLetter = word.charAt(0);

            if(!((word.length() % lengthWord == 0) && isVowel(firstLetter))) {
                stringBuilder.append(word).append(DELIMETER);
            }
        }

        return stringBuilder.toString().trim();
    }

    public boolean isVowel(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
            default:
                return false;
        }
    }
}
