package com.vmsi.mypackage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vmsi.composite.Client;
import com.vmsi.composite.ClientVO;
import com.vmsi.composite.HelloWorld;

public class Main {
	
	@Autowired
	private static ClientVO clientVO;
	
	@Autowired
	private Client client;
	
	
	@Autowired
	private static FetchClientInfo fetchClientInfo;

	public static void main(String args[]) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
	List<String> CustFileIdList1 = new ArrayList<String>();
		List<String> CustFileIdList2 = new ArrayList<String>();

		CustFileIdList1.add("FILEiD1");
		CustFileIdList2.add("FILEID2");
/*
		ClientVO clientVO=new ClientVO();
		FetchClientInfo fetchClientInfo=new FetchClientInfo();*/
		clientVO.setBuyerSellerTypeID("BUYERS1");
		clientVO.setCustFileId1(CustFileIdList1);
		clientVO.setCustFileId2(CustFileIdList2);
		clientVO.setFileNum("FnUM");
		clientVO.setOfficeId("OFCiD");
		clientVO.setSequenceNumber("0");
		fetchClientInfo.getClientInformation(clientVO);
		
		/*ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

	      obj.getMessage();*/
	}
}
