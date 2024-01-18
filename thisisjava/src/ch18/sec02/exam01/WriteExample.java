package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			
			// 값 범위 : -128 ~ 127
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			// 파일에 데이터 쓰기
			os.write(a);
			os.write(b);
			os.write(c);
			
			// 닫기
			os.flush(); // 메모리내에 잔류 데이터 버리기. 버퍼 비움
			os.close(); // 파일 닫기 : 출력 스트림 닫기 : 메모리 해제
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
