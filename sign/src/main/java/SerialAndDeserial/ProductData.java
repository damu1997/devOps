package SerialAndDeserial;

import java.io.Serializable;

public class ProductData implements Serializable {
	int ProductId;  
	 String ProdName;  
	 transient double Price;
	 String ProductInfo;
	 
	public ProductData(int productId, String prodName, double price, String ProductInfo) {
		super();
		this.ProductId = productId;
		this.ProdName = prodName;
		this.Price = price;
		this.ProductInfo=ProductInfo;
	}	





} 

