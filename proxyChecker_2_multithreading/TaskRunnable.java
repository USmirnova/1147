import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
// группа 1313, лабораторная работа №7
// проксичеккер многопоточный (2 метод, реализация интерфейса Runnable)
public class TaskRunnable implements Runnable { //создаем класс TaskRunnable в отдельном файле // название ему можно любое
	// подписываем этот класс на реализацию интерфейса Runnable

	//объявляем переменные, чтобы передавать их через конструктор при создании объекта в классе Main
	String ip; // передавать в объект будем эти
	int port; // переменные

	// инициализация конструктора, чтобы передавать данные при создани объекта
	public TaskRunnable(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	// переносим сюда нашу функцию checkProxy
	private void checkProxy(String ip, int port) { // делаем метод приватным из public static void checkProxy(
		try {
			Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress(ip, port));
			URL url =  new URL("https://vozhzhaev.ru/test.php");
			URLConnection connection = url.openConnection(proxy);
			BufferedReader in = new BufferedReader( // создаем объект буфера
					new InputStreamReader( // в нем создаем входящий поток
							connection.getInputStream())); // в котором нашему соединению устанавливаем поток ввода?

			System.out.println("ip: "+ip+":"+port+" рабочий");
			FileWriter fileWriter = new FileWriter("src/good_ip.txt", true);
			String result = ip+":"+port+"\n";
			fileWriter.write(result);
			fileWriter.flush();
			fileWriter.close();
			in.close();
		} catch (Exception e) {
			System.out.println("ip: "+ip+":"+port+" НЕ РАБОТАЕТ");
		}
	}

	@Override
	public void run() { // реализуем обязательный метод run() интерфейса Runnable
		this.checkProxy(this.ip, this.port); //вызываем внутренний метод с внутренними переменными
	}
}
