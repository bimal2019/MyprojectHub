package eshopping.eshopping.service;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eshopping.eshopping.dao.IProductDao;
import eshopping.eshopping.dao.entity.Product;

@Service
public class ProductService {

	@Autowired
	private IProductDao productDaoImpl;
	
	public void save(Product product) {
	productDaoImpl.add(product);
	}
	public boolean isIdExist(long id) {
		List productList = productDaoImpl.returnProductBy(id);
		if(!productList.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void update(Product product,long id) {
		productDaoImpl.update(product,id);
	}
	
	public List returnProductById(long product_id) {
		List productList = productDaoImpl.returnProductBy(product_id);
		return productList;
	}
	public List returnAllProducts() {
		return productDaoImpl.returnAllProduct();
	}
	public List returnProductByCategory(String category) {
		List<Product> productList = productDaoImpl.returnProductByCategory(category);
		return productList;
	}
	public List returnProductByCategoryAndAvailibility(String category,boolean availability) {
		List<Product> productList = productDaoImpl.returnProductByCategoryAndAvailability(category, availability);
		return productList;
	}
}

