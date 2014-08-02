package com.vmsi.composite;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClientVO {
	private List<String> custFileId1;
	private List<String> custFileId2;
	private String fileNum;
	private String officeId;
	private String buyerSellerTypeID;
	private String sequenceNumber;
	
	public String getFileNum() {
		return fileNum;
	}
	public void setFileNum(String fileNum) {
		this.fileNum = fileNum;
	}
	public String getOfficeId() {
		return officeId;
	}
	public List<String> getCustFileId1() {
		return custFileId1;
	}
	public void setCustFileId1(List<String> custFileId1) {
		this.custFileId1 = custFileId1;
	}
	public List<String> getCustFileId2() {
		return custFileId2;
	}
	public void setCustFileId2(List<String> custFileId2) {
		this.custFileId2 = custFileId2;
	}
	public String getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	public String getBuyerSellerTypeID() {
		return buyerSellerTypeID;
	}
	public void setBuyerSellerTypeID(String buyerSellerTypeID) {
		this.buyerSellerTypeID = buyerSellerTypeID;
	}
	@Override
	public String toString() {
		return "ClienVO [custFileId1=" + custFileId1 + ", custFileId2="
				+ custFileId2 + ", fileNum=" + fileNum + ", officeId="
				+ officeId + ", buyerSellerTypeID=" + buyerSellerTypeID
				+ ", sequenceNumber=" + sequenceNumber + "]";
	}
}
