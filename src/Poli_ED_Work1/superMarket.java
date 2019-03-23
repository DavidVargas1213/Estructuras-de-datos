package Poli_ED_Work1;

public class superMarket  {
	String nameProduct; 
	double price;
	boolean buy; 
	
	public superMarket(String nameProduct, double price) {
		this.nameProduct=nameProduct; 
		this.price=price;
		this.buy=false;
	}

	public String getNameProduct() {
		
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		
		this.nameProduct = nameProduct;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBuy() {
		return buy;
	}

	public void setBuy(boolean buy) {
		this.buy = buy;
	}
	

	@Override
	public boolean equals(Object obj) {
		 superMarket sp = (superMarket) obj;
		 if (this.nameProduct.equals(sp.nameProduct) && this.price == sp.price) 
			return true;
		return false;
		
	}
}
