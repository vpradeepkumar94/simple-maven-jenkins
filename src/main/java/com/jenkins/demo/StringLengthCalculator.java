package com.jenkins.demo;

class StringLengthCalculator {


    public int findStringLength(String item) {
        if (item == null) {
            return -1;
        } else {
            return item.length();
        }
    }
}
