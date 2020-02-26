package com.netty.fuse;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.commons.lang3.StringUtils;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.netty.fuse.util.ISOUtil;
import com.netty.fuse.util.PojoJson;

@Service
public class GenerateFixLength {

	public String generate(String NO_KK, String NIK, String NAMA_LGKP, String KAB_NAME, String AGAMA, String NO_RW,
			String KEC_NAME, String JENIS_PKRJN, String NO_RT, String NO_KEL, String ALAMAT, String NO_KEC,
			String TMPT_LHR, String PDDK_AKH, String STATUS_KAWIN, String NO_PROP, String NAMA_LGKP_IBU,
			String PROP_NAME, String NO_KAB, String KEL_NAME, String JENIS_KLMIN, String TGL_LHR, Exchange exchange)
			throws ISOException {
		System.out.println("INSIDE METHOD GENERATE FL :");
		System.out.println("========================================");
		System.out.println(NO_KK);
		System.out.println(NIK);
		System.out.println(NAMA_LGKP);
		System.out.println(KAB_NAME);
		System.out.println(AGAMA);
		System.out.println(NO_RW);
		System.out.println(KEC_NAME);
		System.out.println(JENIS_PKRJN);
		System.out.println(NO_RT);
		System.out.println(NO_KEL);
		System.out.println(ALAMAT);
		System.out.println(NO_KEC);
		System.out.println(TMPT_LHR);
		System.out.println(PDDK_AKH);
		System.out.println(STATUS_KAWIN);
		System.out.println(NO_PROP);
		System.out.println(NAMA_LGKP_IBU);
		System.out.println(PROP_NAME);
		System.out.println(NO_KAB);
		System.out.println(KEL_NAME);
		System.out.println(JENIS_KLMIN);
		System.out.println(TGL_LHR);
		System.out.println("========================================");

		String component1 = StringUtils.rightPad("1223SWDKWSCONS99990001108", 48, " ");
		String component2 = StringUtils.rightPad("2020012016442500767700000000767700", 34, " ");
		String component3 = StringUtils.rightPad("DUKCALL", 7, " ");
		String component4 = "";
		String component5 = StringUtils.rightPad(NIK, 20, " ");
		String component6 = StringUtils.rightPad(exchange.getProperty("user_id_prop").toString(), 20, " ");
		String component7 = StringUtils.rightPad(NO_KK, 20, " ");
		String component8 = StringUtils.rightPad(NAMA_LGKP, 100, " ");
		String component9 = StringUtils.rightPad(KAB_NAME, 150, " ");
		String component10 = StringUtils.rightPad(NO_RW, 3, " ");
		String component11 = StringUtils.rightPad(KEC_NAME, 50, " ");
		String component12 = "";
		String component13 = StringUtils.rightPad(JENIS_PKRJN, 100, " ");
		String component14 = StringUtils.rightPad(NO_RT, 3, " ");
		String component15 = StringUtils.rightPad(NO_KEL, 8, " ");
		String component16 = StringUtils.rightPad(ALAMAT, 200, " ");
		String component17 = StringUtils.rightPad(NO_KEC, 3, " ");
		String component18 = StringUtils.rightPad(TMPT_LHR, 50, " ");
		String component19 = StringUtils.rightPad(NO_PROP, 3, " ");
		String component20 = StringUtils.rightPad(STATUS_KAWIN, 20, " ");
		String component21 = StringUtils.rightPad(NAMA_LGKP_IBU, 100, " ");
		String component22 = StringUtils.rightPad(PROP_NAME, 50, " ");
		String component23 = StringUtils.rightPad(NO_KAB, 3, " ");
		String component24 = StringUtils.rightPad(KEL_NAME, 50, " ");
		String component25 = StringUtils.rightPad(JENIS_KLMIN, 10, " ");
		String component26 = StringUtils.rightPad(TGL_LHR, 60, " ");
		String component27 = StringUtils.rightPad(AGAMA, 10, " ");
		String component28 = StringUtils.rightPad(PDDK_AKH, 18, " ");

		StringBuilder str = new StringBuilder(component1);
		str.append(component2);
		str.append(component3);
		str.append(component4);
		str.append(component5);
		str.append(component6);
		str.append(component7);
		str.append(component8);
		str.append(component9);
		str.append(component10);
		str.append(component11);
		str.append(component12);
		str.append(component13);
		str.append(component14);
		str.append(component15);
		str.append(component16);
		str.append(component17);
		str.append(component18);
		str.append(component19);
		str.append(component20);
		str.append(component21);
		str.append(component22);
		str.append(component23);
		str.append(component24);
		str.append(component25);
		str.append(component26);
		str.append(component27);
		str.append(component28);
		return str.toString();
	}

}