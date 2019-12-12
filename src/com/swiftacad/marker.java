package com.swiftacad;

public class marker extends writingTool {
	public boolean isPermanent;
	public int fillerTickness;
	public int weight;
	

	public marker (boolean isPermanent,  int fillerTickness, int weight, boolean canWrite, String brand, color color ) {
		this.isPermanent = isPermanent;
		this.fillerTickness = fillerTickness;
		this.weight = weight;
		super.canWrite = canWrite;
		super.brand = brand;
		super.color1 = color;
		
	}
	public static void main(String[] args) {
		marker m1 = new marker(true, 2, 200, true, "Schneider", color.BLUE);
		System.out.println(m1.brand);
	}
}

