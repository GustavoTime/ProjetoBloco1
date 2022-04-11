package TimeProjeto;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Cronometro {

	 public static void main(String[] args) {

	        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	        final Runnable runnable = new Runnable() {
	            int countdownStarter = 15;

	            public void run() {

	                countdownStarter--;
            
	                if (countdownStarter < 0) {
	                    System.out.println("Esfinderson diz: Parceiro, o seu tempo acabou.");
	                    scheduler.shutdown();
	                    
	                }
	            }
	        };
	        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
	    }
	}

