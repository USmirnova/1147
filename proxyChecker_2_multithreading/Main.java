import java.io.*;
// группа 1313, лабораторная работа №7
// проксичеккер многопоточный (2 метод, реализация интерфейса Runnable)
public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/ip_min.txt");
			int i;
			String resultIp = "";
			while ((i = fis.read()) != -1){
				if(i == 13) continue; // Символ возврата каретки
				else if(i == 10){ // Символ переноса строки
					String[] resultArray = resultIp.split(" "); // resultIp.split(":") так не работает
					String ip = resultArray[0];
					int port = Integer.parseInt(resultArray[1]);

					// 2й способ реализации многопоточности
					Thread thread = new Thread(new TaskRunnable(ip, port)); // создаем объект потока вторым способом
					thread.start(); // запускаем его

					resultIp = "";
				}else if(i == 9){
					resultIp += ":";
				} else{
					resultIp += (char) i;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// перенесли отсюда метод checkProxy в класс, подписанный на реализацию метода Runnable
	// в нашем случае это класс TaskRunnable (можно иначе назвать)

}
