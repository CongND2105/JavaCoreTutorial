package org.example.Lab7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidID implements CheckService {
    @Override
    public void check() {
        Pattern pattern = Pattern.compile("[0-9]{12}");
        Matcher matcher = pattern.matcher("099145697412");
        System.out.println("Input ID : " +matcher.matches());
    }
}
