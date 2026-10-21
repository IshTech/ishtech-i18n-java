package fi.ishtech.common.i18n.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import fi.ishtech.common.i18n.enums.CountryEnum;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class CountryEnumTest {

	@Test
	@Order(1)
	void testFromName() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromName("IN");
		assertEquals(expected, actual);
	}

	@Test
	@Order(2)
	void testFromNameNegative() {
		assertThrows(IllegalArgumentException.class, () -> CountryEnum.fromName("Fi"));
	}

	@Test
	@Order(3)
	void testFromNameNull() {
		assertThrows(NullPointerException.class, () -> CountryEnum.fromName(null));
	}

	@Test
	@Order(4)
	void testFromNameBlank() {
		assertThrows(IllegalArgumentException.class, () -> CountryEnum.fromName(""));
	}

	@Test
	@Order(5)
	void testFromNameTrimmed() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromNameTrimmed(" IN ");
		assertEquals(expected, actual);
	}

	@Test
	@Order(6)
	void testFromNameTrimmedNegative() {
		assertThrows(IllegalArgumentException.class, () -> CountryEnum.fromName(" Fi "));
	}

	@Test
	@Order(7)
	void testFromNameIgnoreCase() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromNameIgnoreCase("In");
		assertEquals(expected, actual);
	}

	@Test
	@Order(8)
	void testFromNameTrimmedIgnoreCase() {
		assertThrows(IllegalArgumentException.class, () -> CountryEnum.fromName(" ABCD "));
	}

	@Test
	@Order(9)
	void testFromNameOrElseNull() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromNameOrElseNull("IN");
		assertEquals(expected, actual);
	}

	@Test
	@Order(10)
	void testFromNameOrElseNullNull() {
		assertNull(CountryEnum.fromNameOrElseNull(null));
	}

	@Test
	@Order(11)
	void testFromNameOrElseNullBlank() {
		CountryEnum actual = CountryEnum.fromNameOrElseNull("");
		assertNull(actual);
	}

	@Test
	@Order(12)
	void testFromNameOrElseNullWhenNotFound() {
		CountryEnum actual = CountryEnum.fromNameOrElseNull("Fi");
		assertNull(actual);
	}

	@Test
	@Order(13)
	void testFromNameTrimmedOrElseNull() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromNameTrimmedOrElseNull(" IN ");
		assertEquals(expected, actual);
	}

	@Test
	@Order(14)
	void testFromNameTrimmedOrElseBlank() {
		assertNull(CountryEnum.fromNameTrimmedOrElseNull("  "));
	}

	@Test
	@Order(15)
	void testFromNameTrimmedOrElseNullWhenNotFound() {
		assertNull(CountryEnum.fromNameTrimmedOrElseNull(" ABCD "));
	}

	@Test
	@Order(16)
	void testFromNameIgnoreCaseOrElseNull() {
		CountryEnum expected = CountryEnum.IN;
		CountryEnum actual = CountryEnum.fromNameIgnoreCaseOrElseNull(" In ");
		assertEquals(expected, actual);
	}

	@Test
	@Order(17)
	void testFromNameIgnoreCaseOrElseNullNull() {
		assertNull(CountryEnum.fromNameIgnoreCaseOrElseNull(null));
	}

	@Test
	@Order(18)
	void testFromNameIgnoreCaseOrElseNullBlank() {
		assertNull(CountryEnum.fromNameIgnoreCaseOrElseNull(" "));
	}

	@Test
	@Order(19)
	void testFromNameIgnoreCaseOrElseNullWhenNotFound() {
		assertNull(CountryEnum.fromNameIgnoreCaseOrElseNull(" ABCD "));
	}

	@Test
	@Order(20)
	void testFullName() {
		String expected = "India";
		String actual = CountryEnum.fullName(CountryEnum.IN);
		assertEquals(expected, actual);
	}

	@Test
	@Order(21)
	void testFullNameFrom() {
		String expected = "India";
		String actual = CountryEnum.IN.fullName();
		assertEquals(expected, actual);
	}

	@Test
	@Order(22)
	void testOfficialName() {
		String expected = "The Republic of India";
		String actual = CountryEnum.officialName(CountryEnum.IN);
		assertEquals(expected, actual);
	}

	@Test
	@Order(23)
	void testOfficialNameFrom() {
		String expected = "The Republic of India";
		String actual = CountryEnum.IN.officialName();
		assertEquals(expected, actual);
	}

	@Test
	@Order(24)
	void testIsEu() {
		assertTrue(CountryEnum.isEu(CountryEnum.FI));
	}

	@Test
	@Order(25)
	void testIsEuFrom() {
		assertTrue(CountryEnum.FI.isEu());
	}

	@Test
	@Order(26)
	void testIsEuNegative() {
		assertFalse(CountryEnum.isEu(CountryEnum.IN));
	}

	@Test
	@Order(27)
	void testIsEuFromNegative() {
		assertFalse(CountryEnum.IN.isEu());
	}

	@Test
	@Order(28)
	void testAlpha3() {
		String expected = "IND";
		String actual = CountryEnum.alpha3(CountryEnum.IN);
		assertEquals(expected, actual);
	}

	@Test
	@Order(29)
	void testAlpha3From() {
		String expected = "IND";
		String actual = CountryEnum.IN.alpha3();
		assertEquals(expected, actual);
	}

	@Test
	@Order(30)
	void testNumeric3() {
		String expected = "356";
		String actual = CountryEnum.numeric3(CountryEnum.IN);
		assertEquals(expected, actual);
	}

	@Test
	@Order(31)
	void testNumericFrom() {
		String expected = "356";
		String actual = CountryEnum.IN.numeric3();
		assertEquals(expected, actual);
	}

	@Test
	@Order(32)
	void testCcTld() {
		String expected = ".in";
		String actual = CountryEnum.ccTLD(CountryEnum.IN);
		assertEquals(expected, actual);
	}

	@Test
	@Order(33)
	void testCcTldFrom() {
		String expected = ".in";
		String actual = CountryEnum.IN.ccTLD();
		assertEquals(expected, actual);
	}

	@Test
	@Order(34)
	void testCcTldNull() {
		assertNull(CountryEnum.ccTLD(CountryEnum.EH));
	}

	@Test
	@Order(35)
	void testCcTlds() {
		List<String> expected = List.of(".gb", ".uk");
		List<String> actual = CountryEnum.ccTLDs(CountryEnum.GB);
		// TODO: should compare list values and not their order
		assertEquals(expected, actual);
	}

}