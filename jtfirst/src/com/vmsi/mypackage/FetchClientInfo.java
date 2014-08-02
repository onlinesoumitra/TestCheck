package com.vmsi.mypackage;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vmsi.composite.Client;
import com.vmsi.composite.ClientVO;

@Component
public class FetchClientInfo {
	private Client client;

	
	public Client getClientInformation(ClientVO clientParams) {

		Session session = null;
		Transaction t = null;

		try {
			// creating configuration object
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");// populates the data of the
												// configuration file

			// creating seession factory object
			SessionFactory factory = null;
			try {
				factory = cfg.buildSessionFactory();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// creating session object
			session = factory.openSession();

			// creating transaction object
			t = session.beginTransaction();

			client = new Client();

			List<String> custFileIDList1 = clientParams.getCustFileId1();
			List<String> custFileIDList2 = clientParams.getCustFileId2();
			String buyerSellerTypeId = clientParams.getBuyerSellerTypeID();
			String fileNum = clientParams.getFileNum();
			String officeId = clientParams.getOfficeId();
			String sequenceNumber = clientParams.getSequenceNumber();

			// add the parames in the query
			List data = session.getNamedQuery("clientQuery1")
					.setString("propertyNum", "12348")
					.setParameterList("CUSTOMFIELDID1", custFileIDList1)
					.setParameterList("CUSTOMFIELDID2", custFileIDList2)
					.setString("BuyerSellerTypeID", buyerSellerTypeId)
					.setString("FileNumber", fileNum)
					.setString("OfficeID", officeId)
					.setString("SequenceNumber", sequenceNumber).list();

			/*
			 * System.out.println("value in the list1: " + ((Client)
			 * data.get(0)).getPropertyNum());
			 */

			for (Object c : data) {
				System.out.println((Client) c);
			}
			t.commit();

		} catch (HibernateException e) {
			if (t != null)
				t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return client;
	}
}
