import java.util.ArrayList;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		
		//정수를 저장할 수 있는 ArrayList 생성 
		ArrayList<Integer> a1=new ArrayList<Integer>();
		//데이터 2개 추가 
		a1.add(10);
		a1.add(30);
		//작업하기 전의 시간을 기록 
/*		long start=System.currentTimeMillis();
		//a1의 2번째 자리에 데이터를 10만 번 삽입
		for(int i=0; i<100000; i=i+1) {
			a1.add(1,20);
		}
		

		//작업 종료의 시간을 기록 
		long end=System.currentTimeMillis();
		
		//작업 시간 계산 
		System.out.printf("ArrayList 작업 시간:%d\n", (end-start));
		
		System.out.printf("===============================================\n");
		
		LinkedList<Integer> a2=new LinkedList<Integer>();
		a2.add(10);
		a2.add(30);
		long start1=System.currentTimeMillis();
		for(int i=0; i<100000; i=i+1) {
			a1.add(1,20);
		}
		//읽는 속도 비교 
		for(int i=0; i<100000; i=i+1) {
			Integer integer =a1.get(i);
		}

		long end1=System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간:%d\n", (end1-start1));
*/
		//List의 모든 데이터 순회 - 빠른열거 
		for(Integer i:a1) {
			System.out.printf("%d\n", i);
		}
		
		
	}
}
