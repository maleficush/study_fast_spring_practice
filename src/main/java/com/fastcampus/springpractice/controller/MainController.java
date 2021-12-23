package com.fastcampus.springpractice.controller;

import com.fastcampus.springpractice.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController =
// @Controller (response를 view resolver로 전달하여 뷰딴을 넘기도록 설정)
// + @ResponseBody (응답을 그냥 responsebody에 담아서 전달)
@RestController
public class MainController {
	// 생성자 주입 : 한번만 주입할 것이기 때문에 final로 선언
	private final SortService sortService;

	// 생성자 주입 : 한번만 주입할 것이기 때문에 final로 선언
	public MainController(SortService sortService) {
		this.sortService = sortService;
	}

	@GetMapping("/")
	public String hello(@RequestParam List<String> list){
		return sortService.doSort(list).toString();
	}
}
