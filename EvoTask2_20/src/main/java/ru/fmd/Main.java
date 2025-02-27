package ru.fmd;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Integer[] array = new Integer[20];
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(1,16);
            System.out.printf("%d ", array[i]);

            if(frequency.containsKey(array[i]))
                frequency.put(array[i], frequency.get(array[i])+1);
            else
                frequency.put(array[i], 1);
        }
        System.out.println();

        for (Integer i : frequency.keySet()) {
            if(frequency.get(i) > 1)
                System.out.printf("Число '%d' встречается %d раз\n", i, frequency.get(i));
        }
    }
}