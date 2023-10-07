package com.ml.revision.identifiers;

public class Identifiers_Paractice {
	int a;
	int A;
	int $;		
	//int #;		/* syntax error, invalid identifier */
	//char 123;		/* syntax error, invalid identifier */
	String xyz="abc";
	String _x="yz";
	String $1="abc";
	//String 1x="$123";		/* syntax error on token "1"' */
	//boolean true;		/* syntax error on token "true" */
	//long a&b;		/* syntax error on token "&", , expected */
	
	//public static void class() {	}				/* syntax error on token "class", identifier expected */
	
	public static void _123() {
		
	}
	public static void $123() {
		
	}
	public static void a23() {
		
	}
	public static void A123() {
		
	}
	public static void _1a23() {
		
	}
	public static void _1A23() {
		
	}
	void m1() {}
	
	//void 1a() {}				
	/* syntax error on token "1", delete this token
	 * return type of the method is missing
	 */
	//double static;
	/* syntax error on token "static", invalid Variableeclarator
	 */

	public static void main(String[] args) {


	}

}
