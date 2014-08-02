package com.vmsi.mypackage;

public interface Constants {
public static final  String SQL="select (ClientsFileNumber + 1) as propertyId, ClientsFileNumber as propertyNum,"+
"'"+"RESW"+"'"+ "as \"client-code\","+
"\'RESMAE\' as clientDealName, "+
 "\'SF\' as propertyType,"+

"InstrumentNumber as investorCode, StreetNumber as propertyStreetNumber,StreetName as propertyStreetName, Name as propertyCity,"+ 
"State as propertyState,"+
 "Zip as propertyZip, PrimaryBuyerSellerName as borrowerName,SalesPrice as \"pre-fcValue\", LoanAmount as assetValue,  val as propertyStatus,"+ 
"'0' as yearBuilt, '0' as  area, '0' as  noofRooms,'0' as  noofBedRooms, '0' as noofFullBaths,'0' as noofHalfBaths, "+
"'0' as garageSize, 'Referral Broker' as listingAgentType, 'NA' as Name, 'NA' Email, '0' as priorityFlag, "+
"'1' as OccupancyStatus, '1' as IsInvestorBilling,'1' as LienPosition, 'Yes' as  InspectionRequired,"+ 
"'\\\\"+"PTP-A4B-364"+"\\\\Adjuster Report\\'"+" as AdjustorLinkReport, "
+ "FileNumber as ReswarefileNo, spli as SplInstruction,Buyer1 as Name, EmailPrimary as Email,"
 +"Phone as PhoneNo1, Buyer2 as Name, EmailSecondary as Email, Phone as PhoneNo1 from DUMMY_VMSI";

public static final  String SQLTest="select (ClientsFileNumber + 1) as propertyId from DUMMY_VMSI";
}
