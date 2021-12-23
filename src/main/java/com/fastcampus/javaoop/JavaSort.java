package com.fastcampus.javaoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSort <T extends Comparable<T>>{
	public List<T> sort(List<T> input){
		List<T> output = new ArrayList<>(input);
		Collections.sort(output);

		return output;
	}
}
// gitflow-feature-stash: #1-apply-spring
// 기존 Gradle 설정을 활용하여 스프링 초기 설정을 수동 적용
// *https://github.com/maleficush/study_fast_spring_practice
