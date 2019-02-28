import java.util.Arrays;

public class Search {

	public static void main(String[] args) {
	
		int [] ar= {20,30,40,10,40,70,60};
	
		//Binary Search
		//20이 몇 번째 있는지 검색
		int pos=Arrays.binarySearch(ar, 20);
		System.out.printf("20: %d번째\n", pos); //-5번째 출력됨  
		//정렬되어 있지 않아서 이분검색을 제대로 수행할 수 없음 
		
		Arrays.sort(ar);
		//정렬됨 {10,20,30,40,50,60,70}
		pos=Arrays.binarySearch(ar, 20);
		System.out.printf("20: %d번째\n", pos);  
		
	}
}
