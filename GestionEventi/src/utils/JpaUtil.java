package utils;



public class JpaUtil {

	private static final EntityManagerFactory entityManagerFactory;
	
	static {
		try {
			entityManagerFactory = Persistence
					.createEntityManagerFactory("simplejpa");
		} catch {
			
		}
	}
		

}
