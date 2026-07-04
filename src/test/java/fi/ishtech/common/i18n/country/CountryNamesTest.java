package fi.ishtech.common.i18n.country;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import fi.ishtech.common.i18n.country.CountryNames;
import fi.ishtech.common.i18n.enums.CountryEnum;
import fi.ishtech.common.i18n.enums.LangEnum;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class CountryNamesTest {

	@Test
	@Order(1)
	void testByLangsSortedByFullName() {
		Map<LangEnum, Map<CountryEnum, String>> actual = CountryNames
				.byLangsSortedByFullName(List.of(LangEnum.za, LangEnum.en, LangEnum.fi));
		assertNotNull(actual);
		assertFalse(actual.isEmpty());
	}

}