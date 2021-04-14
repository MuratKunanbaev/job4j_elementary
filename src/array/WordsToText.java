package array;

public class WordsToText {
    public static String convert(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i < words.length - 1) {
                result = result + words[i] + " ";
            } else {
                result += words[i];
            }
            if (words.length == 1) {
                result = words[i];
            }
        }
        return result;
    }
}
