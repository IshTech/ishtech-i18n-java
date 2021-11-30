package fi.ishtech.core.i18n.enums;

import java.util.ArrayList;
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

	private final static List<String> NAMES_LIST = new ArrayList<String>(0);
	static {
		for (CountryEnum c : values()) {
			NAMES_LIST.add(c.name());
		}
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

	private static final Map<CountryEnum, String> MAP_COUNTRY_FULL_NAME = new HashMap<CountryEnum, String>();
	static {
		MAP_COUNTRY_FULL_NAME.put(AF, "Afghanistan");
		MAP_COUNTRY_FULL_NAME.put(AX, "Åland Islands");
		MAP_COUNTRY_FULL_NAME.put(AL, "Albania");
		MAP_COUNTRY_FULL_NAME.put(DZ, "Algeria");
		MAP_COUNTRY_FULL_NAME.put(AS, "American Samoa");
		MAP_COUNTRY_FULL_NAME.put(AD, "Andorra");
		MAP_COUNTRY_FULL_NAME.put(AO, "Angola");
		MAP_COUNTRY_FULL_NAME.put(AI, "Anguilla");
		MAP_COUNTRY_FULL_NAME.put(AQ, "Antarctica");
		MAP_COUNTRY_FULL_NAME.put(AG, "Antigua and Barbuda");
		MAP_COUNTRY_FULL_NAME.put(AR, "Argentina");
		MAP_COUNTRY_FULL_NAME.put(AM, "Armenia");
		MAP_COUNTRY_FULL_NAME.put(AW, "Aruba");
		MAP_COUNTRY_FULL_NAME.put(AU, "Australia");
		MAP_COUNTRY_FULL_NAME.put(AT, "Austria");
		MAP_COUNTRY_FULL_NAME.put(AZ, "Azerbaijan");
		MAP_COUNTRY_FULL_NAME.put(BS, "Bahamas");
		MAP_COUNTRY_FULL_NAME.put(BH, "Bahrain");
		MAP_COUNTRY_FULL_NAME.put(BD, "Bangladesh");
		MAP_COUNTRY_FULL_NAME.put(BB, "Barbados");
		MAP_COUNTRY_FULL_NAME.put(BY, "Belarus");
		MAP_COUNTRY_FULL_NAME.put(BE, "Belgium");
		MAP_COUNTRY_FULL_NAME.put(BZ, "Belize");
		MAP_COUNTRY_FULL_NAME.put(BJ, "Benin");
		MAP_COUNTRY_FULL_NAME.put(BM, "Bermuda");
		MAP_COUNTRY_FULL_NAME.put(BT, "Bhutan");
		MAP_COUNTRY_FULL_NAME.put(BO, "Bolivia");
		MAP_COUNTRY_FULL_NAME.put(BQ, "Bonaire, Sint Eustatius and Saba");
		MAP_COUNTRY_FULL_NAME.put(BA, "Bosnia and Herzegovina");
		MAP_COUNTRY_FULL_NAME.put(BW, "Botswana");
		MAP_COUNTRY_FULL_NAME.put(BV, "Bouvet Island");
		MAP_COUNTRY_FULL_NAME.put(BR, "Brazil");
		MAP_COUNTRY_FULL_NAME.put(IO, "British Indian Ocean Territory");
		MAP_COUNTRY_FULL_NAME.put(BN, "Brunei Darussalam");
		MAP_COUNTRY_FULL_NAME.put(BG, "Bulgaria");
		MAP_COUNTRY_FULL_NAME.put(BF, "Burkina Faso");
		MAP_COUNTRY_FULL_NAME.put(BI, "Burundi");
		MAP_COUNTRY_FULL_NAME.put(CV, "Cabo Verde");
		MAP_COUNTRY_FULL_NAME.put(KH, "Cambodia");
		MAP_COUNTRY_FULL_NAME.put(CM, "Cameroon");
		MAP_COUNTRY_FULL_NAME.put(CA, "Canada");
		MAP_COUNTRY_FULL_NAME.put(KY, "Cayman Islands");
		MAP_COUNTRY_FULL_NAME.put(CF, "Central African Republic");
		MAP_COUNTRY_FULL_NAME.put(TD, "Chad");
		MAP_COUNTRY_FULL_NAME.put(CL, "Chile");
		MAP_COUNTRY_FULL_NAME.put(CN, "China");
		MAP_COUNTRY_FULL_NAME.put(CX, "Christmas Island");
		MAP_COUNTRY_FULL_NAME.put(CC, "Cocos (Keeling) Islands");
		MAP_COUNTRY_FULL_NAME.put(CO, "Colombia");
		MAP_COUNTRY_FULL_NAME.put(KM, "Comoros");
		MAP_COUNTRY_FULL_NAME.put(CD, "Congo (The Democratic Republic of the)");
		MAP_COUNTRY_FULL_NAME.put(CG, "Congo (The Republic of the)");
		MAP_COUNTRY_FULL_NAME.put(CK, "Cook Islands");
		MAP_COUNTRY_FULL_NAME.put(CR, "Costa Rica");
		MAP_COUNTRY_FULL_NAME.put(CI, "Côte d'Ivoire (Ivory Coast)");
		MAP_COUNTRY_FULL_NAME.put(HR, "Croatia");
		MAP_COUNTRY_FULL_NAME.put(CU, "Cuba");
		MAP_COUNTRY_FULL_NAME.put(CW, "Curaçao");
		MAP_COUNTRY_FULL_NAME.put(CY, "Cyprus");
		MAP_COUNTRY_FULL_NAME.put(CZ, "Czechia");
		MAP_COUNTRY_FULL_NAME.put(DK, "Denmark");
		MAP_COUNTRY_FULL_NAME.put(DJ, "Djibouti");
		MAP_COUNTRY_FULL_NAME.put(DM, "Dominica");
		MAP_COUNTRY_FULL_NAME.put(DO, "Dominican Republic");
		MAP_COUNTRY_FULL_NAME.put(EC, "Ecuador");
		MAP_COUNTRY_FULL_NAME.put(EG, "Egypt");
		MAP_COUNTRY_FULL_NAME.put(SV, "El Salvador");
		MAP_COUNTRY_FULL_NAME.put(GQ, "Equatorial Guinea");
		MAP_COUNTRY_FULL_NAME.put(ER, "Eritrea");
		MAP_COUNTRY_FULL_NAME.put(EE, "Estonia");
		MAP_COUNTRY_FULL_NAME.put(SZ, "Eswatini");
		MAP_COUNTRY_FULL_NAME.put(ET, "Ethiopia");
		MAP_COUNTRY_FULL_NAME.put(FK, "Falkland Islands (Malvinas)");
		MAP_COUNTRY_FULL_NAME.put(FO, "Faroe Islands");
		MAP_COUNTRY_FULL_NAME.put(FJ, "Fiji");
		MAP_COUNTRY_FULL_NAME.put(FI, "Finland");
		MAP_COUNTRY_FULL_NAME.put(FR, "France");
		MAP_COUNTRY_FULL_NAME.put(GF, "French Guiana");
		MAP_COUNTRY_FULL_NAME.put(PF, "French Polynesia");
		MAP_COUNTRY_FULL_NAME.put(TF, "French Southern Territories");
		MAP_COUNTRY_FULL_NAME.put(GA, "Gabon");
		MAP_COUNTRY_FULL_NAME.put(GM, "Gambia");
		MAP_COUNTRY_FULL_NAME.put(GE, "Georgia");
		MAP_COUNTRY_FULL_NAME.put(DE, "Germany");
		MAP_COUNTRY_FULL_NAME.put(GH, "Ghana");
		MAP_COUNTRY_FULL_NAME.put(GI, "Gibraltar");
		MAP_COUNTRY_FULL_NAME.put(GR, "Greece");
		MAP_COUNTRY_FULL_NAME.put(GL, "Greenland");
		MAP_COUNTRY_FULL_NAME.put(GD, "Grenada");
		MAP_COUNTRY_FULL_NAME.put(GP, "Guadeloupe");
		MAP_COUNTRY_FULL_NAME.put(GU, "Guam");
		MAP_COUNTRY_FULL_NAME.put(GT, "Guatemala");
		MAP_COUNTRY_FULL_NAME.put(GG, "Guernsey");
		MAP_COUNTRY_FULL_NAME.put(GN, "Guinea");
		MAP_COUNTRY_FULL_NAME.put(GW, "Guinea-Bissau");
		MAP_COUNTRY_FULL_NAME.put(GY, "Guyana");
		MAP_COUNTRY_FULL_NAME.put(HT, "Haiti");
		MAP_COUNTRY_FULL_NAME.put(HM, "Heard Island and McDonald Islands");
		MAP_COUNTRY_FULL_NAME.put(VA, "Holy See (Vatican)");
		MAP_COUNTRY_FULL_NAME.put(HN, "Honduras");
		MAP_COUNTRY_FULL_NAME.put(HK, "Hong Kong");
		MAP_COUNTRY_FULL_NAME.put(HU, "Hungary");
		MAP_COUNTRY_FULL_NAME.put(IS, "Iceland");
		MAP_COUNTRY_FULL_NAME.put(IN, "India");
		MAP_COUNTRY_FULL_NAME.put(ID, "Indonesia");
		MAP_COUNTRY_FULL_NAME.put(IR, "Iran");
		MAP_COUNTRY_FULL_NAME.put(IQ, "Iraq");
		MAP_COUNTRY_FULL_NAME.put(IE, "Ireland");
		MAP_COUNTRY_FULL_NAME.put(IM, "Isle of Man");
		MAP_COUNTRY_FULL_NAME.put(IL, "Israel");
		MAP_COUNTRY_FULL_NAME.put(IT, "Italy");
		MAP_COUNTRY_FULL_NAME.put(JM, "Jamaica");
		MAP_COUNTRY_FULL_NAME.put(JP, "Japan");
		MAP_COUNTRY_FULL_NAME.put(JE, "Jersey");
		MAP_COUNTRY_FULL_NAME.put(JO, "Jordan");
		MAP_COUNTRY_FULL_NAME.put(KZ, "Kazakhstan");
		MAP_COUNTRY_FULL_NAME.put(KE, "Kenya");
		MAP_COUNTRY_FULL_NAME.put(KI, "Kiribati");
		MAP_COUNTRY_FULL_NAME.put(KP, "North Korea");
		MAP_COUNTRY_FULL_NAME.put(KR, "South Korea");
		MAP_COUNTRY_FULL_NAME.put(KW, "Kuwait");
		MAP_COUNTRY_FULL_NAME.put(KG, "Kyrgyzstan");
		MAP_COUNTRY_FULL_NAME.put(LA, "Lao");
		MAP_COUNTRY_FULL_NAME.put(LV, "Latvia");
		MAP_COUNTRY_FULL_NAME.put(LB, "Lebanon");
		MAP_COUNTRY_FULL_NAME.put(LS, "Lesotho");
		MAP_COUNTRY_FULL_NAME.put(LR, "Liberia");
		MAP_COUNTRY_FULL_NAME.put(LY, "Libya");
		MAP_COUNTRY_FULL_NAME.put(LI, "Liechtenstein");
		MAP_COUNTRY_FULL_NAME.put(LT, "Lithuania");
		MAP_COUNTRY_FULL_NAME.put(LU, "Luxembourg");
		MAP_COUNTRY_FULL_NAME.put(MO, "Macao");
		MAP_COUNTRY_FULL_NAME.put(MK, "North Macedonia");
		MAP_COUNTRY_FULL_NAME.put(MG, "Madagascar");
		MAP_COUNTRY_FULL_NAME.put(MW, "Malawi");
		MAP_COUNTRY_FULL_NAME.put(MY, "Malaysia");
		MAP_COUNTRY_FULL_NAME.put(MV, "Maldives");
		MAP_COUNTRY_FULL_NAME.put(ML, "Mali");
		MAP_COUNTRY_FULL_NAME.put(MT, "Malta");
		MAP_COUNTRY_FULL_NAME.put(MH, "Marshall Islands");
		MAP_COUNTRY_FULL_NAME.put(MQ, "Martinique");
		MAP_COUNTRY_FULL_NAME.put(MR, "Mauritania");
		MAP_COUNTRY_FULL_NAME.put(MU, "Mauritius");
		MAP_COUNTRY_FULL_NAME.put(YT, "Mayotte");
		MAP_COUNTRY_FULL_NAME.put(MX, "Mexico");
		MAP_COUNTRY_FULL_NAME.put(FM, "Micronesia");
		MAP_COUNTRY_FULL_NAME.put(MD, "Moldova");
		MAP_COUNTRY_FULL_NAME.put(MC, "Monaco");
		MAP_COUNTRY_FULL_NAME.put(MN, "Mongolia");
		MAP_COUNTRY_FULL_NAME.put(ME, "Montenegro");
		MAP_COUNTRY_FULL_NAME.put(MS, "Montserrat");
		MAP_COUNTRY_FULL_NAME.put(MA, "Morocco");
		MAP_COUNTRY_FULL_NAME.put(MZ, "Mozambique");
		MAP_COUNTRY_FULL_NAME.put(MM, "Myanmar");
		MAP_COUNTRY_FULL_NAME.put(NA, "Namibia");
		MAP_COUNTRY_FULL_NAME.put(NR, "Nauru");
		MAP_COUNTRY_FULL_NAME.put(NP, "Nepal");
		MAP_COUNTRY_FULL_NAME.put(NL, "Netherlands");
		MAP_COUNTRY_FULL_NAME.put(NC, "New Caledonia");
		MAP_COUNTRY_FULL_NAME.put(NZ, "New Zealand");
		MAP_COUNTRY_FULL_NAME.put(NI, "Nicaragua");
		MAP_COUNTRY_FULL_NAME.put(NE, "Niger");
		MAP_COUNTRY_FULL_NAME.put(NG, "Nigeria");
		MAP_COUNTRY_FULL_NAME.put(NU, "Niue");
		MAP_COUNTRY_FULL_NAME.put(NF, "Norfolk Island");
		MAP_COUNTRY_FULL_NAME.put(MP, "Northern Mariana Islands");
		MAP_COUNTRY_FULL_NAME.put(NO, "Norway");
		MAP_COUNTRY_FULL_NAME.put(OM, "Oman");
		MAP_COUNTRY_FULL_NAME.put(PK, "Pakistan");
		MAP_COUNTRY_FULL_NAME.put(PW, "Palau");
		MAP_COUNTRY_FULL_NAME.put(PS, "Palestine");
		MAP_COUNTRY_FULL_NAME.put(PA, "Panama");
		MAP_COUNTRY_FULL_NAME.put(PG, "Papua New Guinea");
		MAP_COUNTRY_FULL_NAME.put(PY, "Paraguay");
		MAP_COUNTRY_FULL_NAME.put(PE, "Peru");
		MAP_COUNTRY_FULL_NAME.put(PH, "Philippines");
		MAP_COUNTRY_FULL_NAME.put(PN, "Pitcairn");
		MAP_COUNTRY_FULL_NAME.put(PL, "Poland");
		MAP_COUNTRY_FULL_NAME.put(PT, "Portugal");
		MAP_COUNTRY_FULL_NAME.put(PR, "Puerto Rico");
		MAP_COUNTRY_FULL_NAME.put(QA, "Qatar");
		MAP_COUNTRY_FULL_NAME.put(RE, "Réunion");
		MAP_COUNTRY_FULL_NAME.put(RO, "Romania");
		MAP_COUNTRY_FULL_NAME.put(RU, "Russia");
		MAP_COUNTRY_FULL_NAME.put(RW, "Rwanda");
		MAP_COUNTRY_FULL_NAME.put(BL, "Saint Barthélemy");
		MAP_COUNTRY_FULL_NAME.put(SH, "Saint Helena, Ascension and Tristan da Cunha");
		MAP_COUNTRY_FULL_NAME.put(KN, "Saint Kitts and Nevis");
		MAP_COUNTRY_FULL_NAME.put(LC, "Saint Lucia");
		MAP_COUNTRY_FULL_NAME.put(MF, "Saint Martin (French part)");
		MAP_COUNTRY_FULL_NAME.put(PM, "Saint Pierre and Miquelon");
		MAP_COUNTRY_FULL_NAME.put(VC, "Saint Vincent and the Grenadines");
		MAP_COUNTRY_FULL_NAME.put(WS, "Samoa");
		MAP_COUNTRY_FULL_NAME.put(SM, "San Marino");
		MAP_COUNTRY_FULL_NAME.put(ST, "Sao Tome and Principe");
		MAP_COUNTRY_FULL_NAME.put(SA, "Saudi Arabia");
		MAP_COUNTRY_FULL_NAME.put(SN, "Senegal");
		MAP_COUNTRY_FULL_NAME.put(RS, "Serbia");
		MAP_COUNTRY_FULL_NAME.put(SC, "Seychelles");
		MAP_COUNTRY_FULL_NAME.put(SL, "Sierra Leone");
		MAP_COUNTRY_FULL_NAME.put(SG, "Singapore");
		MAP_COUNTRY_FULL_NAME.put(SX, "Sint Maarten (Dutch part)");
		MAP_COUNTRY_FULL_NAME.put(SK, "Slovakia");
		MAP_COUNTRY_FULL_NAME.put(SI, "Slovenia");
		MAP_COUNTRY_FULL_NAME.put(SB, "Solomon Islands");
		MAP_COUNTRY_FULL_NAME.put(SO, "Somalia");
		MAP_COUNTRY_FULL_NAME.put(ZA, "South Africa");
		MAP_COUNTRY_FULL_NAME.put(GS, "South Georgia and the South Sandwich Islands");
		MAP_COUNTRY_FULL_NAME.put(SS, "South Sudan");
		MAP_COUNTRY_FULL_NAME.put(ES, "Spain");
		MAP_COUNTRY_FULL_NAME.put(LK, "Sri Lanka");
		MAP_COUNTRY_FULL_NAME.put(SD, "Sudan");
		MAP_COUNTRY_FULL_NAME.put(SR, "Suriname");
		MAP_COUNTRY_FULL_NAME.put(SJ, "Svalbard and Jan Mayen");
		MAP_COUNTRY_FULL_NAME.put(SE, "Sweden");
		MAP_COUNTRY_FULL_NAME.put(CH, "Switzerland");
		MAP_COUNTRY_FULL_NAME.put(SY, "Syria");
		MAP_COUNTRY_FULL_NAME.put(TW, "Taiwan");
		MAP_COUNTRY_FULL_NAME.put(TJ, "Tajikistan");
		MAP_COUNTRY_FULL_NAME.put(TZ, "Tanzania");
		MAP_COUNTRY_FULL_NAME.put(TH, "Thailand");
		MAP_COUNTRY_FULL_NAME.put(TL, "Timor-Leste");
		MAP_COUNTRY_FULL_NAME.put(TG, "Togo");
		MAP_COUNTRY_FULL_NAME.put(TK, "Tokelau");
		MAP_COUNTRY_FULL_NAME.put(TO, "Tonga");
		MAP_COUNTRY_FULL_NAME.put(TT, "Trinidad and Tobago");
		MAP_COUNTRY_FULL_NAME.put(TN, "Tunisia");
		MAP_COUNTRY_FULL_NAME.put(TR, "Turkey");
		MAP_COUNTRY_FULL_NAME.put(TM, "Turkmenistan");
		MAP_COUNTRY_FULL_NAME.put(TC, "Turks and Caicos Islands");
		MAP_COUNTRY_FULL_NAME.put(TV, "Tuvalu");
		MAP_COUNTRY_FULL_NAME.put(UG, "Uganda");
		MAP_COUNTRY_FULL_NAME.put(UA, "Ukraine");
		MAP_COUNTRY_FULL_NAME.put(AE, "United Arab Emirates");
		MAP_COUNTRY_FULL_NAME.put(GB, "United Kingdom of Great Britain and Northern Ireland");
		MAP_COUNTRY_FULL_NAME.put(UM, "United States Minor Outlying Islands");
		MAP_COUNTRY_FULL_NAME.put(US, "United States of America");
		MAP_COUNTRY_FULL_NAME.put(UY, "Uruguay");
		MAP_COUNTRY_FULL_NAME.put(UZ, "Uzbekistan");
		MAP_COUNTRY_FULL_NAME.put(VU, "Vanuatu");
		MAP_COUNTRY_FULL_NAME.put(VE, "Venezuela");
		MAP_COUNTRY_FULL_NAME.put(VN, "Viet Nam");
		MAP_COUNTRY_FULL_NAME.put(VG, "Virgin Islands (British)");
		MAP_COUNTRY_FULL_NAME.put(VI, "Virgin Islands (U.S.)");
		MAP_COUNTRY_FULL_NAME.put(WF, "Wallis and Futuna");
		MAP_COUNTRY_FULL_NAME.put(EH, "Western Sahara");
		MAP_COUNTRY_FULL_NAME.put(YE, "Yemen");
		MAP_COUNTRY_FULL_NAME.put(ZM, "Zambia");
		MAP_COUNTRY_FULL_NAME.put(ZW, "Zimbabwe");
	}

	private static final Map<CountryEnum, String> MAP_COUNTRY_OFFICIAL_NAME;
	// @formatter:off
	static {
		MAP_COUNTRY_OFFICIAL_NAME = Map.ofEntries(
				Map.entry(AF, "The Islamic Republic of Afghanistan"),
				Map.entry(AX, "Åland"),
				Map.entry(AL, "The Republic of Albania"),
				Map.entry(DZ, "The People's Democratic Republic of Algeria"),
				Map.entry(AS, "The Territory of American Samoa"),
				Map.entry(AD, "The Principality of Andorra"),
				Map.entry(AO, "The Republic of Angola"),
				Map.entry(AI, "Anguilla"),
				Map.entry(AQ, "All land and ice shelves south of the 60th parallel south"),
				Map.entry(AG, "Antigua and Barbuda"),
				Map.entry(AR, "The Argentine Republic"),
				Map.entry(AM, "The Republic of Armenia"),
				Map.entry(AW, "Aruba"),
				Map.entry(AU, "The Commonwealth of Australia"),
				Map.entry(AT, "The Republic of Austria"),
				Map.entry(AZ, "The Republic of Azerbaijan"),
				Map.entry(BS, "The Commonwealth of The Bahamas"),
				Map.entry(BH, "The Kingdom of Bahrain"),
				Map.entry(BD, "The People's Republic of Bangladesh"),
				Map.entry(BB, "Barbados"),
				Map.entry(BY, "The Republic of Belarus"),
				Map.entry(BE, "The Kingdom of Belgium"),
				Map.entry(BZ, "Belize"),
				Map.entry(BJ, "The Republic of Benin"),
				Map.entry(BM, "Bermuda"),
				Map.entry(BT, "The Kingdom of Bhutan"),
				Map.entry(BO, "The Plurinational State of Bolivia"),
				Map.entry(BQ, "Bonaire, Sint Eustatius and Saba"),
				Map.entry(BA, "Bosnia and Herzegovina"),
				Map.entry(BW, "The Republic of Botswana"),
				Map.entry(BV, "Bouvet Island"),
				Map.entry(BR, "The Federative Republic of Brazil"),
				Map.entry(IO, "The British Indian Ocean Territory"),
				Map.entry(BN, "The Nation of Brunei, the Abode of Peace"),
				Map.entry(BG, "The Republic of Bulgaria"),
				Map.entry(BF, "Burkina Faso"),
				Map.entry(BI, "The Republic of Burundi"),
				Map.entry(CV, "The Republic of Cabo Verde"),
				Map.entry(KH, "The Kingdom of Cambodia"),
				Map.entry(CM, "The Republic of Cameroon"),
				Map.entry(CA, "Canada"),
				Map.entry(KY, "The Cayman Islands"),
				Map.entry(CF, "The Central African Republic"),
				Map.entry(TD, "The Republic of Chad"),
				Map.entry(CL, "The Republic of Chile"),
				Map.entry(CN, "The People's Republic of China"),
				Map.entry(CX, "The Territory of Christmas Island"),
				Map.entry(CC, "The Territory of Cocos (Keeling) Islands"),
				Map.entry(CO, "The Republic of Colombia"),
				Map.entry(KM, "The Union of the Comoros"),
				Map.entry(CD, "The Democratic Republic of the Congo"),
				Map.entry(CG, "The Republic of the Congo"),
				Map.entry(CK, "The Cook Islands"),
				Map.entry(CR, "The Republic of Costa Rica"),
				Map.entry(CI, "The Republic of Côte d'Ivoire"),
				Map.entry(HR, "The Republic of Croatia"),
				Map.entry(CU, "The Republic of Cuba"),
				Map.entry(CW, "The Country of Curaçao"),
				Map.entry(CY, "The Republic of Cyprus"),
				Map.entry(CZ, "The Czech Republic"),
				Map.entry(DK, "The Kingdom of Denmark"),
				Map.entry(DJ, "The Republic of Djibouti"),
				Map.entry(DM, "The Commonwealth of Dominica"),
				Map.entry(DO, "The Dominican Republic"),
				Map.entry(EC, "The Republic of Ecuador"),
				Map.entry(EG, "The Arab Republic of Egypt"),
				Map.entry(SV, "The Republic of El Salvador"),
				Map.entry(GQ, "The Republic of Equatorial Guinea"),
				Map.entry(ER, "The State of Eritrea"),
				Map.entry(EE, "The Republic of Estonia"),
				Map.entry(SZ, "The Kingdom of Eswatini"),
				Map.entry(ET, "The Federal Democratic Republic of Ethiopia"),
				Map.entry(FK, "The Falkland Islands"),
				Map.entry(FO, "The Faroe Islands"),
				Map.entry(FJ, "The Republic of Fiji"),
				Map.entry(FI, "The Republic of Finland"),
				Map.entry(FR, "The French Republic"),
				Map.entry(GF, "Guyane"),
				Map.entry(PF, "French Polynesia"),
				Map.entry(TF, "The French Southern and Antarctic Lands"),
				Map.entry(GA, "The Gabonese Republic"),
				Map.entry(GM, "The Republic of The Gambia"),
				Map.entry(GE, "Georgia"),
				Map.entry(DE, "The Federal Republic of Germany"),
				Map.entry(GH, "The Republic of Ghana"),
				Map.entry(GI, "Gibraltar"),
				Map.entry(GR, "The Hellenic Republic"),
				Map.entry(GL, "Kalaallit Nunaat"),
				Map.entry(GD, "Grenada"),
				Map.entry(GP, "Guadeloupe"),
				Map.entry(GU, "The Territory of Guam"),
				Map.entry(GT, "The Republic of Guatemala"),
				Map.entry(GG, "The Bailiwick of Guernsey"),
				Map.entry(GN, "The Republic of Guinea"),
				Map.entry(GW, "The Republic of Guinea-Bissau"),
				Map.entry(GY, "The Co-operative Republic of Guyana"),
				Map.entry(HT, "The Republic of Haiti"),
				Map.entry(HM, "The Territory of Heard Island and McDonald Islands"),
				Map.entry(VA, "The Holy See"),
				Map.entry(HN, "The Republic of Honduras"),
				Map.entry(HK, "The Hong Kong Special Administrative Region of China[10]"),
				Map.entry(HU, "Hungary"),
				Map.entry(IS, "Iceland"),
				Map.entry(IN, "The Republic of India"),
				Map.entry(ID, "The Republic of Indonesia"),
				Map.entry(IR, "The Islamic Republic of Iran"),
				Map.entry(IQ, "The Republic of Iraq"),
				Map.entry(IE, "Ireland"),
				Map.entry(IM, "The Isle of Man"),
				Map.entry(IL, "The State of Israel"),
				Map.entry(IT, "The Italian Republic"),
				Map.entry(JM, "Jamaica"),
				Map.entry(JP, "Japan"),
				Map.entry(JE, "The Bailiwick of Jersey"),
				Map.entry(JO, "The Hashemite Kingdom of Jordan"),
				Map.entry(KZ, "The Republic of Kazakhstan"),
				Map.entry(KE, "The Republic of Kenya"),
				Map.entry(KI, "The Republic of Kiribati"),
				Map.entry(KP, "The Democratic People's Republic of Korea"),
				Map.entry(KR, "The Republic of Korea"),
				Map.entry(KW, "The State of Kuwait"),
				Map.entry(KG, "The Kyrgyz Republic"),
				Map.entry(LA, "The Lao People's Democratic Republic"),
				Map.entry(LV, "The Republic of Latvia"),
				Map.entry(LB, "The Lebanese Republic"),
				Map.entry(LS, "The Kingdom of Lesotho"),
				Map.entry(LR, "The Republic of Liberia"),
				Map.entry(LY, "The State of Libya"),
				Map.entry(LI, "The Principality of Liechtenstein"),
				Map.entry(LT, "The Republic of Lithuania"),
				Map.entry(LU, "The Grand Duchy of Luxembourg"),
				Map.entry(MO, "The Macao Special Administrative Region of China[11]"),
				Map.entry(MK, "The Republic of North Macedonia[12]"),
				Map.entry(MG, "The Republic of Madagascar"),
				Map.entry(MW, "The Republic of Malawi"),
				Map.entry(MY, "Malaysia"),
				Map.entry(MV, "The Republic of Maldives"),
				Map.entry(ML, "The Republic of Mali"),
				Map.entry(MT, "The Republic of Malta"),
				Map.entry(MH, "The Republic of the Marshall Islands"),
				Map.entry(MQ, "Martinique"),
				Map.entry(MR, "The Islamic Republic of Mauritania"),
				Map.entry(MU, "The Republic of Mauritius"),
				Map.entry(YT, "The Department of Mayotte"),
				Map.entry(MX, "The United Mexican States"),
				Map.entry(FM, "The Federated States of Micronesia"),
				Map.entry(MD, "The Republic of Moldova"),
				Map.entry(MC, "The Principality of Monaco"),
				Map.entry(MN, "Mongolia"),
				Map.entry(ME, "Montenegro"),
				Map.entry(MS, "Montserrat"),
				Map.entry(MA, "The Kingdom of Morocco"),
				Map.entry(MZ, "The Republic of Mozambique"),
				Map.entry(MM, "The Republic of the Union of Myanmar"),
				Map.entry(NA, "The Republic of Namibia"),
				Map.entry(NR, "The Republic of Nauru"),
				Map.entry(NP, "The Federal Democratic Republic of Nepal"),
				Map.entry(NL, "The Kingdom of the Netherlands"),
				Map.entry(NC, "New Caledonia"),
				Map.entry(NZ, "New Zealand"),
				Map.entry(NI, "The Republic of Nicaragua"),
				Map.entry(NE, "The Republic of the Niger"),
				Map.entry(NG, "The Federal Republic of Nigeria"),
				Map.entry(NU, "Niue"),
				Map.entry(NF, "The Territory of Norfolk Island"),
				Map.entry(MP, "The Commonwealth of the Northern Mariana Islands"),
				Map.entry(NO, "The Kingdom of Norway"),
				Map.entry(OM, "The Sultanate of Oman"),
				Map.entry(PK, "The Islamic Republic of Pakistan"),
				Map.entry(PW, "The Republic of Palau"),
				Map.entry(PS, "The State of Palestine"),
				Map.entry(PA, "The Republic of Panamá"),
				Map.entry(PG, "The Independent State of Papua New Guinea"),
				Map.entry(PY, "The Republic of Paraguay"),
				Map.entry(PE, "The Republic of Perú"),
				Map.entry(PH, "The Republic of the Philippines"),
				Map.entry(PN, "The Pitcairn, Henderson, Ducie and Oeno Islands"),
				Map.entry(PL, "The Republic of Poland"),
				Map.entry(PT, "The Portuguese Republic"),
				Map.entry(PR, "The Commonwealth of Puerto Rico"),
				Map.entry(QA, "The State of Qatar"),
				Map.entry(RE, "Réunion"),
				Map.entry(RO, "Romania"),
				Map.entry(RU, "The Russian Federation"),
				Map.entry(RW, "The Republic of Rwanda"),
				Map.entry(BL, "The Collectivity of Saint-Barthélemy"),
				Map.entry(SH, "Saint Helena, Ascension and Tristan da Cunha"),
				Map.entry(KN, "Saint Kitts and Nevis"),
				Map.entry(LC, "Saint Lucia"),
				Map.entry(MF, "The Collectivity of Saint-Martin"),
				Map.entry(PM, "The Overseas Collectivity of Saint-Pierre and Miquelon"),
				Map.entry(VC, "Saint Vincent and the Grenadines"),
				Map.entry(WS, "The Independent State of Samoa"),
				Map.entry(SM, "The Republic of San Marino"),
				Map.entry(ST, "The Democratic Republic of São Tomé and Príncipe"),
				Map.entry(SA, "The Kingdom of Saudi Arabia"),
				Map.entry(SN, "The Republic of Senegal"),
				Map.entry(RS, "The Republic of Serbia"),
				Map.entry(SC, "The Republic of Seychelles"),
				Map.entry(SL, "The Republic of Sierra Leone"),
				Map.entry(SG, "The Republic of Singapore"),
				Map.entry(SX, "Sint Maarten"),
				Map.entry(SK, "The Slovak Republic"),
				Map.entry(SI, "The Republic of Slovenia"),
				Map.entry(SB, "The Solomon Islands"),
				Map.entry(SO, "The Federal Republic of Somalia"),
				Map.entry(ZA, "The Republic of South Africa"),
				Map.entry(GS, "South Georgia and the South Sandwich Islands"),
				Map.entry(SS, "The Republic of South Sudan"),
				Map.entry(ES, "The Kingdom of Spain"),
				Map.entry(LK, "The Democratic Socialist Republic of Sri Lanka"),
				Map.entry(SD, "The Republic of the Sudan"),
				Map.entry(SR, "The Republic of Suriname"),
				Map.entry(SJ, "Svalbard and Jan Mayen"),
				Map.entry(SE, "The Kingdom of Sweden"),
				Map.entry(CH, "The Swiss Confederation"),
				Map.entry(SY, "The Syrian Arab Republic"),
				Map.entry(TW, "The Republic of China"),
				Map.entry(TJ, "The Republic of Tajikistan"),
				Map.entry(TZ, "The United Republic of Tanzania"),
				Map.entry(TH, "The Kingdom of Thailand"),
				Map.entry(TL, "The Democratic Republic of Timor-Leste"),
				Map.entry(TG, "The Togolese Republic"),
				Map.entry(TK, "Tokelau"),
				Map.entry(TO, "The Kingdom of Tonga"),
				Map.entry(TT, "The Republic of Trinidad and Tobago"),
				Map.entry(TN, "The Republic of Tunisia"),
				Map.entry(TR, "The Republic of Turkey"),
				Map.entry(TM, "Turkmenistan"),
				Map.entry(TC, "The Turks and Caicos Islands"),
				Map.entry(TV, "Tuvalu"),
				Map.entry(UG, "The Republic of Uganda"),
				Map.entry(UA, "Ukraine"),
				Map.entry(AE, "The United Arab Emirates"),
				Map.entry(GB, "The United Kingdom of Great Britain and Northern Ireland"),
				Map.entry(UM, "Baker Island, Howland Island, Jarvis Island, Johnston Atoll, Kingman Reef, Midway Atoll, Navassa Island, Palmyra Atoll, and Wake Island"),
				Map.entry(US, "The United States of America"),
				Map.entry(UY, "The Oriental Republic of Uruguay"),
				Map.entry(UZ, "The Republic of Uzbekistan"),
				Map.entry(VU, "The Republic of Vanuatu"),
				Map.entry(VE, "The Bolivarian Republic of Venezuela"),
				Map.entry(VN, "The Socialist Republic of Viet Nam"),
				Map.entry(VG, "The Virgin Islands"),
				Map.entry(VI, "The Virgin Islands of the United States"),
				Map.entry(WF, "The Territory of the Wallis and Futuna Islands"),
				Map.entry(EH, "The Sahrawi Arab Democratic Republic"),
				Map.entry(YE, "The Republic of Yemen"),
				Map.entry(ZM, "The Republic of Zambia"),
				Map.entry(ZW, "The Republic of Zimbabwe")
			);
	}
	// @formatter:on

	private static final Map<CountryEnum, String> MAP_COUNTRY_ALPHA_3;
	// @formatter:off
	static {
		MAP_COUNTRY_ALPHA_3 = Map.ofEntries(
				Map.entry(AF, "AFG"),
				Map.entry(AX, "ALA"),
				Map.entry(AL, "ALB"),
				Map.entry(DZ, "DZA"),
				Map.entry(AS, "ASM"),
				Map.entry(AD, "AND"),
				Map.entry(AO, "AGO"),
				Map.entry(AI, "AIA"),
				Map.entry(AQ, "ATA"),
				Map.entry(AG, "ATG"),
				Map.entry(AR, "ARG"),
				Map.entry(AM, "ARM"),
				Map.entry(AW, "ABW"),
				Map.entry(AU, "AUS"),
				Map.entry(AT, "AUT"),
				Map.entry(AZ, "AZE"),
				Map.entry(BS, "BHS"),
				Map.entry(BH, "BHR"),
				Map.entry(BD, "BGD"),
				Map.entry(BB, "BRB"),
				Map.entry(BY, "BLR"),
				Map.entry(BE, "BEL"),
				Map.entry(BZ, "BLZ"),
				Map.entry(BJ, "BEN"),
				Map.entry(BM, "BMU"),
				Map.entry(BT, "BTN"),
				Map.entry(BO, "BOL"),
				Map.entry(BQ, "BES"),
				Map.entry(BA, "BIH"),
				Map.entry(BW, "BWA"),
				Map.entry(BV, "BVT"),
				Map.entry(BR, "BRA"),
				Map.entry(IO, "IOT"),
				Map.entry(BN, "BRN"),
				Map.entry(BG, "BGR"),
				Map.entry(BF, "BFA"),
				Map.entry(BI, "BDI"),
				Map.entry(CV, "CPV"),
				Map.entry(KH, "KHM"),
				Map.entry(CM, "CMR"),
				Map.entry(CA, "CAN"),
				Map.entry(KY, "CYM"),
				Map.entry(CF, "CAF"),
				Map.entry(TD, "TCD"),
				Map.entry(CL, "CHL"),
				Map.entry(CN, "CHN"),
				Map.entry(CX, "CXR"),
				Map.entry(CC, "CCK"),
				Map.entry(CO, "COL"),
				Map.entry(KM, "COM"),
				Map.entry(CD, "COD"),
				Map.entry(CG, "COG"),
				Map.entry(CK, "COK"),
				Map.entry(CR, "CRI"),
				Map.entry(CI, "CIV"),
				Map.entry(HR, "HRV"),
				Map.entry(CU, "CUB"),
				Map.entry(CW, "CUW"),
				Map.entry(CY, "CYP"),
				Map.entry(CZ, "CZE"),
				Map.entry(DK, "DNK"),
				Map.entry(DJ, "DJI"),
				Map.entry(DM, "DMA"),
				Map.entry(DO, "DOM"),
				Map.entry(EC, "ECU"),
				Map.entry(EG, "EGY"),
				Map.entry(SV, "SLV"),
				Map.entry(GQ, "GNQ"),
				Map.entry(ER, "ERI"),
				Map.entry(EE, "EST"),
				Map.entry(SZ, "SWZ"),
				Map.entry(ET, "ETH"),
				Map.entry(FK, "FLK"),
				Map.entry(FO, "FRO"),
				Map.entry(FJ, "FJI"),
				Map.entry(FI, "FIN"),
				Map.entry(FR, "FRA"),
				Map.entry(GF, "GUF"),
				Map.entry(PF, "PYF"),
				Map.entry(TF, "ATF"),
				Map.entry(GA, "GAB"),
				Map.entry(GM, "GMB"),
				Map.entry(GE, "GEO"),
				Map.entry(DE, "DEU"),
				Map.entry(GH, "GHA"),
				Map.entry(GI, "GIB"),
				Map.entry(GR, "GRC"),
				Map.entry(GL, "GRL"),
				Map.entry(GD, "GRD"),
				Map.entry(GP, "GLP"),
				Map.entry(GU, "GUM"),
				Map.entry(GT, "GTM"),
				Map.entry(GG, "GGY"),
				Map.entry(GN, "GIN"),
				Map.entry(GW, "GNB"),
				Map.entry(GY, "GUY"),
				Map.entry(HT, "HTI"),
				Map.entry(HM, "HMD"),
				Map.entry(VA, "VAT"),
				Map.entry(HN, "HND"),
				Map.entry(HK, "HKG"),
				Map.entry(HU, "HUN"),
				Map.entry(IS, "ISL"),
				Map.entry(IN, "IND"),
				Map.entry(ID, "IDN"),
				Map.entry(IR, "IRN"),
				Map.entry(IQ, "IRQ"),
				Map.entry(IE, "IRL"),
				Map.entry(IM, "IMN"),
				Map.entry(IL, "ISR"),
				Map.entry(IT, "ITA"),
				Map.entry(JM, "JAM"),
				Map.entry(JP, "JPN"),
				Map.entry(JE, "JEY"),
				Map.entry(JO, "JOR"),
				Map.entry(KZ, "KAZ"),
				Map.entry(KE, "KEN"),
				Map.entry(KI, "KIR"),
				Map.entry(KP, "PRK"),
				Map.entry(KR, "KOR"),
				Map.entry(KW, "KWT"),
				Map.entry(KG, "KGZ"),
				Map.entry(LA, "LAO"),
				Map.entry(LV, "LVA"),
				Map.entry(LB, "LBN"),
				Map.entry(LS, "LSO"),
				Map.entry(LR, "LBR"),
				Map.entry(LY, "LBY"),
				Map.entry(LI, "LIE"),
				Map.entry(LT, "LTU"),
				Map.entry(LU, "LUX"),
				Map.entry(MO, "MAC"),
				Map.entry(MK, "MKD"),
				Map.entry(MG, "MDG"),
				Map.entry(MW, "MWI"),
				Map.entry(MY, "MYS"),
				Map.entry(MV, "MDV"),
				Map.entry(ML, "MLI"),
				Map.entry(MT, "MLT"),
				Map.entry(MH, "MHL"),
				Map.entry(MQ, "MTQ"),
				Map.entry(MR, "MRT"),
				Map.entry(MU, "MUS"),
				Map.entry(YT, "MYT"),
				Map.entry(MX, "MEX"),
				Map.entry(FM, "FSM"),
				Map.entry(MD, "MDA"),
				Map.entry(MC, "MCO"),
				Map.entry(MN, "MNG"),
				Map.entry(ME, "MNE"),
				Map.entry(MS, "MSR"),
				Map.entry(MA, "MAR"),
				Map.entry(MZ, "MOZ"),
				Map.entry(MM, "MMR"),
				Map.entry(NA, "NAM"),
				Map.entry(NR, "NRU"),
				Map.entry(NP, "NPL"),
				Map.entry(NL, "NLD"),
				Map.entry(NC, "NCL"),
				Map.entry(NZ, "NZL"),
				Map.entry(NI, "NIC"),
				Map.entry(NE, "NER"),
				Map.entry(NG, "NGA"),
				Map.entry(NU, "NIU"),
				Map.entry(NF, "NFK"),
				Map.entry(MP, "MNP"),
				Map.entry(NO, "NOR"),
				Map.entry(OM, "OMN"),
				Map.entry(PK, "PAK"),
				Map.entry(PW, "PLW"),
				Map.entry(PS, "PSE"),
				Map.entry(PA, "PAN"),
				Map.entry(PG, "PNG"),
				Map.entry(PY, "PRY"),
				Map.entry(PE, "PER"),
				Map.entry(PH, "PHL"),
				Map.entry(PN, "PCN"),
				Map.entry(PL, "POL"),
				Map.entry(PT, "PRT"),
				Map.entry(PR, "PRI"),
				Map.entry(QA, "QAT"),
				Map.entry(RE, "REU"),
				Map.entry(RO, "ROU"),
				Map.entry(RU, "RUS"),
				Map.entry(RW, "RWA"),
				Map.entry(BL, "BLM"),
				Map.entry(SH, "SHN"),
				Map.entry(KN, "KNA"),
				Map.entry(LC, "LCA"),
				Map.entry(MF, "MAF"),
				Map.entry(PM, "SPM"),
				Map.entry(VC, "VCT"),
				Map.entry(WS, "WSM"),
				Map.entry(SM, "SMR"),
				Map.entry(ST, "STP"),
				Map.entry(SA, "SAU"),
				Map.entry(SN, "SEN"),
				Map.entry(RS, "SRB"),
				Map.entry(SC, "SYC"),
				Map.entry(SL, "SLE"),
				Map.entry(SG, "SGP"),
				Map.entry(SX, "SXM"),
				Map.entry(SK, "SVK"),
				Map.entry(SI, "SVN"),
				Map.entry(SB, "SLB"),
				Map.entry(SO, "SOM"),
				Map.entry(ZA, "ZAF"),
				Map.entry(GS, "SGS"),
				Map.entry(SS, "SSD"),
				Map.entry(ES, "ESP"),
				Map.entry(LK, "LKA"),
				Map.entry(SD, "SDN"),
				Map.entry(SR, "SUR"),
				Map.entry(SJ, "SJM"),
				Map.entry(SE, "SWE"),
				Map.entry(CH, "CHE"),
				Map.entry(SY, "SYR"),
				Map.entry(TW, "TWN"),
				Map.entry(TJ, "TJK"),
				Map.entry(TZ, "TZA"),
				Map.entry(TH, "THA"),
				Map.entry(TL, "TLS"),
				Map.entry(TG, "TGO"),
				Map.entry(TK, "TKL"),
				Map.entry(TO, "TON"),
				Map.entry(TT, "TTO"),
				Map.entry(TN, "TUN"),
				Map.entry(TR, "TUR"),
				Map.entry(TM, "TKM"),
				Map.entry(TC, "TCA"),
				Map.entry(TV, "TUV"),
				Map.entry(UG, "UGA"),
				Map.entry(UA, "UKR"),
				Map.entry(AE, "ARE"),
				Map.entry(GB, "GBR"),
				Map.entry(UM, "UMI"),
				Map.entry(US, "USA"),
				Map.entry(UY, "URY"),
				Map.entry(UZ, "UZB"),
				Map.entry(VU, "VUT"),
				Map.entry(VE, "VEN"),
				Map.entry(VN, "VNM"),
				Map.entry(VG, "VGB"),
				Map.entry(VI, "VIR"),
				Map.entry(WF, "WLF"),
				Map.entry(EH, "ESH"),
				Map.entry(YE, "YEM"),
				Map.entry(ZM, "ZMB"),
				Map.entry(ZW, "ZWE")
			);
	}
	// @formatter:on

	private static final Map<CountryEnum, String> MAP_COUNTRY_NUMERIC_3;
	// @formatter:off
	static {
		MAP_COUNTRY_NUMERIC_3 = Map.ofEntries(
				Map.entry(AF, "004"),
				Map.entry(AX, "248"),
				Map.entry(AL, "008"),
				Map.entry(DZ, "012"),
				Map.entry(AS, "016"),
				Map.entry(AD, "020"),
				Map.entry(AO, "024"),
				Map.entry(AI, "660"),
				Map.entry(AQ, "010"),
				Map.entry(AG, "028"),
				Map.entry(AR, "032"),
				Map.entry(AM, "051"),
				Map.entry(AW, "533"),
				Map.entry(AU, "036"),
				Map.entry(AT, "040"),
				Map.entry(AZ, "031"),
				Map.entry(BS, "044"),
				Map.entry(BH, "048"),
				Map.entry(BD, "050"),
				Map.entry(BB, "052"),
				Map.entry(BY, "112"),
				Map.entry(BE, "056"),
				Map.entry(BZ, "084"),
				Map.entry(BJ, "204"),
				Map.entry(BM, "060"),
				Map.entry(BT, "064"),
				Map.entry(BO, "068"),
				Map.entry(BQ, "535"),
				Map.entry(BA, "070"),
				Map.entry(BW, "072"),
				Map.entry(BV, "074"),
				Map.entry(BR, "076"),
				Map.entry(IO, "086"),
				Map.entry(BN, "096"),
				Map.entry(BG, "100"),
				Map.entry(BF, "854"),
				Map.entry(BI, "108"),
				Map.entry(CV, "132"),
				Map.entry(KH, "116"),
				Map.entry(CM, "120"),
				Map.entry(CA, "124"),
				Map.entry(KY, "136"),
				Map.entry(CF, "140"),
				Map.entry(TD, "148"),
				Map.entry(CL, "152"),
				Map.entry(CN, "156"),
				Map.entry(CX, "162"),
				Map.entry(CC, "166"),
				Map.entry(CO, "170"),
				Map.entry(KM, "174"),
				Map.entry(CD, "180"),
				Map.entry(CG, "178"),
				Map.entry(CK, "184"),
				Map.entry(CR, "188"),
				Map.entry(CI, "384"),
				Map.entry(HR, "191"),
				Map.entry(CU, "192"),
				Map.entry(CW, "531"),
				Map.entry(CY, "196"),
				Map.entry(CZ, "203"),
				Map.entry(DK, "208"),
				Map.entry(DJ, "262"),
				Map.entry(DM, "212"),
				Map.entry(DO, "214"),
				Map.entry(EC, "218"),
				Map.entry(EG, "818"),
				Map.entry(SV, "222"),
				Map.entry(GQ, "226"),
				Map.entry(ER, "232"),
				Map.entry(EE, "233"),
				Map.entry(SZ, "748"),
				Map.entry(ET, "231"),
				Map.entry(FK, "238"),
				Map.entry(FO, "234"),
				Map.entry(FJ, "242"),
				Map.entry(FI, "246"),
				Map.entry(FR, "250"),
				Map.entry(GF, "254"),
				Map.entry(PF, "258"),
				Map.entry(TF, "260"),
				Map.entry(GA, "266"),
				Map.entry(GM, "270"),
				Map.entry(GE, "268"),
				Map.entry(DE, "276"),
				Map.entry(GH, "288"),
				Map.entry(GI, "292"),
				Map.entry(GR, "300"),
				Map.entry(GL, "304"),
				Map.entry(GD, "308"),
				Map.entry(GP, "312"),
				Map.entry(GU, "316"),
				Map.entry(GT, "320"),
				Map.entry(GG, "831"),
				Map.entry(GN, "324"),
				Map.entry(GW, "624"),
				Map.entry(GY, "328"),
				Map.entry(HT, "332"),
				Map.entry(HM, "334"),
				Map.entry(VA, "336"),
				Map.entry(HN, "340"),
				Map.entry(HK, "344"),
				Map.entry(HU, "348"),
				Map.entry(IS, "352"),
				Map.entry(IN, "356"),
				Map.entry(ID, "360"),
				Map.entry(IR, "364"),
				Map.entry(IQ, "368"),
				Map.entry(IE, "372"),
				Map.entry(IM, "833"),
				Map.entry(IL, "376"),
				Map.entry(IT, "380"),
				Map.entry(JM, "388"),
				Map.entry(JP, "392"),
				Map.entry(JE, "832"),
				Map.entry(JO, "400"),
				Map.entry(KZ, "398"),
				Map.entry(KE, "404"),
				Map.entry(KI, "296"),
				Map.entry(KP, "408"),
				Map.entry(KR, "410"),
				Map.entry(KW, "414"),
				Map.entry(KG, "417"),
				Map.entry(LA, "418"),
				Map.entry(LV, "428"),
				Map.entry(LB, "422"),
				Map.entry(LS, "426"),
				Map.entry(LR, "430"),
				Map.entry(LY, "434"),
				Map.entry(LI, "438"),
				Map.entry(LT, "440"),
				Map.entry(LU, "442"),
				Map.entry(MO, "446"),
				Map.entry(MK, "807"),
				Map.entry(MG, "450"),
				Map.entry(MW, "454"),
				Map.entry(MY, "458"),
				Map.entry(MV, "462"),
				Map.entry(ML, "466"),
				Map.entry(MT, "470"),
				Map.entry(MH, "584"),
				Map.entry(MQ, "474"),
				Map.entry(MR, "478"),
				Map.entry(MU, "480"),
				Map.entry(YT, "175"),
				Map.entry(MX, "484"),
				Map.entry(FM, "583"),
				Map.entry(MD, "498"),
				Map.entry(MC, "492"),
				Map.entry(MN, "496"),
				Map.entry(ME, "499"),
				Map.entry(MS, "500"),
				Map.entry(MA, "504"),
				Map.entry(MZ, "508"),
				Map.entry(MM, "104"),
				Map.entry(NA, "516"),
				Map.entry(NR, "520"),
				Map.entry(NP, "524"),
				Map.entry(NL, "528"),
				Map.entry(NC, "540"),
				Map.entry(NZ, "554"),
				Map.entry(NI, "558"),
				Map.entry(NE, "562"),
				Map.entry(NG, "566"),
				Map.entry(NU, "570"),
				Map.entry(NF, "574"),
				Map.entry(MP, "580"),
				Map.entry(NO, "578"),
				Map.entry(OM, "512"),
				Map.entry(PK, "586"),
				Map.entry(PW, "585"),
				Map.entry(PS, "275"),
				Map.entry(PA, "591"),
				Map.entry(PG, "598"),
				Map.entry(PY, "600"),
				Map.entry(PE, "604"),
				Map.entry(PH, "608"),
				Map.entry(PN, "612"),
				Map.entry(PL, "616"),
				Map.entry(PT, "620"),
				Map.entry(PR, "630"),
				Map.entry(QA, "634"),
				Map.entry(RE, "638"),
				Map.entry(RO, "642"),
				Map.entry(RU, "643"),
				Map.entry(RW, "646"),
				Map.entry(BL, "652"),
				Map.entry(SH, "654"),
				Map.entry(KN, "659"),
				Map.entry(LC, "662"),
				Map.entry(MF, "663"),
				Map.entry(PM, "666"),
				Map.entry(VC, "670"),
				Map.entry(WS, "882"),
				Map.entry(SM, "674"),
				Map.entry(ST, "678"),
				Map.entry(SA, "682"),
				Map.entry(SN, "686"),
				Map.entry(RS, "688"),
				Map.entry(SC, "690"),
				Map.entry(SL, "694"),
				Map.entry(SG, "702"),
				Map.entry(SX, "534"),
				Map.entry(SK, "703"),
				Map.entry(SI, "705"),
				Map.entry(SB, "090"),
				Map.entry(SO, "706"),
				Map.entry(ZA, "710"),
				Map.entry(GS, "239"),
				Map.entry(SS, "728"),
				Map.entry(ES, "724"),
				Map.entry(LK, "144"),
				Map.entry(SD, "729"),
				Map.entry(SR, "740"),
				Map.entry(SJ, "744"),
				Map.entry(SE, "752"),
				Map.entry(CH, "756"),
				Map.entry(SY, "760"),
				Map.entry(TW, "158"),
				Map.entry(TJ, "762"),
				Map.entry(TZ, "834"),
				Map.entry(TH, "764"),
				Map.entry(TL, "626"),
				Map.entry(TG, "768"),
				Map.entry(TK, "772"),
				Map.entry(TO, "776"),
				Map.entry(TT, "780"),
				Map.entry(TN, "788"),
				Map.entry(TR, "792"),
				Map.entry(TM, "795"),
				Map.entry(TC, "796"),
				Map.entry(TV, "798"),
				Map.entry(UG, "800"),
				Map.entry(UA, "804"),
				Map.entry(AE, "784"),
				Map.entry(GB, "826"),
				Map.entry(UM, "581"),
				Map.entry(US, "840"),
				Map.entry(UY, "858"),
				Map.entry(UZ, "860"),
				Map.entry(VU, "548"),
				Map.entry(VE, "862"),
				Map.entry(VN, "704"),
				Map.entry(VG, "092"),
				Map.entry(VI, "850"),
				Map.entry(WF, "876"),
				Map.entry(EH, "732"),
				Map.entry(YE, "887"),
				Map.entry(ZM, "894"),
				Map.entry(ZW, "716")
			);
	}
	// @formatter:on

	private static final Map<CountryEnum, List<String>> MAP_CC_TLD;
	// @formatter:off
	static {
		MAP_CC_TLD = Map.ofEntries(
				Map.entry(AF, List.of(".af")),
				Map.entry(AX, List.of(".ax")),
				Map.entry(AL, List.of(".al")),
				Map.entry(DZ, List.of(".dz")),
				Map.entry(AS, List.of(".as")),
				Map.entry(AD, List.of(".ad")),
				Map.entry(AO, List.of(".ao")),
				Map.entry(AI, List.of(".ai")),
				Map.entry(AQ, List.of(".aq")),
				Map.entry(AG, List.of(".ag")),
				Map.entry(AR, List.of(".ar")),
				Map.entry(AM, List.of(".am")),
				Map.entry(AW, List.of(".aw")),
				Map.entry(AU, List.of(".au")),
				Map.entry(AT, List.of(".at")),
				Map.entry(AZ, List.of(".az")),
				Map.entry(BS, List.of(".bs")),
				Map.entry(BH, List.of(".bh")),
				Map.entry(BD, List.of(".bd")),
				Map.entry(BB, List.of(".bb")),
				Map.entry(BY, List.of(".by")),
				Map.entry(BE, List.of(".be")),
				Map.entry(BZ, List.of(".bz")),
				Map.entry(BJ, List.of(".bj")),
				Map.entry(BM, List.of(".bm")),
				Map.entry(BT, List.of(".bt")),
				Map.entry(BO, List.of(".bo")),
				Map.entry(BQ, List.of(".bq", ".nl")),
				Map.entry(BA, List.of(".ba")),
				Map.entry(BW, List.of(".bw")),
				Map.entry(BR, List.of(".br")),
				Map.entry(IO, List.of(".io")),
				Map.entry(BN, List.of(".bn")),
				Map.entry(BG, List.of(".bg")),
				Map.entry(BF, List.of(".bf")),
				Map.entry(BI, List.of(".bi")),
				Map.entry(CV, List.of(".cv")),
				Map.entry(KH, List.of(".kh")),
				Map.entry(CM, List.of(".cm")),
				Map.entry(CA, List.of(".ca")),
				Map.entry(KY, List.of(".ky")),
				Map.entry(CF, List.of(".cf")),
				Map.entry(TD, List.of(".td")),
				Map.entry(CL, List.of(".cl")),
				Map.entry(CN, List.of(".cn")),
				Map.entry(CX, List.of(".cx")),
				Map.entry(CC, List.of(".cc")),
				Map.entry(CO, List.of(".co")),
				Map.entry(KM, List.of(".km")),
				Map.entry(CD, List.of(".cd")),
				Map.entry(CG, List.of(".cg")),
				Map.entry(CK, List.of(".ck")),
				Map.entry(CR, List.of(".cr")),
				Map.entry(CI, List.of(".ci")),
				Map.entry(HR, List.of(".hr")),
				Map.entry(CU, List.of(".cu")),
				Map.entry(CW, List.of(".cw")),
				Map.entry(CY, List.of(".cy")),
				Map.entry(CZ, List.of(".cz")),
				Map.entry(DK, List.of(".dk")),
				Map.entry(DJ, List.of(".dj")),
				Map.entry(DM, List.of(".dm")),
				Map.entry(DO, List.of(".do")),
				Map.entry(EC, List.of(".ec")),
				Map.entry(EG, List.of(".eg")),
				Map.entry(SV, List.of(".sv")),
				Map.entry(GQ, List.of(".gq")),
				Map.entry(ER, List.of(".er")),
				Map.entry(EE, List.of(".ee")),
				Map.entry(SZ, List.of(".sz")),
				Map.entry(ET, List.of(".et")),
				Map.entry(FK, List.of(".fk")),
				Map.entry(FO, List.of(".fo")),
				Map.entry(FJ, List.of(".fj")),
				Map.entry(FI, List.of(".fi")),
				Map.entry(FR, List.of(".fr")),
				Map.entry(GF, List.of(".gf")),
				Map.entry(PF, List.of(".pf")),
				Map.entry(TF, List.of(".tf")),
				Map.entry(GA, List.of(".ga")),
				Map.entry(GM, List.of(".gm")),
				Map.entry(GE, List.of(".ge")),
				Map.entry(DE, List.of(".de")),
				Map.entry(GH, List.of(".gh")),
				Map.entry(GI, List.of(".gi")),
				Map.entry(GR, List.of(".gr")),
				Map.entry(GL, List.of(".gl")),
				Map.entry(GD, List.of(".gd")),
				Map.entry(GP, List.of(".gp")),
				Map.entry(GU, List.of(".gu")),
				Map.entry(GT, List.of(".gt")),
				Map.entry(GG, List.of(".gg")),
				Map.entry(GN, List.of(".gn")),
				Map.entry(GW, List.of(".gw")),
				Map.entry(GY, List.of(".gy")),
				Map.entry(HT, List.of(".ht")),
				Map.entry(HM, List.of(".hm")),
				Map.entry(VA, List.of(".va")),
				Map.entry(HN, List.of(".hn")),
				Map.entry(HK, List.of(".hk")),
				Map.entry(HU, List.of(".hu")),
				Map.entry(IS, List.of(".is")),
				Map.entry(IN, List.of(".in")),
				Map.entry(ID, List.of(".id")),
				Map.entry(IR, List.of(".ir")),
				Map.entry(IQ, List.of(".iq")),
				Map.entry(IE, List.of(".ie")),
				Map.entry(IM, List.of(".im")),
				Map.entry(IL, List.of(".il")),
				Map.entry(IT, List.of(".it")),
				Map.entry(JM, List.of(".jm")),
				Map.entry(JP, List.of(".jp")),
				Map.entry(JE, List.of(".je")),
				Map.entry(JO, List.of(".jo")),
				Map.entry(KZ, List.of(".kz")),
				Map.entry(KE, List.of(".ke")),
				Map.entry(KI, List.of(".ki")),
				Map.entry(KP, List.of(".kp")),
				Map.entry(KR, List.of(".kr")),
				Map.entry(KW, List.of(".kw")),
				Map.entry(KG, List.of(".kg")),
				Map.entry(LA, List.of(".la")),
				Map.entry(LV, List.of(".lv")),
				Map.entry(LB, List.of(".lb")),
				Map.entry(LS, List.of(".ls")),
				Map.entry(LR, List.of(".lr")),
				Map.entry(LY, List.of(".ly")),
				Map.entry(LI, List.of(".li")),
				Map.entry(LT, List.of(".lt")),
				Map.entry(LU, List.of(".lu")),
				Map.entry(MO, List.of(".mo")),
				Map.entry(MK, List.of(".mk")),
				Map.entry(MG, List.of(".mg")),
				Map.entry(MW, List.of(".mw")),
				Map.entry(MY, List.of(".my")),
				Map.entry(MV, List.of(".mv")),
				Map.entry(ML, List.of(".ml")),
				Map.entry(MT, List.of(".mt")),
				Map.entry(MH, List.of(".mh")),
				Map.entry(MQ, List.of(".mq")),
				Map.entry(MR, List.of(".mr")),
				Map.entry(MU, List.of(".mu")),
				Map.entry(YT, List.of(".yt")),
				Map.entry(MX, List.of(".mx")),
				Map.entry(FM, List.of(".fm")),
				Map.entry(MD, List.of(".md")),
				Map.entry(MC, List.of(".mc")),
				Map.entry(MN, List.of(".mn")),
				Map.entry(ME, List.of(".me")),
				Map.entry(MS, List.of(".ms")),
				Map.entry(MA, List.of(".ma")),
				Map.entry(MZ, List.of(".mz")),
				Map.entry(MM, List.of(".mm")),
				Map.entry(NA, List.of(".na")),
				Map.entry(NR, List.of(".nr")),
				Map.entry(NP, List.of(".np")),
				Map.entry(NL, List.of(".nl")),
				Map.entry(NC, List.of(".nc")),
				Map.entry(NZ, List.of(".nz")),
				Map.entry(NI, List.of(".ni")),
				Map.entry(NE, List.of(".ne")),
				Map.entry(NG, List.of(".ng")),
				Map.entry(NU, List.of(".nu")),
				Map.entry(NF, List.of(".nf")),
				Map.entry(MP, List.of(".mp")),
				Map.entry(NO, List.of(".no")),
				Map.entry(OM, List.of(".om")),
				Map.entry(PK, List.of(".pk")),
				Map.entry(PW, List.of(".pw")),
				Map.entry(PS, List.of(".ps")),
				Map.entry(PA, List.of(".pa")),
				Map.entry(PG, List.of(".pg")),
				Map.entry(PY, List.of(".py")),
				Map.entry(PE, List.of(".pe")),
				Map.entry(PH, List.of(".ph")),
				Map.entry(PN, List.of(".pn")),
				Map.entry(PL, List.of(".pl")),
				Map.entry(PT, List.of(".pt")),
				Map.entry(PR, List.of(".pr")),
				Map.entry(QA, List.of(".qa")),
				Map.entry(RE, List.of(".re")),
				Map.entry(RO, List.of(".ro")),
				Map.entry(RU, List.of(".ru")),
				Map.entry(RW, List.of(".rw")),
				Map.entry(BL, List.of(".bl")),
				Map.entry(SH, List.of(".sh")),
				Map.entry(KN, List.of(".kn")),
				Map.entry(LC, List.of(".lc")),
				Map.entry(MF, List.of(".mf")),
				Map.entry(PM, List.of(".pm")),
				Map.entry(VC, List.of(".vc")),
				Map.entry(WS, List.of(".ws")),
				Map.entry(SM, List.of(".sm")),
				Map.entry(ST, List.of(".st")),
				Map.entry(SA, List.of(".sa")),
				Map.entry(SN, List.of(".sn")),
				Map.entry(RS, List.of(".rs")),
				Map.entry(SC, List.of(".sc")),
				Map.entry(SL, List.of(".sl")),
				Map.entry(SG, List.of(".sg")),
				Map.entry(SX, List.of(".sx")),
				Map.entry(SK, List.of(".sk")),
				Map.entry(SI, List.of(".si")),
				Map.entry(SB, List.of(".sb")),
				Map.entry(SO, List.of(".so")),
				Map.entry(ZA, List.of(".za")),
				Map.entry(GS, List.of(".gs")),
				Map.entry(SS, List.of(".ss")),
				Map.entry(ES, List.of(".es")),
				Map.entry(LK, List.of(".lk")),
				Map.entry(SD, List.of(".sd")),
				Map.entry(SR, List.of(".sr")),
				Map.entry(SE, List.of(".se")),
				Map.entry(CH, List.of(".ch")),
				Map.entry(SY, List.of(".sy")),
				Map.entry(TW, List.of(".tw")),
				Map.entry(TJ, List.of(".tj")),
				Map.entry(TZ, List.of(".tz")),
				Map.entry(TH, List.of(".th")),
				Map.entry(TL, List.of(".tl")),
				Map.entry(TG, List.of(".tg")),
				Map.entry(TK, List.of(".tk")),
				Map.entry(TO, List.of(".to")),
				Map.entry(TT, List.of(".tt")),
				Map.entry(TN, List.of(".tn")),
				Map.entry(TR, List.of(".tr")),
				Map.entry(TM, List.of(".tm")),
				Map.entry(TC, List.of(".tc")),
				Map.entry(TV, List.of(".tv")),
				Map.entry(UG, List.of(".ug")),
				Map.entry(UA, List.of(".ua")),
				Map.entry(AE, List.of(".ae")),
				Map.entry(GB, List.of(".gb", ".uk")),
				Map.entry(US, List.of(".us")),
				Map.entry(UY, List.of(".uy")),
				Map.entry(UZ, List.of(".uz")),
				Map.entry(VU, List.of(".vu")),
				Map.entry(VE, List.of(".ve")),
				Map.entry(VN, List.of(".vn")),
				Map.entry(VG, List.of(".vg")),
				Map.entry(VI, List.of(".vi")),
				Map.entry(WF, List.of(".wf")),
				Map.entry(YE, List.of(".ye")),
				Map.entry(ZM, List.of(".zm")),
				Map.entry(ZW, List.of(".zw"))
			);
	}
	// @formatter:on

	// @formatter:off
	private static final List<CountryEnum> LIST_EU;
	static {
		LIST_EU = List.of(
			AT,
			BE,
			BG,
			HR,
			CY,
			CZ,
			DK,
			EE,
			FI,
			FR,
			DE,
			GR,
			HU,
			IE,
			IT,
			LV,
			LT,
			LU,
			MT,
			NL,
			PL,
			PT,
			RO,
			SK,
			SI,
			ES,
			SE
		);
	}
	// @formatter:on

}