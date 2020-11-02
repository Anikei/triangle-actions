package org.example;

public class Logic {
    float a;
    float b;
    float c;
    String result = "ERROR";

    public Logic(float a, float b, float c) {

        if ((a == 0) || (b == 0) || (c == 0)) {
            this.result = "zero value";
        } else if ((a < 0) || (b < 0) || (c < 0)) {
            this.result = "negative value";
        } else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            result = "invalid";
        } else if ((a == c) & (a == b) & (b == c)) {
            result = "equaliteral";
        } else if ((a == c) | (a == b) | (b == c)) {
            result = "isosceles";
        } else {
            result = "valid";
        }
    }

    public Logic(float a, float b) {
        this.result = "no args";
    }

    public Logic(float a) {
        this.result = "no args";
    }

    public Logic() {
        this.result = "no args";
    }

    String getResult() {
        return this.result;
    }

}
