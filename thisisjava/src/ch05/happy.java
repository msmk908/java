package ch05;

public class happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3}; // 배열 객체 생성 10번지
		arr2 = new int[] {1,2,3}; // 배열 객체 생성 20번지
		arr3 = arr2; // arr2와 arr3는 주소가 같다.   20번지
		
		System.out.println(arr1 == arr2);
		// arr1, arr2는 같지 않다.
		// 객체를 생성시 메모리 주소를 할당(생성시에 주소를 새롭게 등록
		// 메모리 주소가 같지 않아 false가 나온다.
		System.out.println(arr2 == arr3);
		// 주소가 같은경우 true가 나온다.
		
		
	}

}
