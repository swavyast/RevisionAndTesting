package com.ml.revision.dataTypes;
import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalOperations {

    
    public static void main(String[] args) {
	
	System.out.println(BigDecimal.ZERO);
	System.out.println(BigDecimal.ONE);
	System.out.println(BigDecimal.TWO);
	System.out.println(BigDecimal.TEN);
	System.out.println("\n*************************************************************");
		
		//BigDecimal Values
	BigDecimal firstValue=new BigDecimal("12256984789964558.556988487555896");
	BigDecimal secondValue=new BigDecimal("122569847899645567.5569882387555896");
	
		//BigDecimalOperations
	BigDecimal sum=firstValue.add(secondValue);
	BigDecimal sub=secondValue.subtract(firstValue);
	BigDecimal pro=firstValue.multiply(secondValue);
        	/**
        	 * throws
        	 * Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; 
        	 * no exact representable decimal result.
        	 * 
        	 * Reason : In the case of divide, the exact quotient could have an infinitely long decimal expansion; 
        	 * for example, 1 divided by 3.
        	 * */
		//BigDecimal quo=secondValue.divide(firstValue);
	BigDecimal quo=secondValue.divide(firstValue, MathContext.DECIMAL128);
	BigDecimal rem=firstValue.remainder(secondValue);
		//PrintResults
	System.out.println("Sum of firstValue and secondValue is : \n\n"+sum.toString());
	System.out.println("\nDifference of firstValue and secondValue is : \n\n"+sub.toString());
	System.out.println("\nProduct of firstValue and secondValue is : \n\n"+pro.toString());
	System.out.println("\nQuotient of firstValue and secondValue is : \n\n"+quo.toString());
	System.out.println("\nRemainder of firstValue and secondValue is : \n\n"+rem.toString());
	System.out.println("\n************************************************************************");
	
        	/**
        	 * 	-1 represents that firstValue is smaller than secondValue
        	 * 	0 represents that both values are equal and
        	 * 	1 represents that firstValue is greater than secondValue
        	 * */
	System.out.println("Comparison between firstValue and SecondValue : "+firstValue.compareTo(secondValue));
	
        	/**
        	 * Converts this BigDecimal to a double.This conversion is similar to the narrowing primitive conversion from 
        	 * double to float as defined in The Java Language Specification:
        	 * */
	System.out.println("Value of firstValue in double format : "+firstValue.doubleValue());
	System.out.println("Checking if both values are equal : "+firstValue.equals(secondValue));
	
		//The precision is the number of digits in the unscaled value.
	System.out.println("Precision of firstValue is : "+firstValue.precision());
	
        	/** If zero or positive, the scale is the number of digits to the right of the decimal point. 
        	 * If negative, the unscaled value of the number is multiplied by ten to the power of the negation of the scale. 
        	 * For example, a scale of -3 means the unscaled value is multiplied by 1000.
        	 * */
	System.out.println("Scale of firstValue is : "+firstValue.scale());
	
		//Returns a string representation of this BigDecimal without an exponent field.
	System.out.println("PlainStringValue of firstValue is : "+firstValue.toPlainString());
	
		//Returns a BigDecimal whose value is the absolute value of this BigDecimal, and whose scale is this.scale().
	System.out.println("AbsoluteValue of firstValue is : "+firstValue.abs());
	
		//Returns the numeric value represented by this object after conversion to type byte.
	System.out.println("ByteValue of firstValue is : "+firstValue.byteValue());
	
	System.out.println("ByteValue of secondValue is : "+secondValue.byteValue());
	System.out.println("\n************************************");
	
		//Using Number Type reference for storing BigDecimal Type values
	Number n1=new BigDecimal("23.69");
	System.out.println(n1.doubleValue());
	System.out.println(n1.intValue());
	System.out.println(n1.toString());
	System.out.println(n1.getClass());
	System.out.println(n1.byteValue());
	System.out.println(n1.shortValue());
	
    }

}
