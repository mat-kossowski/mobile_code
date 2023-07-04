package org.example.decoding;

public class DecodingWords extends Decoding{

    public DecodingWords() {
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
