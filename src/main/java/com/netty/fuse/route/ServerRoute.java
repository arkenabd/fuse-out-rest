package com.netty.fuse.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.spring.Main;
import org.springframework.stereotype.Component;

import com.netty.fuse.util.PojoJson;
import com.netty.fuse.util.UserPojoReq;
import com.netty.fuse.util.UserPojoReq2;
import com.netty.fuse.util.UserPojoResp;

@Component

public class ServerRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		String user_id="";
		from("netty:tcp://0.0.0.0:7000?textline=true&sync=true&requestTimeout=10000&allowDefaultCodec=false&encoder=#stringEncoder&decoder=#stringDecoder")
				// from("timer:1")
		
				.bean("parsingFixLength")
				.unmarshal().json(JsonLibrary.Gson, UserPojoReq2.class)
				.setProperty("user_id_prop", simple("${body.getUser_id}"))
				.setProperty("nik_prop", simple("${body.getNIK}"))
				  .process(new Processor() {
				     public void process(Exchange exchange) throws Exception {
				        System.out.println(exchange.getProperty("user_id_prop"));
				        System.out.println(exchange.getProperty("nik_prop"));
				    }
				})
				.marshal().json(JsonLibrary.Gson, UserPojoReq.class)
				.setHeader(Exchange.HTTP_METHOD, constant("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
				
				.to("http4://fuse-dum-dukcapil-middleware.apps.hanabank.co.id/dukcapil/reg").unmarshal().json(JsonLibrary.Gson, UserPojoReq.class)
//				.to("http4://localhost:7070/dukcapil/reg")
				.unmarshal().json(JsonLibrary.Gson, UserPojoResp.class)
				.log("Body IN : (${body})")
				.log("Body body.getNO_KK : ( ${body.getNO_KK} )")
				.log("Body body.getNIK : ( ${body.getNIK} )")
				.log("Body body.getNAMA_LGKP : ( ${body.getNAMA_LGKP} )")
				.log("Body body.getKAB_NAME : ( ${body.getKAB_NAME} )")
				.log("Body body.getAGAMA : ( ${body.getAGAMA} )")
				.log("Body body.getNO_RW : ( ${body.getNO_RW} )")
				.log("Body body.getKEC_NAME : ( ${body.getKEC_NAME} )")
				.log("Body body.getJENIS_PKRJN : ( ${body.getJENIS_PKRJN} )")
				.log("Body body.getNO_RT : ( ${body.getNO_RT} )")
				.log("Body body.getNO_KEL : ( ${body.getNO_KEL} )")
				.log("Body body.getALAMAT : ( ${body.getALAMAT} )")
				.log("Body body.getNO_KEC : ( ${body.getNO_KEC} )")
				.log("Body body.getTMPT_LHR : ( ${body.getTMPT_LHR} )")
				.log("Body body.getPDDK_AKH : ( ${body.getPDDK_AKH} )")
				.log("Body body.getSTATUS_KAWIN : ( ${body.getSTATUS_KAWIN} )")
				.log("Body body.getNO_PROP : ( ${body.getNO_PROP} )")
				.log("Body body.getNAMA_LGKP_IBU : ( ${body.getNAMA_LGKP_IBU} )")
				.log("Body body.getPROP_NAME : ( ${body.getPROP_NAME} )")
				.log("Body body.getNO_KAB : ( ${body.getNO_KAB} )")
				.log("Body body.getKEL_NAME : ( ${body.getKEL_NAME} )")
				.log("Body body.getJENIS_KLMIN : ( ${body.getJENIS_KLMIN} )")
				.log("Body body.getTGL_LHR : ( ${body.getTGL_LHR} )")
				.bean("generateFixLength",
						"generate(${body.getNO_KK},${body.getNIK},${body.getNAMA_LGKP},${body.getKAB_NAME},"
								+ "${body.getAGAMA},${body.getNO_RW},${body.getKEC_NAME},${body.getJENIS_PKRJN},"
								+ "${body.getNO_RT},${body.getNO_KEL},${body.getALAMAT},${body.getNO_KEC},"
								+ "${body.getTMPT_LHR},${body.getPDDK_AKH},${body.getSTATUS_KAWIN},${body.getNO_PROP},"
								+ "${body.getNAMA_LGKP_IBU},${body.getPROP_NAME},${body.getNO_KAB},${body.getKEL_NAME},"
								+ "${body.getJENIS_KLMIN},${body.getTGL_LHR})");
		;

	}
}