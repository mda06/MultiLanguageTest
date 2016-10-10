package com.multilanguage.project.model;

import java.util.Observable;
import java.util.Observer;

import com.multilanguage.project.language.LanguageHandler;
import com.multilanguage.project.observable.LanguageObservable;
import com.multilanguage.project.view.MainFrame;

public class MainModel implements Observer {
	private MainFrame frame;

	public MainModel(MainFrame frame) {
		this.frame = frame;
	}

	public void update(Observable o, Object arg) {
		if(o instanceof LanguageObservable) {
			LanguageHandler handler = ((LanguageObservable)o).getLanguageHandler();
			frame.getLblClose().setText(handler.getString("close"));
			frame.getLblOpen().setText(handler.getString("open"));
			frame.getBtnEN().setText(handler.getString("btnEN"));
			frame.getBtnFR().setText(handler.getString("btnFR"));
			frame.getBtnNL().setText(handler.getString("btnNL"));
		}
	}
	
}
