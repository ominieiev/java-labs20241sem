package edu.dp.sau.isidorenko;

public class Main {
    public final static float PI_FROM_BASIC_MATH = 3.14f;

    public static void main(String[] args) {
        int[] heightsOfStudents = new int[20];
        heightsOfStudents[0] = 180;

        double d = 1.1;
        int i = 2;
        long l = 3;
        float f = 4.4f;



            i=12_134_567;

        System.out.println(i);



        System.out.println(PI_FROM_BASIC_MATH);
        while (i < 20) {
            boolean conditionOfModelHeight = heightsOfStudents[i] > 180 || heightsOfStudents[i] < 200;
            System.out.println(i + "-s = " + heightsOfStudents[i]);
            i++;
        }


        int heightOfHuman = 180;
        boolean isMoreThanStandart = heightOfHuman >= 180;

        if (isMoreThanStandart) {
            System.out.println("It's OK");
        } else {
            System.out.println("It's not so much");
        }

        System.out.println(heightOfHuman > 150 ? "It's OK" : "It's not so much");

        switch (heightOfHuman) {
            case (150): {
                System.out.println("150 not so much");
                break;

            }
            case (180): {
                System.out.println("180 it's really cool");
                break;
            }
        }
    }

    public static void myMethod() {

    }
}