package org.example;

public class MyDoubleGenericClass<Key, Value> {
    Key x;
    Value y;

    MyDoubleGenericClass(Key x, Value y) {
        this.x = x;
        this.y = y;
    }
    public Value getValueOfY(){
        return y;
    }
}
