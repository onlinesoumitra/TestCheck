package com.vmsi.mypackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.vmsi.composite.ClientVO;

public class JunitFetchData {

	
	@Test
	public void testGetClientInformation() {
	//	fail("Not yet implemented");
		
		List CustFileIdList1 =new ArrayList<String>();
		List CustFileIdList2 =new ArrayList<String>();
		CustFileIdList1.add("FILEiD1");
		CustFileIdList2.add("FILEiD2");
		
		ClientVO clientVO=new ClientVO();
		clientVO.setBuyerSellerTypeID("BUYERS1");
		clientVO.setCustFileId1(CustFileIdList1);
		clientVO.setCustFileId2(CustFileIdList2);
		clientVO.setFileNum("FnUM");
		clientVO.setOfficeId("OFCiD");
		clientVO.setSequenceNumber("0");
		
		
		
	}

}
