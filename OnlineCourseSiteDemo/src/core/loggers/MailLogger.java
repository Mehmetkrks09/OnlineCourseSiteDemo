package core.loggers;

public class MailLogger implements IBaseLogger {

	@Override
	public void log(String data) {

		System.out.println(data + " Mail adresine Loglandı");
		
	}

}
