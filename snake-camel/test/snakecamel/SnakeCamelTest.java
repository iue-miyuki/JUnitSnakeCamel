package snakecamel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void 一番始めの文字を大文字にする() {
		//SnakeCamelUtil scu = new SnakeCamelUtil();
		String ex = "apple_baseball_candy";
		String an = SnakeCamelUtil.snakeToCamelcase(ex);
		String wer = "AppleBaseballCandy";
		assertThat(wer,is(an));
	}
	@Test
	public void 一番始めの文字を小文字にする() {
		//SnakeCamelUtil scu = new SnakeCamelUtil();
		String ex = "DayEggFlower";
		String an = SnakeCamelUtil.camelToSnakecase(ex);
		String wer = "day_egg_flower";
		assertThat(wer,is(an));
	}
}
