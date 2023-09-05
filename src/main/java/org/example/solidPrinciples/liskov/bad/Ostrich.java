package org.example.solidPrinciples.liskov.bad;

public class Ostrich extends Bird{
    @Override
    public void fly(){
        throw new IllegalArgumentException("Ostrich cannot fly");
    }
}
