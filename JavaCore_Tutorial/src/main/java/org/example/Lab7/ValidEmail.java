package org.example.Lab7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail implements CheckService{
    @Override
    public void check() {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher("caucongrex@gmail.com");
        System.out.println("Input Email : " +matcher.matches());
    }
}
