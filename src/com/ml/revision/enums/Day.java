package com.ml.revision.enums;

public enum Day {
    
    SUNDAY("Sun"), MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"), THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat");
    
    private String value;
    
    Day(String value){
	this.value=value;
    }
    public String Day() {
	return value;
    }
}
