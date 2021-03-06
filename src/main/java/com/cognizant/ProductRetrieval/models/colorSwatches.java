package com.cognizant.ProductRetrieval.models;

public class ColorSwatches {
	private String color;
	private String rgbColor;
	private String skuid;
	
	private ColorSwatches(String color, String rgbColor, String skuid) {
		this.color = color;
		this.rgbColor = rgbColor;
		this.skuid = skuid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRgbColor() {
		return rgbColor;
	}
	public void setRgbColor(String rgbColor) {
		this.rgbColor = rgbColor;
	}
	public String getSkuid() {
		return skuid;
	}
	public void setSkuid(String skuid) {
		this.skuid = skuid;
	}

}
