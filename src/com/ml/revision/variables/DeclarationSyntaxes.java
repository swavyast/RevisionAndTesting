package com.ml.revision.variables;

public class DeclarationSyntaxes {
	int x;			//class level variable declaration
	int y=10;			//class level variable initialization
	int a, b, c;			//class level variable - batch declaration
	int m=20, n=30, o=40;			//class level variables - batch initialization
	
	//public method without return type
	public void methodOne() {
		int x; // before it's use, it must be initialized with a certain value.
		x=36;			//local variable
		System.out.println("Value of local variable x inside local context of methodOne : "+x);
	}
	
	//method with return type
	public int add(int a, float b){
		int res;
		//res=a+b;	/*Type mismatch: cannot convert from float to int */
		res=a+(int)b;
		return res;
	}
	
	//method with return type
	public float add(float a, int b){
		float res;
		//res=a+b;	/*Type mismatch: cannot convert from float to int */
		res=a+(float)b;
		return res;
	}
	
	//method with return type
	public int xyz(int m){
		m++;
		return m;
	}
	
	//instance block
	{
		int var=25;			//local variable
		System.out.println("Value of local variable var in instance block : "+var);
	}
	
	//static block
	static {
		float val=2.36f;			//local variable
		System.out.println("Value of local variable val in static block : "+val);
	}
	
	public static void main(String[] args) {
		//System.out.println(x);
								/* Cannot make a static reference to the non-static field 'x' */
		DeclarationSyntaxes ds=new DeclarationSyntaxes();
		ds.methodOne();
		System.out.println("Value of class level variable x in class DeclarationSyntaxes : "+ds.x); 
		//prints default value of integer type because variable is not initialized.
		System.out.println("Value of class level variable y in class DeclarationSyntaxes : "+ds.y);
		System.out.println("Value of class level variable a in class DeclarationSyntaxes : "+ds.a);
		System.out.println("Value of class level variable b in class DeclarationSyntaxes : "+ds.b);
		System.out.println("Value of class level variable c in class DeclarationSyntaxes : "+ds.c);
		System.out.println("Value of class level variable m in class DeclarationSyntaxes : "+ds.m);
		System.out.println("Value of class level variable n in class DeclarationSyntaxes : "+ds.n);
		System.out.println("Value of class level variable o in class DeclarationSyntaxes : "+ds.o);
		//System.out.println(ds.var); /* var can't be resolved or is not a field*/
		//System.out.println(val); /* val can't be resolved to a variable*/
		//System.out.println(var); /* val can't be resolved to a variable*/
		
		System.out.println("Value of local variable res in method add : "+ds.add(23, 3.6f));
		System.out.println("Value of local variable res in method add : "+ds.add(45.23f, 55));
		
		//byte b=ds.xyz(56); /*Type mismatch: cannot convert from int to byte*/
		
		byte b1=(byte)ds.xyz(98); /*accessing the value of local variable in main method using incompatible data type 
		using type-casting feature. Same process will work for short as well*/
		short s1=(short)ds.xyz(78);
		int M=ds.xyz(25); //accessing the value of local variable in main method using same data type
		double N=ds.xyz(36); //accessing the value of local variable in main method using compatible data type
		float F=ds.xyz(55); //accessing the value of local variable in main method using compatible data type
		System.out.println("Value of local variable m in method xyz : "+M);
		System.out.println("Value of local variable m in method xyz : "+N);
		System.out.println("Value of local variable m in method xyz : "+F);
		System.out.println("Value of local variable m in method xyz : "+b1);
		System.out.println("Value of local variable m in method xyz : "+s1);
	}

}