package service;

import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {

    public int countWords(String word) {
        String text = null;
        int count = 0;

        try(InputStream stream = this.getClass().getClassLoader().getResourceAsStream("text.txt")) {
            text = new String(stream.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
