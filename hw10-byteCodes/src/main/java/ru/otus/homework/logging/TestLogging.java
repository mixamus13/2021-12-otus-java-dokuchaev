package ru.otus.homework.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.otus.homework.annotations.Log;

public class TestLogging {

    private static Logger LOGGER = LoggerFactory.getLogger(TestLogging.class);

    @Log
    public void calculation(int param) {
        LOGGER.info("int param --> " + param);
    }

}
