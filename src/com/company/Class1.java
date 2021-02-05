package com.company;

public class Class1 {
    private int a1;
    private Class4 class4;
    private EnumClass enumClass;


    public Class1(int a1,Class4 class4,EnumClass enumClass) {
        this.a1 = a1;
        this.class4 = class4;
        this.enumClass = enumClass;
    }

    public int getA1() {
        return a1;
    }
    public Class4 getClass4() {
        return class4;
    }
    public EnumClass getEnumClass() {
        return enumClass;
    }
}
