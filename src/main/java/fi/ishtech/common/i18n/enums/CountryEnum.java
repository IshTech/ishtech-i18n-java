package fi.ishtech.common.i18n.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {@link Enum} for Country.<br>
 * Use {@link CountryEnum#fromName} instead of {@link CountryEnum#valueOf}<br>
 *
 * @author Muneer Ahmed Syed
 */
public enum CountryEnum {

	AD,
	AE,
	AF,
	AG,
	AI,
	AL,
	AM,
	AO,
	AQ,
	AR,
	AS,
	AT,
	AU,
	AW,
	AX,
	AZ,
	BA,
	BB,
	BD,
	BE,
	BF,
	BG,
	BH,
	BI,
	BJ,
	BL,
	BM,
	BN,
	BO,
	BQ,
	BR,
	BS,
	BT,
	BV,
	BW,
	BY,
	BZ,
	CA,
	CC,
	CD,
	CF,
	CG,
	CH,
	CI,
	CK,
	CL,
	CM,
	CN,
	CO,
	CR,
	CU,
	CV,
	CW,
	CX,
	CY,
	CZ,
	DE,
	DJ,
	DK,
	DM,
	DO,
	DZ,
	EC,
	EE,
	EG,
	EH,
	ER,
	ES,
	ET,
	FI,
	FJ,
	FK,
	FM,
	FO,
	FR,
	GA,
	GB,
	GD,
	GE,
	GF,
	GG,
	GH,
	GI,
	GL,
	GM,
	GN,
	GP,
	GQ,
	GR,
	GS,
	GT,
	GU,
	GW,
	GY,
	HK,
	HM,
	HN,
	HR,
	HT,
	HU,
	ID,
	IE,
	IL,
	IM,
	IN,
	IO,
	IQ,
	IR,
	IS,
	IT,
	JE,
	JM,
	JO,
	JP,
	KE,
	KG,
	KH,
	KI,
	KM,
	KN,
	KP,
	KR,
	KW,
	KY,
	KZ,
	LA,
	LB,
	LC,
	LI,
	LK,
	LR,
	LS,
	LT,
	LU,
	LV,
	LY,
	MA,
	MC,
	MD,
	ME,
	MF,
	MG,
	MH,
	MK,
	ML,
	MM,
	MN,
	MO,
	MP,
	MQ,
	MR,
	MS,
	MT,
	MU,
	MV,
	MW,
	MX,
	MY,
	MZ,
	NA,
	NC,
	NE,
	NF,
	NG,
	NI,
	NL,
	NO,
	NP,
	NR,
	NU,
	NZ,
	OM,
	PA,
	PE,
	PF,
	PG,
	PH,
	PK,
	PL,
	PM,
	PN,
	PR,
	PS,
	PT,
	PW,
	PY,
	QA,
	RE,
	RO,
	RS,
	RU,
	RW,
	SA,
	SB,
	SC,
	SD,
	SE,
	SG,
	SH,
	SI,
	SJ,
	SK,
	SL,
	SM,
	SN,
	SO,
	SR,
	SS,
	ST,
	SV,
	SX,
	SY,
	SZ,
	TC,
	TD,
	TF,
	TG,
	TH,
	TJ,
	TK,
	TL,
	TM,
	TN,
	TO,
	TR,
	TT,
	TV,
	TW,
	TZ,
	UA,
	UG,
	UM,
	US,
	UY,
	UZ,
	VA,
	VC,
	VE,
	VG,
	VI,
	VN,
	VU,
	WF,
	WS,
	YE,
	YT,
	ZA,
	ZM,
	ZW;

	private final static List<String> NAMES_LIST;
	static {
		List<String> tmpNamesList = new ArrayList<String>(249);

		for (CountryEnum c : values()) {
			tmpNamesList.add(c.name());
		}

		NAMES_LIST = Collections.unmodifiableList(tmpNamesList);

		tmpNamesList = null; // gc
	}

	/**
	 * Alias for valueOf
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 */
	public static CountryEnum fromName(String name) {
		return valueOf(name);
	}

	/**
	 * Gets {@code enum} object based {@code name} trimmed of leading and trailing spaces.<br>
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 */
	public static CountryEnum fromNameTrimmed(String name) {
		if (name == null) {
			throw new NullPointerException("name is null");
		}

		if ("".equals(name.trim())) {
			throw new NullPointerException("name is blank");
		}

		return valueOf(name.trim());
	}

	/**
	 * Gets {@code enum} object based case-insensitive {@code name}<br>
	 *
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 *
	 * @throws NullPointerException
	 *             when input {@code name} is null or blank
	 */
	public static CountryEnum fromNameIgnoreCase(String name) {
		if (name == null) {
			throw new NullPointerException("name is null");
		}

		if ("".equals(name.trim())) {
			throw new NullPointerException("name is blank");
		}

		return fromNameTrimmed(name.toUpperCase());
	}

	/**
	 * Gets {@code enum} object based {@code name}.<br>
	 * If not present, returns {@code null}
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 */
	public static CountryEnum fromNameOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name) ? fromName(name) : null;
	}

	/**
	 * Gets {@code enum} object based {@code name} trimmed of leading and trailing spaces.<br>
	 * If not present, returns {@code null}
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 */
	public static CountryEnum fromNameTrimmedOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name.trim()) ? fromNameTrimmed(name) : null;
	}

	/**
	 * Gets {@code enum} object based case-insensitive {@code name}<br>
	 * If not present, returns null
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link CountryEnum} constant of the specified {@code name}
	 */
	public static CountryEnum fromNameIgnoreCaseOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name.trim().toUpperCase()) ? fromNameIgnoreCase(name) : null;
	}

	/**
	 * Full name of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link String}
	 */
	public static String fullName(CountryEnum name) {
		return MAP_COUNTRY_FULL_NAME.get(name);
	}

	/**
	 * Full name of the country.
	 *
	 * @return {@link String}
	 */
	public String fullName() {
		return fullName(this);
	}

	/**
	 * Full names of all the countries.
	 *
	 * @return {@link Map}&lt;{@link CountryEnum}, {@link String}&gt;
	 */
	public static final Map<CountryEnum, String> fullNames() {
		return MAP_COUNTRY_FULL_NAME;
	}

	/**
	 * Official name of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link String}
	 */
	public static String officialName(CountryEnum name) {
		return MAP_COUNTRY_OFFICIAL_NAME.get(name);
	}

	/**
	 * Official name of the country.
	 *
	 * @return {@link String}
	 */
	public String officialName() {
		return officialName(this);
	}

	/**
	 * Alpha-3 code of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link String}
	 */
	public static String alpha3(CountryEnum name) {
		return MAP_COUNTRY_ALPHA_3.get(name);
	}

	/**
	 * Alpha-3 code of the country.
	 *
	 * @return {@link String}
	 */
	public String alpha3() {
		return alpha3(this);
	}

	/**
	 * Numeric-3 code of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link String}
	 */
	public static String numeric3(CountryEnum name) {
		return MAP_COUNTRY_NUMERIC_3.get(name);
	}

	/**
	 * Numeric-3 code of the country.
	 *
	 * @return {@link String}
	 */
	public String numeric3() {
		return numeric3(this);
	}

	/**
	 * Top level domain (ccTLD) of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link String}
	 */
	public static String ccTLD(CountryEnum name) {
		List<String> ccTlds = ccTLDs(name);
		return ccTlds != null && !ccTlds.isEmpty() ? ccTlds.get(0) : null;
	}

	/**
	 * Top level domain (ccTLD) of the country.
	 *
	 * @return {@link String}
	 */
	public String ccTLD() {
		return ccTLD(this);
	}

	/**
	 * Top level domain (ccTLD) of the country.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return {@link List}&lt;{@link String}&gt;
	 */
	public static List<String> ccTLDs(CountryEnum name) {
		return MAP_CC_TLD.get(name);
	}

	/**
	 * Top level domain (ccTLD) of the country.
	 *
	 * @return {@link List}&lt;{@link String}&gt;
	 */
	public List<String> ccTLDs() {
		return ccTLDs(this);
	}

	/**
	 * Cheks if the country is part of EU.
	 *
	 * @param name
	 *            - input enum name
	 *
	 * @return true or false
	 */
	public static boolean isEu(CountryEnum name) {
		return LIST_EU.contains(name);
	}

	/**
	 * Cheks if the country is part of EU.
	 *
	 * @return true or false
	 */
	public boolean isEu() {
		return isEu(this);
	}

	private static final Map<CountryEnum, String> MAP_COUNTRY_FULL_NAME;
	static {
		Map<CountryEnum, String> tmpMapCountryFullName = new HashMap<CountryEnum, String>(249);

		tmpMapCountryFullName.put(AF, "Afghanistan");
		tmpMapCountryFullName.put(AX, "Åland Islands");
		tmpMapCountryFullName.put(AL, "Albania");
		tmpMapCountryFullName.put(DZ, "Algeria");
		tmpMapCountryFullName.put(AS, "American Samoa");
		tmpMapCountryFullName.put(AD, "Andorra");
		tmpMapCountryFullName.put(AO, "Angola");
		tmpMapCountryFullName.put(AI, "Anguilla");
		tmpMapCountryFullName.put(AQ, "Antarctica");
		tmpMapCountryFullName.put(AG, "Antigua and Barbuda");
		tmpMapCountryFullName.put(AR, "Argentina");
		tmpMapCountryFullName.put(AM, "Armenia");
		tmpMapCountryFullName.put(AW, "Aruba");
		tmpMapCountryFullName.put(AU, "Australia");
		tmpMapCountryFullName.put(AT, "Austria");
		tmpMapCountryFullName.put(AZ, "Azerbaijan");
		tmpMapCountryFullName.put(BS, "Bahamas");
		tmpMapCountryFullName.put(BH, "Bahrain");
		tmpMapCountryFullName.put(BD, "Bangladesh");
		tmpMapCountryFullName.put(BB, "Barbados");
		tmpMapCountryFullName.put(BY, "Belarus");
		tmpMapCountryFullName.put(BE, "Belgium");
		tmpMapCountryFullName.put(BZ, "Belize");
		tmpMapCountryFullName.put(BJ, "Benin");
		tmpMapCountryFullName.put(BM, "Bermuda");
		tmpMapCountryFullName.put(BT, "Bhutan");
		tmpMapCountryFullName.put(BO, "Bolivia");
		tmpMapCountryFullName.put(BQ, "Bonaire, Sint Eustatius and Saba");
		tmpMapCountryFullName.put(BA, "Bosnia and Herzegovina");
		tmpMapCountryFullName.put(BW, "Botswana");
		tmpMapCountryFullName.put(BV, "Bouvet Island");
		tmpMapCountryFullName.put(BR, "Brazil");
		tmpMapCountryFullName.put(IO, "British Indian Ocean Territory");
		tmpMapCountryFullName.put(BN, "Brunei Darussalam");
		tmpMapCountryFullName.put(BG, "Bulgaria");
		tmpMapCountryFullName.put(BF, "Burkina Faso");
		tmpMapCountryFullName.put(BI, "Burundi");
		tmpMapCountryFullName.put(CV, "Cabo Verde");
		tmpMapCountryFullName.put(KH, "Cambodia");
		tmpMapCountryFullName.put(CM, "Cameroon");
		tmpMapCountryFullName.put(CA, "Canada");
		tmpMapCountryFullName.put(KY, "Cayman Islands");
		tmpMapCountryFullName.put(CF, "Central African Republic");
		tmpMapCountryFullName.put(TD, "Chad");
		tmpMapCountryFullName.put(CL, "Chile");
		tmpMapCountryFullName.put(CN, "China");
		tmpMapCountryFullName.put(CX, "Christmas Island");
		tmpMapCountryFullName.put(CC, "Cocos (Keeling) Islands");
		tmpMapCountryFullName.put(CO, "Colombia");
		tmpMapCountryFullName.put(KM, "Comoros");
		tmpMapCountryFullName.put(CD, "Congo (The Democratic Republic of the)");
		tmpMapCountryFullName.put(CG, "Congo (The Republic of the)");
		tmpMapCountryFullName.put(CK, "Cook Islands");
		tmpMapCountryFullName.put(CR, "Costa Rica");
		tmpMapCountryFullName.put(CI, "Côte d'Ivoire (Ivory Coast)");
		tmpMapCountryFullName.put(HR, "Croatia");
		tmpMapCountryFullName.put(CU, "Cuba");
		tmpMapCountryFullName.put(CW, "Curaçao");
		tmpMapCountryFullName.put(CY, "Cyprus");
		tmpMapCountryFullName.put(CZ, "Czechia");
		tmpMapCountryFullName.put(DK, "Denmark");
		tmpMapCountryFullName.put(DJ, "Djibouti");
		tmpMapCountryFullName.put(DM, "Dominica");
		tmpMapCountryFullName.put(DO, "Dominican Republic");
		tmpMapCountryFullName.put(EC, "Ecuador");
		tmpMapCountryFullName.put(EG, "Egypt");
		tmpMapCountryFullName.put(SV, "El Salvador");
		tmpMapCountryFullName.put(GQ, "Equatorial Guinea");
		tmpMapCountryFullName.put(ER, "Eritrea");
		tmpMapCountryFullName.put(EE, "Estonia");
		tmpMapCountryFullName.put(SZ, "Eswatini");
		tmpMapCountryFullName.put(ET, "Ethiopia");
		tmpMapCountryFullName.put(FK, "Falkland Islands (Malvinas)");
		tmpMapCountryFullName.put(FO, "Faroe Islands");
		tmpMapCountryFullName.put(FJ, "Fiji");
		tmpMapCountryFullName.put(FI, "Finland");
		tmpMapCountryFullName.put(FR, "France");
		tmpMapCountryFullName.put(GF, "French Guiana");
		tmpMapCountryFullName.put(PF, "French Polynesia");
		tmpMapCountryFullName.put(TF, "French Southern Territories");
		tmpMapCountryFullName.put(GA, "Gabon");
		tmpMapCountryFullName.put(GM, "Gambia");
		tmpMapCountryFullName.put(GE, "Georgia");
		tmpMapCountryFullName.put(DE, "Germany");
		tmpMapCountryFullName.put(GH, "Ghana");
		tmpMapCountryFullName.put(GI, "Gibraltar");
		tmpMapCountryFullName.put(GR, "Greece");
		tmpMapCountryFullName.put(GL, "Greenland");
		tmpMapCountryFullName.put(GD, "Grenada");
		tmpMapCountryFullName.put(GP, "Guadeloupe");
		tmpMapCountryFullName.put(GU, "Guam");
		tmpMapCountryFullName.put(GT, "Guatemala");
		tmpMapCountryFullName.put(GG, "Guernsey");
		tmpMapCountryFullName.put(GN, "Guinea");
		tmpMapCountryFullName.put(GW, "Guinea-Bissau");
		tmpMapCountryFullName.put(GY, "Guyana");
		tmpMapCountryFullName.put(HT, "Haiti");
		tmpMapCountryFullName.put(HM, "Heard Island and McDonald Islands");
		tmpMapCountryFullName.put(VA, "Holy See (Vatican)");
		tmpMapCountryFullName.put(HN, "Honduras");
		tmpMapCountryFullName.put(HK, "Hong Kong");
		tmpMapCountryFullName.put(HU, "Hungary");
		tmpMapCountryFullName.put(IS, "Iceland");
		tmpMapCountryFullName.put(IN, "India");
		tmpMapCountryFullName.put(ID, "Indonesia");
		tmpMapCountryFullName.put(IR, "Iran");
		tmpMapCountryFullName.put(IQ, "Iraq");
		tmpMapCountryFullName.put(IE, "Ireland");
		tmpMapCountryFullName.put(IM, "Isle of Man");
		tmpMapCountryFullName.put(IL, "Israel");
		tmpMapCountryFullName.put(IT, "Italy");
		tmpMapCountryFullName.put(JM, "Jamaica");
		tmpMapCountryFullName.put(JP, "Japan");
		tmpMapCountryFullName.put(JE, "Jersey");
		tmpMapCountryFullName.put(JO, "Jordan");
		tmpMapCountryFullName.put(KZ, "Kazakhstan");
		tmpMapCountryFullName.put(KE, "Kenya");
		tmpMapCountryFullName.put(KI, "Kiribati");
		tmpMapCountryFullName.put(KP, "North Korea");
		tmpMapCountryFullName.put(KR, "South Korea");
		tmpMapCountryFullName.put(KW, "Kuwait");
		tmpMapCountryFullName.put(KG, "Kyrgyzstan");
		tmpMapCountryFullName.put(LA, "Lao");
		tmpMapCountryFullName.put(LV, "Latvia");
		tmpMapCountryFullName.put(LB, "Lebanon");
		tmpMapCountryFullName.put(LS, "Lesotho");
		tmpMapCountryFullName.put(LR, "Liberia");
		tmpMapCountryFullName.put(LY, "Libya");
		tmpMapCountryFullName.put(LI, "Liechtenstein");
		tmpMapCountryFullName.put(LT, "Lithuania");
		tmpMapCountryFullName.put(LU, "Luxembourg");
		tmpMapCountryFullName.put(MO, "Macao");
		tmpMapCountryFullName.put(MK, "North Macedonia");
		tmpMapCountryFullName.put(MG, "Madagascar");
		tmpMapCountryFullName.put(MW, "Malawi");
		tmpMapCountryFullName.put(MY, "Malaysia");
		tmpMapCountryFullName.put(MV, "Maldives");
		tmpMapCountryFullName.put(ML, "Mali");
		tmpMapCountryFullName.put(MT, "Malta");
		tmpMapCountryFullName.put(MH, "Marshall Islands");
		tmpMapCountryFullName.put(MQ, "Martinique");
		tmpMapCountryFullName.put(MR, "Mauritania");
		tmpMapCountryFullName.put(MU, "Mauritius");
		tmpMapCountryFullName.put(YT, "Mayotte");
		tmpMapCountryFullName.put(MX, "Mexico");
		tmpMapCountryFullName.put(FM, "Micronesia");
		tmpMapCountryFullName.put(MD, "Moldova");
		tmpMapCountryFullName.put(MC, "Monaco");
		tmpMapCountryFullName.put(MN, "Mongolia");
		tmpMapCountryFullName.put(ME, "Montenegro");
		tmpMapCountryFullName.put(MS, "Montserrat");
		tmpMapCountryFullName.put(MA, "Morocco");
		tmpMapCountryFullName.put(MZ, "Mozambique");
		tmpMapCountryFullName.put(MM, "Myanmar");
		tmpMapCountryFullName.put(NA, "Namibia");
		tmpMapCountryFullName.put(NR, "Nauru");
		tmpMapCountryFullName.put(NP, "Nepal");
		tmpMapCountryFullName.put(NL, "Netherlands");
		tmpMapCountryFullName.put(NC, "New Caledonia");
		tmpMapCountryFullName.put(NZ, "New Zealand");
		tmpMapCountryFullName.put(NI, "Nicaragua");
		tmpMapCountryFullName.put(NE, "Niger");
		tmpMapCountryFullName.put(NG, "Nigeria");
		tmpMapCountryFullName.put(NU, "Niue");
		tmpMapCountryFullName.put(NF, "Norfolk Island");
		tmpMapCountryFullName.put(MP, "Northern Mariana Islands");
		tmpMapCountryFullName.put(NO, "Norway");
		tmpMapCountryFullName.put(OM, "Oman");
		tmpMapCountryFullName.put(PK, "Pakistan");
		tmpMapCountryFullName.put(PW, "Palau");
		tmpMapCountryFullName.put(PS, "Palestine");
		tmpMapCountryFullName.put(PA, "Panama");
		tmpMapCountryFullName.put(PG, "Papua New Guinea");
		tmpMapCountryFullName.put(PY, "Paraguay");
		tmpMapCountryFullName.put(PE, "Peru");
		tmpMapCountryFullName.put(PH, "Philippines");
		tmpMapCountryFullName.put(PN, "Pitcairn");
		tmpMapCountryFullName.put(PL, "Poland");
		tmpMapCountryFullName.put(PT, "Portugal");
		tmpMapCountryFullName.put(PR, "Puerto Rico");
		tmpMapCountryFullName.put(QA, "Qatar");
		tmpMapCountryFullName.put(RE, "Réunion");
		tmpMapCountryFullName.put(RO, "Romania");
		tmpMapCountryFullName.put(RU, "Russia");
		tmpMapCountryFullName.put(RW, "Rwanda");
		tmpMapCountryFullName.put(BL, "Saint Barthélemy");
		tmpMapCountryFullName.put(SH, "Saint Helena, Ascension and Tristan da Cunha");
		tmpMapCountryFullName.put(KN, "Saint Kitts and Nevis");
		tmpMapCountryFullName.put(LC, "Saint Lucia");
		tmpMapCountryFullName.put(MF, "Saint Martin (French part)");
		tmpMapCountryFullName.put(PM, "Saint Pierre and Miquelon");
		tmpMapCountryFullName.put(VC, "Saint Vincent and the Grenadines");
		tmpMapCountryFullName.put(WS, "Samoa");
		tmpMapCountryFullName.put(SM, "San Marino");
		tmpMapCountryFullName.put(ST, "São Tomé and Príncipe");
		tmpMapCountryFullName.put(SA, "Saudi Arabia");
		tmpMapCountryFullName.put(SN, "Senegal");
		tmpMapCountryFullName.put(RS, "Serbia");
		tmpMapCountryFullName.put(SC, "Seychelles");
		tmpMapCountryFullName.put(SL, "Sierra Leone");
		tmpMapCountryFullName.put(SG, "Singapore");
		tmpMapCountryFullName.put(SX, "Sint Maarten (Dutch part)");
		tmpMapCountryFullName.put(SK, "Slovakia");
		tmpMapCountryFullName.put(SI, "Slovenia");
		tmpMapCountryFullName.put(SB, "Solomon Islands");
		tmpMapCountryFullName.put(SO, "Somalia");
		tmpMapCountryFullName.put(ZA, "South Africa");
		tmpMapCountryFullName.put(GS, "South Georgia and the South Sandwich Islands");
		tmpMapCountryFullName.put(SS, "South Sudan");
		tmpMapCountryFullName.put(ES, "Spain");
		tmpMapCountryFullName.put(LK, "Sri Lanka");
		tmpMapCountryFullName.put(SD, "Sudan");
		tmpMapCountryFullName.put(SR, "Suriname");
		tmpMapCountryFullName.put(SJ, "Svalbard and Jan Mayen");
		tmpMapCountryFullName.put(SE, "Sweden");
		tmpMapCountryFullName.put(CH, "Switzerland");
		tmpMapCountryFullName.put(SY, "Syria");
		tmpMapCountryFullName.put(TW, "Taiwan");
		tmpMapCountryFullName.put(TJ, "Tajikistan");
		tmpMapCountryFullName.put(TZ, "Tanzania");
		tmpMapCountryFullName.put(TH, "Thailand");
		tmpMapCountryFullName.put(TL, "Timor-Leste");
		tmpMapCountryFullName.put(TG, "Togo");
		tmpMapCountryFullName.put(TK, "Tokelau");
		tmpMapCountryFullName.put(TO, "Tonga");
		tmpMapCountryFullName.put(TT, "Trinidad and Tobago");
		tmpMapCountryFullName.put(TN, "Tunisia");
		tmpMapCountryFullName.put(TR, "Turkey");
		tmpMapCountryFullName.put(TM, "Turkmenistan");
		tmpMapCountryFullName.put(TC, "Turks and Caicos Islands");
		tmpMapCountryFullName.put(TV, "Tuvalu");
		tmpMapCountryFullName.put(UG, "Uganda");
		tmpMapCountryFullName.put(UA, "Ukraine");
		tmpMapCountryFullName.put(AE, "United Arab Emirates");
		tmpMapCountryFullName.put(GB, "United Kingdom of Great Britain and Northern Ireland");
		tmpMapCountryFullName.put(UM, "United States Minor Outlying Islands");
		tmpMapCountryFullName.put(US, "United States of America");
		tmpMapCountryFullName.put(UY, "Uruguay");
		tmpMapCountryFullName.put(UZ, "Uzbekistan");
		tmpMapCountryFullName.put(VU, "Vanuatu");
		tmpMapCountryFullName.put(VE, "Venezuela");
		tmpMapCountryFullName.put(VN, "Viet Nam");
		tmpMapCountryFullName.put(VG, "Virgin Islands (British)");
		tmpMapCountryFullName.put(VI, "Virgin Islands (U.S.)");
		tmpMapCountryFullName.put(WF, "Wallis and Futuna");
		tmpMapCountryFullName.put(EH, "Western Sahara");
		tmpMapCountryFullName.put(YE, "Yemen");
		tmpMapCountryFullName.put(ZM, "Zambia");
		tmpMapCountryFullName.put(ZW, "Zimbabwe");

		MAP_COUNTRY_FULL_NAME = Collections.unmodifiableMap(tmpMapCountryFullName);

		tmpMapCountryFullName = null; // gc
	}

	private static final Map<CountryEnum, String> MAP_COUNTRY_OFFICIAL_NAME;
	static {
		Map<CountryEnum, String> tmpMapCountryOfficialName = new HashMap<CountryEnum, String>(249);

		tmpMapCountryOfficialName.put(AF, "The Islamic Republic of Afghanistan");
		tmpMapCountryOfficialName.put(AX, "Åland");
		tmpMapCountryOfficialName.put(AL, "The Republic of Albania");
		tmpMapCountryOfficialName.put(DZ, "The People's Democratic Republic of Algeria");
		tmpMapCountryOfficialName.put(AS, "The Territory of American Samoa");
		tmpMapCountryOfficialName.put(AD, "The Principality of Andorra");
		tmpMapCountryOfficialName.put(AO, "The Republic of Angola");
		tmpMapCountryOfficialName.put(AI, "Anguilla");
		tmpMapCountryOfficialName.put(AQ, "All land and ice shelves south of the 60th parallel south");
		tmpMapCountryOfficialName.put(AG, "Antigua and Barbuda");
		tmpMapCountryOfficialName.put(AR, "The Argentine Republic");
		tmpMapCountryOfficialName.put(AM, "The Republic of Armenia");
		tmpMapCountryOfficialName.put(AW, "Aruba");
		tmpMapCountryOfficialName.put(AU, "The Commonwealth of Australia");
		tmpMapCountryOfficialName.put(AT, "The Republic of Austria");
		tmpMapCountryOfficialName.put(AZ, "The Republic of Azerbaijan");
		tmpMapCountryOfficialName.put(BS, "The Commonwealth of The Bahamas");
		tmpMapCountryOfficialName.put(BH, "The Kingdom of Bahrain");
		tmpMapCountryOfficialName.put(BD, "The People's Republic of Bangladesh");
		tmpMapCountryOfficialName.put(BB, "Barbados");
		tmpMapCountryOfficialName.put(BY, "The Republic of Belarus");
		tmpMapCountryOfficialName.put(BE, "The Kingdom of Belgium");
		tmpMapCountryOfficialName.put(BZ, "Belize");
		tmpMapCountryOfficialName.put(BJ, "The Republic of Benin");
		tmpMapCountryOfficialName.put(BM, "Bermuda");
		tmpMapCountryOfficialName.put(BT, "The Kingdom of Bhutan");
		tmpMapCountryOfficialName.put(BO, "The Plurinational State of Bolivia");
		tmpMapCountryOfficialName.put(BQ, "Bonaire, Sint Eustatius and Saba");
		tmpMapCountryOfficialName.put(BA, "Bosnia and Herzegovina");
		tmpMapCountryOfficialName.put(BW, "The Republic of Botswana");
		tmpMapCountryOfficialName.put(BV, "Bouvet Island");
		tmpMapCountryOfficialName.put(BR, "The Federative Republic of Brazil");
		tmpMapCountryOfficialName.put(IO, "The British Indian Ocean Territory");
		tmpMapCountryOfficialName.put(BN, "The Nation of Brunei, the Abode of Peace");
		tmpMapCountryOfficialName.put(BG, "The Republic of Bulgaria");
		tmpMapCountryOfficialName.put(BF, "Burkina Faso");
		tmpMapCountryOfficialName.put(BI, "The Republic of Burundi");
		tmpMapCountryOfficialName.put(CV, "The Republic of Cabo Verde");
		tmpMapCountryOfficialName.put(KH, "The Kingdom of Cambodia");
		tmpMapCountryOfficialName.put(CM, "The Republic of Cameroon");
		tmpMapCountryOfficialName.put(CA, "Canada");
		tmpMapCountryOfficialName.put(KY, "The Cayman Islands");
		tmpMapCountryOfficialName.put(CF, "The Central African Republic");
		tmpMapCountryOfficialName.put(TD, "The Republic of Chad");
		tmpMapCountryOfficialName.put(CL, "The Republic of Chile");
		tmpMapCountryOfficialName.put(CN, "The People's Republic of China");
		tmpMapCountryOfficialName.put(CX, "The Territory of Christmas Island");
		tmpMapCountryOfficialName.put(CC, "The Territory of Cocos (Keeling) Islands");
		tmpMapCountryOfficialName.put(CO, "The Republic of Colombia");
		tmpMapCountryOfficialName.put(KM, "The Union of the Comoros");
		tmpMapCountryOfficialName.put(CD, "The Democratic Republic of the Congo");
		tmpMapCountryOfficialName.put(CG, "The Republic of the Congo");
		tmpMapCountryOfficialName.put(CK, "The Cook Islands");
		tmpMapCountryOfficialName.put(CR, "The Republic of Costa Rica");
		tmpMapCountryOfficialName.put(CI, "The Republic of Côte d'Ivoire");
		tmpMapCountryOfficialName.put(HR, "The Republic of Croatia");
		tmpMapCountryOfficialName.put(CU, "The Republic of Cuba");
		tmpMapCountryOfficialName.put(CW, "The Country of Curaçao");
		tmpMapCountryOfficialName.put(CY, "The Republic of Cyprus");
		tmpMapCountryOfficialName.put(CZ, "The Czech Republic");
		tmpMapCountryOfficialName.put(DK, "The Kingdom of Denmark");
		tmpMapCountryOfficialName.put(DJ, "The Republic of Djibouti");
		tmpMapCountryOfficialName.put(DM, "The Commonwealth of Dominica");
		tmpMapCountryOfficialName.put(DO, "The Dominican Republic");
		tmpMapCountryOfficialName.put(EC, "The Republic of Ecuador");
		tmpMapCountryOfficialName.put(EG, "The Arab Republic of Egypt");
		tmpMapCountryOfficialName.put(SV, "The Republic of El Salvador");
		tmpMapCountryOfficialName.put(GQ, "The Republic of Equatorial Guinea");
		tmpMapCountryOfficialName.put(ER, "The State of Eritrea");
		tmpMapCountryOfficialName.put(EE, "The Republic of Estonia");
		tmpMapCountryOfficialName.put(SZ, "The Kingdom of Eswatini");
		tmpMapCountryOfficialName.put(ET, "The Federal Democratic Republic of Ethiopia");
		tmpMapCountryOfficialName.put(FK, "The Falkland Islands");
		tmpMapCountryOfficialName.put(FO, "The Faroe Islands");
		tmpMapCountryOfficialName.put(FJ, "The Republic of Fiji");
		tmpMapCountryOfficialName.put(FI, "The Republic of Finland");
		tmpMapCountryOfficialName.put(FR, "The French Republic");
		tmpMapCountryOfficialName.put(GF, "Guyane");
		tmpMapCountryOfficialName.put(PF, "French Polynesia");
		tmpMapCountryOfficialName.put(TF, "The French Southern and Antarctic Lands");
		tmpMapCountryOfficialName.put(GA, "The Gabonese Republic");
		tmpMapCountryOfficialName.put(GM, "The Republic of The Gambia");
		tmpMapCountryOfficialName.put(GE, "Georgia");
		tmpMapCountryOfficialName.put(DE, "The Federal Republic of Germany");
		tmpMapCountryOfficialName.put(GH, "The Republic of Ghana");
		tmpMapCountryOfficialName.put(GI, "Gibraltar");
		tmpMapCountryOfficialName.put(GR, "The Hellenic Republic");
		tmpMapCountryOfficialName.put(GL, "Kalaallit Nunaat");
		tmpMapCountryOfficialName.put(GD, "Grenada");
		tmpMapCountryOfficialName.put(GP, "Guadeloupe");
		tmpMapCountryOfficialName.put(GU, "The Territory of Guam");
		tmpMapCountryOfficialName.put(GT, "The Republic of Guatemala");
		tmpMapCountryOfficialName.put(GG, "The Bailiwick of Guernsey");
		tmpMapCountryOfficialName.put(GN, "The Republic of Guinea");
		tmpMapCountryOfficialName.put(GW, "The Republic of Guinea-Bissau");
		tmpMapCountryOfficialName.put(GY, "The Co-operative Republic of Guyana");
		tmpMapCountryOfficialName.put(HT, "The Republic of Haiti");
		tmpMapCountryOfficialName.put(HM, "The Territory of Heard Island and McDonald Islands");
		tmpMapCountryOfficialName.put(VA, "The Holy See");
		tmpMapCountryOfficialName.put(HN, "The Republic of Honduras");
		tmpMapCountryOfficialName.put(HK, "The Hong Kong Special Administrative Region of China[10]");
		tmpMapCountryOfficialName.put(HU, "Hungary");
		tmpMapCountryOfficialName.put(IS, "Iceland");
		tmpMapCountryOfficialName.put(IN, "The Republic of India");
		tmpMapCountryOfficialName.put(ID, "The Republic of Indonesia");
		tmpMapCountryOfficialName.put(IR, "The Islamic Republic of Iran");
		tmpMapCountryOfficialName.put(IQ, "The Republic of Iraq");
		tmpMapCountryOfficialName.put(IE, "Ireland");
		tmpMapCountryOfficialName.put(IM, "The Isle of Man");
		tmpMapCountryOfficialName.put(IL, "The State of Israel");
		tmpMapCountryOfficialName.put(IT, "The Italian Republic");
		tmpMapCountryOfficialName.put(JM, "Jamaica");
		tmpMapCountryOfficialName.put(JP, "Japan");
		tmpMapCountryOfficialName.put(JE, "The Bailiwick of Jersey");
		tmpMapCountryOfficialName.put(JO, "The Hashemite Kingdom of Jordan");
		tmpMapCountryOfficialName.put(KZ, "The Republic of Kazakhstan");
		tmpMapCountryOfficialName.put(KE, "The Republic of Kenya");
		tmpMapCountryOfficialName.put(KI, "The Republic of Kiribati");
		tmpMapCountryOfficialName.put(KP, "The Democratic People's Republic of Korea");
		tmpMapCountryOfficialName.put(KR, "The Republic of Korea");
		tmpMapCountryOfficialName.put(KW, "The State of Kuwait");
		tmpMapCountryOfficialName.put(KG, "The Kyrgyz Republic");
		tmpMapCountryOfficialName.put(LA, "The Lao People's Democratic Republic");
		tmpMapCountryOfficialName.put(LV, "The Republic of Latvia");
		tmpMapCountryOfficialName.put(LB, "The Lebanese Republic");
		tmpMapCountryOfficialName.put(LS, "The Kingdom of Lesotho");
		tmpMapCountryOfficialName.put(LR, "The Republic of Liberia");
		tmpMapCountryOfficialName.put(LY, "The State of Libya");
		tmpMapCountryOfficialName.put(LI, "The Principality of Liechtenstein");
		tmpMapCountryOfficialName.put(LT, "The Republic of Lithuania");
		tmpMapCountryOfficialName.put(LU, "The Grand Duchy of Luxembourg");
		tmpMapCountryOfficialName.put(MO, "The Macao Special Administrative Region of China[11]");
		tmpMapCountryOfficialName.put(MK, "The Republic of North Macedonia[12]");
		tmpMapCountryOfficialName.put(MG, "The Republic of Madagascar");
		tmpMapCountryOfficialName.put(MW, "The Republic of Malawi");
		tmpMapCountryOfficialName.put(MY, "Malaysia");
		tmpMapCountryOfficialName.put(MV, "The Republic of Maldives");
		tmpMapCountryOfficialName.put(ML, "The Republic of Mali");
		tmpMapCountryOfficialName.put(MT, "The Republic of Malta");
		tmpMapCountryOfficialName.put(MH, "The Republic of the Marshall Islands");
		tmpMapCountryOfficialName.put(MQ, "Martinique");
		tmpMapCountryOfficialName.put(MR, "The Islamic Republic of Mauritania");
		tmpMapCountryOfficialName.put(MU, "The Republic of Mauritius");
		tmpMapCountryOfficialName.put(YT, "The Department of Mayotte");
		tmpMapCountryOfficialName.put(MX, "The United Mexican States");
		tmpMapCountryOfficialName.put(FM, "The Federated States of Micronesia");
		tmpMapCountryOfficialName.put(MD, "The Republic of Moldova");
		tmpMapCountryOfficialName.put(MC, "The Principality of Monaco");
		tmpMapCountryOfficialName.put(MN, "Mongolia");
		tmpMapCountryOfficialName.put(ME, "Montenegro");
		tmpMapCountryOfficialName.put(MS, "Montserrat");
		tmpMapCountryOfficialName.put(MA, "The Kingdom of Morocco");
		tmpMapCountryOfficialName.put(MZ, "The Republic of Mozambique");
		tmpMapCountryOfficialName.put(MM, "The Republic of the Union of Myanmar");
		tmpMapCountryOfficialName.put(NA, "The Republic of Namibia");
		tmpMapCountryOfficialName.put(NR, "The Republic of Nauru");
		tmpMapCountryOfficialName.put(NP, "The Federal Democratic Republic of Nepal");
		tmpMapCountryOfficialName.put(NL, "The Kingdom of the Netherlands");
		tmpMapCountryOfficialName.put(NC, "New Caledonia");
		tmpMapCountryOfficialName.put(NZ, "New Zealand");
		tmpMapCountryOfficialName.put(NI, "The Republic of Nicaragua");
		tmpMapCountryOfficialName.put(NE, "The Republic of the Niger");
		tmpMapCountryOfficialName.put(NG, "The Federal Republic of Nigeria");
		tmpMapCountryOfficialName.put(NU, "Niue");
		tmpMapCountryOfficialName.put(NF, "The Territory of Norfolk Island");
		tmpMapCountryOfficialName.put(MP, "The Commonwealth of the Northern Mariana Islands");
		tmpMapCountryOfficialName.put(NO, "The Kingdom of Norway");
		tmpMapCountryOfficialName.put(OM, "The Sultanate of Oman");
		tmpMapCountryOfficialName.put(PK, "The Islamic Republic of Pakistan");
		tmpMapCountryOfficialName.put(PW, "The Republic of Palau");
		tmpMapCountryOfficialName.put(PS, "The State of Palestine");
		tmpMapCountryOfficialName.put(PA, "The Republic of Panamá");
		tmpMapCountryOfficialName.put(PG, "The Independent State of Papua New Guinea");
		tmpMapCountryOfficialName.put(PY, "The Republic of Paraguay");
		tmpMapCountryOfficialName.put(PE, "The Republic of Perú");
		tmpMapCountryOfficialName.put(PH, "The Republic of the Philippines");
		tmpMapCountryOfficialName.put(PN, "The Pitcairn, Henderson, Ducie and Oeno Islands");
		tmpMapCountryOfficialName.put(PL, "The Republic of Poland");
		tmpMapCountryOfficialName.put(PT, "The Portuguese Republic");
		tmpMapCountryOfficialName.put(PR, "The Commonwealth of Puerto Rico");
		tmpMapCountryOfficialName.put(QA, "The State of Qatar");
		tmpMapCountryOfficialName.put(RE, "Réunion");
		tmpMapCountryOfficialName.put(RO, "Romania");
		tmpMapCountryOfficialName.put(RU, "The Russian Federation");
		tmpMapCountryOfficialName.put(RW, "The Republic of Rwanda");
		tmpMapCountryOfficialName.put(BL, "The Collectivity of Saint-Barthélemy");
		tmpMapCountryOfficialName.put(SH, "Saint Helena, Ascension and Tristan da Cunha");
		tmpMapCountryOfficialName.put(KN, "Saint Kitts and Nevis");
		tmpMapCountryOfficialName.put(LC, "Saint Lucia");
		tmpMapCountryOfficialName.put(MF, "The Collectivity of Saint-Martin");
		tmpMapCountryOfficialName.put(PM, "The Overseas Collectivity of Saint-Pierre and Miquelon");
		tmpMapCountryOfficialName.put(VC, "Saint Vincent and the Grenadines");
		tmpMapCountryOfficialName.put(WS, "The Independent State of Samoa");
		tmpMapCountryOfficialName.put(SM, "The Republic of San Marino");
		tmpMapCountryOfficialName.put(ST, "The Democratic Republic of São Tomé and Príncipe");
		tmpMapCountryOfficialName.put(SA, "The Kingdom of Saudi Arabia");
		tmpMapCountryOfficialName.put(SN, "The Republic of Senegal");
		tmpMapCountryOfficialName.put(RS, "The Republic of Serbia");
		tmpMapCountryOfficialName.put(SC, "The Republic of Seychelles");
		tmpMapCountryOfficialName.put(SL, "The Republic of Sierra Leone");
		tmpMapCountryOfficialName.put(SG, "The Republic of Singapore");
		tmpMapCountryOfficialName.put(SX, "Sint Maarten");
		tmpMapCountryOfficialName.put(SK, "The Slovak Republic");
		tmpMapCountryOfficialName.put(SI, "The Republic of Slovenia");
		tmpMapCountryOfficialName.put(SB, "The Solomon Islands");
		tmpMapCountryOfficialName.put(SO, "The Federal Republic of Somalia");
		tmpMapCountryOfficialName.put(ZA, "The Republic of South Africa");
		tmpMapCountryOfficialName.put(GS, "South Georgia and the South Sandwich Islands");
		tmpMapCountryOfficialName.put(SS, "The Republic of South Sudan");
		tmpMapCountryOfficialName.put(ES, "The Kingdom of Spain");
		tmpMapCountryOfficialName.put(LK, "The Democratic Socialist Republic of Sri Lanka");
		tmpMapCountryOfficialName.put(SD, "The Republic of the Sudan");
		tmpMapCountryOfficialName.put(SR, "The Republic of Suriname");
		tmpMapCountryOfficialName.put(SJ, "Svalbard and Jan Mayen");
		tmpMapCountryOfficialName.put(SE, "The Kingdom of Sweden");
		tmpMapCountryOfficialName.put(CH, "The Swiss Confederation");
		tmpMapCountryOfficialName.put(SY, "The Syrian Arab Republic");
		tmpMapCountryOfficialName.put(TW, "The Republic of China");
		tmpMapCountryOfficialName.put(TJ, "The Republic of Tajikistan");
		tmpMapCountryOfficialName.put(TZ, "The United Republic of Tanzania");
		tmpMapCountryOfficialName.put(TH, "The Kingdom of Thailand");
		tmpMapCountryOfficialName.put(TL, "The Democratic Republic of Timor-Leste");
		tmpMapCountryOfficialName.put(TG, "The Togolese Republic");
		tmpMapCountryOfficialName.put(TK, "Tokelau");
		tmpMapCountryOfficialName.put(TO, "The Kingdom of Tonga");
		tmpMapCountryOfficialName.put(TT, "The Republic of Trinidad and Tobago");
		tmpMapCountryOfficialName.put(TN, "The Republic of Tunisia");
		tmpMapCountryOfficialName.put(TR, "The Republic of Turkey");
		tmpMapCountryOfficialName.put(TM, "Turkmenistan");
		tmpMapCountryOfficialName.put(TC, "The Turks and Caicos Islands");
		tmpMapCountryOfficialName.put(TV, "Tuvalu");
		tmpMapCountryOfficialName.put(UG, "The Republic of Uganda");
		tmpMapCountryOfficialName.put(UA, "Ukraine");
		tmpMapCountryOfficialName.put(AE, "The United Arab Emirates");
		tmpMapCountryOfficialName.put(GB, "The United Kingdom of Great Britain and Northern Ireland");
		tmpMapCountryOfficialName.put(UM,
				"Baker Island, Howland Island, Jarvis Island, Johnston Atoll, Kingman Reef, Midway Atoll, Navassa Island, Palmyra Atoll, and Wake Island");
		tmpMapCountryOfficialName.put(US, "The United States of America");
		tmpMapCountryOfficialName.put(UY, "The Oriental Republic of Uruguay");
		tmpMapCountryOfficialName.put(UZ, "The Republic of Uzbekistan");
		tmpMapCountryOfficialName.put(VU, "The Republic of Vanuatu");
		tmpMapCountryOfficialName.put(VE, "The Bolivarian Republic of Venezuela");
		tmpMapCountryOfficialName.put(VN, "The Socialist Republic of Viet Nam");
		tmpMapCountryOfficialName.put(VG, "The Virgin Islands");
		tmpMapCountryOfficialName.put(VI, "The Virgin Islands of the United States");
		tmpMapCountryOfficialName.put(WF, "The Territory of the Wallis and Futuna Islands");
		tmpMapCountryOfficialName.put(EH, "The Sahrawi Arab Democratic Republic");
		tmpMapCountryOfficialName.put(YE, "The Republic of Yemen");
		tmpMapCountryOfficialName.put(ZM, "The Republic of Zambia");
		tmpMapCountryOfficialName.put(ZW, "The Republic of Zimbabwe");

		MAP_COUNTRY_OFFICIAL_NAME = Collections.unmodifiableMap(tmpMapCountryOfficialName);

		tmpMapCountryOfficialName = null; // gc
	}

	private static final Map<CountryEnum, String> MAP_COUNTRY_ALPHA_3;
	static {
		Map<CountryEnum, String> tmpMapCountryAlpha3 = new HashMap<CountryEnum, String>(249);

		tmpMapCountryAlpha3.put(AF, "AFG");
		tmpMapCountryAlpha3.put(AX, "ALA");
		tmpMapCountryAlpha3.put(AL, "ALB");
		tmpMapCountryAlpha3.put(DZ, "DZA");
		tmpMapCountryAlpha3.put(AS, "ASM");
		tmpMapCountryAlpha3.put(AD, "AND");
		tmpMapCountryAlpha3.put(AO, "AGO");
		tmpMapCountryAlpha3.put(AI, "AIA");
		tmpMapCountryAlpha3.put(AQ, "ATA");
		tmpMapCountryAlpha3.put(AG, "ATG");
		tmpMapCountryAlpha3.put(AR, "ARG");
		tmpMapCountryAlpha3.put(AM, "ARM");
		tmpMapCountryAlpha3.put(AW, "ABW");
		tmpMapCountryAlpha3.put(AU, "AUS");
		tmpMapCountryAlpha3.put(AT, "AUT");
		tmpMapCountryAlpha3.put(AZ, "AZE");
		tmpMapCountryAlpha3.put(BS, "BHS");
		tmpMapCountryAlpha3.put(BH, "BHR");
		tmpMapCountryAlpha3.put(BD, "BGD");
		tmpMapCountryAlpha3.put(BB, "BRB");
		tmpMapCountryAlpha3.put(BY, "BLR");
		tmpMapCountryAlpha3.put(BE, "BEL");
		tmpMapCountryAlpha3.put(BZ, "BLZ");
		tmpMapCountryAlpha3.put(BJ, "BEN");
		tmpMapCountryAlpha3.put(BM, "BMU");
		tmpMapCountryAlpha3.put(BT, "BTN");
		tmpMapCountryAlpha3.put(BO, "BOL");
		tmpMapCountryAlpha3.put(BQ, "BES");
		tmpMapCountryAlpha3.put(BA, "BIH");
		tmpMapCountryAlpha3.put(BW, "BWA");
		tmpMapCountryAlpha3.put(BV, "BVT");
		tmpMapCountryAlpha3.put(BR, "BRA");
		tmpMapCountryAlpha3.put(IO, "IOT");
		tmpMapCountryAlpha3.put(BN, "BRN");
		tmpMapCountryAlpha3.put(BG, "BGR");
		tmpMapCountryAlpha3.put(BF, "BFA");
		tmpMapCountryAlpha3.put(BI, "BDI");
		tmpMapCountryAlpha3.put(CV, "CPV");
		tmpMapCountryAlpha3.put(KH, "KHM");
		tmpMapCountryAlpha3.put(CM, "CMR");
		tmpMapCountryAlpha3.put(CA, "CAN");
		tmpMapCountryAlpha3.put(KY, "CYM");
		tmpMapCountryAlpha3.put(CF, "CAF");
		tmpMapCountryAlpha3.put(TD, "TCD");
		tmpMapCountryAlpha3.put(CL, "CHL");
		tmpMapCountryAlpha3.put(CN, "CHN");
		tmpMapCountryAlpha3.put(CX, "CXR");
		tmpMapCountryAlpha3.put(CC, "CCK");
		tmpMapCountryAlpha3.put(CO, "COL");
		tmpMapCountryAlpha3.put(KM, "COM");
		tmpMapCountryAlpha3.put(CD, "COD");
		tmpMapCountryAlpha3.put(CG, "COG");
		tmpMapCountryAlpha3.put(CK, "COK");
		tmpMapCountryAlpha3.put(CR, "CRI");
		tmpMapCountryAlpha3.put(CI, "CIV");
		tmpMapCountryAlpha3.put(HR, "HRV");
		tmpMapCountryAlpha3.put(CU, "CUB");
		tmpMapCountryAlpha3.put(CW, "CUW");
		tmpMapCountryAlpha3.put(CY, "CYP");
		tmpMapCountryAlpha3.put(CZ, "CZE");
		tmpMapCountryAlpha3.put(DK, "DNK");
		tmpMapCountryAlpha3.put(DJ, "DJI");
		tmpMapCountryAlpha3.put(DM, "DMA");
		tmpMapCountryAlpha3.put(DO, "DOM");
		tmpMapCountryAlpha3.put(EC, "ECU");
		tmpMapCountryAlpha3.put(EG, "EGY");
		tmpMapCountryAlpha3.put(SV, "SLV");
		tmpMapCountryAlpha3.put(GQ, "GNQ");
		tmpMapCountryAlpha3.put(ER, "ERI");
		tmpMapCountryAlpha3.put(EE, "EST");
		tmpMapCountryAlpha3.put(SZ, "SWZ");
		tmpMapCountryAlpha3.put(ET, "ETH");
		tmpMapCountryAlpha3.put(FK, "FLK");
		tmpMapCountryAlpha3.put(FO, "FRO");
		tmpMapCountryAlpha3.put(FJ, "FJI");
		tmpMapCountryAlpha3.put(FI, "FIN");
		tmpMapCountryAlpha3.put(FR, "FRA");
		tmpMapCountryAlpha3.put(GF, "GUF");
		tmpMapCountryAlpha3.put(PF, "PYF");
		tmpMapCountryAlpha3.put(TF, "ATF");
		tmpMapCountryAlpha3.put(GA, "GAB");
		tmpMapCountryAlpha3.put(GM, "GMB");
		tmpMapCountryAlpha3.put(GE, "GEO");
		tmpMapCountryAlpha3.put(DE, "DEU");
		tmpMapCountryAlpha3.put(GH, "GHA");
		tmpMapCountryAlpha3.put(GI, "GIB");
		tmpMapCountryAlpha3.put(GR, "GRC");
		tmpMapCountryAlpha3.put(GL, "GRL");
		tmpMapCountryAlpha3.put(GD, "GRD");
		tmpMapCountryAlpha3.put(GP, "GLP");
		tmpMapCountryAlpha3.put(GU, "GUM");
		tmpMapCountryAlpha3.put(GT, "GTM");
		tmpMapCountryAlpha3.put(GG, "GGY");
		tmpMapCountryAlpha3.put(GN, "GIN");
		tmpMapCountryAlpha3.put(GW, "GNB");
		tmpMapCountryAlpha3.put(GY, "GUY");
		tmpMapCountryAlpha3.put(HT, "HTI");
		tmpMapCountryAlpha3.put(HM, "HMD");
		tmpMapCountryAlpha3.put(VA, "VAT");
		tmpMapCountryAlpha3.put(HN, "HND");
		tmpMapCountryAlpha3.put(HK, "HKG");
		tmpMapCountryAlpha3.put(HU, "HUN");
		tmpMapCountryAlpha3.put(IS, "ISL");
		tmpMapCountryAlpha3.put(IN, "IND");
		tmpMapCountryAlpha3.put(ID, "IDN");
		tmpMapCountryAlpha3.put(IR, "IRN");
		tmpMapCountryAlpha3.put(IQ, "IRQ");
		tmpMapCountryAlpha3.put(IE, "IRL");
		tmpMapCountryAlpha3.put(IM, "IMN");
		tmpMapCountryAlpha3.put(IL, "ISR");
		tmpMapCountryAlpha3.put(IT, "ITA");
		tmpMapCountryAlpha3.put(JM, "JAM");
		tmpMapCountryAlpha3.put(JP, "JPN");
		tmpMapCountryAlpha3.put(JE, "JEY");
		tmpMapCountryAlpha3.put(JO, "JOR");
		tmpMapCountryAlpha3.put(KZ, "KAZ");
		tmpMapCountryAlpha3.put(KE, "KEN");
		tmpMapCountryAlpha3.put(KI, "KIR");
		tmpMapCountryAlpha3.put(KP, "PRK");
		tmpMapCountryAlpha3.put(KR, "KOR");
		tmpMapCountryAlpha3.put(KW, "KWT");
		tmpMapCountryAlpha3.put(KG, "KGZ");
		tmpMapCountryAlpha3.put(LA, "LAO");
		tmpMapCountryAlpha3.put(LV, "LVA");
		tmpMapCountryAlpha3.put(LB, "LBN");
		tmpMapCountryAlpha3.put(LS, "LSO");
		tmpMapCountryAlpha3.put(LR, "LBR");
		tmpMapCountryAlpha3.put(LY, "LBY");
		tmpMapCountryAlpha3.put(LI, "LIE");
		tmpMapCountryAlpha3.put(LT, "LTU");
		tmpMapCountryAlpha3.put(LU, "LUX");
		tmpMapCountryAlpha3.put(MO, "MAC");
		tmpMapCountryAlpha3.put(MK, "MKD");
		tmpMapCountryAlpha3.put(MG, "MDG");
		tmpMapCountryAlpha3.put(MW, "MWI");
		tmpMapCountryAlpha3.put(MY, "MYS");
		tmpMapCountryAlpha3.put(MV, "MDV");
		tmpMapCountryAlpha3.put(ML, "MLI");
		tmpMapCountryAlpha3.put(MT, "MLT");
		tmpMapCountryAlpha3.put(MH, "MHL");
		tmpMapCountryAlpha3.put(MQ, "MTQ");
		tmpMapCountryAlpha3.put(MR, "MRT");
		tmpMapCountryAlpha3.put(MU, "MUS");
		tmpMapCountryAlpha3.put(YT, "MYT");
		tmpMapCountryAlpha3.put(MX, "MEX");
		tmpMapCountryAlpha3.put(FM, "FSM");
		tmpMapCountryAlpha3.put(MD, "MDA");
		tmpMapCountryAlpha3.put(MC, "MCO");
		tmpMapCountryAlpha3.put(MN, "MNG");
		tmpMapCountryAlpha3.put(ME, "MNE");
		tmpMapCountryAlpha3.put(MS, "MSR");
		tmpMapCountryAlpha3.put(MA, "MAR");
		tmpMapCountryAlpha3.put(MZ, "MOZ");
		tmpMapCountryAlpha3.put(MM, "MMR");
		tmpMapCountryAlpha3.put(NA, "NAM");
		tmpMapCountryAlpha3.put(NR, "NRU");
		tmpMapCountryAlpha3.put(NP, "NPL");
		tmpMapCountryAlpha3.put(NL, "NLD");
		tmpMapCountryAlpha3.put(NC, "NCL");
		tmpMapCountryAlpha3.put(NZ, "NZL");
		tmpMapCountryAlpha3.put(NI, "NIC");
		tmpMapCountryAlpha3.put(NE, "NER");
		tmpMapCountryAlpha3.put(NG, "NGA");
		tmpMapCountryAlpha3.put(NU, "NIU");
		tmpMapCountryAlpha3.put(NF, "NFK");
		tmpMapCountryAlpha3.put(MP, "MNP");
		tmpMapCountryAlpha3.put(NO, "NOR");
		tmpMapCountryAlpha3.put(OM, "OMN");
		tmpMapCountryAlpha3.put(PK, "PAK");
		tmpMapCountryAlpha3.put(PW, "PLW");
		tmpMapCountryAlpha3.put(PS, "PSE");
		tmpMapCountryAlpha3.put(PA, "PAN");
		tmpMapCountryAlpha3.put(PG, "PNG");
		tmpMapCountryAlpha3.put(PY, "PRY");
		tmpMapCountryAlpha3.put(PE, "PER");
		tmpMapCountryAlpha3.put(PH, "PHL");
		tmpMapCountryAlpha3.put(PN, "PCN");
		tmpMapCountryAlpha3.put(PL, "POL");
		tmpMapCountryAlpha3.put(PT, "PRT");
		tmpMapCountryAlpha3.put(PR, "PRI");
		tmpMapCountryAlpha3.put(QA, "QAT");
		tmpMapCountryAlpha3.put(RE, "REU");
		tmpMapCountryAlpha3.put(RO, "ROU");
		tmpMapCountryAlpha3.put(RU, "RUS");
		tmpMapCountryAlpha3.put(RW, "RWA");
		tmpMapCountryAlpha3.put(BL, "BLM");
		tmpMapCountryAlpha3.put(SH, "SHN");
		tmpMapCountryAlpha3.put(KN, "KNA");
		tmpMapCountryAlpha3.put(LC, "LCA");
		tmpMapCountryAlpha3.put(MF, "MAF");
		tmpMapCountryAlpha3.put(PM, "SPM");
		tmpMapCountryAlpha3.put(VC, "VCT");
		tmpMapCountryAlpha3.put(WS, "WSM");
		tmpMapCountryAlpha3.put(SM, "SMR");
		tmpMapCountryAlpha3.put(ST, "STP");
		tmpMapCountryAlpha3.put(SA, "SAU");
		tmpMapCountryAlpha3.put(SN, "SEN");
		tmpMapCountryAlpha3.put(RS, "SRB");
		tmpMapCountryAlpha3.put(SC, "SYC");
		tmpMapCountryAlpha3.put(SL, "SLE");
		tmpMapCountryAlpha3.put(SG, "SGP");
		tmpMapCountryAlpha3.put(SX, "SXM");
		tmpMapCountryAlpha3.put(SK, "SVK");
		tmpMapCountryAlpha3.put(SI, "SVN");
		tmpMapCountryAlpha3.put(SB, "SLB");
		tmpMapCountryAlpha3.put(SO, "SOM");
		tmpMapCountryAlpha3.put(ZA, "ZAF");
		tmpMapCountryAlpha3.put(GS, "SGS");
		tmpMapCountryAlpha3.put(SS, "SSD");
		tmpMapCountryAlpha3.put(ES, "ESP");
		tmpMapCountryAlpha3.put(LK, "LKA");
		tmpMapCountryAlpha3.put(SD, "SDN");
		tmpMapCountryAlpha3.put(SR, "SUR");
		tmpMapCountryAlpha3.put(SJ, "SJM");
		tmpMapCountryAlpha3.put(SE, "SWE");
		tmpMapCountryAlpha3.put(CH, "CHE");
		tmpMapCountryAlpha3.put(SY, "SYR");
		tmpMapCountryAlpha3.put(TW, "TWN");
		tmpMapCountryAlpha3.put(TJ, "TJK");
		tmpMapCountryAlpha3.put(TZ, "TZA");
		tmpMapCountryAlpha3.put(TH, "THA");
		tmpMapCountryAlpha3.put(TL, "TLS");
		tmpMapCountryAlpha3.put(TG, "TGO");
		tmpMapCountryAlpha3.put(TK, "TKL");
		tmpMapCountryAlpha3.put(TO, "TON");
		tmpMapCountryAlpha3.put(TT, "TTO");
		tmpMapCountryAlpha3.put(TN, "TUN");
		tmpMapCountryAlpha3.put(TR, "TUR");
		tmpMapCountryAlpha3.put(TM, "TKM");
		tmpMapCountryAlpha3.put(TC, "TCA");
		tmpMapCountryAlpha3.put(TV, "TUV");
		tmpMapCountryAlpha3.put(UG, "UGA");
		tmpMapCountryAlpha3.put(UA, "UKR");
		tmpMapCountryAlpha3.put(AE, "ARE");
		tmpMapCountryAlpha3.put(GB, "GBR");
		tmpMapCountryAlpha3.put(UM, "UMI");
		tmpMapCountryAlpha3.put(US, "USA");
		tmpMapCountryAlpha3.put(UY, "URY");
		tmpMapCountryAlpha3.put(UZ, "UZB");
		tmpMapCountryAlpha3.put(VU, "VUT");
		tmpMapCountryAlpha3.put(VE, "VEN");
		tmpMapCountryAlpha3.put(VN, "VNM");
		tmpMapCountryAlpha3.put(VG, "VGB");
		tmpMapCountryAlpha3.put(VI, "VIR");
		tmpMapCountryAlpha3.put(WF, "WLF");
		tmpMapCountryAlpha3.put(EH, "ESH");
		tmpMapCountryAlpha3.put(YE, "YEM");
		tmpMapCountryAlpha3.put(ZM, "ZMB");
		tmpMapCountryAlpha3.put(ZW, "ZWE");

		MAP_COUNTRY_ALPHA_3 = Collections.unmodifiableMap(tmpMapCountryAlpha3);

		tmpMapCountryAlpha3 = null; // gc
	}

	private static final Map<CountryEnum, String> MAP_COUNTRY_NUMERIC_3;
	static {
		Map<CountryEnum, String> tmpMapCountryNumeric3 = new HashMap<CountryEnum, String>(249);

		tmpMapCountryNumeric3.put(AF, "004");
		tmpMapCountryNumeric3.put(AX, "248");
		tmpMapCountryNumeric3.put(AL, "008");
		tmpMapCountryNumeric3.put(DZ, "012");
		tmpMapCountryNumeric3.put(AS, "016");
		tmpMapCountryNumeric3.put(AD, "020");
		tmpMapCountryNumeric3.put(AO, "024");
		tmpMapCountryNumeric3.put(AI, "660");
		tmpMapCountryNumeric3.put(AQ, "010");
		tmpMapCountryNumeric3.put(AG, "028");
		tmpMapCountryNumeric3.put(AR, "032");
		tmpMapCountryNumeric3.put(AM, "051");
		tmpMapCountryNumeric3.put(AW, "533");
		tmpMapCountryNumeric3.put(AU, "036");
		tmpMapCountryNumeric3.put(AT, "040");
		tmpMapCountryNumeric3.put(AZ, "031");
		tmpMapCountryNumeric3.put(BS, "044");
		tmpMapCountryNumeric3.put(BH, "048");
		tmpMapCountryNumeric3.put(BD, "050");
		tmpMapCountryNumeric3.put(BB, "052");
		tmpMapCountryNumeric3.put(BY, "112");
		tmpMapCountryNumeric3.put(BE, "056");
		tmpMapCountryNumeric3.put(BZ, "084");
		tmpMapCountryNumeric3.put(BJ, "204");
		tmpMapCountryNumeric3.put(BM, "060");
		tmpMapCountryNumeric3.put(BT, "064");
		tmpMapCountryNumeric3.put(BO, "068");
		tmpMapCountryNumeric3.put(BQ, "535");
		tmpMapCountryNumeric3.put(BA, "070");
		tmpMapCountryNumeric3.put(BW, "072");
		tmpMapCountryNumeric3.put(BV, "074");
		tmpMapCountryNumeric3.put(BR, "076");
		tmpMapCountryNumeric3.put(IO, "086");
		tmpMapCountryNumeric3.put(BN, "096");
		tmpMapCountryNumeric3.put(BG, "100");
		tmpMapCountryNumeric3.put(BF, "854");
		tmpMapCountryNumeric3.put(BI, "108");
		tmpMapCountryNumeric3.put(CV, "132");
		tmpMapCountryNumeric3.put(KH, "116");
		tmpMapCountryNumeric3.put(CM, "120");
		tmpMapCountryNumeric3.put(CA, "124");
		tmpMapCountryNumeric3.put(KY, "136");
		tmpMapCountryNumeric3.put(CF, "140");
		tmpMapCountryNumeric3.put(TD, "148");
		tmpMapCountryNumeric3.put(CL, "152");
		tmpMapCountryNumeric3.put(CN, "156");
		tmpMapCountryNumeric3.put(CX, "162");
		tmpMapCountryNumeric3.put(CC, "166");
		tmpMapCountryNumeric3.put(CO, "170");
		tmpMapCountryNumeric3.put(KM, "174");
		tmpMapCountryNumeric3.put(CD, "180");
		tmpMapCountryNumeric3.put(CG, "178");
		tmpMapCountryNumeric3.put(CK, "184");
		tmpMapCountryNumeric3.put(CR, "188");
		tmpMapCountryNumeric3.put(CI, "384");
		tmpMapCountryNumeric3.put(HR, "191");
		tmpMapCountryNumeric3.put(CU, "192");
		tmpMapCountryNumeric3.put(CW, "531");
		tmpMapCountryNumeric3.put(CY, "196");
		tmpMapCountryNumeric3.put(CZ, "203");
		tmpMapCountryNumeric3.put(DK, "208");
		tmpMapCountryNumeric3.put(DJ, "262");
		tmpMapCountryNumeric3.put(DM, "212");
		tmpMapCountryNumeric3.put(DO, "214");
		tmpMapCountryNumeric3.put(EC, "218");
		tmpMapCountryNumeric3.put(EG, "818");
		tmpMapCountryNumeric3.put(SV, "222");
		tmpMapCountryNumeric3.put(GQ, "226");
		tmpMapCountryNumeric3.put(ER, "232");
		tmpMapCountryNumeric3.put(EE, "233");
		tmpMapCountryNumeric3.put(SZ, "748");
		tmpMapCountryNumeric3.put(ET, "231");
		tmpMapCountryNumeric3.put(FK, "238");
		tmpMapCountryNumeric3.put(FO, "234");
		tmpMapCountryNumeric3.put(FJ, "242");
		tmpMapCountryNumeric3.put(FI, "246");
		tmpMapCountryNumeric3.put(FR, "250");
		tmpMapCountryNumeric3.put(GF, "254");
		tmpMapCountryNumeric3.put(PF, "258");
		tmpMapCountryNumeric3.put(TF, "260");
		tmpMapCountryNumeric3.put(GA, "266");
		tmpMapCountryNumeric3.put(GM, "270");
		tmpMapCountryNumeric3.put(GE, "268");
		tmpMapCountryNumeric3.put(DE, "276");
		tmpMapCountryNumeric3.put(GH, "288");
		tmpMapCountryNumeric3.put(GI, "292");
		tmpMapCountryNumeric3.put(GR, "300");
		tmpMapCountryNumeric3.put(GL, "304");
		tmpMapCountryNumeric3.put(GD, "308");
		tmpMapCountryNumeric3.put(GP, "312");
		tmpMapCountryNumeric3.put(GU, "316");
		tmpMapCountryNumeric3.put(GT, "320");
		tmpMapCountryNumeric3.put(GG, "831");
		tmpMapCountryNumeric3.put(GN, "324");
		tmpMapCountryNumeric3.put(GW, "624");
		tmpMapCountryNumeric3.put(GY, "328");
		tmpMapCountryNumeric3.put(HT, "332");
		tmpMapCountryNumeric3.put(HM, "334");
		tmpMapCountryNumeric3.put(VA, "336");
		tmpMapCountryNumeric3.put(HN, "340");
		tmpMapCountryNumeric3.put(HK, "344");
		tmpMapCountryNumeric3.put(HU, "348");
		tmpMapCountryNumeric3.put(IS, "352");
		tmpMapCountryNumeric3.put(IN, "356");
		tmpMapCountryNumeric3.put(ID, "360");
		tmpMapCountryNumeric3.put(IR, "364");
		tmpMapCountryNumeric3.put(IQ, "368");
		tmpMapCountryNumeric3.put(IE, "372");
		tmpMapCountryNumeric3.put(IM, "833");
		tmpMapCountryNumeric3.put(IL, "376");
		tmpMapCountryNumeric3.put(IT, "380");
		tmpMapCountryNumeric3.put(JM, "388");
		tmpMapCountryNumeric3.put(JP, "392");
		tmpMapCountryNumeric3.put(JE, "832");
		tmpMapCountryNumeric3.put(JO, "400");
		tmpMapCountryNumeric3.put(KZ, "398");
		tmpMapCountryNumeric3.put(KE, "404");
		tmpMapCountryNumeric3.put(KI, "296");
		tmpMapCountryNumeric3.put(KP, "408");
		tmpMapCountryNumeric3.put(KR, "410");
		tmpMapCountryNumeric3.put(KW, "414");
		tmpMapCountryNumeric3.put(KG, "417");
		tmpMapCountryNumeric3.put(LA, "418");
		tmpMapCountryNumeric3.put(LV, "428");
		tmpMapCountryNumeric3.put(LB, "422");
		tmpMapCountryNumeric3.put(LS, "426");
		tmpMapCountryNumeric3.put(LR, "430");
		tmpMapCountryNumeric3.put(LY, "434");
		tmpMapCountryNumeric3.put(LI, "438");
		tmpMapCountryNumeric3.put(LT, "440");
		tmpMapCountryNumeric3.put(LU, "442");
		tmpMapCountryNumeric3.put(MO, "446");
		tmpMapCountryNumeric3.put(MK, "807");
		tmpMapCountryNumeric3.put(MG, "450");
		tmpMapCountryNumeric3.put(MW, "454");
		tmpMapCountryNumeric3.put(MY, "458");
		tmpMapCountryNumeric3.put(MV, "462");
		tmpMapCountryNumeric3.put(ML, "466");
		tmpMapCountryNumeric3.put(MT, "470");
		tmpMapCountryNumeric3.put(MH, "584");
		tmpMapCountryNumeric3.put(MQ, "474");
		tmpMapCountryNumeric3.put(MR, "478");
		tmpMapCountryNumeric3.put(MU, "480");
		tmpMapCountryNumeric3.put(YT, "175");
		tmpMapCountryNumeric3.put(MX, "484");
		tmpMapCountryNumeric3.put(FM, "583");
		tmpMapCountryNumeric3.put(MD, "498");
		tmpMapCountryNumeric3.put(MC, "492");
		tmpMapCountryNumeric3.put(MN, "496");
		tmpMapCountryNumeric3.put(ME, "499");
		tmpMapCountryNumeric3.put(MS, "500");
		tmpMapCountryNumeric3.put(MA, "504");
		tmpMapCountryNumeric3.put(MZ, "508");
		tmpMapCountryNumeric3.put(MM, "104");
		tmpMapCountryNumeric3.put(NA, "516");
		tmpMapCountryNumeric3.put(NR, "520");
		tmpMapCountryNumeric3.put(NP, "524");
		tmpMapCountryNumeric3.put(NL, "528");
		tmpMapCountryNumeric3.put(NC, "540");
		tmpMapCountryNumeric3.put(NZ, "554");
		tmpMapCountryNumeric3.put(NI, "558");
		tmpMapCountryNumeric3.put(NE, "562");
		tmpMapCountryNumeric3.put(NG, "566");
		tmpMapCountryNumeric3.put(NU, "570");
		tmpMapCountryNumeric3.put(NF, "574");
		tmpMapCountryNumeric3.put(MP, "580");
		tmpMapCountryNumeric3.put(NO, "578");
		tmpMapCountryNumeric3.put(OM, "512");
		tmpMapCountryNumeric3.put(PK, "586");
		tmpMapCountryNumeric3.put(PW, "585");
		tmpMapCountryNumeric3.put(PS, "275");
		tmpMapCountryNumeric3.put(PA, "591");
		tmpMapCountryNumeric3.put(PG, "598");
		tmpMapCountryNumeric3.put(PY, "600");
		tmpMapCountryNumeric3.put(PE, "604");
		tmpMapCountryNumeric3.put(PH, "608");
		tmpMapCountryNumeric3.put(PN, "612");
		tmpMapCountryNumeric3.put(PL, "616");
		tmpMapCountryNumeric3.put(PT, "620");
		tmpMapCountryNumeric3.put(PR, "630");
		tmpMapCountryNumeric3.put(QA, "634");
		tmpMapCountryNumeric3.put(RE, "638");
		tmpMapCountryNumeric3.put(RO, "642");
		tmpMapCountryNumeric3.put(RU, "643");
		tmpMapCountryNumeric3.put(RW, "646");
		tmpMapCountryNumeric3.put(BL, "652");
		tmpMapCountryNumeric3.put(SH, "654");
		tmpMapCountryNumeric3.put(KN, "659");
		tmpMapCountryNumeric3.put(LC, "662");
		tmpMapCountryNumeric3.put(MF, "663");
		tmpMapCountryNumeric3.put(PM, "666");
		tmpMapCountryNumeric3.put(VC, "670");
		tmpMapCountryNumeric3.put(WS, "882");
		tmpMapCountryNumeric3.put(SM, "674");
		tmpMapCountryNumeric3.put(ST, "678");
		tmpMapCountryNumeric3.put(SA, "682");
		tmpMapCountryNumeric3.put(SN, "686");
		tmpMapCountryNumeric3.put(RS, "688");
		tmpMapCountryNumeric3.put(SC, "690");
		tmpMapCountryNumeric3.put(SL, "694");
		tmpMapCountryNumeric3.put(SG, "702");
		tmpMapCountryNumeric3.put(SX, "534");
		tmpMapCountryNumeric3.put(SK, "703");
		tmpMapCountryNumeric3.put(SI, "705");
		tmpMapCountryNumeric3.put(SB, "090");
		tmpMapCountryNumeric3.put(SO, "706");
		tmpMapCountryNumeric3.put(ZA, "710");
		tmpMapCountryNumeric3.put(GS, "239");
		tmpMapCountryNumeric3.put(SS, "728");
		tmpMapCountryNumeric3.put(ES, "724");
		tmpMapCountryNumeric3.put(LK, "144");
		tmpMapCountryNumeric3.put(SD, "729");
		tmpMapCountryNumeric3.put(SR, "740");
		tmpMapCountryNumeric3.put(SJ, "744");
		tmpMapCountryNumeric3.put(SE, "752");
		tmpMapCountryNumeric3.put(CH, "756");
		tmpMapCountryNumeric3.put(SY, "760");
		tmpMapCountryNumeric3.put(TW, "158");
		tmpMapCountryNumeric3.put(TJ, "762");
		tmpMapCountryNumeric3.put(TZ, "834");
		tmpMapCountryNumeric3.put(TH, "764");
		tmpMapCountryNumeric3.put(TL, "626");
		tmpMapCountryNumeric3.put(TG, "768");
		tmpMapCountryNumeric3.put(TK, "772");
		tmpMapCountryNumeric3.put(TO, "776");
		tmpMapCountryNumeric3.put(TT, "780");
		tmpMapCountryNumeric3.put(TN, "788");
		tmpMapCountryNumeric3.put(TR, "792");
		tmpMapCountryNumeric3.put(TM, "795");
		tmpMapCountryNumeric3.put(TC, "796");
		tmpMapCountryNumeric3.put(TV, "798");
		tmpMapCountryNumeric3.put(UG, "800");
		tmpMapCountryNumeric3.put(UA, "804");
		tmpMapCountryNumeric3.put(AE, "784");
		tmpMapCountryNumeric3.put(GB, "826");
		tmpMapCountryNumeric3.put(UM, "581");
		tmpMapCountryNumeric3.put(US, "840");
		tmpMapCountryNumeric3.put(UY, "858");
		tmpMapCountryNumeric3.put(UZ, "860");
		tmpMapCountryNumeric3.put(VU, "548");
		tmpMapCountryNumeric3.put(VE, "862");
		tmpMapCountryNumeric3.put(VN, "704");
		tmpMapCountryNumeric3.put(VG, "092");
		tmpMapCountryNumeric3.put(VI, "850");
		tmpMapCountryNumeric3.put(WF, "876");
		tmpMapCountryNumeric3.put(EH, "732");
		tmpMapCountryNumeric3.put(YE, "887");
		tmpMapCountryNumeric3.put(ZM, "894");
		tmpMapCountryNumeric3.put(ZW, "716");

		MAP_COUNTRY_NUMERIC_3 = Collections.unmodifiableMap(tmpMapCountryNumeric3);

		tmpMapCountryNumeric3 = null; // gc
	}

	private static final Map<CountryEnum, List<String>> MAP_CC_TLD;
	static {
		Map<CountryEnum, List<String>> tmpMapCcTld = new HashMap<CountryEnum, List<String>>(249);

		tmpMapCcTld.put(AF, List.of(".af"));
		tmpMapCcTld.put(AX, List.of(".ax"));
		tmpMapCcTld.put(AL, List.of(".al"));
		tmpMapCcTld.put(DZ, List.of(".dz"));
		tmpMapCcTld.put(AS, List.of(".as"));
		tmpMapCcTld.put(AD, List.of(".ad"));
		tmpMapCcTld.put(AO, List.of(".ao"));
		tmpMapCcTld.put(AI, List.of(".ai"));
		tmpMapCcTld.put(AQ, List.of(".aq"));
		tmpMapCcTld.put(AG, List.of(".ag"));
		tmpMapCcTld.put(AR, List.of(".ar"));
		tmpMapCcTld.put(AM, List.of(".am"));
		tmpMapCcTld.put(AW, List.of(".aw"));
		tmpMapCcTld.put(AU, List.of(".au"));
		tmpMapCcTld.put(AT, List.of(".at"));
		tmpMapCcTld.put(AZ, List.of(".az"));
		tmpMapCcTld.put(BS, List.of(".bs"));
		tmpMapCcTld.put(BH, List.of(".bh"));
		tmpMapCcTld.put(BD, List.of(".bd"));
		tmpMapCcTld.put(BB, List.of(".bb"));
		tmpMapCcTld.put(BY, List.of(".by"));
		tmpMapCcTld.put(BE, List.of(".be"));
		tmpMapCcTld.put(BZ, List.of(".bz"));
		tmpMapCcTld.put(BJ, List.of(".bj"));
		tmpMapCcTld.put(BM, List.of(".bm"));
		tmpMapCcTld.put(BT, List.of(".bt"));
		tmpMapCcTld.put(BO, List.of(".bo"));
		tmpMapCcTld.put(BQ, List.of(".bq", ".nl"));
		tmpMapCcTld.put(BA, List.of(".ba"));
		tmpMapCcTld.put(BW, List.of(".bw"));
		tmpMapCcTld.put(BR, List.of(".br"));
		tmpMapCcTld.put(IO, List.of(".io"));
		tmpMapCcTld.put(BN, List.of(".bn"));
		tmpMapCcTld.put(BG, List.of(".bg"));
		tmpMapCcTld.put(BF, List.of(".bf"));
		tmpMapCcTld.put(BI, List.of(".bi"));
		tmpMapCcTld.put(CV, List.of(".cv"));
		tmpMapCcTld.put(KH, List.of(".kh"));
		tmpMapCcTld.put(CM, List.of(".cm"));
		tmpMapCcTld.put(CA, List.of(".ca"));
		tmpMapCcTld.put(KY, List.of(".ky"));
		tmpMapCcTld.put(CF, List.of(".cf"));
		tmpMapCcTld.put(TD, List.of(".td"));
		tmpMapCcTld.put(CL, List.of(".cl"));
		tmpMapCcTld.put(CN, List.of(".cn"));
		tmpMapCcTld.put(CX, List.of(".cx"));
		tmpMapCcTld.put(CC, List.of(".cc"));
		tmpMapCcTld.put(CO, List.of(".co"));
		tmpMapCcTld.put(KM, List.of(".km"));
		tmpMapCcTld.put(CD, List.of(".cd"));
		tmpMapCcTld.put(CG, List.of(".cg"));
		tmpMapCcTld.put(CK, List.of(".ck"));
		tmpMapCcTld.put(CR, List.of(".cr"));
		tmpMapCcTld.put(CI, List.of(".ci"));
		tmpMapCcTld.put(HR, List.of(".hr"));
		tmpMapCcTld.put(CU, List.of(".cu"));
		tmpMapCcTld.put(CW, List.of(".cw"));
		tmpMapCcTld.put(CY, List.of(".cy"));
		tmpMapCcTld.put(CZ, List.of(".cz"));
		tmpMapCcTld.put(DK, List.of(".dk"));
		tmpMapCcTld.put(DJ, List.of(".dj"));
		tmpMapCcTld.put(DM, List.of(".dm"));
		tmpMapCcTld.put(DO, List.of(".do"));
		tmpMapCcTld.put(EC, List.of(".ec"));
		tmpMapCcTld.put(EG, List.of(".eg"));
		tmpMapCcTld.put(SV, List.of(".sv"));
		tmpMapCcTld.put(GQ, List.of(".gq"));
		tmpMapCcTld.put(ER, List.of(".er"));
		tmpMapCcTld.put(EE, List.of(".ee"));
		tmpMapCcTld.put(SZ, List.of(".sz"));
		tmpMapCcTld.put(ET, List.of(".et"));
		tmpMapCcTld.put(FK, List.of(".fk"));
		tmpMapCcTld.put(FO, List.of(".fo"));
		tmpMapCcTld.put(FJ, List.of(".fj"));
		tmpMapCcTld.put(FI, List.of(".fi"));
		tmpMapCcTld.put(FR, List.of(".fr"));
		tmpMapCcTld.put(GF, List.of(".gf"));
		tmpMapCcTld.put(PF, List.of(".pf"));
		tmpMapCcTld.put(TF, List.of(".tf"));
		tmpMapCcTld.put(GA, List.of(".ga"));
		tmpMapCcTld.put(GM, List.of(".gm"));
		tmpMapCcTld.put(GE, List.of(".ge"));
		tmpMapCcTld.put(DE, List.of(".de"));
		tmpMapCcTld.put(GH, List.of(".gh"));
		tmpMapCcTld.put(GI, List.of(".gi"));
		tmpMapCcTld.put(GR, List.of(".gr"));
		tmpMapCcTld.put(GL, List.of(".gl"));
		tmpMapCcTld.put(GD, List.of(".gd"));
		tmpMapCcTld.put(GP, List.of(".gp"));
		tmpMapCcTld.put(GU, List.of(".gu"));
		tmpMapCcTld.put(GT, List.of(".gt"));
		tmpMapCcTld.put(GG, List.of(".gg"));
		tmpMapCcTld.put(GN, List.of(".gn"));
		tmpMapCcTld.put(GW, List.of(".gw"));
		tmpMapCcTld.put(GY, List.of(".gy"));
		tmpMapCcTld.put(HT, List.of(".ht"));
		tmpMapCcTld.put(HM, List.of(".hm"));
		tmpMapCcTld.put(VA, List.of(".va"));
		tmpMapCcTld.put(HN, List.of(".hn"));
		tmpMapCcTld.put(HK, List.of(".hk"));
		tmpMapCcTld.put(HU, List.of(".hu"));
		tmpMapCcTld.put(IS, List.of(".is"));
		tmpMapCcTld.put(IN, List.of(".in"));
		tmpMapCcTld.put(ID, List.of(".id"));
		tmpMapCcTld.put(IR, List.of(".ir"));
		tmpMapCcTld.put(IQ, List.of(".iq"));
		tmpMapCcTld.put(IE, List.of(".ie"));
		tmpMapCcTld.put(IM, List.of(".im"));
		tmpMapCcTld.put(IL, List.of(".il"));
		tmpMapCcTld.put(IT, List.of(".it"));
		tmpMapCcTld.put(JM, List.of(".jm"));
		tmpMapCcTld.put(JP, List.of(".jp"));
		tmpMapCcTld.put(JE, List.of(".je"));
		tmpMapCcTld.put(JO, List.of(".jo"));
		tmpMapCcTld.put(KZ, List.of(".kz"));
		tmpMapCcTld.put(KE, List.of(".ke"));
		tmpMapCcTld.put(KI, List.of(".ki"));
		tmpMapCcTld.put(KP, List.of(".kp"));
		tmpMapCcTld.put(KR, List.of(".kr"));
		tmpMapCcTld.put(KW, List.of(".kw"));
		tmpMapCcTld.put(KG, List.of(".kg"));
		tmpMapCcTld.put(LA, List.of(".la"));
		tmpMapCcTld.put(LV, List.of(".lv"));
		tmpMapCcTld.put(LB, List.of(".lb"));
		tmpMapCcTld.put(LS, List.of(".ls"));
		tmpMapCcTld.put(LR, List.of(".lr"));
		tmpMapCcTld.put(LY, List.of(".ly"));
		tmpMapCcTld.put(LI, List.of(".li"));
		tmpMapCcTld.put(LT, List.of(".lt"));
		tmpMapCcTld.put(LU, List.of(".lu"));
		tmpMapCcTld.put(MO, List.of(".mo"));
		tmpMapCcTld.put(MK, List.of(".mk"));
		tmpMapCcTld.put(MG, List.of(".mg"));
		tmpMapCcTld.put(MW, List.of(".mw"));
		tmpMapCcTld.put(MY, List.of(".my"));
		tmpMapCcTld.put(MV, List.of(".mv"));
		tmpMapCcTld.put(ML, List.of(".ml"));
		tmpMapCcTld.put(MT, List.of(".mt"));
		tmpMapCcTld.put(MH, List.of(".mh"));
		tmpMapCcTld.put(MQ, List.of(".mq"));
		tmpMapCcTld.put(MR, List.of(".mr"));
		tmpMapCcTld.put(MU, List.of(".mu"));
		tmpMapCcTld.put(YT, List.of(".yt"));
		tmpMapCcTld.put(MX, List.of(".mx"));
		tmpMapCcTld.put(FM, List.of(".fm"));
		tmpMapCcTld.put(MD, List.of(".md"));
		tmpMapCcTld.put(MC, List.of(".mc"));
		tmpMapCcTld.put(MN, List.of(".mn"));
		tmpMapCcTld.put(ME, List.of(".me"));
		tmpMapCcTld.put(MS, List.of(".ms"));
		tmpMapCcTld.put(MA, List.of(".ma"));
		tmpMapCcTld.put(MZ, List.of(".mz"));
		tmpMapCcTld.put(MM, List.of(".mm"));
		tmpMapCcTld.put(NA, List.of(".na"));
		tmpMapCcTld.put(NR, List.of(".nr"));
		tmpMapCcTld.put(NP, List.of(".np"));
		tmpMapCcTld.put(NL, List.of(".nl"));
		tmpMapCcTld.put(NC, List.of(".nc"));
		tmpMapCcTld.put(NZ, List.of(".nz"));
		tmpMapCcTld.put(NI, List.of(".ni"));
		tmpMapCcTld.put(NE, List.of(".ne"));
		tmpMapCcTld.put(NG, List.of(".ng"));
		tmpMapCcTld.put(NU, List.of(".nu"));
		tmpMapCcTld.put(NF, List.of(".nf"));
		tmpMapCcTld.put(MP, List.of(".mp"));
		tmpMapCcTld.put(NO, List.of(".no"));
		tmpMapCcTld.put(OM, List.of(".om"));
		tmpMapCcTld.put(PK, List.of(".pk"));
		tmpMapCcTld.put(PW, List.of(".pw"));
		tmpMapCcTld.put(PS, List.of(".ps"));
		tmpMapCcTld.put(PA, List.of(".pa"));
		tmpMapCcTld.put(PG, List.of(".pg"));
		tmpMapCcTld.put(PY, List.of(".py"));
		tmpMapCcTld.put(PE, List.of(".pe"));
		tmpMapCcTld.put(PH, List.of(".ph"));
		tmpMapCcTld.put(PN, List.of(".pn"));
		tmpMapCcTld.put(PL, List.of(".pl"));
		tmpMapCcTld.put(PT, List.of(".pt"));
		tmpMapCcTld.put(PR, List.of(".pr"));
		tmpMapCcTld.put(QA, List.of(".qa"));
		tmpMapCcTld.put(RE, List.of(".re"));
		tmpMapCcTld.put(RO, List.of(".ro"));
		tmpMapCcTld.put(RU, List.of(".ru"));
		tmpMapCcTld.put(RW, List.of(".rw"));
		tmpMapCcTld.put(BL, List.of(".bl"));
		tmpMapCcTld.put(SH, List.of(".sh"));
		tmpMapCcTld.put(KN, List.of(".kn"));
		tmpMapCcTld.put(LC, List.of(".lc"));
		tmpMapCcTld.put(MF, List.of(".mf"));
		tmpMapCcTld.put(PM, List.of(".pm"));
		tmpMapCcTld.put(VC, List.of(".vc"));
		tmpMapCcTld.put(WS, List.of(".ws"));
		tmpMapCcTld.put(SM, List.of(".sm"));
		tmpMapCcTld.put(ST, List.of(".st"));
		tmpMapCcTld.put(SA, List.of(".sa"));
		tmpMapCcTld.put(SN, List.of(".sn"));
		tmpMapCcTld.put(RS, List.of(".rs"));
		tmpMapCcTld.put(SC, List.of(".sc"));
		tmpMapCcTld.put(SL, List.of(".sl"));
		tmpMapCcTld.put(SG, List.of(".sg"));
		tmpMapCcTld.put(SX, List.of(".sx"));
		tmpMapCcTld.put(SK, List.of(".sk"));
		tmpMapCcTld.put(SI, List.of(".si"));
		tmpMapCcTld.put(SB, List.of(".sb"));
		tmpMapCcTld.put(SO, List.of(".so"));
		tmpMapCcTld.put(ZA, List.of(".za"));
		tmpMapCcTld.put(GS, List.of(".gs"));
		tmpMapCcTld.put(SS, List.of(".ss"));
		tmpMapCcTld.put(ES, List.of(".es"));
		tmpMapCcTld.put(LK, List.of(".lk"));
		tmpMapCcTld.put(SD, List.of(".sd"));
		tmpMapCcTld.put(SR, List.of(".sr"));
		tmpMapCcTld.put(SE, List.of(".se"));
		tmpMapCcTld.put(CH, List.of(".ch"));
		tmpMapCcTld.put(SY, List.of(".sy"));
		tmpMapCcTld.put(TW, List.of(".tw"));
		tmpMapCcTld.put(TJ, List.of(".tj"));
		tmpMapCcTld.put(TZ, List.of(".tz"));
		tmpMapCcTld.put(TH, List.of(".th"));
		tmpMapCcTld.put(TL, List.of(".tl"));
		tmpMapCcTld.put(TG, List.of(".tg"));
		tmpMapCcTld.put(TK, List.of(".tk"));
		tmpMapCcTld.put(TO, List.of(".to"));
		tmpMapCcTld.put(TT, List.of(".tt"));
		tmpMapCcTld.put(TN, List.of(".tn"));
		tmpMapCcTld.put(TR, List.of(".tr"));
		tmpMapCcTld.put(TM, List.of(".tm"));
		tmpMapCcTld.put(TC, List.of(".tc"));
		tmpMapCcTld.put(TV, List.of(".tv"));
		tmpMapCcTld.put(UG, List.of(".ug"));
		tmpMapCcTld.put(UA, List.of(".ua"));
		tmpMapCcTld.put(AE, List.of(".ae"));
		tmpMapCcTld.put(GB, List.of(".gb", ".uk"));
		tmpMapCcTld.put(US, List.of(".us"));
		tmpMapCcTld.put(UY, List.of(".uy"));
		tmpMapCcTld.put(UZ, List.of(".uz"));
		tmpMapCcTld.put(VU, List.of(".vu"));
		tmpMapCcTld.put(VE, List.of(".ve"));
		tmpMapCcTld.put(VN, List.of(".vn"));
		tmpMapCcTld.put(VG, List.of(".vg"));
		tmpMapCcTld.put(VI, List.of(".vi"));
		tmpMapCcTld.put(WF, List.of(".wf"));
		tmpMapCcTld.put(YE, List.of(".ye"));
		tmpMapCcTld.put(ZM, List.of(".zm"));
		tmpMapCcTld.put(ZW, List.of(".zw"));

		MAP_CC_TLD = Collections.unmodifiableMap(tmpMapCcTld);

		tmpMapCcTld = null; // gc
	}

	private static final List<CountryEnum> LIST_EU;
	static {
		List<CountryEnum> tmpListEu = new ArrayList<CountryEnum>(27);

		tmpListEu.add(AE);
		tmpListEu.add(BE);
		tmpListEu.add(BG);
		tmpListEu.add(HR);
		tmpListEu.add(CY);
		tmpListEu.add(CZ);
		tmpListEu.add(DK);
		tmpListEu.add(EE);
		tmpListEu.add(FI);
		tmpListEu.add(FR);
		tmpListEu.add(DE);
		tmpListEu.add(GR);
		tmpListEu.add(HU);
		tmpListEu.add(IE);
		tmpListEu.add(IT);
		tmpListEu.add(LV);
		tmpListEu.add(LT);
		tmpListEu.add(LU);
		tmpListEu.add(MT);
		tmpListEu.add(NL);
		tmpListEu.add(PL);
		tmpListEu.add(PT);
		tmpListEu.add(RO);
		tmpListEu.add(SK);
		tmpListEu.add(SI);
		tmpListEu.add(ES);
		tmpListEu.add(SE);

		LIST_EU = Collections.unmodifiableList(tmpListEu);

		tmpListEu = null; // gc
	}

}