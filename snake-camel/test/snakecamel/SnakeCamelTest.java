package snakecamel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void ˆê”Ôn‚ß‚Ì•¶š‚ğ‘å•¶š‚É‚·‚é() {
		//SnakeCamelUtil scu = new SnakeCamelUtil();
		String ex = "apple_baseball_candy";
		String an = SnakeCamelUtil.snakeToCamelcase(ex);
		String wer = "AppleBaseballCandy";
		assertThat(wer,is(an));
	}
	@Test
	public void ˆê”Ôn‚ß‚Ì•¶š‚ğ¬•¶š‚É‚·‚é() {
		//SnakeCamelUtil scu = new SnakeCamelUtil();
		String ex = "DayEggFlower";
		String an = SnakeCamelUtil.camelToSnakecase(ex);
		String wer = "day_egg_flower";
		assertThat(wer,is(an));
	}
}
