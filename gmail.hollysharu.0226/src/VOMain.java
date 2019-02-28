import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class VOMain {

	public static void main(String[] args) {

		VO [] data=new VO[3];
		VO vo=new VO(1, "haru", "haru316","하루", 11);
		data[0]=vo;
		
		vo=new VO(2, "boxy", "boxy707","박시", 4);
		data[1]=vo;
		
		vo=new VO(3, "DGbaam", "dg810","광광", 28);
		data[2]=vo;
		
		//배열의 데이터 확인 
		//클래스 본인이 자료형인 VO, 자료형에 클래스명 
		for(VO temp:data) {
			System.out.printf("%s\n", temp);
		}
		
		System.out.printf("\n\n===========정렬1====================\n");
		//1. implements-Overriding해서 사용 
		//배열의 데이터 정렬 - data의 구성요소 자료형인 VO 클래스가 
		//Comparable 인터페이스를 implements하지 않았으면 예외 발생 
		//크기 비교할 방법이 없어서 예외 발생 
		//VO클래스의 인스턴스를 Comparable 타입으로 형변환하려고 했는데 실패 
		//이 작업을 수행하도록 하려면 Comparable을 implements해야 함 
		Arrays.sort(data);
		for(VO temp:data) {
			System.out.printf("%s\n", temp);
		}
		
		System.out.printf("\n\n===========정렬2====================\n");
		//2. 
		//VO타입을 비교할 수 있는 comparator 인터페이스의 Anonymous Class -> instance
		//ctrl+shift+o :자동 import
		
		//num의 오름차순 정렬을 할 수 있는 comparator
		Comparator <VO> numAscComp=new Comparator<VO>() {
			//크기 비교할 때 사용하는 메소드  
			@Override
			public int compare(VO o1, VO o2) {
				return o1.getNum()-o2.getNum();	
			}
		};
		
		//num의 내차순 정렬을 할 수 있는 comparator
		Comparator <VO> numDescComp=new Comparator<VO>() {
			@Override
			public int compare(VO o1, VO o2) {
				return o2.getNum()-o1.getNum();
			}
		};
		
		//name의 오름차순 정렬을 할 수 있는 comparator
		Comparator <VO> nameAscComp=new Comparator<VO>() {
			@Override
			public int compare(VO o1, VO o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		//name의 내림차순 정렬을 할 수 있는 comparator
		Comparator <VO> nameDescComp=new Comparator<VO>() {
			@Override
			public int compare(VO o1, VO o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};
		
		//생성자별로 정렬내용 변경하기 
		Arrays.sort(data, nameDescComp);
		for(VO temp:data) {
			System.out.printf("%s\n", temp);
		}
		
		System.out.printf("\n\n===========입력 받아서 정렬하기3====================\n");
		
		//1번부터 4번까지 입력을 받기 위한 코드를 작성
		Scanner sc=new Scanner(System.in);
		System.out.printf("정렬방법 선택\n(1:번호오름차순 2:번호내림차순 3:이름오름차순 4:이름내림차순)");
		
		//case 식별을 편하게 하기 위한 상수 선언 
		final int numAsc=1;
		final int numDesc=2;
		final int nameAsc=3;
		final int nameDesc=4;
		
		int input=sc.nextInt();
		
		Comparator <VO> comparator=numAscComp; 
		switch(input) {
		case numAsc:
			comparator=numAscComp;
		case numDesc:
			comparator=numDescComp;
		case nameAsc:
			comparator=nameAscComp;
		case nameDesc:
			comparator=nameDescComp;	
			break;
		default:
			System.out.printf("1-4번 중에 선택");
			break;
		}
		
		//비교할 수 있는 인스턴스를 대입해서 정렬
		Arrays.sort(data, comparator);
		for(VO temp:data) {
			System.out.printf("%s\n", temp);
		}

		sc.close();
				
	}
}
