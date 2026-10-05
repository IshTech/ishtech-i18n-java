package fi.ishtech.common.i18n.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import fi.ishtech.common.i18n.enums.LangEnum;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class LangEnumTest {

	@Test
	@Order(1)
	void testFromName() {
		LangEnum expected = LangEnum.en;
		LangEnum actual = LangEnum.fromName("en");
		assertEquals(expected, actual);
	}

	@Test
	@Order(2)
	void testFromNameNegative() {
		assertThrows(IllegalArgumentException.class, () -> LangEnum.fromName("En"));
	}

	@Test
	@Order(3)
	void testFromNameNull() {
		assertThrows(NullPointerException.class, () -> LangEnum.fromName(null));
	}

	@Test
	@Order(4)
	void testFromNameBlank() {
		assertThrows(IllegalArgumentException.class, () -> LangEnum.fromName(""));
	}

	@Test
	@Order(5)
	void testFromNameTrimmed() {
		LangEnum expected = LangEnum.en;
		LangEnum actual = LangEnum.fromNameTrimmed(" en ");
		assertEquals(expected, actual);
	}

	@Test
	@Order(6)
	void testFromNameTrimmedNegative() {
		assertThrows(IllegalArgumentException.class, () -> LangEnum.fromName(" En "));
	}

	@Test
	@Order(7)
	void testFromNameIgnoreCase() {
		LangEnum expected = LangEnum.en;
		LangEnum actual = LangEnum.fromNameIgnoreCase("En");
		assertEquals(expected, actual);
	}

	@Test
	@Order(8)
	void testFromNameTrimmedIgnoreCase() {
		assertThrows(IllegalArgumentException.class, () -> LangEnum.fromName(" ABCD "));
	}

	@Test
	@Order(9)
	void testFromNameOrElseNull() {
		LangEnum expected = LangEnum.en;
		LangEnum actual = LangEnum.fromNameOrElseNull("en");
		assertEquals(expected, actual);
	}

	@Test
	@Order(10)
	void testFromNameOrElseNullNull() {
		assertNull(LangEnum.fromNameOrElseNull(null));
	}

	@Test
	@Order(11)
	void testFromNameOrElseNullBlank() {
		LangEnum actual = LangEnum.fromNameOrElseNull("");
		assertNull(actual);
	}

	@Test
	@Order(12)
	void testFromNameOrElseNullWhenNotFound() {
		LangEnum actual = LangEnum.fromNameOrElseNull("En");
		assertNull(actual);
	}

	@Test
	@Order(13)
	void testFromNameTrimmedOrElseNull() {
		LangEnum expected = LangEnum.en;
		LangEnum actual = LangEnum.fromNameTrimmedOrElseNull(" en ");
		assertEquals(expected, actual);
	}

	@Test
	@Order(14)
	void testFromNameTrimmedOrElseBlank() {
		assertNull(LangEnum.fromNameTrimmedOrElseNull("  "));
	}

	@Test
	@Order(15)
	void testFromNameTrimmedOrElseNullWhenNotFound() {
		assertNull(LangEnum.fromNameTrimmedOrElseNull(" ABCD "));
	}

	@Test
	@Order(16)
	void testFromNameIgnoreCaseOrElseNull() {
		LangEnum expected = LangEnum.en;
		LangEnum actual = LangEnum.fromNameIgnoreCaseOrElseNull(" En ");
		assertEquals(expected, actual);
	}

	@Test
	@Order(17)
	void testFromNameIgnoreCaseOrElseNullNull() {
		assertNull(LangEnum.fromNameIgnoreCaseOrElseNull(null));
	}

	@Test
	@Order(18)
	void testFromNameIgnoreCaseOrElseNullBlank() {
		assertNull(LangEnum.fromNameIgnoreCaseOrElseNull(" "));
	}

	@Test
	@Order(19)
	void testFromNameIgnoreCaseOrElseNullWhenNotFound() {
		assertNull(LangEnum.fromNameIgnoreCaseOrElseNull(" ABCD "));
	}

	@Test
	@Order(20)
	void testFullName() {
		String expected = "Englanti";
		String actual = LangEnum.fullName(LangEnum.fi, LangEnum.en);
		assertEquals(expected, actual);
	}

	@Test
	@Order(21)
	void testFullNameFrom() {
		String expected = "Arabic";
		String actual = LangEnum.ar.fullName(LangEnum.en);
		assertEquals(expected, actual);
	}

	@Test
	@Order(22)
	void testFullNameOwn() {
		String expected = "English";
		String actual = LangEnum.en.fullName();
		assertEquals(expected, actual);
	}

}