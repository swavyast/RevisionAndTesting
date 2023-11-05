package com.ml.revision.variables;

public class DeclarationSyntaxes {
	int x;			//instance(non=static) variable declaration
	int y=10;			//instance(non=static) variable declaration & initialization
	int a, b, c;			//instance(non=static) variable - batch declaration
	int m=20, n=30, o=40;			//instance(non=static) variables - batch declaration & initialization
	static int v1=25;		//class variable declaration & initialization
		
		/**Duplicate field DeclarationSyntaxes.x*/
	
	//int x=67;
	
	/**Duplicate field DeclarationSyntaxes.x*/
	
	//static int v1=90;
	
	//public method without return type
	public void methodOne() {
		int x; // before it's use, it must be initialized with a certain value.
		
			/**Cannot make a static reference to the 
			non-static field DeclarationSyntaxes.x*/
		//x=DeclarationSyntaxes.x;	
		
			//The local variable x may not have been initialized
		
		//System.out.println("Value of local variable x inside local context of methodOne : "+x);
		
		x=new DeclarationSyntaxes().x;
		System.out.println("Value of local variable x inside local context of methodOne : "+x);
		x=89;
		System.out.println("Value of local variable x inside local context of methodOne after re-initialization : "+x);
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
        		/**
        		val+=new DeclarationSyntaxes().y;
        		System.out.println("Value of val with y : "+val); 12.36
        		*/
		System.out.println("Value of local variable val in static block : "+val);
		val+=v1;
		System.out.println("Value of local variable val in static block after adding static variable v1 : "+val);
		
		/**Type mismatch: cannot convert from float to int*/
		//v1=val+v1; 
		v1=(int) (val+v1);
		System.out.println("Changed value of static variable v1 inside static context of class DeclarationSyntaxes : "+v1);
		val=v1+val;
		System.out.println("Changed value of val : "+val);
		double result=v1+val;
		System.out.println("Changing the type of resultant variable result : "+result);
		
		/**Type mismatch: cannot convert from float to long*/
		//long res=v1+val;
		long res=(long) (v1+val);
		System.out.println("result of res=v1+val in long format : "+res);
		float res1=v1+val;
		System.out.println("result of res1=v1+val in float format : "+res1);
		
		/** Cannot make a static reference to the non-static field y */
		//val+=y;
		val+=new DeclarationSyntaxes().y;
		System.out.println("Value of val with y : "+val); //89.36? val=79.36(changed value of val)+ y=10.
	}
	
	public static void main(String[] args) {
		//System.out.println(x);
								/* Cannot make a static reference to the non-static field 'x' */
		DeclarationSyntaxes ds=new DeclarationSyntaxes();
		ds.methodOne();
		
		//prints default value of integer type because variable is not initialized.
		System.out.println("Value of class level variable x in class DeclarationSyntaxes : "+ds.x); 
		System.out.println("Value of class level variable y in class DeclarationSyntaxes : "+ds.y);
		System.out.println("Value of class level variable a in class DeclarationSyntaxes : "+ds.a);
		System.out.println("Value of class level variable b in class DeclarationSyntaxes : "+ds.b);
		System.out.println("Value of class level variable c in class DeclarationSyntaxes : "+ds.c);
		System.out.println("Value of class level variable m in class DeclarationSyntaxes : "+ds.m);
		System.out.println("Value of class level variable n in class DeclarationSyntaxes : "+ds.n);
		System.out.println("Value of class level variable o in class DeclarationSyntaxes : "+ds.o);
		
			/** var can't be resolved or is not a field, because var is declared inside a local context 
			 * and is accessible in it's local context only */
		
		//System.out.println(ds.var);	
		
			/** val can't be resolved to a variable, because var is declared inside a local context 
			 * and is accessible in it's local context only */
		
		//System.out.println(val); 

			/** var can't be resolved to a variable, because var is declared inside a local context 
			 * and is accessible in it's local context only*/
		
		//System.out.println(var); 
		
			/** var cannot be resolved or is not a field, */
		
		//System.out.println(DeclarationSyntaxes.var); 
		
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
		
		System.out.println("Value of static variable v1 : "+v1);
		//System.out.println(ds.val);
	}

}