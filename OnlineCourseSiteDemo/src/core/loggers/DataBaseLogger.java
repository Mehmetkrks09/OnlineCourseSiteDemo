package core.loggers;

public class DataBaseLogger implements IBaseLogger {

	@Override
	public void log(String data) {
		System.out.println(data+" Veritabanına Loglandı ");
		
	}

}
