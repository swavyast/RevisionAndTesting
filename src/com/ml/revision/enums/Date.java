package com.ml.revision.enums;

public enum Date {
    
    D1(1), D2(2), D3(3), D4(4), D5(5), D6(6), D7(7), D8(8), D9(9), D10(10), D11(11), D12(12), D13(13), D14(14), D15(15), D16(16),
    D17(17), D18(18), D19(19), D20(20), D21(21), D22(22), D23(23), D24(24), D25(25), D26(26), D27(27), D28(28), D29(29), D30(30),
    D31(31);
    
    private int value;
    
    Date(int value) {
	this.value=value;
    }
    
    public int Date() {
	return value;
    }
}
