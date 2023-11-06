package com.ml.revision.variables;

public class StaticVariables {
    static int a;
    static int b;
    //int static b;		
    		    //Syntax error on token "static", delete this token
    //static final float discount=355.6987;
    		    //Type mismatch: cannot convert from double to float
    //static final float discount=355.6987d;
    		    //Type mismatch: cannot convert from double to float
    static final float discount=355.6987f;
    final static int graceMarks=6;
    public static void main(String[] args) {
	/**compareVar cannot be resolved to a variable*/
	//System.out.println("Default value of compareVar : "+compareVar);
	System.out.println("Default value of compareVar : "+new Abc().compareVar);
	System.out.println("Changed value of compareVar : "+(new Abc().compareVar=2000));
	System.out.println("Value of static int a : "+StaticVariables.a);
	System.out.println("Value of static final float discount : "+StaticVariables.discount);
	System.out.println("final static int graceMarks"+ StaticVariables.graceMarks);
	System.out.println("max_value_of_a : "+Abc.max_value_of_a);
	System.out.println("max_value_of_a for new instance of Abc : "+new Abc().max_value_of_a);
	
	/**The operator <= is undefined for the argument type(s) String, int*/
	//System.out.println("Value of a after initialization in class StaticVariables"+a=65);
	System.out.println("Value of a after initialization in class StaticVariables : "+(a=65));
	System.out.println("max_value_of_a for new instance of Abc : "+(new Abc().max_value_of_a=65));
	System.out.println("Value of static int b : "+StaticVariables.b);
	System.out.println("MAX_VALUE_OF_B : "+Abc.MAX_VALUE_OF_B);
	System.out.println("MAX_VALUE_OF_B for new instance of Abc : "+new Abc().MAX_VALUE_OF_B);
	System.out.println("Value of b after initialization in class StaticVariables : "+(b=95));
	
	/**The final field Abc.MAX_VALUE_OF_B cannot be assigned*/
	//System.out.println("MAX_VALUE_OF_B for new instance of Abc : "+(new Abc().MAX_VALUE_OF_B=105));
	
	Abc x=new Abc();
	System.out.println("Default value of max_value_of_a : "+x.max_value_of_a);
	System.out.println("Default value of MAX_VALUE_OF_B : "+x.MAX_VALUE_OF_B);
	System.out.println("Instance Specific value of compareVar : "+x.compareVar);
	x.compareVar=99;
	System.out.println("Changed Instance Specific value of compareVar : "+x.compareVar);
	Class c=x.getClass();
	System.out.println(c.descriptorString());
	System.out.println(c.getAnnotatedSuperclass());
	System.out.println(c.getTypeName());
	System.out.println(c.getName());
	System.out.println(c.getModifiers());
    }
}



final class Abc{
    //static MAX_VALUE_OF_A=10;
    				//Syntax error on token "MAX_VALUE_OF_A", VariableDeclaratorId expected after this token
    static int max_value_of_a=10;
    static final int MAX_VALUE_OF_B=20;
    int compareVar=33;
}
