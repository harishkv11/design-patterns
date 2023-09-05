package org.example.solidPrinciples.openClose;

public class BadCalculator {
    public int performOperation(int a, int b, String type){
        int result = 0;
        switch (type){
            case "sum":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
        }
        return result;
    }
}
