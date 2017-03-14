package com.han.test;

import com.han.client.ServiceHello;
import com.han.client.ServiceHelloService;

/**
 * ²âÊÔ·þÎñÆ÷
 * @author Hxd
 *
 */
public class ServiceTest {

	public static void main(String[] args) {
		ServiceHello serviceHello = new ServiceHelloService().getServiceHelloPort();
		String name = serviceHello.sayHello("zhangsan");
		System.out.println(name);
	}
}
