package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 	이벤트 관리 시스템
 	
 	이벤트 참가자 명단 관리
 	: 사전에 등록, 이벤트 당일에는 추가적인 참가자 등록X
 	>> 참가자 조회
 	>> ArrayList(목록 추가, 삭제X / 참가자 조회 O)
 	
 	대기열 관리
 	: 이벤트에는 한정된 좌석, 좌석이 모두 차면 추가 도착 참가자들은 대기열에 등록
 	>> 위 이벤트 참가자들이 퇴장하는 경우 입장 가능
 	>> LinkedList (목록 추가, 삭제 O, 참가자 조회X)
 */
class EventManagement{
	// 이벤트 참여자 명단
	ArrayList<String> participantList= new ArrayList();
	// 대기열 명단
	LinkedList<String> waitingQueue= new LinkedList();
	
	// 1. 참가자 명단에 참가자 추가
	void addParticipant(String name) {
		participantList.add(name);
	}
	
	// 2. 대기열에 참가자 추가
	void addToWaitingQueue(String name) {
		waitingQueue.add(name);
	}
	
	// 3. 참가자가 이벤트를 떠날 때
	// >> 대기열의 인원을 추가
	void leaveParticipant(String name) {
		
	}
}

public class C_ListPractice {

	public static void main(String[] args) {
		
	}

}
