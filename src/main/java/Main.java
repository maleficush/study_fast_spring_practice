import com.fastcampus.springpractice.config.Config;
import com.fastcampus.springpractice.logic.Sort;
import com.fastcampus.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// 설정 클래스를 파라미터로 전달
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		SortService sortService = context.getBean(SortService.class);
		System.out.println(sortService.doSort(Arrays.asList(args)));
	}
}
