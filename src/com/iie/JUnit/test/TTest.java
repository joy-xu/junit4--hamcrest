package com.iie.JUnit.test;

import static org.junit.Assert.*;//静态引入,可以直接将方法引入进来,不用写"类名.静态方法"了

import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.iie.JUnit.T;

public class TTest {

	@Test//@Test是一个Annotation，表明是下面一个测试的方法
	public void testAdd() {
		
		int z = new T().add(1, 2);
		assertEquals(3, z);//keeps the bar green to keep the code clean
		assertThat(z, is(3));
		assertThat(z, allOf(greaterThan(2),lessThan(10)));
	}
	
	//@Ignore//本次测试中不测试
	@Test(expected=java.lang.ArithmeticException.class,timeout=10)
	public void testDivide() {
		int z = new T().divide(2, 0);
		assertEquals(0, z);//keeps the bar green to keep the code clean
		assertThat(z, is(0));
		assertThat(z, allOf(greaterThan(-1),lessThan(10)));
	}
	
	@Before
	public void testD() {
		System.out.println("Before");
	}
	
	@After
	public void testA() {
		System.out.println("after");
	}
	
	@BeforeClass
	public static void b() {
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public static void a() {
		System.out.println("afterClass");
	}
	
}
