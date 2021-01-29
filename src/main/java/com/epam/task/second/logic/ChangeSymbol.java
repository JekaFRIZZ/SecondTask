package com.epam.task.second.logic;

import com.epam.task.second.record.RecordError;

public class ChangeSymbol {

    private final String DELIMETER = " ";
    private final RecordError recordError = new RecordError();

    public String changeSymbol(String text, int indexChange, char symbol) {

        recordError.recordError(text);

        StringBuilder stringBuilder = new StringBuilder();

        String[] words = text.split(DELIMETER);

        for(String word : words) {
            int length = word.length();
            if(length >= indexChange) {
                String letterBefore = word.substring(0, indexChange - 1);
                String letterAfter = word.substring(indexChange, length);

                stringBuilder.append(letterBefore).append(symbol).append(letterAfter);
            }
            else {
                stringBuilder.append(word);
            }
                stringBuilder.append(DELIMETER);
        }
        return stringBuilder.toString().trim();
    }
}
