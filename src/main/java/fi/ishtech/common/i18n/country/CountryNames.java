package fi.ishtech.common.i18n.country;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import fi.ishtech.common.i18n.enums.CountryEnum;
import fi.ishtech.common.i18n.enums.LangEnum;

/**
 *
 * @author Muneer Ahmed Syed
 */
public abstract class CountryNames {

	public static final Map<CountryEnum, String> byLang(LangEnum lang) {
		if (lang == null) {
			return null;
		}

		return MAP_LANG_COUNTRY_FULL_NAMES.get(lang);
	}

	public static final Map<CountryEnum, String> byLangOrElseByEn(LangEnum lang) {
		Map<CountryEnum, String> tmpMapCountryFullName = MAP_LANG_COUNTRY_FULL_NAMES.get(lang);

		return tmpMapCountryFullName != null ? tmpMapCountryFullName : byLang(LangEnum.en);
	}

	public static final Map<CountryEnum, String> byLang(String lang) {
		return byLang(LangEnum.fromNameIgnoreCaseOrElseNull(lang));
	}

	public static final Map<CountryEnum, String> byLangOrElseByEn(String lang) {
		return byLangOrElseByEn(LangEnum.fromNameIgnoreCaseOrElseNull(lang));
	}

	public static final Map<LangEnum, Map<CountryEnum, String>> byLangsSortedByFullName(List<LangEnum> langs) {
		if (langs == null) {
			return null;
		}

		Map<LangEnum, Map<CountryEnum, String>> result = new TreeMap<>();
		for (LangEnum lang : langs) {
			if (MAP_LANG_COUNTRY_FULL_NAMES.containsKey(lang)) {
				Map<CountryEnum, String> sortedMap = new LinkedHashMap<>();

				MAP_LANG_COUNTRY_FULL_NAMES.get(lang)
						.entrySet()
						.stream()
						.sorted(Map.Entry.comparingByValue())
						.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
				result.put(lang, sortedMap);
			} else {
				result.put(lang, null);
			}
		}

		return Collections.unmodifiableMap(result);
	}

	private static final Map<LangEnum, Map<CountryEnum, String>> MAP_LANG_COUNTRY_FULL_NAMES;
	static {
		Map<LangEnum, Map<CountryEnum, String>> tmpLangMapCountryFullName = new HashMap<LangEnum, Map<CountryEnum, String>>(
				2);

		tmpLangMapCountryFullName.put(LangEnum.en, CountryNamesEn.fullNames());
		tmpLangMapCountryFullName.put(LangEnum.fi, CountryNamesFi.fullNames());

		MAP_LANG_COUNTRY_FULL_NAMES = Collections.unmodifiableMap(tmpLangMapCountryFullName);

		tmpLangMapCountryFullName = null; // gc
	}

}