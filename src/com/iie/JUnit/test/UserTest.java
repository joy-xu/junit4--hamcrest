package com.iie.JUnit.test;

import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Test;

import com.iie.JUnit.User;

public class UserTest {

	@Test
	public void testGetName() {
		assertThat(new User().getName(), Matchers.is("Joy"));
	}

}
