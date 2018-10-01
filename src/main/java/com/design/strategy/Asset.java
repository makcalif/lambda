package com.design.strategy;

public class Asset {
    public enum Type {STOCK, BOND, CASH};

    private Type type;
    private Long value;

    public Asset(Type type, Long value) {
        this.type = type;
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public Long getValue() {
        return value;
    }
}
