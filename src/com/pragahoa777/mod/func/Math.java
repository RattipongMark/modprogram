package com.pragahoa777.mod.func;

public class Math {
    public static String mod_func(int num){
        String buffer = "tua pra gob is ";
        for(int i = 2 ; i <= num ; i++) {
            if (num % i == 0) {
                buffer += i + ",";
            }
        }
        return buffer;
    }
}
