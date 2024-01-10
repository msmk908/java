package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")    // 문자열을 끝에 추가 -> DEF
				.insert(0, "ABC") // index[0]위치에 문자열 추가 -> ABCDEF
				.delete(3, 4)     // 시작위치3 끝위치4 문자열 삭제 -> ABCEF
				.toString();
		System.out.println(data);
		

}}
