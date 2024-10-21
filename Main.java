import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
        System.out.println("Java program started.");
		
		String filePath = "test.txt"; // 文件路径
        String content = "This is a test to create a file.\n"; // 要写入的内容
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
			System.out.println("Write file finshed!++++");
        } catch (IOException e) {
            e.printStackTrace();
			System.out.println("Failed to write file.");
        }
		
		int count = 0;
		
		while (true) {
			try {
				count++;
				System.out.println("Delay 2 seconds.");
				Thread.sleep(2000); // 延时2秒（2000毫秒）				            
			} catch (InterruptedException e) {
				e.printStackTrace();										         
			}
			
			if (count > 5) {
				break;
			}
		}
		
		System.out.println("Java program exit.");
    }
}

