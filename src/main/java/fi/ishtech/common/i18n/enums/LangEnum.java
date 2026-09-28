package fi.ishtech.common.i18n.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {@link Enum} for Language.<br>
 * Use {@link LangEnum#fromName} instead of {@link LangEnum#valueOf}<br>
 *
 * @author Muneer Ahmed Syed
 */
public enum LangEnum {

	aa,
	ab,
	ae,
	af,
	ak,
	am,
	an,
	ar,
	as,
	av,
	ay,
	az,
	ba,
	be,
	bg,
	bi,
	bm,
	bn,
	bo,
	br,
	bs,
	ca,
	ce,
	ch,
	co,
	cr,
	cs,
	cu,
	cv,
	cy,
	da,
	de,
	dv,
	dz,
	ee,
	el,
	en,
	eo,
	es,
	et,
	eu,
	fa,
	ff,
	fi,
	fj,
	fo,
	fr,
	fy,
	ga,
	gd,
	gl,
	gn,
	gu,
	gv,
	ha,
	he,
	hi,
	ho,
	hr,
	ht,
	hu,
	hy,
	hz,
	ia,
	id,
	ie,
	ig,
	ii,
	ik,
	io,
	is,
	it,
	iu,
	ja,
	jv,
	ka,
	kg,
	ki,
	kj,
	kk,
	kl,
	km,
	kn,
	ko,
	kr,
	ks,
	ku,
	kv,
	kw,
	ky,
	la,
	lb,
	lg,
	li,
	ln,
	lo,
	lt,
	lu,
	lv,
	mg,
	mh,
	mi,
	mk,
	ml,
	mn,
	mr,
	ms,
	mt,
	my,
	na,
	nb,
	nd,
	ne,
	ng,
	nl,
	nn,
	no,
	nr,
	nv,
	ny,
	oc,
	oj,
	om,
	or,
	os,
	pa,
	pi,
	pl,
	ps,
	pt,
	qu,
	rm,
	rn,
	ro,
	ru,
	rw,
	sa,
	sc,
	sd,
	se,
	sg,
	si,
	sk,
	sl,
	sm,
	sn,
	so,
	sq,
	sr,
	ss,
	st,
	su,
	sv,
	sw,
	ta,
	te,
	tg,
	th,
	ti,
	tk,
	tl,
	tn,
	to,
	tr,
	ts,
	tt,
	tw,
	ty,
	ug,
	uk,
	ur,
	uz,
	ve,
	vi,
	vo,
	wa,
	wo,
	xh,
	yi,
	yo,
	za,
	zh,
	zu;

	private final static List<String> NAMES_LIST;
	static {
		List<String> tmpNamesList = new ArrayList<String>(193);

		for (LangEnum c : values()) {
			tmpNamesList.add(c.name());
		}

		NAMES_LIST = Collections.unmodifiableList(tmpNamesList);

		tmpNamesList = null; // GC
	}

	/**
	 * Alias for valueOf
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 */
	public static LangEnum fromName(String name) {
		return valueOf(name);
	}

	/**
	 * Gets LangEnum object based {@code name} trimmed of leading and trailing spaces.<br>
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 */
	public static LangEnum fromNameTrimmed(String name) {
		if (name == null) {
			throw new NullPointerException("name is null");
		}

		if ("".equals(name.trim())) {
			throw new NullPointerException("name is blank");
		}

		return valueOf(name.trim());
	}

	/**
	 * Gets LangEnum object based case-insensitive {@code name}<br>
	 *
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 *
	 * @throws NullPointerException
	 *             when input {@code name} is null or blank
	 */
	public static LangEnum fromNameIgnoreCase(String name) {
		if (name == null) {
			throw new NullPointerException("name is null");
		}

		if ("".equals(name.trim())) {
			throw new NullPointerException("name is blank");
		}

		return fromNameTrimmed(name.toLowerCase());
	}

	/**
	 * Gets LangEnum object based {@code name}.<br>
	 * If not present, returns {@code null}
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 */
	public static LangEnum fromNameOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name) ? fromName(name) : null;
	}

	/**
	 * Gets LangEnum object based {@code name} trimmed of leading and trailing spaces.<br>
	 * If not present, returns {@code null}
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 */
	public static LangEnum fromNameTrimmedOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name.trim()) ? fromNameTrimmed(name) : null;
	}

	/**
	 * Gets LangEnum object based case-insensitive {@code name}<br>
	 * If not present, returns null
	 *
	 * @param name
	 *            - the name of the constant to return
	 *
	 * @return {@link LangEnum} constant of the specified {@code name}
	 */
	public static LangEnum fromNameIgnoreCaseOrElseNull(String name) {
		if (name == null || "".equals(name.trim())) {
			return null;
		}

		return NAMES_LIST.contains(name.trim().toLowerCase()) ? fromNameIgnoreCase(name) : null;
	}

	/**
	 * Returns map of full names in each available langauge.
	 *
	 * @return {@link Map}&lt;{@link LangEnum}, {@link Map}&lt;{@link LangEnum}, {@link String}&gt;&gt;
	 */
	public static Map<LangEnum, Map<LangEnum, String>> fullNames() {
		return MAP_LANG_FULL_NAME;
	}

	/**
	 * Returns full names in input langauge.
	 *
	 * @param keyLang
	 *            - in which language you want full names in.
	 *
	 * @return {@link Map}&lt;{@link LangEnum}, {@link String}&gt;
	 */
	public static Map<LangEnum, String> fullNames(LangEnum keyLang) {
		return MAP_LANG_FULL_NAME.get(keyLang);
	}

	/**
	 * Returns full names in English.
	 *
	 * @return {@link Map}&lt;{@link LangEnum}, {@link String}&gt;
	 */
	public static Map<LangEnum, String> fullNamesInEn() {
		return MAP_LANG_FULL_NAME.get(en);
	}

	/**
	 * FullName for {@code inputLang} in {@code keyLang},<br>
	 * e.g. if keyLang = fi, inputLang = en, it returns Englanti.
	 *
	 * @param keyLang
	 *            - in which language you want full names in.
	 * @param inputLang
	 *            - for which language you want the full name.
	 *
	 * @return {@link String}
	 */
	public static String fullName(LangEnum keyLang, LangEnum inputLang) {
		return MAP_LANG_FULL_NAME.containsKey(keyLang) ? MAP_LANG_FULL_NAME.get(keyLang).get(inputLang) : null;
	}

	/**
	 * Full name of current language in input language.
	 *
	 * @param keyLang
	 *            - in which language you want full names in.
	 *
	 * @return {@link String}
	 */
	public String fullName(LangEnum keyLang) {
		return fullName(keyLang, this);
	}

	/**
	 * Full name of current language in own languge.
	 *
	 * @return {@link String}
	 */
	public String fullName() {
		return fullName(this, this);
	}

	/**
	 * Full name of input language in English.
	 *
	 * @param inputLang
	 *            - for which language you want the full name.
	 *
	 * @return {@link String}
	 */
	public static String fullNameInEn(LangEnum inputLang) {
		return fullName(en, inputLang);
	}

	/**
	 * Full name of current language in English.
	 *
	 * @return {@link String}
	 */
	public String fullNameInEn() {
		return fullName(en, this);
	}

	private static final Map<LangEnum, Map<LangEnum, String>> MAP_LANG_FULL_NAME;
	static {
		Map<LangEnum, Map<LangEnum, String>> tmpMapLangFullName = new HashMap<LangEnum, Map<LangEnum, String>>(173);

		Map<LangEnum, String> tmpMapLangFullNameEn = new HashMap<LangEnum, String>(173);

		tmpMapLangFullNameEn.put(aa, "Afar");
		tmpMapLangFullNameEn.put(ab, "Abkhazian");
		tmpMapLangFullNameEn.put(ae, "Avestan");
		tmpMapLangFullNameEn.put(af, "Afrikaans");
		tmpMapLangFullNameEn.put(ak, "Akan");
		tmpMapLangFullNameEn.put(am, "Amharic");
		tmpMapLangFullNameEn.put(an, "Aragonese");
		tmpMapLangFullNameEn.put(ar, "Arabic");
		tmpMapLangFullNameEn.put(as, "Assamese");
		tmpMapLangFullNameEn.put(av, "Avaric");
		tmpMapLangFullNameEn.put(ay, "Aymara");
		tmpMapLangFullNameEn.put(az, "Azerbaijani");
		tmpMapLangFullNameEn.put(ba, "Bashkir");
		tmpMapLangFullNameEn.put(be, "Belarusian");
		tmpMapLangFullNameEn.put(bg, "Bulgarian");
		tmpMapLangFullNameEn.put(bi, "Bislama");
		tmpMapLangFullNameEn.put(bm, "Bambara");
		tmpMapLangFullNameEn.put(bn, "Bengali");
		tmpMapLangFullNameEn.put(bo, "Tibetan");
		tmpMapLangFullNameEn.put(br, "Breton");
		tmpMapLangFullNameEn.put(bs, "Bosnian");
		tmpMapLangFullNameEn.put(ca, "Catalan");
		tmpMapLangFullNameEn.put(ce, "Chechen");
		tmpMapLangFullNameEn.put(ch, "Chamorro");
		tmpMapLangFullNameEn.put(co, "Corsican");
		tmpMapLangFullNameEn.put(cr, "Cree");
		tmpMapLangFullNameEn.put(cs, "Czech");
		tmpMapLangFullNameEn.put(cu, "Church Slavic");
		tmpMapLangFullNameEn.put(cv, "Chuvash");
		tmpMapLangFullNameEn.put(cy, "Welsh");
		tmpMapLangFullNameEn.put(da, "Danish");
		tmpMapLangFullNameEn.put(de, "German");
		tmpMapLangFullNameEn.put(dv, "Divehi");
		tmpMapLangFullNameEn.put(dz, "Dzongkha");
		tmpMapLangFullNameEn.put(ee, "Ewe");
		tmpMapLangFullNameEn.put(el, "Greek");
		tmpMapLangFullNameEn.put(en, "English");
		tmpMapLangFullNameEn.put(eo, "Esperanto");
		tmpMapLangFullNameEn.put(es, "Spanish");
		tmpMapLangFullNameEn.put(et, "Estonian");
		tmpMapLangFullNameEn.put(eu, "Basque");
		tmpMapLangFullNameEn.put(fa, "Persian");
		tmpMapLangFullNameEn.put(ff, "Fulah");
		tmpMapLangFullNameEn.put(fi, "Finnish");
		tmpMapLangFullNameEn.put(fj, "Fijian");
		tmpMapLangFullNameEn.put(fo, "Faroese");
		tmpMapLangFullNameEn.put(fr, "French");
		tmpMapLangFullNameEn.put(fy, "Western Frisian");
		tmpMapLangFullNameEn.put(ga, "Irish");
		tmpMapLangFullNameEn.put(gd, "Gaelic");
		tmpMapLangFullNameEn.put(gl, "Galician");
		tmpMapLangFullNameEn.put(gn, "Guarani");
		tmpMapLangFullNameEn.put(gu, "Gujarati");
		tmpMapLangFullNameEn.put(gv, "Manx");
		tmpMapLangFullNameEn.put(ha, "Hausa");
		tmpMapLangFullNameEn.put(he, "Hebrew");
		tmpMapLangFullNameEn.put(hi, "Hindi");
		tmpMapLangFullNameEn.put(ho, "Hiri Motu");
		tmpMapLangFullNameEn.put(hr, "Croatian");
		tmpMapLangFullNameEn.put(ht, "Haitian");
		tmpMapLangFullNameEn.put(hu, "Hungarian");
		tmpMapLangFullNameEn.put(hy, "Armenian");
		tmpMapLangFullNameEn.put(hz, "Herero");
		tmpMapLangFullNameEn.put(ia, "Interlingua");
		tmpMapLangFullNameEn.put(id, "Indonesian");
		tmpMapLangFullNameEn.put(ie, "Interlingue");
		tmpMapLangFullNameEn.put(ig, "Igbo");
		tmpMapLangFullNameEn.put(ii, "Sichuan Yi");
		tmpMapLangFullNameEn.put(ik, "Inupiaq");
		tmpMapLangFullNameEn.put(io, "Ido");
		tmpMapLangFullNameEn.put(is, "Icelandic");
		tmpMapLangFullNameEn.put(it, "Italian");
		tmpMapLangFullNameEn.put(iu, "Inuktitut");
		tmpMapLangFullNameEn.put(ja, "Japanese");
		tmpMapLangFullNameEn.put(jv, "Javanese");
		tmpMapLangFullNameEn.put(ka, "Georgian");
		tmpMapLangFullNameEn.put(kg, "Kongo");
		tmpMapLangFullNameEn.put(ki, "Kikuyu");
		tmpMapLangFullNameEn.put(kj, "Kuanyama");
		tmpMapLangFullNameEn.put(kk, "Kazakh");
		tmpMapLangFullNameEn.put(kl, "Kalaallisut");
		tmpMapLangFullNameEn.put(km, "Khmer");
		tmpMapLangFullNameEn.put(kn, "Kannada");
		tmpMapLangFullNameEn.put(ko, "Korean");
		tmpMapLangFullNameEn.put(kr, "Kanuri");
		tmpMapLangFullNameEn.put(ks, "Kashmiri");
		tmpMapLangFullNameEn.put(ku, "Kurdish");
		tmpMapLangFullNameEn.put(kv, "Komi");
		tmpMapLangFullNameEn.put(kw, "Cornish");
		tmpMapLangFullNameEn.put(ky, "Kirghiz");
		tmpMapLangFullNameEn.put(la, "Latin");
		tmpMapLangFullNameEn.put(lb, "Luxembourgish");
		tmpMapLangFullNameEn.put(lg, "Ganda");
		tmpMapLangFullNameEn.put(li, "Limburgan");
		tmpMapLangFullNameEn.put(ln, "Lingala");
		tmpMapLangFullNameEn.put(lo, "Lao");
		tmpMapLangFullNameEn.put(lt, "Lithuanian");
		tmpMapLangFullNameEn.put(lu, "Luba-Katanga");
		tmpMapLangFullNameEn.put(lv, "Latvian");
		tmpMapLangFullNameEn.put(mg, "Malagasy");
		tmpMapLangFullNameEn.put(mh, "Marshallese");
		tmpMapLangFullNameEn.put(mi, "Maori");
		tmpMapLangFullNameEn.put(mk, "Macedonian");
		tmpMapLangFullNameEn.put(ml, "Malayalam");
		tmpMapLangFullNameEn.put(mn, "Mongolian");
		tmpMapLangFullNameEn.put(mr, "Marathi");
		tmpMapLangFullNameEn.put(ms, "Malay");
		tmpMapLangFullNameEn.put(mt, "Maltese");
		tmpMapLangFullNameEn.put(my, "Burmese");
		tmpMapLangFullNameEn.put(na, "Nauru");
		tmpMapLangFullNameEn.put(nb, "Norwegian Bokmål");
		tmpMapLangFullNameEn.put(nd, "North Ndebele");
		tmpMapLangFullNameEn.put(ne, "Nepali");
		tmpMapLangFullNameEn.put(ng, "Ndonga");
		tmpMapLangFullNameEn.put(nl, "Dutch");
		tmpMapLangFullNameEn.put(nn, "Norwegian Nynorsk");
		tmpMapLangFullNameEn.put(no, "Norwegian");
		tmpMapLangFullNameEn.put(nr, "South Ndebele");
		tmpMapLangFullNameEn.put(nv, "Navajo");
		tmpMapLangFullNameEn.put(ny, "Chichewa");
		tmpMapLangFullNameEn.put(oc, "Occitan");
		tmpMapLangFullNameEn.put(oj, "Ojibwa");
		tmpMapLangFullNameEn.put(om, "Oromo");
		tmpMapLangFullNameEn.put(or, "Oriya");
		tmpMapLangFullNameEn.put(os, "Ossetian");
		tmpMapLangFullNameEn.put(pa, "Punjabi");
		tmpMapLangFullNameEn.put(pi, "Pali");
		tmpMapLangFullNameEn.put(pl, "Polish");
		tmpMapLangFullNameEn.put(ps, "Pashto");
		tmpMapLangFullNameEn.put(pt, "Portuguese");
		tmpMapLangFullNameEn.put(qu, "Quechua");
		tmpMapLangFullNameEn.put(rm, "Romansh");
		tmpMapLangFullNameEn.put(rn, "Rundi");
		tmpMapLangFullNameEn.put(ro, "Romanian");
		tmpMapLangFullNameEn.put(ru, "Russian");
		tmpMapLangFullNameEn.put(rw, "Kinyarwanda");
		tmpMapLangFullNameEn.put(sa, "Sanskrit");
		tmpMapLangFullNameEn.put(sc, "Sardinian");
		tmpMapLangFullNameEn.put(sd, "Sindhi");
		tmpMapLangFullNameEn.put(se, "Northern Sami");
		tmpMapLangFullNameEn.put(sg, "Sango");
		tmpMapLangFullNameEn.put(si, "Sinhala");
		tmpMapLangFullNameEn.put(sk, "Slovak");
		tmpMapLangFullNameEn.put(sl, "Slovenian");
		tmpMapLangFullNameEn.put(sm, "Samoan");
		tmpMapLangFullNameEn.put(sn, "Shona");
		tmpMapLangFullNameEn.put(so, "Somali");
		tmpMapLangFullNameEn.put(sq, "Albanian");
		tmpMapLangFullNameEn.put(sr, "Serbian");
		tmpMapLangFullNameEn.put(ss, "Swati");
		tmpMapLangFullNameEn.put(st, "Southern Sotho");
		tmpMapLangFullNameEn.put(su, "Sundanese");
		tmpMapLangFullNameEn.put(sv, "Swedish");
		tmpMapLangFullNameEn.put(sw, "Swahili");
		tmpMapLangFullNameEn.put(ta, "Tamil");
		tmpMapLangFullNameEn.put(te, "Telugu");
		tmpMapLangFullNameEn.put(tg, "Tajik");
		tmpMapLangFullNameEn.put(th, "Thai");
		tmpMapLangFullNameEn.put(ti, "Tigrinya");
		tmpMapLangFullNameEn.put(tk, "Turkmen");
		tmpMapLangFullNameEn.put(tl, "Tagalog");
		tmpMapLangFullNameEn.put(tn, "Tswana");
		tmpMapLangFullNameEn.put(to, "Tonga");
		tmpMapLangFullNameEn.put(tr, "Turkish");
		tmpMapLangFullNameEn.put(ts, "Tsonga");
		tmpMapLangFullNameEn.put(tt, "Tatar");
		tmpMapLangFullNameEn.put(tw, "Twi");
		tmpMapLangFullNameEn.put(ty, "Tahitian");
		tmpMapLangFullNameEn.put(ug, "Uighur");
		tmpMapLangFullNameEn.put(uk, "Ukrainian");
		tmpMapLangFullNameEn.put(ur, "Urdu");
		tmpMapLangFullNameEn.put(uz, "Uzbek");
		tmpMapLangFullNameEn.put(ve, "Venda");
		tmpMapLangFullNameEn.put(vi, "Vietnamese");
		tmpMapLangFullNameEn.put(vo, "Volapük");
		tmpMapLangFullNameEn.put(wa, "Walloon");
		tmpMapLangFullNameEn.put(wo, "Wolof");
		tmpMapLangFullNameEn.put(xh, "Xhosa");
		tmpMapLangFullNameEn.put(yi, "Yiddish");
		tmpMapLangFullNameEn.put(yo, "Yoruba");
		tmpMapLangFullNameEn.put(za, "Zhuang");
		tmpMapLangFullNameEn.put(zh, "Chinese");
		tmpMapLangFullNameEn.put(zu, "Zulu");

		tmpMapLangFullName.put(en, tmpMapLangFullNameEn);

		Map<LangEnum, String> tmpMapLangFullNameFi = new HashMap<LangEnum, String>(173);

		tmpMapLangFullNameFi.put(ar, "Arabic");
		tmpMapLangFullNameFi.put(en, "Englanti");
		tmpMapLangFullNameFi.put(fi, "Suomi");
		tmpMapLangFullNameFi.put(ru, "Venäjä");
		tmpMapLangFullNameFi.put(sv, "Ruotsi");

		tmpMapLangFullName.put(fi, tmpMapLangFullNameFi);

		MAP_LANG_FULL_NAME = Collections.unmodifiableMap(tmpMapLangFullName);

		tmpMapLangFullName = null; //GC
		tmpMapLangFullNameEn = null; //GC
		tmpMapLangFullNameFi = null; //GC
	}

}