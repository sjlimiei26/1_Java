package com.kh.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.music.model.compare.AscTitle;
import com.kh.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>(); // []

	/*
	 * 리스트 마지막 위치에 새로운 곡을 추가하고 1을 반환합니다. 
	 */
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	/*
	 * 리스트 **첫 번째 위치(0번 인덱스)**에 곡을 추가하고 1을 반환합니다. 
	 */
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	/*
	 * 현재 저장된 **전체 곡 목록(리스트)**을 반환합니다. 
	 */
	public List<Music> printAll() {
		return list;
	}
	/*
	 * 곡명으로 검색하여 일치하는 Music 객체를 반환합니다. 
	 * (없으면 null 반환) 
	 */
	public Music searchMusic(String title) {
		
		for(Music m : list) {
			if( m.getTitle().equals(title) ) {
				return m;
			}
		}
		
		return null;
		
	}
	/*
	 * 곡명으로 검색하여 해당 곡을 리스트에서 삭제하고, 
	 * 삭제된 기존 객체를 반환합니다. (없으면 null 반환) 
	 */
	public Music removeMusic(String title) {
		
		for(int i=0; i<list.size(); i++) {
			Music m = list.get(i);
			
			if ( m.getTitle().equals(title) ) {
				return list.remove(i);
			}
			
		}
		
		return null;
		
	}
	/*
	 * 곡명으로 검색하여 새로운 정보로 수정하고, 
	 * 수정되기 전의 기존 객체를 반환합니다. (없으면 null 반환) 
	 */
	public Music setMusic(String title, Music music) {
		
		for(int i=0; i < list.size(); i++) {
			
			//Music m = list.get(i);
			if (list.get(i).getTitle().equals(title)) {
				/*
				Music m = list.remove(i);
				list.add(i, music);
				return m;
				
				*/
				return list.set(i, music);	// 해당 인덱스에 데이터를 변경(수정)			
			}
			
		}
		
		return null;
		
	}
	/*
	 * AscTitle 클래스(Comparator)를 활용하여 
	 * 리스트를 곡명 오름차순으로 정렬하고 1을 반환합니다. 
	 */
	public int ascTitle() { // asc : 오름차순
		Collections.sort(list, new AscTitle());
		return 1;
	}
	/*
	 * Music 클래스에 구현된 기본 정렬 기준(Comparable)을 활용하여 
	 * 리스트를 가수명 내림차순으로 정렬하고 1을 반환합니다. 
	 */
	public int descSinger() {  // desc : 내림차순
		Collections.sort(list);
		return 1;
	}
}




