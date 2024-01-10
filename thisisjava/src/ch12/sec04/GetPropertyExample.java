package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		// 전체 키와 값 출력
		System.out.println("---------------------");
		System.out.println(" key:  value");
		System.out.println("---------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet(); // 객체 저장
		
		// 뒤에 있는 집합을 앞에 하나씩 대입해서 처리 >> keys의 값을 objKey에 하나씩 대입 
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
		}

	}

}
