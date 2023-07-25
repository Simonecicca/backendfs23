package runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRunner implements CommandLineRunner {
	
	Logger log = LoggerFactory.getLogger(UserRunner.class);
	
	@Override
	public void run(String. . . args) throws Exception {
		System.out.println("User run. . .");
	}

}
