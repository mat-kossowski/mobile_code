package org.example;

import java.util.Arrays;

public class DataMapping {



    public String getValue(Dictionary key) {
        return key.getValue();
    }

    public boolean containsKey(Dictionary key) {
        return Arrays.asList(Dictionary.values()).contains(key);
    }
}
