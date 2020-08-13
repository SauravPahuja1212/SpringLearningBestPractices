package com.springLearning.factoryBeans;

public class SessionFactory {
	
	private SessionFactory() {}

	private static class SingletonSessionFactory {
		private static final SessionFactory INSTANCE = new SessionFactory();
	}
	
	public static SessionFactory getInstance() {
		return SingletonSessionFactory.INSTANCE;
	}
	
	public Session getSession() throws IllegalAccessException {
		return new Session(this);
	}
}
