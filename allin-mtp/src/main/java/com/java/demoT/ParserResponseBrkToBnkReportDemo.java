/**
 * 报文解密，验签，解析处理DEMO
 * @author leo.xu
 */
package com.java.demoT;

import com.mind.platform.system.base.DataRow;

public class ParserResponseBrkToBnkReportDemo {
	
	public static void main(String[] args) {
		
		//初始化需要签名加密的报文数据，以DataRow方式返回
		DataRow requestDataRowDto = ReportDemo.initBrkToBnkReportDemo();
		
		//进行报文的组装，签名，加密处理，返回密文requestXml
		String requestXml = ReportDemo.encryptionBrkToBnkDemo(requestDataRowDto);
		
		/*
		 * 报文解密，验签，解析处理
		 * 
		 * 生成DataRow为解析出信息的包装类
		 */
		
//		String requestXml = "PFNUU1BhY2thZ2U+PEVuY3J5cHRlZFRleHQ+OFo4T1F5UXBwK2lZd2xRVWZ4dFptelJwQ2xNWGZJSWtkYWhGZTNzQythN0JiOTgxa2tySGlGbmN1dVdkeXg3cGIwTGFxc2lyK2hMMk9IWHBTcm94UUdST0dCYjhPOFlNdXg3ODJtck5Tcm9KbTRVU1VLeWoxd3hJSy8zMlFKWXJCRHlTaEdWNWgrb2RmUWVDWkw4Tnh4ZnVpOVFpUFdjUUNxNzVLWmtvZXA2RXYraUhZMHdMaHhWTFR6YWEzcnp5cCtCdVcxSmtnamtkM0lvUlBPSWN2UFJqOG4wMVhLL09RczMyK2l0Y0ZWbW40RzViVW1TQ09iVGNVOXBhL3pWS3EzQ1I5L1hCdGUwUEI5L3BGM21BVkNnVWFXOUxNSmk3aHB2YUs2Y09EcjcxaWpicExSUmVSd3pIakYxK1VVWHBXWXVwOGI3T283QXJsSC9xSjAycDhyNHlqa1ZzcDByU1BzcndJQWJqMWRKTy9TMFBPWGIzUFV6SHM5MGtTVkhCSnlBWWpWcVhVN3hGelhvUXBkNW5qRURFS0cveVgyNFpaRmpUbkpqSTFLR0RsWEI1VjJEWTlxQlJQbFdNSytBcXRBeVBTNkJ5TzNjaVY4OEJQZDh4VnZNZFBlNkVsODBTQWxKaVRNckdpUFdlSEJzTlJHVzJGY1JSbEhueTJTUmtCY0ZUK2pGdTFraUdpSWpKWThzaUNHSlViNmdxRnZ3d2VGdENKWkxUNHFGSHlDMVRVTnhJei9xcWJ0U0VEcWRZdUxla3dPeTdxYVZURWVpNjBZREZ1SllvZnM4WE5meXNoZ0twMFVFZEJ4d3hrY1N4OWVrdE50eEhJSjRxOEkxVXNkRGJrRmRpOXVpQkRMQ1Y4SHUwRUVXTTRsRU51VGgzcm84YzRkb2dLMXJBRGx4VnAzdEpsL1IvVnJFMU9Kc3l3Ny9wbmdTVXNiamUyZjRTUTBCZ3FvbG5TbDBJb3NVRUFtcDBhNW5TZVQ4VFNpVGVOaDEzVVpyTU52YitlT2NNdHg1UEFUeGdIUGM3eVEraFh0eHFzZXZYSHdBRzBzb2VnWU1XVWdHTkswK3FVeGh4QjMxZWpwTDVSK2RKcC8zQU5XZFJuWStBS3d2YTQ1Z0VsMUp0dUwxZkpadEprZWNyc3NCaDE5OEx1bXlCdHgzQ0t2a2MxT3dYMGd5VlF5SzB5aFN1TnN0a1ByMTZoeGRnb3psalczaDBUcjI0Z09JSG1qODUrQlYyQ3lmVGJQeFZpV1p4Sk9YYmM5Nnc5R01SRktVb1V2MGRCQkY4cmx3RGZqRThxd0tkSmQ1bnZzcEUrcXB1MUlRT3AxaWlad1AvQkR3Qld3T2doaSswUXczMDwvRW5jcnlwdGVkVGV4dD48S2V5SW5mbz48UmVjZWl2ZXJYNTA5Q2VydFNOPjkwODUzMzc2NjM0NzY2Mjc5MzY5NDE2MDcwNzQyOTQ0NzE3MDQ8L1JlY2VpdmVyWDUwOUNlcnRTTj48RW5jcnlwdGVkS2V5PmM3WE84RDFBRnN5eWRVRXVjU21pSW5vT0ZTaUVIcldRRmhSU3VrKzFBRUl5eGtDK1puQkJ6bFBVZ0NhNHk4ZVIyaDBGMWp4eXk5YkxUeTIvbTZiYTlTcTdnTmZ2ejgyblhsV2xvWHhidU1oeXhucCtaK1ZrNFVDcmkwMDZXNTVTb2FUYmRRNTNoWnh0cEFibm5JSmVLT1hWRDVSNzEwSFV0K3VGZStOZEc5bz08L0VuY3J5cHRlZEtleT48L0tleUluZm8+PC9TVFNQYWNrYWdlPg==";
		DataRow row = ReportDemo.decryptionBrkToBnkDemo(requestXml);
		
		System.out.println(row);
	}

}
