package com.spring.dao;

public class BookDaoImp implements BookDao {
@AutoWired
private SessionFactory SessionFactory;

public SessionFactory getSessionFactory() {
	return SessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory) {
	SessionFactory = sessionFactory;
}
public List<Book> getAllBooks(){
	Session session=sessionFactory.openSession();
	return session.createQuery("from Book").list();
}
}
