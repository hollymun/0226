import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		//5. 로또 번호 저장하기 
		//정수 6개 저장할 수 있는 자료구조를 생성(배열, ArrayList, LinkedList, Stack, PrioryQueue, ArrayDeque 등) 
		//1) 6개의 정수를 입력 받아서 저장 -> 출력 
		//2) 1부터 45 숫자만, 사이의 숫자가 아니면 다시 입력하도록 저장-> 출력 
		//3) 중복된 데이터를 저장했을 때 다시 입력하도록 
		//4) 정렬해서 출력 
/*
		ArrayList<Integer> int6=new ArrayList<Integer>();

		int6.add(40);
		int6.add(30);
		int6.add(20);
		int6.add(60);
		int6.add(50);
		int6.add(10);
		
		for(int temp:int6) {
			System.out.printf("%d\n", temp);
		}

*/

//		Integer [] int6=new Integer[6];
/*
		ArrayList<Integer> lotto=new ArrayList<Integer>();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.printf("1-45 사이의 값을 입력하세요\n:");
		int input=sc.nextInt();
		
		lotto.add(input);

			if(input>0 && input<=45) {
				System.out.printf("1-45 사이의 값\n");
				return;
			}else {
				System.out.printf("1-45 사이의 값을 입력하세요\n");
				return;
			}
*/		
//////////////////////////////////////////
		ArrayList<Integer> lotto=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);

		for(int i=0; i<6; i=i+1) {
			System.out.printf("1-45 사이의 값 %d번째 \n:", i+1);
				int su=sc.nextInt();
				if(su<1||su>45) {
					System.out.printf("1-45 사이의 값을 입력하세요\n");
					//무효 시키기 위해 횟수 복귀 
					i=i-1;
					continue;
				}
				//flag 안 쓰고 중복체크 
				//j가 i보다 작을 때까지 반복하는 구문에
				int j;
				for(j=0; j<i; j=j+1) {
					//중복된 값 들어오면 중단시키기 
					if(su==lotto.get(j)) {
					break;
					}
				}
				//도출된 i가 j와 같지 않으면 반복문이 끝까지 돌지 않았으니까 다시 반복 시키기 
				if(i!=j) {
					System.out.printf("이전과 동일한 데이터가 입력되었습니다.\n");
					i=i-1;
					continue;
				}
				
			lotto.add(su);		
	}
				
				//이전에 입력된 모든 데이터와 비교해서 
				//동일한 데이터가 있으면 중복  
/*				int flag=0;
				for(int j=0; j<i; j=j+1) {
					if(su==lotto.get(j)) {
						flag=1;
						break;
					}
				}
				//중복체크 
				if(flag==1) {
					System.out.printf("이전과 동일한 데이터가 입력되었습니다 \n");
					i=i-1;  	//무효 시키고 
					continue;	//다시 반복문으로 돌아가기 
*/			
				
		//데이터 정렬 
		Comparator<Integer> comp=new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				//정수비교는 뺄셈 
				return o2-o1;
			}	
		};
		lotto.sort(comp);
		
		
		for(int temp:lotto) {
			System.out.printf("%d\t", temp);
		}

					
			
	}
}
