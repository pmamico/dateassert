package hu.mico.date;

import java.time.LocalDate;

import org.junit.Assert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Main {


	public static void main(String[] args) {
		LocalDate mult = LocalDate.now().minusDays(23);
		LocalDate ma = LocalDate.now();
		LocalDate jovo = LocalDate.now().plusDays(23);

		Assert.assertTrue("hibás: múlt <= ma <= jövő", isActive(mult, jovo));
		Assert.assertTrue("hibás: múlt <= ma <= ma", isActive(mult, ma));
		Assert.assertTrue("hibás: ma <= ma <= jövő", isActive(ma, jovo));
		Assert.assertTrue("hibás: -végtelen <= ma <= jövő", isActive(null, jovo));
		Assert.assertTrue("hibás: -végtelen  <= ma <= ma", isActive(null, ma));
		Assert.assertTrue("hibás: ma <= ma <= végtelen", isActive(ma, null));
		Assert.assertTrue("hibás: múlt <= ma <= végtelen", isActive(mult, null));
		Assert.assertFalse("hibás: jövő <= ma <= jövő", isActive(jovo, jovo));
		Assert.assertFalse("hibás: múlt <= ma <= múlt", isActive(mult, mult));
		Assert.assertFalse("hibás: -végtelen <= ma <= múlt", isActive(null, mult));
		Assert.assertFalse("hibás: jövő <= ma <= végtelen", isActive(jovo, null));
		Assert.assertTrue("hibás: -végtelen <= ma <= végtelen", isActive(null, null));

		System.out.println("Jól működik! :)");
	}


	public static boolean isActive(LocalDate ervenyessegKezdete, LocalDate ervenyessegVege) {
		// ezt kell megírni
		throw new NotImplementedException();
	}

}
