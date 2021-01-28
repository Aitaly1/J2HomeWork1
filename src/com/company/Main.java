package com.company;

public class Main {

    public static void main(String[] args) {
        Class2 ObjectA = new Class2("fdfdg",233,57,new Class4("guiui","egrer"),EnumClass.PROPERTY5);
        Class3 ObjectB = new Class3("sdfds","dsdss","ddsfd",new Class4("dgfdf","sgdfg"),EnumClass.PROPERTY3);
        Class3 ObjectC = new Class3("uyuyg","g","y",new Class4("j","n"),EnumClass.PROPERTY1);


        System.out.println(ObjectA.getA2() + " " + ObjectA.getB2() + " " + ObjectA.getC2()
                + " " + ObjectA.getClass4().getA4() + " " + ObjectA.getClass4().getB4() + " " + ObjectA.getEnumClass());

        System.out.println(ObjectB.getA3() + " " + ObjectB.getB3() + " " + ObjectB.getC3()
                + " " + ObjectB.getClass4().getA4() + " " + ObjectB.getClass4().getB4() + " " + ObjectB.getEnumClass());

        System.out.println(ObjectC.getA3() + " " + ObjectC.getB3() + " " + ObjectC.getC3()
                + " " + ObjectC.getClass4().getA4() + " " + ObjectC.getClass4().getB4() + " " + ObjectC.getEnumClass());


        ObjectA.overloadedMethod("opkpp",3);
        ObjectB.overloadedMethod(5,"kujbh");
        ObjectC.overloadedMethod("dsjhmq");
    }
}
