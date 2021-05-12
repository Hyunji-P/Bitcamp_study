package pkg1022;

public class ThreadMainEx {

	public static void main(String[] args) {
		// thread 가 많아지면 관리하기 편하게 만들어진 메소드 들임
		long id = Thread.currentThread().getId();
		// 숫자 형태의 사번이 있다고 이해할 것
		String name = Thread.currentThread().getName();
		// 문자 형태의 사번이 있다고 이해할 것
		int count = Thread.currentThread().activeCount();
		// 지금까지 해온 쓰레드 : single thread
		int priority = Thread.currentThread().getPriority();
		// ex) pc에서 노래 , 출력 , 워드 문서 작업 -> 하나의 pc에서 세가지 동작이 실행 -> 동작에서 우선순위를 부여할 때 priority
		// 우선순위 : 1 ~ 10 이며 숫자가 높을 수록 우선순위가 높음 
		
		//태어나고 죽을때까지를 라이프 사이클이라고 하며 그 동안 사람은 무엇을 했다가 멈췄다를 반복함
		//쓰레드도 마찬가지로 생성되었다가 소멸되기 전에 뭔가 동작을 했다가 멈추기를 반복
		//쓰레드도 상태값이 존재 -> 상태 정보를 저장하고 있는 메소드 : getState() 

		System.out.println("쓰레드 아이디 : " + id);
		System.out.println("쓰레드 이름 : " + name);
		System.out.println("동작 중인 쓰레드 개수 : " + count);
		System.out.println("쓰레드 우선 순위 : " + priority);
	}

}
