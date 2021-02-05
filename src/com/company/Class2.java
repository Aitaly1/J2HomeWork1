package com.company;

public class Class2 extends Class1{
    private String a2;

    public Class2(int a1, Class4 class4, EnumClass enumClass) {
        super(a1, class4, enumClass);
    }

    public Class2(int a1, String a2, Class4 class4, EnumClass enumClass) {
        super(a1, class4, enumClass);
        this.a2 = a2;
    }

    // private EnumClass enumClass;

//    public Class2() {
//
//    }

//    public Class2(String a2, int b2, int c2, Class4 class4) {
//        super();
//        this.a2 = a2;
//        this.b2 = b2;
//        this.c2 = c2;
//        this.class4 = class4;
//        //this.enumClass = enumClass;
//    }

//    public Class2(int a1, int b1, int c1, Class4 class4, EnumClass enumClass, String a2, int b2, int c2, Class4 class41) {
//        super(a1, b1, c1, class4, enumClass);
//        this.a2 = a2;
//        this.b2 = b2;
//        this.c2 = c2;
//        this.class4 = class41;
//        //this.enumClass = enumClass1;
//    }

    public String getA2() {
        return a2;
    }

//    @Override
//    public EnumClass getEnumClass() {
//        return enumClass;
//    }

    public void overloadedMethod(String d2,int e2){
        for (int i = 0; i <e2 ; i++) {
            System.out.println(d2);
        }
    }
    public void overloadedMethod(int e2,String d2){
        for (int i = 0; i <e2 ; i++) {
            System.out.println(d2);
        }
    }
    public void overloadedMethod(String d2){
        System.out.println(d2);
    }

}
