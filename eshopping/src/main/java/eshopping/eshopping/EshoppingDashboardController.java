package eshopping.eshopping;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eshopping.eshopping.dao.entity.Product;
import eshopping.eshopping.request.model.ProductUpdateRequest;
import eshopping.eshopping.request.model.ProductsRequest;
import eshopping.eshopping.service.ProductService;

@RestController

@RequestMapping("/products")
public class EshoppingDashboardController {
	@Autowired
	private ProductService product;
	
	
	@PostMapping
	public ResponseEntity addProduct(@RequestBody ProductsRequest products){
		Product products1 = new Product();
		
		if(product.isIdExist(products.getId())){
			 return new ResponseEntity<String>(
			          "Record Allready Exist", 
			          HttpStatus.BAD_REQUEST);
		}
		if(products!=null) {
			products1.setId(products.getId());
			products1.setName(products.getName());
			products1.setCategory(products.getCategory());
			products1.setRetail_price(products.getRetail_price());
			products1.setDiscount_price(products.getDiscount_price());
			
		
			if(products.isAvailability()==true)
			products1.setAvailability(true);
			else 
				products1.setAvailability(false);
			 
			float discount_percentage = (products.getRetail_price().floatValue()-products.getDiscount_price().floatValue())/products.getRetail_price().floatValue()*100;
			products1.setDiscount_percentage((int) discount_percentage);	
			product.save(products1);
			
			
		}
		 return new ResponseEntity<String>(
		          "", 
		          HttpStatus.OK);
		
		
	}
	@PutMapping("/{product_id}")
	public ResponseEntity<String> updateProduct(@RequestBody ProductUpdateRequest products,@PathVariable long product_id){
		Product prod = new Product();
		
		if(!product.isIdExist(product_id)){
			 return new ResponseEntity<String>(
			          "Record Not Found", 
			          HttpStatus.BAD_REQUEST);
		}
		else {
		
		prod.setDiscount_price(products.getDiscount_price());
		prod.setRetail_price(products.getRetail_price());
		if(products.getAvailability()==1)
			prod.setAvailability(true);
			else if(products.getAvailability()==0)
				prod.setAvailability(false);
		
		product.update(prod,product_id);
		
		 return new ResponseEntity<String>(
		          "", 
		          HttpStatus.OK);
		}
}
	@GetMapping("/{product_id}")
	public ResponseEntity returnById(@PathVariable long product_id) {
		List<Product> productList = product.returnProductById(product_id);
		if(productList.isEmpty()) {
			 return new ResponseEntity<String>(
			          "Record Not Found", 
			          HttpStatus.NOT_FOUND);
		}else {
			return ResponseEntity.ok(productList);
		}
		
	}
   @GetMapping
   public ResponseEntity returnAllProducts() {
	   List<Product> productList = product.returnAllProducts();
	   return ResponseEntity.ok(productList);
   }
	
		
		 
	
	
	
}
