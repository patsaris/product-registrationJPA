package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Product;
import util.HibernateUtil;


public class ProductDao {

    public void saveProduct(Product product) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(product);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Product> getAllProducts() {

		Transaction transaction = null;
		List<Product> listOfProducts = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("from Product");
			listOfProducts = query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally	{
			session.close();
		}
		return listOfProducts;
	}
}
