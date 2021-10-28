import java.io.*;
// группа 1313, лабораторная работа №7, 27.10.2021, д.з.
// проксичеккер многопоточный (1 метод, наследование от класса Thread)
public class Main {
public static void main(String[] args) {
	try {
		FileInputStream fis = new FileInputStream("src/ip.txt");
		int i;
		String resultIp = "";
		while ((i = fis.read()) != -1){
			if(i == 13) continue; // Символ возврата каретки
			else if(i == 10){ // Символ переноса строки
				String[] resultArray = resultIp.split(":"); // resultIp.split(":") так работает
				String ip = resultArray[0];
				int port = Integer.parseInt(resultArray[1]);

				// 1й способ реализации многопоточности -
				// создаем класс TaskThread (в отдельном файле) и наследуем его от класса Thread
				TaskThread thread = new TaskThread(ip, port);
				thread.start(); // стартуем поток в данном цикле

				resultIp = "";
			}else if(i == 9){
				resultIp += ":";
			} else{
				resultIp += (char) i;
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Что-то не так с исходным файлом");
	}
}

// перенесли отсюда метод checkProxy в класс, наследуемый от класса Thread
// в нашем случае это класс TaskThread (можно иначе назвать)

}
