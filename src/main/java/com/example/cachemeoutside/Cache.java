package com.example.cachemeoutside;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    Map<Integer, String> userData = new HashMap<>();

    public String get(int key){
        System.out.println(userData.get(key));
        return userData.get(key);
    }

    public void set(int key, String value){
        userData.put(key,value);
    }

    public boolean has(int key) {
        boolean a = false;
        if (userData.containsKey(key)){
        a = true;
    }
    System.out.println(a);
    return a;
}
public void delete(int key){
        userData.remove(key);
}

}
