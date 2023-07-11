package com.kh.day12.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day12.music.model.vo.Music;

public class MusicController {
	List<Music> mList;
	
	public MusicController() {
		mList = new ArrayList<Music>();
		
	}
	
	/**
	* 마지막 위치에 곡 추가
	* @param music
	*/ // 파란색 주석은 매개변수가 뭔지? / 다중 주석 
	public void addAtLast(Music music) {
		mList.add(music);
		// 얘가 뮤직을 만들지 못하고 view에서 입력받은 값을 받아야 해서 매개변수 필요
	}
	
	/**
	 *  첫번째 위치에 곡 추가
	 * @param music
	 */
	public void addAtFirst(Music music) {
		mList.add(0, music);
	}
	
	/**
	 * 곡 수정하기
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}

	/**
	 *  곡 삭제하기
	 * @param title
	 */
	public void removeMusicsByName(int i) {
		mList.remove(i);
	}

	/**
	 * 음악 전체 정보 출력
	 * @return mList
	 */
	public List<Music> printMusicList() {
		return mList;
	}
	
	/**
	 * 음악 찾기
	 * @param title
	 */
	public List<Music> seachMusicsByName(String title) {
		// 찾은 음악을 담을 리스트 
		List<Music> findList = new ArrayList<Music>();
		// 기존 음악이 있는 mList에서 찾아야 한다 
		for(Music mOne : mList) {
			// 입력한 이름이 mList의 이름과 같으면 
			if(mOne.getTitle().equals(title)) {
				// findList에 추가한다 
				findList.add(mOne);
			}
		}
		// 다 찾았으면 리턴한다
		return findList;
	}
	
	/**
	 * 삭제할 곡 확인
	 * @param title
	 * @return
	 */
	public int searchOneByTitle(String title) {
		for(int i = 0; i <mList.size(); i++) {
			Music music = mList.get(i);
			// 내가 입력한 곡과 기존에 mList에 있는 곡 비교
			if(music.getTitle().equals(title)) { 
				return i;
			}
		}
		return -1;
	}
	
	public void insertionSortByTitleASC() {
		// 삽입정렬 연습 
		
	}
	
	public void selectionSortByTitleASC() {
		// 선택정렬 연습 
		
	}
	

	public void bubbleSortByTitleASC() {
		// 버블정렬 
		// int [] nums; -> mList로 변경 필요 
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) { // 객체들간의 비교, Title을 사전순 비교 
				//The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
				// String과 String 비교에 >는 안 된다 
				// compareTo 결과값이 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 왼쪽이 순서가 더 작음
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}

	public void bubbleSortByTitleDESC() {
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) { // 객체들간의 비교, Title을 사전순 비교 
				//The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
				// String과 String 비교에 >는 안 된다 
				// compareTo 결과값이 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 왼쪽이 순서가 더 작음
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}

	public void bubbleSortBySingerASC() {
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 0) { // 객체들간의 비교, Title을 사전순 비교 
				//The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
				// String과 String 비교에 >는 안 된다 
				// compareTo 결과값이 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 왼쪽이 순서가 더 작음
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}

	public void bubbleSortBySingerDESC() {
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 0) { // 객체들간의 비교, Title을 사전순 비교 
				//The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
				// String과 String 비교에 >는 안 된다 
				// compareTo 결과값이 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 왼쪽이 순서가 더 작음
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}

	
	
	
	
	
}
