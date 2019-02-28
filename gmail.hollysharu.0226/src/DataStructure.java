import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class DataStructure {

	public static void main(String[] args) {

		//문자열을 저장할 수 있는 stack 생성 
		Stack<String> stack=new Stack<String>();

		//데이터 저장 
		stack.push("프로그래밍 언어");
		stack.push("자료구조");
		stack.push("디자인패턴");
		stack.push("알고리즘");
		stack.push("데이터 베이스");
		stack.push("Front-end");
		
		//데이터 꺼내서 출력하기
		String data=stack.pop();
		System.out.printf("%s\n", data);
		//가장 마지막에 들어간 데이터를 먼저 출력함 
		//LIFO (Last In First Out) 
		System.out.printf("--------------------------\n");
		//빠른 열거로 데이터 순회 
		for(String temp:stack) {
			System.out.printf("%s\n", temp);
		}
	
		System.out.printf("===============================================\n");
		//Queue - FIFO(First In First Out)
		//PriorityQueue는 데이터를 오름차순 정렬한 큐 
		//PriorityQueue는 실제로 소트를 하는 게 아니라 
		//데이터를 삽입하면서 정렬된 것처럼 트리구조로 저장함 - 이진트리 
		//데이터를 저장하고 하나씩 poll을 하면 순서대로 나오지만 
		//한꺼번에 출력하면 출력 순서를 알 수 없음 
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("크리스 파인");
		queue.add("칼 어반");
		queue.add("재커리 퀸토");
		queue.add("크리스 햄스워스");
		queue.add("레오나르도 디카프리오");

		//데이터 꺼내기 
		data = queue.poll();
		System.out.printf("%s\n", data);
		System.out.printf("------------------------\n");
		//빠른열거 전체 순회 
		for(String temp:queue) {
			System.out.printf("%s\n",temp);
		}

		System.out.printf("===============================================\n");

		//Deque: 양쪽에서 데이터를 삽입하고 삭제할 수 있는 자료구조 
		//Deque는 인터페이스, 이를 구현한 클래스이름은 ArrayDeque
		ArrayDeque<String> deque=new ArrayDeque<String>();
		deque.addFirst("Encapsulation");
		deque.addLast("Inheritance");
		deque.addLast("Polymorphism");
		System.out.printf("마지막 데이터:%s\n", deque.getLast());
		System.out.printf("첫번째 데이터:%s\n", deque.getFirst());
	
	}
}
