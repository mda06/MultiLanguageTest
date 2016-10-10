package com.multilanguage.project.observable;

import java.util.Observable;

import com.multilanguage.project.language.LanguageHandler;

public class LanguageObservable extends Observable {
	private LanguageHandler handler;
	
	public LanguageObservable() {
		handler = new LanguageHandler();
		handler.setLanguageObservable(this);
	}
	
	public void languageChanged() {
		setChanged();
		notifyObservers();
	}
	
	public LanguageHandler getLanguageHandler() {
		return handler;
	}
}
