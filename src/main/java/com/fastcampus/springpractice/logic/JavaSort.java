package com.fastcampus.springpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// bean으로 등록하는 anno
@Component("jSort")
public class JavaSort <T extends Comparable<T>> implements Sort<T>{
	public List<T> sort(List<T> input){
		List<T> output = new ArrayList<>(input);
		Collections.sort(output);

		return output;
	}
}
// gitflow-feature-stash: #1-apply-spring
// 기존 Gradle 설정을 활용하여 스프링 초기 설정을 수동 적용
// *https://github.com/maleficush/study_fast_spring_practice
