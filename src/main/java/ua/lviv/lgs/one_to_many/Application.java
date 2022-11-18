package ua.lviv.lgs.one_to_many;

import java.util.Arrays;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
public class Application {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("META-INF/hibernate.cfg.xml");

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

        Post post1 = new Post("First");

        Comment comment1 = new Comment("Second");
        comment1.setPost(post1);
        Comment comment2 = new Comment("Third");
        comment2.setPost(post1);
        Comment comment3 = new Comment("Fourth");
        comment3.setPost(post1);

        post1.setComments(new HashSet<>(Arrays.asList(comment1, comment2, comment3)));

        session.persist(post1);

        transaction.commit();

        Post postDB = (Post) session.get(Post.class, 1);
        System.out.println(postDB + " --> " + postDB.getComments());

        Comment commentDB = (Comment) session.get(Comment.class, 2);
        System.out.println(commentDB + " --> " + commentDB.getPost());

        session.close();
	}
}
