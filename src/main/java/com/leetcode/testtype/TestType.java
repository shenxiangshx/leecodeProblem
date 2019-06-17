package com.leetcode.testtype;

import java.util.HashMap;
import java.util.Map;

public class TestType<T> {
    public Map<T,Integer> map=new HashMap<>();
    public T i;

    public Map<T, Integer> getMap() {
        return map;
    }

    public void setMap(Map<T, Integer> map) {
        this.map = map;
    }

    public T getI() {
        return i;
    }

    public void setI(T i) {
        this.i = i;
    }
}
