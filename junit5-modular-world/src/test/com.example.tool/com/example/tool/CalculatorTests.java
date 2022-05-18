/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.tool;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.condition.*;

@DisplayName("com.example.tool/com.example.tool.CalculatorTests")
class CalculatorTests {

	private final Calculator calculator = new Calculator();

	@Test
	void add() {
		Assertions.assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@Test
	void mul() {
		Assertions.assertEquals(4, calculator.mul(2, 2), "2 * 2 should equal 4");
	}

	@Test
	void pow() {
		Assertions.assertEquals(8, calculator.pow(2, 3), "2 ^ 3 should equal 8");
	}
	@Test
	void subs(){
		Assertions.assertEquals(6, calculator.substract(18,12), "18 - 12 should equal 6");
	}
	@Test
	@EnabledOnOs({OS.WINDOWS})
	void TestOnWindows() {
		Assertions.assertEquals(1, 1, "Test on Windows");
	}
	
	@Test
	@EnabledOnOs({OS.MAC, OS.LINUX})
	void TestOnLinux() {
		Assertions.assertEquals(1, 1, "Test on Linux");
	}
	
	@Test
	@EnabledOnJre({JRE.JAVA_10, JRE.JAVA_11})
	public void shouldOnlyRunOnJava10And11() {
		Assertions.assertEquals(1, 1, "Test on JRE 10 - 11");
	}

}
