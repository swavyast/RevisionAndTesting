package com.ml.revision.algorithms;

public class SmithNumber {
    private boolean isPrime = true;

    public static boolean isPrime(int n) {

	boolean isPrime = true;
	if (n <= 1) {
	    isPrime = false;
	    return isPrime;
	} else {
	    for (int i = 2; i <= n / 2; i++) {
		if ((n % i) == 0) {
		    isPrime = false;
		    break;
		}
	    }
	    return isPrime;
	}

    }

    public static int isSmithNumber(int n) {
	int n1 = n;
	int smith = 0;
	int digitSum = 0;
	int factorSum = 0;
	int two = 0;
	int three = 0;
	int five = 0;
	int seven = 0;
	int count = 0;
	int factor[] = new int[50];

	if (isPrime(n)) {
	    smith = 0;

	    return smith;

	} else {
	    while (n > 0) {
		digitSum += n % 10;
		n /= 10;
	    }
	    System.out.println("digitSum : " + digitSum);

	    while (n1 > 1) {

		if (n1 % 2 == 0 && n1 % 3 != 0 && n1 % 5 != 0 && n1 % 7 != 0 && !isPrime(n1)) {
		    two++;
		    count++;
		    factor[count] = 2;
		    n1 = n1 / 2;
		}
		if (n1 % 3 == 0 && n1 % 5 != 0 && n1 % 7 != 0 && !isPrime(n1)) {
		    three++;
		    count++;
		    factor[count] = 3;
		    n1 = n1 / 3;
		}

		if (n1 % 5 == 0 && n1 % 7 != 0 && !isPrime(n1)) {
		    five++;
		    count++;
		    factor[count] = 5;
		    n1 = n1 / 5;
		}

		if (n1 % 7 == 0 && !isPrime(n1)) {
		    seven++;
		    count++;
		    factor[count] = 7;
		    n1 = n1 / 7;
		}
		
		if (n1 == 1) {
		    n1 %= 1;
		}
		System.out.println("n1 here is : "+n1);
		if(n1>10) {
		    for(int i = 0; i<=n1/10;i++) {
			factor[count]=n1%10;
			count++;
			n1/=10;
		    }
		}

	    }

	    for (int i : factor) {
		factorSum = factorSum + i;
	    }

	    System.out.println("\ncount : " + count);

	    System.out.println("\ntwo : " + two);

	    System.out.println("\nthree : " + three);

	    System.out.println("\nfive : " + five);

	    System.out.println("\nseven : " + seven);

	    System.out.println("\nfactorSum : " + factorSum);
	    
	    System.out.print("\nPrime Factors are : ");
	    for (int i : factor) {
		if(i>0)
		System.out.print(i+"  ");
	    }

	    if (digitSum == factorSum) {
		return smith = 1;
	    } else {
		return smith = 0;
	    }

	}

    }

    public static void main(String[] args) {

	boolean result = SmithNumber.isPrime(2);
	System.out.println(
		"\nGiven number is prime only if the value of result is true \n\nValue of the result is : " + result);
	int smith = SmithNumber.isSmithNumber(121);
	System.out.println("\nSmith value is : " + smith);
    }

}
