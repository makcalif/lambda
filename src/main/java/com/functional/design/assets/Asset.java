package com.functional.design.assets;

/**
 * Created by x239954 on 9/27/2018.
 */
public class Asset {

    public enum Type {BOND, STOCK};
    private Long value;
    private Type type;

    public Asset(Long value, Type type) {
        this.value = value;
        this.type = type;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
