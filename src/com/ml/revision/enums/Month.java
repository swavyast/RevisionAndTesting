package com.ml.revision.enums;

public enum Month {

    JANUARY("Jan"), FEBRUARY("Feb"), MARCH("Mar"), APRIL("Apr"), MAY("May"), JUNE("Jun"), JULY("Jul"),
    AUGUST("Aug"), SEPTEMBER("Sep"), OCTOBER("Oct"), NOVEMBER("Nov"), DECEMBER("Dec");

    private String name;

    Month(String string) {
	this.name=string;
    }
    public String Month() {
	return name;
    }
}
