package com.ml.revision.algorithms;

public class Test {
    static int smithNum(int n) {
	int n1 = n;
	int smith = 0;
	int sumOfDigits = 0;
	int sumOfPrimeFactors = 0;
	int two = 0;
	int three = 0;
	int five = 0;
	int seven = 0;
	int prime = 0;

	while (n > 0) {
	    sumOfDigits += n % 10;
	    n = n / 10;
	}

	while (n1 > 1) {
	    if(n1<10)
	    {
		    while (n1 % 2 == 0 && n1>1) {
			n1 = n1 / 2;
			two++;
		    }
		    while (n1 % 3 == 0&& n1>1) {
			n1 = n1 / 3;
			three++;
		    }
		    while (n1 % 5 == 0&& n1>1) {
			n1 = n1 / 5;
			five++;
		    }
		    while (n1 % 7 == 0&& n1>1) {
			n1 = n1 / 7;
			seven++;
		    }
		    System.out.println(n1+"*************");
		    while(n1> 0) {
			prime +=1;
			n1/=10;
		    }
		    System.out.println(n1+"*************");
		    sumOfPrimeFactors = (2 * two) + (3 * three) + (5 * five) + (7 * seven)+prime;
	    }
	    else {
		 while (n1 % 2 == 0 && n1>1) {
			n1 = n1 / 2;
			two++;
		    }
		    while (n1 % 3 == 0&& n1>1) {
			n1 = n1 / 3;
			three++;
		    }
		    while (n1 % 5 == 0&& n1>1) {
			n1 = n1 / 5;
			five++;
		    }
		    while (n1 % 7 == 0&& n1>1) {
			n1 = n1 / 7;
			seven++;
		    }	    
		    sumOfPrimeFactors = (2 * two) + (3 * three) + (5 * five) + (7 * seven);
	    }

	    System.out.println("value of n1 : "+n1);
	    System.out.println("two : " + two);
	    System.out.println("three : " + three);
	    System.out.println("five : " + five);
	    System.out.println("seven : " + seven);
	    System.out.println("sumOfDigits : " + sumOfDigits);
	    System.out.println("sumOfPrimeFactors : " + sumOfPrimeFactors);
	    
	  //  sumOfPrimeFactors = (2 * two) + (3 * three) + (5 * five) + (7 * seven)+prime;
	    
	    System.out.println("sumOfPrimeFactors : " + sumOfPrimeFactors);
	    
	    if (sumOfDigits == sumOfPrimeFactors) {
		return smith = sumOfDigits / sumOfPrimeFactors;
	    } else {
		return 0;
	    }
	}
	return smith;
    }

    public static void main(String[] args) {
	System.out.println("main method");
	int smith = Test.smithNum(6); // 378/2=189/3=63/3=21/7=7/7=1
	System.out.println("smith number is : " + smith);
    }
}