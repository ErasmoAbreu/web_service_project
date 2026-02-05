package com.webservice.wsp.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.webservice.wsp.entities.Category;
import com.webservice.wsp.entities.Order;
import com.webservice.wsp.entities.Product;
import com.webservice.wsp.entities.User;
import com.webservice.wsp.entities.enums.OrderStatus;
import com.webservice.wsp.repositories.CategoryRepository;
import com.webservice.wsp.repositories.OrderRepository;
import com.webservice.wsp.repositories.ProductRepository;
import com.webservice.wsp.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "Dungeons & Dragons Guide Monsters", "Guide about monster to adventure.", 74.5, "");
		Product p2 = new Product(null, "Nitendo Switch 2", "New great console Nintendo, very funny." , 3400.0, "");
		Product p3 = new Product(null, "Macbook M1", "Macbook m1 is one of the best portateis computers, recommended for those who are always traveling.", 5000.0 ,"");
		Product p4 = new Product(null, "Computer Gamer", "Latest generation gaming scooper, ready for all current games.", 6000.0 ,"");
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	

}
