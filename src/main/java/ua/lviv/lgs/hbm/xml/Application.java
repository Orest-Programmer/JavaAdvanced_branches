package ua.lviv.lgs.hbm.xml;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Arrays;
import java.util.HashSet;

public class Application {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();


        Item item1 = new Item("item01");
        Item item2 = new Item("item02");
        Item item3 = new Item("item03");
        Item item4 = new Item("item04");
        Cart cart = new Cart("test1","name1");
        cart.setItems(new HashSet<>(Arrays.asList(item1, item2, item3, item4)));

        session.persist(cart);

        transaction.commit();
        session.close();
	}
}
