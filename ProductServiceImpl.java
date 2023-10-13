package samp13;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
// @Component
@Service
public class ProductServiceImpl implements ProductService{
	// setter method를 안 만들어도 됨 
	// 생성된 ProductDaoImpl 객체를 연결 시켜줌 
	@Autowired
	@Qualifier("pd2")
	private ProductDao pd;
	public Product getProduct() {
		return pd.getProduct("볼펜");
	}
}