package com.fastcampus.springpractice.web;

import com.fastcampus.springpractice.config.Config;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

	// 서블릿 컨테이너에 의해 다음 onStartup메소드가 자동으로 호출 되면서 스프링 컨텍스트를 구성 / 컨피그 클래스 로드 / 서블릿 등록
	@Override
	public void onStartup(ServletContext servletContext) {

		// Load Spring web application configuration
		/****
		 * The following example of the Java configuration registers and initializes
		 * the DispatcherServlet, which is auto-detected by the Servlet container
		 */
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(Config.class);

		// Create and register the DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
	}
}