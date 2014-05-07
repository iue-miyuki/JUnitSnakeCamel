package snakecamel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test 
	public void capitalizeを使って変換1() {
		String a = "  ";
		String aa = SnakeCamelUtil.capitalize(a);
		String b = "  ";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void capitalizeを使って変換2() {
		String a = "a";
		String aa = SnakeCamelUtil.capitalize(a);
		String b = "A";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void capitalizeを使って変換3() {
		String a = "xyz";
		String aa = SnakeCamelUtil.capitalize(a);
		String b = "Xyz";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void uncapitalizeを使って変換1() {
		String a = "  ";
		String aa = SnakeCamelUtil.uncapitalize(a);
		String b = "  ";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void uncapitalizeを使って変換2() {
		String a = "A";
		String aa = SnakeCamelUtil.uncapitalize(a);
		String b = "a";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void uncapitalizeを使って変換3() {
		String a = "Xyz";
		String aa = SnakeCamelUtil.uncapitalize(a);
		String b = "xyz";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void snakeToCamelCaseを使って変換1() {
		String a = "abc";
		String aa = SnakeCamelUtil.snakeToCamelcase(a);
		String b = "Abc";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void snakeToCamelCaseを使って変換2() {
		String a = "abc_def";
		String aa = SnakeCamelUtil.snakeToCamelcase(a);
		String b = "AbcDef";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void snakeToCamelCaseを使って変換3() {
		String a = "abc_def_gh";
		String aa = SnakeCamelUtil.snakeToCamelcase(a);
		String b = "AbcDefGh";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void snakeToCamelCaseを使って変換4() {
		String a = "abc__def___gh";
		String aa = SnakeCamelUtil.snakeToCamelcase(a);
		String b = "AbcDefGh";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void snakeToCamelCaseを使って変換5() {
		String a = "_abc_def__";
		String aa = SnakeCamelUtil.snakeToCamelcase(a);
		String b = "AbcDef";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void camelToSnakeCaseを使って変換1() {
		String a = "Abc";
		String aa = SnakeCamelUtil.camelToSnakecase(a);
		String b = "abc";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void camelToSnakeCaseを使って変換2() {
		String a = "AbcDef";
		String aa = SnakeCamelUtil.camelToSnakecase(a);
		String b = "abc_def";
		assertThat(b,is(aa));
	}
	
	@Test 
	public void camelToSnakeCaseを使って変換3() {
		String a = "AbcDefGh";
		String aa = SnakeCamelUtil.camelToSnakecase(a);
		String b = "abc_def_gh";
		assertThat(b,is(aa));
	}
	}
