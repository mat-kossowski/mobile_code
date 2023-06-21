package org.example;

public enum Dictionary {

    KEY_1("2", "a"),
    KEY_11("22", "b"),
    KEY_111("222", "c"),
    KEY_3("3", "d"),
    KEY_33("33", "e"),
    KEY_333("333", "f"),
    KEY_4("4", "g"),
    KEY_44("44", "h"),
    KEY_444("444", "i"),
    KEY_5("5", "j"),
    KEY_55("55", "k"),
    KEY_555("555", "l"),
    KEY_6("6", "m"),
    KEY_66("66", "n"),
    KEY_666("666", "o"),
    KEY_7("7", "p"),
    KEY_77("77", "q"),
    KEY_777("777", "r"),
    KEY_7777("7777", "s"),
    KEY_8("8", "t"),
    KEY_88("88", "u"),
    KEY_888("888", "v"),
    KEY_9("9", "w"),
    KEY_99("99", "x"),
    KEY_999("999", "y"),
    KEY_9999("9999", "z");

    private final String key;
    private final String value;

    Dictionary(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

