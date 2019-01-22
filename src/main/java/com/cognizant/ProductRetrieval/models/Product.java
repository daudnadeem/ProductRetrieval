package com.cognizant.ProductRetrieval.models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
	
	public Product() {
		
	}
	
	public Product(String productId, String title) {
		super();
		this.productId = productId;
		this.title = title;
	}
	
	 @JsonProperty("productId")
	private String productId;
	 
	 @JsonProperty("title")
	private String title;
	 
	ArrayList<ColorSwatches> arrayColorSwatches = new ArrayList<ColorSwatches>();
	private String nowPrice;
	private String priceLabel;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<ColorSwatches> getStr() {
		return arrayColorSwatches;
	}
	public void setStr(ArrayList<ColorSwatches> str) {
		this.arrayColorSwatches = str;
	}
	public String getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice;
	}
	public String getPriceLabel() {
		return priceLabel;
	}
	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}
	
	@Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", title=" + title +
//                "colorSwatches='" + colorSwatches.class + '\'' +
//                "nowPrice='" + nowPrice + '\'' +
//                "priceLabel='" + priceLabel +
                '}';
    }
	

}
