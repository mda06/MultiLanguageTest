package com.multilanguage.project.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.multilanguage.project.language.LanguageHandler.Language;
import com.multilanguage.project.model.MainModel;
import com.multilanguage.project.observable.LanguageObservable;
import com.multilanguage.project.view.MainFrame;

public class MainController {
	private MainFrame frame;
	private MainModel model;
	private LanguageObservable obs;
	
	public MainController(MainFrame frame, MainModel model, LanguageObservable obs) {
		this.frame = frame;
		this.model = model;
		this.obs = obs;
		obs.addObserver(this.model);
		initBtns();
	}
	
	private void initBtns() {
		frame.getBtnEN().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obs.getLanguageHandler().setLanguage(Language.EN);
			}
		});
		frame.getBtnFR().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obs.getLanguageHandler().setLanguage(Language.FR);
			}
		});
		frame.getBtnNL().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obs.getLanguageHandler().setLanguage(Language.NL);
			}
		});
	}
	
}
