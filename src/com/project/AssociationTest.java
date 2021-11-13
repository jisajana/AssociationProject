package com.project;
//THINKING IN JAVA -
//I WANT EACH PARTICIPANT TO DISCUSS ON ASSOCIATION PRINCIPLE - AS PER THEIR IMAGINATION

//exponential number is a complex number

import com.calcs.ComplexNumber;
import com.calcs.MyCalculator;

/**
 * This is the main program of our application which
 * has the main method
 */
public class AssociationTest {
    /**
     *
     * @param args
     * main method is the main method of any
     * java application
     */
    public static void main(String[] args) {
        MyCalculator myCalci = new MyCalculator();
        int answer =  myCalci.addTwoNumbers(876687,98768); //invocation is here
        System.out.println("the answer is : "+answer);

        ComplexNumber c1 = new ComplexNumber(2,3);
        ComplexNumber c2 = new ComplexNumber(4,9);
        ComplexNumber c3 = new ComplexNumber(3,7);

        System.out.println("c1 "+c1);
        System.out.println("c2 "+c2);
        System.out.println("c3 "+c3);

        int output = myCalci.addTwoComplexNumbers(c1,c2);
        System.out.println("output "+output);

    /*   int c1 = 2*2*2*2*2*2; //2^6;

        System.out.println("c1 "+c1);

        int c2 = 4*4*4*4*4; //4^5;

        System.out.println("c2 "+c2);

        int c3 = c1 + c2;

        System.out.println("c3 "+c3);

        int base = 2;
        int power = 9;
        int c4 = base;
        for(int i=1;i<power;i++) {
            System.out.println("i "+i);
            c4 = c4 * base;
        }
        System.out.println("c4 "+c4);
*/

    /*
        System.out.println("hello mac");

        Human h = new Human(); // every Human isNOT a Poet
        Poet thePoet = new Poet(); //conscious being - movable, every Poet isA Human

        Pen myPen = new Pen(); // non movable entity, blank pen
        Paper thePaper = new Paper(); //non movable entity , blank paper

        //you take 100 1000 times, ask me 100000 times i will reply
        //i want each and every participant tounderstand line number 10

        Poetry gotThePoetry = thePoet.makePoetry(myPen,thePaper); //PASSING OBJECTS AS ARGUMENTS
        gotThePoetry.printPoetry();//21:50
     //   Milk m = new Milk(); // regular way of object creation

        Cow myCow = new Cow();
        Milk myMilk = myCow.milkACow(); //indirect way of object creation
        Yogurt yog = myMilk.coagulate();
        Butter bu = yog.churn();
        ClarifiedButter mycb = bu.boil();
        mycb.enjoy();
*/
    }
}

