package com.company;

public final class Class3 extends Class2 {
    private String a3;
    private String b3;
    private String c3;
    private Class4 class4;
    private EnumClass enumClass;

    public Class3( String a3, String b3, String c3, Class4 class4, EnumClass enumClass) {
        super();
        this.a3 = a3;
        this.b3 = b3;
        this.c3 = c3;
        this.class4 = class4;
        this.enumClass = enumClass;
    }

    public Class3(String a2, int b2, int c2, Class4 class4, EnumClass enumClass) {
        super(a2, b2, c2, class4, enumClass);
    }


    public String getA3() {
        return a3;
    }
    public String getB3() {
        return b3;
    }
    public String getC3() {
        return c3;
    }
    @Override
    public Class4 getClass4() {
        return class4;
    }
    @Override
    public EnumClass getEnumClass() {
        return enumClass;
    }

    @Override
    public void overloadedMethod(String d2){
        System.out.println("dsjhmg");
    }


}
