package com.company;

public class Main {

    public static void main(String[] args) {
        Class2 objectA = new Class2(123,"ds",new Class4("gui","sdf"),EnumClass.PROPERTY5);
        Class3 objectB = new Class3(212,"dsds",212334f,new Class4("dgf","sgd"),EnumClass.PROPERTY3);
        Class3 objectC = new Class3(123,"g",21334f,new Class4("j","n"),EnumClass.PROPERTY1);


       System.out.println(objectA.getA1() +" "+ objectA.getA2()
              +" "+ objectA.getClass4().getA4() +" "+ objectA.getClass4().getB4() +" "+ objectA.getEnumClass());

        System.out.println(objectB.getA1() +" "+ objectB.getA2() +" "+ objectB.getA3()
               +" "+ objectB.getClass4().getA4() +" "+ objectB.getClass4().getB4() +" "+ objectB.getEnumClass());

       System.out.println(objectC.getA1() +" "+ objectC.getA2() +" "+ objectC.getA3()
               +" "+ objectC.getClass4().getA4() +" "+ objectC.getClass4().getB4() +" "+ objectC.getEnumClass());


        objectA.overloadedMethod("opkpp",3);
        objectB.overloadedMethod(5,"kujbh");
        objectC.overloadedMethod("dsjhmq");
    }
}
