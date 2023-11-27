package testForm.utils;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

//    String[] msgs = {"Сегодня в #Москва хорошая погода", "А в #Питер идет #дождь", "Вчера тоже был #Дождь в #МОСКВА", "В #Москва он льет почти всегда"};

    public static String[] hashArr(String[] msgs) {
        Set<String> setHash = new HashSet<>();
        for (String str : msgs) {
            String[] tempArr = str.split(" ");
            for (String temp : tempArr) {
                if (temp.startsWith("#")) {
                    setHash.add(temp.toLowerCase());
                }
            }
        }

        String[] ans = setHash.toArray(new String[0]);
        Arrays.sort(ans, Comparator.reverseOrder());
        return ans;

    }



}
