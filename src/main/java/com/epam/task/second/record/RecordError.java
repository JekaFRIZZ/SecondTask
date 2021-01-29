package com.epam.task.second.record;

import org.apache.log4j.Logger;

public class RecordError {
    private final Logger LOGGER = Logger.getLogger(RecordError.class);

    public void recordError(String text) {
        if (text == null) {
            LOGGER.error("Text is empty");
            throw new NullPointerException();
        }
    }
}
