package com.github.dieselniu.charpter7.moveMethod1;

public class AccountType {
    private final String typeName;

    public AccountType(String typeName) {
        this.typeName = typeName;
    }

    public boolean isPremium() {
        return "premium".equals(typeName);
    }
}
