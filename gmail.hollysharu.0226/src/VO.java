

//번호, 아이디, 비밀번호, 이름, 나이를 같이 저장하는 클래스 
public class VO implements Comparable {
//comparable를 implements하고도 에러
//반드시 상속받아야 할 메소드 오버라이딩 하기 
	
		private int num;
		private String id;
		private String pw;
		private String name;
		private int age;
		
		
		//디버깅을 위한 메소드 : 인스턴스 멤버의 값을 호출해주는 메소드 
		@Override
		public String toString() {
			return "VO [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
		}


		//접근자 메소드 
		public int getNum() {
			return num;
		}


		public void setNum(int num) {
			this.num = num;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getPw() {
			return pw;
		}


		public void setPw(String pw) {
			this.pw = pw;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		//기본 생성자 
		public VO() {
			super();

		}

		//매개변수가 있는 생성자 
		public VO(int num, String id, String pw, String name, int age) {
			super();
			this.num = num;
			this.id = id;
			this.pw = pw;
			this.name = name;
			this.age = age;
		}

		//크기 비교를 위한 메소드 
		//앞쪽의 데이터가 더 크면 양수를 리턴
		//2개의 데이터가 동일하면 0 
		//앞쪽의 데이터가 작으면 음수를 리턴
		//오름차순 정렬 (기본) - 내림차순을 하고자 하면 부호를 반대로 리턴 
		@Override
		public int compareTo(Object o) {
			//Object 타입의 데이터를 사용할 때는 원래의 자료형으로 형변환해서 사용
			//여기는 클래스가 VO이므로 VO 타입으로 형 변환 
			VO other=(VO)o;
			return this.name.compareTo(other.name);
			//숫자 데이터는 뺄셈으로 크기 비교 
			//문자열은 compareTo로 비교 
			
/*			
			if(this.age>other.age) {
				return 1; 
			}
			else if(this.age==other.age) {
				return 0;
			}else {
				return -1;
			}
*/
			//앞쪽이 더 크면 양수, 같으면 0, 작으면 음수 
			//위 if문과 결과는 같음 
			//return this.age-other.age;
			//return other.age-this.age;
			
		}


		
		

}
