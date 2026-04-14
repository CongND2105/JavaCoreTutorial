package org.example.Lab7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword implements CheckService {
    @Override
    public void check() {
        Pattern pattern = Pattern.compile("[0-9A-Za-z]{6,}");
        Matcher matcher = pattern.matcher("dasswaa");
        System.out.println("Input Password : " +matcher.matches());
    }
}
