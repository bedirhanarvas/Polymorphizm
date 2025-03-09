package polimorphizmDemo;

public class DataBaseLogger extends BaseLogger{
	@Override
	public void log(String message){
		System.out.println("Database'e "+message+" yapıldı.");
	}

}
