package com.leetcode.bean;

import java.util.List;

public class NTree {
    private String id;
    private String value;
    private List<NTree> children;

    public NTree() {
    }

    public NTree(String id, String value, List<NTree> children) {
        this.id = id;
        this.value = value;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<NTree> getChildren() {
        return children;
    }

    public void setChildren(List<NTree> children) {
        this.children = children;
    }
}
