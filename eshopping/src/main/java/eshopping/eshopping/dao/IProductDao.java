package eshopping.eshopping.dao;

import java.util.List;

import eshopping.eshopping.dao.entity.Product;
import eshopping.eshopping.request.model.ProductsRequest;

public interface IProductDao {

	public String add(Product product);
	
	public boolean idExist(long id);

	public void update(Product product,long product_id);
   
	public List returnProductBy(long product_id);
	
	public List returnAllProduct();
	
	public List returnProductByCategory(String category);
	
	public List returnProductByCategoryAndAvailability(String category,boolean availability);
	
}
