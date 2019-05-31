package eshopping.eshopping.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eshopping.eshopping.dao.IProductDao;
import eshopping.eshopping.dao.entity.Product;
import eshopping.eshopping.request.model.ProductsRequest;
@Repository
@Transactional
public class ProductDaoImpl implements IProductDao{
	@Autowired
    private SessionFactory sessionFactory;
	private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
	@Override
	public String add(Product product) {
		 Long isSuccess = (Long)getSession().save(product);
	        if(isSuccess >= 1){
	            return "Success";
	        }else{
	            return "Error while Saving Person";
	        
	}
	}        
	@Override
	public boolean idExist(long id) {
		Query query = getSession().createQuery("from Product where id ="+id);
		List list = query.list();
		
		if(!list.isEmpty()) 
			return true;
		else
		return false;
	}
	@Override
	public void update(Product product,long id) {
		Query query = getSession()
                .createQuery("update Product  set retail_price= :retail_price,"
                		+ "discount_price= :discount_price,availability= :availability where id= :id");
      
	   query.setBigDecimal("retail_price", product.getRetail_price());
       query.setBigDecimal("discount_price", product.getDiscount_price());
       query.setBoolean("availability", product.isAvailability());
        query.setLong("id", id);	
        
       query.executeUpdate();
	}
	@Override
	public List returnProductBy(long id) {
		Query query = getSession().createQuery("from Product where id ="+id);
		List list = query.list();
		
		return list;
	}
	@Override
	public List returnAllProduct() {
		Query query = getSession().createQuery("from Product p order by p.id asc");
		List list = query.list();
		return list;
	}
	@Override
	public List returnProductByCategory(String category) {
		Query query = getSession().createQuery("from Product where category= :category order by availability desc,discount_price,id asc");
		
		query.setString("category", category);
		
		List list = query.list();
		return list;
	}
	@Override
	public List returnProductByCategoryAndAvailability(String category, boolean availability) {
    Query query = getSession().createQuery("from Product where category= :category and availability= :availability order by discount_percentage desc,discount_price,id asc");
		
		query.setString("category", category);
		query.setBoolean("availability", availability);
		List list = query.list();
		return list;
	}
	

}
