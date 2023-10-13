package samp13;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
// @Component  // ProductDaoImpl를 객체
@Repository("pd1")
public class ProductDaoImpl implements ProductDao {
	public Product getProduct(String name) {
		return new Product(name, 2000);
	}
}