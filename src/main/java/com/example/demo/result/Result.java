package com.example.demo.result;

import java.util.HashMap;
import java.util.Map;

public  class Result {
    public static Map<String, Object> success(String msg, int count, Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", msg);
        map.put("count", count);
        map.put("data", data);
        return map;
    }
    public static  Map<String, Object> success(String msg) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", msg);
        return map;
    }
    public static  Map<String, Object> fail(String msg ) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("msg", msg);
        return map;
    }
}
