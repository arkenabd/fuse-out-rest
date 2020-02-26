package com.netty.fuse.util;

import org.apache.commons.lang3.RandomStringUtils;

public class FixLengthMessageOut {
	public String randomNumeric(int n) {
		return RandomStringUtils.randomNumeric(n);
	}

	public String randomAlphabetic(int n) {
		return RandomStringUtils.randomAlphabetic(n);
	}

	public String randomAlphanumeric(int n) {
		return RandomStringUtils.randomAlphanumeric(n);
	}

	public String generateFl() {
		String component1 = randomNumeric(17);
		String component2 = "hliapp";
		String component3 = randomAlphanumeric(5);
		String component4 = "___";
		String component5 = randomAlphanumeric(10);
		String component6 = "192.168.87.61                          ";
		String component7 = randomNumeric(2) + "-" + randomNumeric(2) + "-" + randomNumeric(2) + "-" + randomNumeric(2);
		String component8 = "TEXTEXT00000SA" + randomNumeric(20) + "655000                        ";
		String component9 = "0024HOS_EAR0000120200120151655280100            ";
		String component10 = "R10KRXTN                ";
		String component11 = "0024EB1                                                       ";
		String component12 = "1000000085SWDKWSCONS9999                              ";
		String component13 = "2020012015165500658100000000" + randomNumeric(6) + "PDFMAIL@@ ";
		return component1 + component2 + component3 + component4 + component5 + component6 + component7 + component8
				+ component9 + component10 + component11 + component12 + component13;
	}

}
