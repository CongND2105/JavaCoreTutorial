package org.example.Lab7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mainLab7 {
    public static void main(String[] args) {
        CheckService [] service ={
                new ValidID(),
                new ValidPassword(),
                new ValidEmail()
        };
        for(int i = 0 ; i < service.length ; i++) {
            service[i].check();
        }

    }
}
