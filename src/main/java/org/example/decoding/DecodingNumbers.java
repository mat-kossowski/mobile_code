package org.example.decoding;

public class DecodingNumbers extends Decoding{

    public DecodingNumbers() {
    }

    public String decodingFunctionNumbers(String code) {

        String decodingCode = "";
        String[] codeSnippets = code.split(" ");
        for (String codeSnippet : codeSnippets) {
            decodingCode = decodingCode + Dictionary.getValueForKey(codeSnippet);
        }

        return decodingCode;
    }
}
