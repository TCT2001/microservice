package com.tct.bccs.ca.common.utils;

public enum BasicStringOperation implements StringOperation {
    TRIM("Removing leading and trailing spaces.") {
        @Override
        public String apply(String input) { 
            return input.trim(); 
        }
    },
    TO_UPPER("Changing all characters into upper case.") {
        @Override
        public String apply(String input) {
            return input.toUpperCase();
        }
    },
    TO_LOWER("Changing all characters into lower case.") {
        @Override
        public String apply(String input) {
            return input.toUpperCase();
        }
    };

    private final String description;

    BasicStringOperation(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}