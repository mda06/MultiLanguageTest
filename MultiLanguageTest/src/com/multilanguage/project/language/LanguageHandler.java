package com.multilanguage.project.language;

import java.util.HashMap;

import com.multilanguage.project.observable.LanguageObservable;

public class LanguageHandler {
	public enum Language {
		NL, FR, EN;
	}
	
	private Language currentLanguage;
	private LanguageObservable observable;
	private HashMap<Language, HashMap<String, String>> words;
	
	public LanguageHandler() {
		currentLanguage = Language.EN;
		words = new HashMap<Language, HashMap<String, String>>();
		initWords();
	}
	
	private void initWords() {
		words.put(Language.NL, new HashMap<String, String>());
		words.put(Language.FR, new HashMap<String, String>());
		words.put(Language.EN, new HashMap<String, String>());
		put(Language.NL, "close", "Sluiten");
		put(Language.NL, "btnNL", "Nederlands");
		put(Language.NL, "btnFR", "Frans");
		put(Language.NL, "btnEN", "Engels");
		put(Language.NL, "open", "Open");
		put(Language.FR, "close", "Fermer");
		put(Language.FR, "open", "Ouvrir");
		put(Language.FR, "btnNL", "Néerlandais");
		put(Language.FR, "btnFR", "Français");
		put(Language.FR, "btnEN", "Anglais");
		put(Language.EN, "close", "Close");
		put(Language.EN, "open", "Open");
		put(Language.EN, "btnNL", "Netherlands");
		put(Language.EN, "btnFR", "French");
		put(Language.EN, "btnEN", "English");
	}
	
	public void setLanguage(Language l) {
		currentLanguage = l;
		observable.languageChanged();
	}
	
	private void put(Language lan, String key, String value) {
		words.get(lan).put(key, value);
	}
	
	public String getString(String key) {
		return words.get(currentLanguage).get(key);
	}

	public void setLanguageObservable(LanguageObservable languageObservable) {
		observable = languageObservable;
	}
}
