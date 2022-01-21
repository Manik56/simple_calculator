package com.example;

import java.util.*;
import java.lang.*;
import java.math.*;
class Complex_Number
{  
    public static void main(String args[])
    {
    int a1,a2,b1,b2,m1,m2,m3,m4,d,r1,s;
    double r,r2,x,y;
    a1=5; b1=2; a2=7;b2=-4;d=0;s=0;
    //Multiplication of complex number
    m1=a1*a2;
    m2=b1*(-(b2));
    m3=a1*b2;
    m4=a2*b1;
    int m5=(m1+m2);
    int m6=m3+m4;
    if(m6>0)
    {
        System.out.println("Multiplication of complex num:"+m5+"+"+m6+"i");
    }
    else
    {
        System.out.println("Multiplication of complex num:"+m5+" "+m6+"i");
    }
    //Division of complex number
    d=(a2*a2) +(b2*b2);
    if(m6>0)
    {
        System.out.println("Division of complex num: ("+m5+"+"+m6+"i)/"+d);
    }
    else
    {
        System.out.println("Division of complex num: ("+m5+" "+m6+"i)/"+d);
    }
    //Squareroot of complex number
    r1=(5*5)+(2*2);
    r=Math.sqrt(r1);
    r2=(r-a1)/2;
    y=Math.sqrt(r2);
    x=b1/(2*y); 
    String x1=String.format("%.6f",x);
    x=Double.parseDouble(x1);
    String x2=String.format("%.6f",y);
    y=Double.parseDouble(x2);
    System.out.println("Square Root: "+x1+" +"+x2+"i");
    System.out.println("Square Root:-"+x1+" -"+x2+"i");
} 
}



C:\Users\manik\OneDrive\Desktop\java_intern1\week1\day4\java1_project\src\main\java\com\example\simplecalculator.java