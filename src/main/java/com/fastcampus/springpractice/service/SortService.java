package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

// bean으로 등록하는 anno (@Component와 똑같다.)
@Service
public class SortService {
	private final Sort<String> sort;

	public SortService(@Qualifier("bbSort") Sort<String> sort) {
		this.sort = sort;
		System.out.println("구현체 : " + sort.getClass().getName());
	}

	public List<String> doSort(List<String> list){
		return sort.sort(list);
	}
}
