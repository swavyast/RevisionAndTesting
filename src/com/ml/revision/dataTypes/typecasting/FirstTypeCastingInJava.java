package com.ml.revision.dataTypes.typecasting;

public class FirstTypeCastingInJava {

    public static void main(String[] args) {
	/*
	 * smaller data types can be directly type-casted into larger data types without doing anything in particular.
	 * this kind of type-casting is known as implicit type-casting.
	 * */
	byte x=97;
	short y=x;
	int a=y;
	long b=a;
	//long(64 bit/8byte) has smaller range than float(32bit/4byte).
	float c=b;
	double d=c;
	System.out.println("\n\nbyte representation : "+x);
	System.out.println("\n\nshort representation : "+y);
	System.out.println("\n\nint representation : "+a);
	System.out.println("\n\nlong representation : "+b);
	System.out.println("\n\nfloat representation : "+c);
	System.out.println("\n\ndouble representation : "+d);
	
	//Accessing SecondTypeCastingInJava
	SecondTypeCastingInJava obj = new SecondTypeCastingInJava();
	/*
	 * Larger data-types if being down casted to relatively smaller data-types, requires to be type-casted explicitly.
	 * this kind of type-casting is known as explicit type-casting.
	 * */
	System.out.println("\n\ndouble representation : "+obj.getVar());
	System.out.println("\n\nfloat representation : "+obj.getFl());
	System.out.println("\n\nlong representation : "+obj.getLo());
	System.out.println("\n\nint representation : "+obj.getIn());
	System.out.println("\n\nshort representation : "+obj.getSh());
	System.out.println("\n\nbyte representation : "+obj.getBy());
	
	System.out.println("\n\nCalling toString() method : "+obj);
	System.out.println("\n\nChanging the value of var : ");
	obj.setVar(156.36);
	obj.setFl((float) obj.getVar());
	obj.setLo((long) obj.getFl());
	obj.setIn((int) obj.getLo());
	obj.setSh((short) obj.getIn());
	obj.setBy((byte) obj.getSh());
	System.out.println("\n\n___________________________________________");
	System.out.println("\nAfter changing the value");
	System.out.println("\n\ndouble representation : "+obj.getVar());
	System.out.println("\n\nfloat representation : "+obj.getFl());
	System.out.println("\n\nlong representation : "+obj.getLo());
	System.out.println("\n\nint representation : "+obj.getIn());
	System.out.println("\n\nshort representation : "+obj.getSh());
	System.out.println("\n\nbyte representation : "+obj.getBy()); //prints -100, because range of byte is limited to -128 to 127.
    }

}

class SecondTypeCastingInJava{
    
   private double var=56.36789123456;
   
   //Type mismatch: cannot convert from double to float.
   //private float fp=var;
   private float fl=(float) var;
   private long lo=(long) fl;
   private int in=(int) lo;
   private short sh=(short) in;
   private byte by=(byte) sh;

public double getVar() {
    return var;
}

public void setVar(double var) {
    this.var = var;
}

public float getFl() {
    return fl;
}

public void setFl(float fl) {
    this.fl = fl;
}

public long getLo() {
    return lo;
}

public void setLo(long lo) {
    this.lo = lo;
}

public int getIn() {
    return in;
}

public void setIn(int in) {
    this.in = in;
}

public short getSh() {
    return sh;
}

public void setSh(short sh) {
    this.sh = sh;
}

public byte getBy() {
    return by;
}

public void setBy(byte by) {
    this.by = by;
}

@Override
public String toString() {
    return "SecondTypeCastingInJava [var=" + var + ", fl=" + fl + ", lo=" + lo + ", in=" + in + ", sh=" + sh + ", by="
	    + by + "]";
}
}
