package com.example.bootmvc.thymeleaf.devtools.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppUtils {
    public static boolean checkEmailOrPassword(String pattern, String pStr) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(pStr);
        return m.matches();
    }
}
