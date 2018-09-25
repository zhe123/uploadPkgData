package com.modelAndDomain;
import java.io.Serializable;
public class ItemData  implements Serializable{
	private static final long serialVersionUID=1L;
	private String ShippingNo;
	private String SKU;
	private String UPC;
	private String CommdityName;
	private String ItemDescription;
	private String CustomsDescription;
	private String UnitValue;
	private String ItemWeight;
	private String UnitOfItemWeight;
	private String Quantity;
	private String CountryOfOrigin;
	private String HTSNumber;
	private String MultiSourceFlag;
	private String price;
	private String CurrencyType;
	private String PurchaseUrl;
	private String ImageUrl;
	public ItemData() {
		super();	}
	
	public String getCommdityName() {
		return CommdityName;
	}
	public void setCommdityName(String commdityName) {
		CommdityName = commdityName;
	}
	public String getItemDescription() {
		return ItemDescription;
	}
	public void setItemDescription(String itemDescription) {
		ItemDescription = itemDescription;
	}
	public String getCustomsDescription() {
		return CustomsDescription;
	}
	public void setCustomsDescription(String customsDescription) {
		CustomsDescription = customsDescription;
	}
	public String getUnitValue() {
		return UnitValue;
	}
	public void setUnitValue(String unitValue) {
		UnitValue = unitValue;
	}
	public String getItemWeight() {
		return ItemWeight;
	}
	public void setItemWeight(String itemWeight) {
		ItemWeight = itemWeight;
	}
	public String getUnitOfItemWeight() {
		return UnitOfItemWeight;
	}
	public void setUnitOfItemWeight(String unitOfItemWeight) {
		UnitOfItemWeight = unitOfItemWeight;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getCountryOfOrigin() {
		return CountryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		CountryOfOrigin = countryOfOrigin;
	}
	public String getHTSNumber() {
		return HTSNumber;
	}
	public void setHTSNumber(String hTSNumber) {
		HTSNumber = hTSNumber;
	}
	public String getMultiSourceFlag() {
		return MultiSourceFlag;
	}
	public void setMultiSourceFlag(String multiSourceFlag) {
		MultiSourceFlag = multiSourceFlag;
	}
	
	public String getShippingNo() {
		return ShippingNo;
	}
	public void setShippingNo(String shippingNo) {
		ShippingNo = shippingNo;
	}
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public String getUPC() {
		return UPC;
	}
	public void setUPC(String uPC) {
		UPC = uPC;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCurrencyType() {
		return CurrencyType;
	}
	public void setCurrencyType(String currencyType) {
		CurrencyType = currencyType;
	}
	public String getPurchaseUrl() {
		return PurchaseUrl;
	}
	public void setPurchaseUrl(String purchaseUrl) {
		PurchaseUrl = purchaseUrl;
	}
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
