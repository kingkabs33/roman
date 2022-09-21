import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String args[])
    {
        for (int i = 1;i<3000;i++)
        {
            System.out.println("i="+i+" -> "+RomanNumerals(i));
        }
    }

    public static String RomanNumerals(int num) {
        LinkedHashMap<String, Integer> romanNumerals = new LinkedHashMap();
        romanNumerals.put("M", 1000);
        romanNumerals.put("CM", 900);
        romanNumerals.put("D", 500);
        romanNumerals.put("CD", 400);
        romanNumerals.put("C", 100);
        romanNumerals.put("XC", 90);
        romanNumerals.put("L", 50);
        romanNumerals.put("XL", 40);
        romanNumerals.put("X", 10);
        romanNumerals.put("IX", 9);
        romanNumerals.put("V", 5);
        romanNumerals.put("IV", 4);
        romanNumerals.put("I", 1);
        String result = "";
        for(Map.Entry<String, Integer> numeral : romanNumerals.entrySet())
        {
            int matches = num/numeral.getValue();
            result = result+repeat(numeral.getKey(), matches);
            num = num % numeral.getValue();
        }
        return result;
    }
    public static String repeat(String s, int n)
    {
        if(s == null)
        {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++)
        {
            sb.append(s);
        }
        return sb.toString();
    }
}
