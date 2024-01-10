/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

/**
 *
 * @author user
 */
public class PrimitiveDataTypes {

    public static void main(String[] args) {

        byte b1 = 0b1100;
        byte b2 = 014;
        byte b3 = 12;
        byte b4 = 0xC;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = 0b0101_0001_0100;
        short s2 = 02424;
        short s3 = 1300;
        short s4 = 0x514;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0b0;
        int i2 = 00;
        int i3 = 0;
        int i4 = 0x0;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 0b0111_0101_1011_1100_1101_0001_0101;
        long l2 = 0726_746_425;
        long l3 = 123_456_789;
        long l4 = 0x75B_CD15;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        float f1 = 1.1f;
        float f2 = 1.2f;

        double d1 = 1.1;
        double d2 = 1.2;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(bo1);
        System.out.println(bo2);

        char c1 = 'a';
        char c2 = 500;
        char c3 = '\u01F4';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }

}
