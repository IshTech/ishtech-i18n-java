package fi.ishtech.common.i18n.country;

import java.util.Map;

import fi.ishtech.common.i18n.enums.CountryEnum;

/**
 *
 * @author Muneer Ahmed Syed
 */
public abstract class CountryNamesEn {

	public static final Map<CountryEnum, String> fullNames() {
		return CountryEnum.fullNames();
	}

}