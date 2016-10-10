package com.multilanguage.project;

import com.multilanguage.project.controller.MainController;
import com.multilanguage.project.model.MainModel;
import com.multilanguage.project.observable.LanguageObservable;
import com.multilanguage.project.view.MainFrame;

public class Main {
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		LanguageObservable lanObs = new LanguageObservable();
		new MainController(frame, new MainModel(frame), lanObs);
		lanObs.languageChanged();
		frame.setVisible(true);
	}
}
