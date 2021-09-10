package com.stickers.classes;

public abstract class Sticker {
	
	private String name;
	private String gum;
	private String[] colors;
	private String printer;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGum() {
		return gum;
	}
	public void setGum(String gum) {
		this.gum = gum;
	}
	public String[] getColors() {
		return colors;
	}
	public void setColors(String[] colors) {
		this.colors = colors;
	}
	public String getPrinter() {
		return printer;
	}
	public void setPrinter(String printer) {
		this.printer = printer;
	}
	
	
//	process methods discussion
	public void chooseSheets() {
		System.out.println("step-1 : Required Sheets selected");
	}
	public void printColors() {
		System.out.println("step-2 : Colors Printed on stickers by printer");
	}
	public void cutStickers() {
		System.out.println("step-3 : cut the stickers as required sizes");
	}
	
    public abstract Object createSticker();
    
    public abstract void display();

}
