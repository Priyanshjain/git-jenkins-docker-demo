package git_jenkins_docker_demo.git_jenkins_docker_demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.App;

public class Junit {
	
	App app = new App();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		assertEquals(11, app.sum(6,5));
	}
	@Test
	public void test2() {
		assertEquals(10, app.sum(5,5));
	}
	@Test
	public void test3() {
		assertEquals(100, app.sum(30,70));
	}

}
