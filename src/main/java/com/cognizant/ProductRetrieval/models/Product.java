package com.cognizant.ProductRetrieval.models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
	
	public Product() {
		
	}
	
	private String productId;
	private String title;
	ArrayList<colorSwatches> arrayColorSwatches = new ArrayList<colorSwatches>();
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
	public ArrayList<colorSwatches> getStr() {
		return arrayColorSwatches;
	}
	public void setStr(ArrayList<colorSwatches> str) {
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
                ", title=" + title +  '\'' +
                "colorSwatches='" + colorSwatches.class + '\'' +
                "nowPrice='" + nowPrice + '\'' +
                "priceLabel='" + priceLabel +
                '}';
    }
	

}
