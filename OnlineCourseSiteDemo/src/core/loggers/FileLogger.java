package core.loggers;

public class FileLogger implements IBaseLogger {

	@Override
	public void log(String data) {

		System.out.println(data+ " Dosyaya Loglandı");
		
	}

}
