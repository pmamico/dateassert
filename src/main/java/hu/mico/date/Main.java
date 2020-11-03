package hu.mico.date;

import java.time.LocalDate;

import org.junit.Assert;

public class Main {


	public static void main(String[] args) {

		LocalDate reg = LocalDate.of(2010, 1, 1);
		LocalDate ma = LocalDate.now();
		LocalDate jovo = LocalDate.now().plusDays(23);

		System.out.println("isActive 1");
		Assert.assertTrue(isActive1(reg, jovo));
		Assert.assertTrue(isActive1(reg, ma));
		Assert.assertTrue(isActive1(ma, jovo));
		Assert.assertTrue(isActive1(null, jovo));
		Assert.assertTrue(isActive1(null, ma));
		Assert.assertTrue(isActive1(ma, null));
		Assert.assertTrue(isActive1(reg, null));
		Assert.assertFalse(isActive1(jovo, jovo));
		Assert.assertFalse(isActive1(reg, reg));
		Assert.assertFalse(isActive1(null, reg));
		Assert.assertFalse(isActive1(jovo, null));


		System.out.println("isActive 2");
		Assert.assertTrue( isActive2(reg, jovo));
		Assert.assertTrue(isActive2(reg, ma));
		Assert.assertTrue(isActive2(ma, jovo));
		Assert.assertTrue(isActive2(null, jovo));
		Assert.assertTrue(isActive2(null, ma));
		Assert.assertTrue(isActive2(ma, null));
		Assert.assertTrue(isActive2(reg, null));
		Assert.assertFalse(isActive2(jovo, jovo));
		Assert.assertFalse(isActive2(reg, reg));
		Assert.assertFalse(isActive2(null, reg));
		Assert.assertFalse(isActive2(jovo, null));


	}

	public static boolean isActive1(LocalDate ervenyessegKezdete, LocalDate ervenyessegVege) {
		if ((LocalDate.now().isEqual(ervenyessegKezdete) || LocalDate.now().isAfter(ervenyessegKezdete)) && ervenyessegVege == null) {
			return true;
		}

		if ((LocalDate.now().isEqual(ervenyessegKezdete) || LocalDate.now().isAfter(ervenyessegKezdete)) && (LocalDate.now().isEqual(ervenyessegVege) || LocalDate.now().isBefore(ervenyessegVege))) {
			return true;
		}

		return false;
	}

	public static boolean isActive2(LocalDate ervenyessegKezdete, LocalDate ervenyessegVege){
		if(ervenyessegKezdete != null && ervenyessegKezdete.isAfter(LocalDate.now())){
			return false;
		}
		if(ervenyessegVege != null && ervenyessegVege.isBefore(LocalDate.now())){
			return false;
		}
		return true;
	}

}
