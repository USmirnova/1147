import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class TaskThread extends Thread { //создаем класс TaskThread в отдельном файле // название ему можно любое
// наследуем этот класс от класса Thread

	//объявляем переменные, чтобы передавать их через конструктор при создании объекта в классе Main
	String ip; // передавать в объект будем эти
	int port; // переменные

	// инициализация конструктора, чтобы передавать данные при создани объекта
	public TaskThread(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	// переносим сюда наш метод checkProxy
	private void checkProxy(String ip, int port) { // делаем его приватным из public static void checkProxy(
		try {
			Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress(ip, port));
			URL url =  new URL("https://vozhzhaev.ru/test.php");
			URLConnection connection = url.openConnection(proxy);
			BufferedReader in = new BufferedReader( // создаем объект буфера
					new InputStreamReader( // в нем создаем входящий поток
							connection.getInputStream())); // в котором нашему соединению устанавливаем поток ввода?

			System.out.println("ip: "+ip+":"+port+" рабочий");
			FileWriter fileWriter = new FileWriter("src/good_ip.txt", true); // true - для дозаписи в конец файла
			String result = ip+":"+port+"\n";
			fileWriter.write(result); // выполняем дозапись в файл
			fileWriter.flush(); // очищаем (объект записи в файл?)
			fileWriter.close(); // закрываем (объект записи в файл?)
			in.close(); // закрываем поток ввода
		} catch (Exception e) {
			System.out.println("ip: "+ip+":"+port+" НЕ РАБОТАЕТ");
		}
	}

	@Override
	public void run() { // реализуем обязательный метод run() класса Tread
		this.checkProxy(this.ip, this.port); //вызываем внутренний метод с внутренними переменными
	}
}
