package service;

import java.text.DecimalFormat;
import java.util.Random;

public class Util {
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; //a-z
    private static final String alphaUpCase = alpha.toUpperCase(); // A-Z
    private static final String digits = "0123456789"; // 0-9
    private static final String specials = "~=+%^*/()[]{}/!@#$?|";
    private static final String ALPHA_NUMERIC = alpha+alphaUpCase+digits;
    private static final String ALL = alpha+alphaUpCase+digits + specials;
    private static Random generator = new Random();
    public static String generateId(int numberOfCharactor){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<numberOfCharactor;i++){
            int number = randomNumber(0,ALL.length()-1);
            sb.append(ALL.charAt(number));
        }
        return sb.toString();
    }
    public static int randomNumber(int min, int max){
        return generator.nextInt(max- min+1);
    }
    public static String formatNumber(long money){
        String pattern = "###,###,##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return decimalFormat.format(money);
    }
}
