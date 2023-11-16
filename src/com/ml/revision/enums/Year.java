package com.ml.revision.enums;

public enum Year {
    Y1990(1990), Y1991(1991), Y1992(1992);

    private int value;

    Year(int value) {
	this.value=value;
    }
    public int Year() {
	return value;
    }
}
