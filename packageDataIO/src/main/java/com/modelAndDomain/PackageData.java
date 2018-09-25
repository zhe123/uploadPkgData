package com.modelAndDomain;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class PackageData  implements Serializable{
	private static final long serialVersionUID=1L;
    private String UserNo; 
    private String ShippingCo;
    private String ShippingNo;
    private String RecipientFirstName;
    private String RecipientMiddleInitial;
	
    private String RecipientLastName;
    private String RecipientBusinessName;
    private String RecipientAddress_Line_1;
    private String RecipientAddress_Line_2;
	private String RecipientAddress_Line_3;
    private String RecipientCity;
    private String RecipientProvince;
    private String RecipientPostal_Code;
    private String RecipientCountry_Code;
    private String RecipientPhone;
    private String RecipientEmail;
	private String RecipientAddress_IsPOBox;
	private String IdCardNum;
	private String IdFrontUrl;
	private String IdBackUrl;
    private List<ItemData> list;
	
   public PackageData() {
		super();
	}
	public PackageData(JSONObject map) throws JSONException, JsonParseException, JsonMappingException, IOException {
		super();
		 
		this.UserNo=(String)map.get("UserNo"); 
		this.ShippingCo=(String)map.get("ShippingCo");
		this.ShippingNo=(String)map.get("ShippingNo");
    	this.RecipientFirstName=(String)map.get("RecipientName");
    	this.RecipientMiddleInitial=(String)map.get("RecipientMiddleInitial");
    	this.RecipientLastName=(String) map.get("RecipientLastName");
    	this.RecipientBusinessName=(String)map.get("RecipientBusinessName");
    	this.RecipientAddress_Line_1=(String)map.get("RecipientAddress_Line_1");
    	this.RecipientAddress_Line_2=(String)map.get("RecipientAddress_Line_2");
    	this.RecipientAddress_Line_3=(String)map.get("RecipientAddress_Line_3");

    	this.RecipientAddress_IsPOBox=(String)map.get("RecipientAddress_IsPOBox");
    	this.RecipientCity=(String) map.get("RecipientCity");
    	this.RecipientProvince=(String)map.get("RecipientProvince");
    	this.RecipientPostal_Code=(String) map.get("RecipientPostal_Code"); 
    	this.RecipientCountry_Code=(String)map.get("RecipientCountry_Code"); 
    	this.RecipientPhone=(String)map.get("RecipientPhone");
    	this.RecipientEmail=(String)map.get("RecipientEmail");
        this.RecipientAddress_IsPOBox=(String)map.get("RecipientAddress_IsPOBox");
        this.IdCardNum=(String)map.get("IdCardNum");
        this.IdFrontUrl=(String)map.get("IdFrontUrl");
        this.IdBackUrl=(String)map.get("IdBackUrl");
   
    	
    	ObjectMapper mapper=new ObjectMapper();
    	for(int i=0;i<map.getJSONArray("Item").length();i++) {
    		JSONObject temp=map.getJSONArray("Item").getJSONObject(i);
    	this.list.add(mapper.readValue(temp.toString(), ItemData.class));
    	
    	}	
    }
	
	

	public String getRecipientFirstName() {
		return RecipientFirstName;
	}
	public void setRecipientFirstName(String recipientFirstName) {
		RecipientFirstName = recipientFirstName;
	}
	public String getRecipientLastName() {
		return RecipientLastName;
	}
	public void setRecipientLastName(String recipientLastName) {
		RecipientLastName = recipientLastName;
	}
	public String getRecipientAddress_Line_1() {
		return RecipientAddress_Line_1;
	}
	public void setRecipientAddress_Line_1(String recipientAddress_Line_1) {
		RecipientAddress_Line_1 = recipientAddress_Line_1;
	}
	public String getRecipientCity() {
		return RecipientCity;
	}
	public void setRecipientCity(String recipientCity) {
		RecipientCity = recipientCity;
	}
	public String getRecipientProvince() {
		return RecipientProvince;
	}
	public void setRecipientProvince(String recipientProvince) {
		RecipientProvince = recipientProvince;
	}
	public String getRecipientPostal_Code() {
		return RecipientPostal_Code;
	}
	public void setRecipientPostal_Code(String recipientPostal_Code) {
		RecipientPostal_Code = recipientPostal_Code;
	}
	public String getRecipientCountry_Code() {
		return RecipientCountry_Code;
	}
	public void setRecipientCountry_Code(String recipientCountry_Code) {
		RecipientCountry_Code = recipientCountry_Code;
	}
	public String getRecipientPhone() {
		return RecipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		RecipientPhone = recipientPhone;
	}
	public String getRecipientEmail() {
		return RecipientEmail;
	}
	public void setRecipientEmail(String recipientEmail) {
		RecipientEmail = recipientEmail;
	}
	
	public String getRecipientMiddleInitial() {
		return RecipientMiddleInitial;
	}
	public void setRecipientMiddleInitial(String recipientMiddleInitial) {
		RecipientMiddleInitial = recipientMiddleInitial;
	}
	public String getRecipientBusinessName() {
		return RecipientBusinessName;
	}
	public void setRecipientBusinessName(String recipientBusinessName) {
		RecipientBusinessName = recipientBusinessName;
	}
	public String getRecipientAddress_Line_2() {
		return RecipientAddress_Line_2;
	}
	public void setRecipientAddress_Line_2(String recipientAddress_Line_2) {
		RecipientAddress_Line_2 = recipientAddress_Line_2;
	}
	public String getRecipientAddress_Line_3() {
		return RecipientAddress_Line_3;
	}
	public void setRecipientAddress_Line_3(String recipientAddress_Line_3) {
		RecipientAddress_Line_3 = recipientAddress_Line_3;
	}

	public String getRecipientAddress_IsPOBox() {
		return RecipientAddress_IsPOBox;
	}
	public void setRecipientAddress_IsPOBox(String recipientAddress_IsPOBox) {
		RecipientAddress_IsPOBox = recipientAddress_IsPOBox;
	}
	
	public String getUserNo() {
		return UserNo;
	}
	public void setUserNo(String userNo) {
		UserNo = userNo;
	}
	public String getShippingCo() {
		return ShippingCo;
	}
	public void setShippingCo(String shippingCo) {
		ShippingCo = shippingCo;
	}
	public String getShippingNo() {
		return ShippingNo;
	}
	public void setShippingNo(String shippingNo) {
		ShippingNo = shippingNo;
	}
	public String getIdCardNum() {
		return IdCardNum;
	}
	public void setIdCardNum(String idCardNum) {
		IdCardNum = idCardNum;
	}
	public String getIdFrontUrl() {
		return IdFrontUrl;
	}
	public void setIdFrontUrl(String idFrontUrl) {
		IdFrontUrl = idFrontUrl;
	}
	public String getIdBackUrl() {
		return IdBackUrl;
	}
	public void setIdBackUrl(String idBackUrl) {
		IdBackUrl = idBackUrl;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<ItemData> getList() {
		return list;
	}
	public void setList(List<ItemData> list) {
		this.list = list;
	}
	
}
