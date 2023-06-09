package day15.thread;
//스레드 : 하나의 프로세스 안에서 두가지 이상의 일을 하도록 하는 것
//프로세스 : 실행중인 프로그램
//스레드 : 프로세스에서 작업을 수행하는 것

//1. 시간분할방식 : 모든 프로세스에게 동일한 시간을 할당하고 골고루 실행되는 방식
//2. 선점형방식 : 각각의 프로세스에게 우선순위를 부여하고 우선순위가 높은 순으로 실행되는 방식

// [JVM이 스레드 처리시 하는일] : 스레드 스케줄링
// 스레드가 몇개 존재하는지
// 스레드가 실행되는 포그램 코드의 메모리 위치가 어디인지
// 현재 스레드의 상태는 무엇인지
// 스레드의 우선순위는 몇 인지

// [개발자가 스레드 처리시 하는 일]
// 자바 스레드로 작동할 작업이 무엇인지 코드로 작성
// 스레드 코드가 실행할 수 있도록 JVM한테 요청

// 스레드의 라이프사이클 
// 1. priority 우선순위 지정
// 2. sleep n초만큼 멈춤
// 3. yield 양보
// 4. join 특정한 스레드가 작업을 먼저 수행할 때 사용
public class D1_Thread_Meaning {

}
