package org.example;

public class Decoding {

     private String code;
    public Decoding() {
    }

    public String decodingFunctionNumbers(String code) {

        String decodingCode = "";
        String[] codeSnippets = code.split(" ");
        for (String codeSnippet : codeSnippets) {
            decodingCode = decodingCode + Dictionary.getValueForKey(codeSnippet);
        }

        return decodingCode;
    }

    public String decodingFunctionWords(String code) {

        String decodingCode = "";
        String[] codeSnippets = code.toLowerCase().split("");
        for (String codeSnippet : codeSnippets) {
            decodingCode = decodingCode + Dictionary.getKeyForValue(codeSnippet)+ " ";
        }

        return decodingCode;
    }
}
