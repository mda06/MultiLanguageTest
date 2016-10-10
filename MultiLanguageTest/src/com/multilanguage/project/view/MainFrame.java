package com.multilanguage.project.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private JButton btnFR, btnNL, btnEN;
	private JLabel lblOpen, lblClose;
	
	public MainFrame() {
		JPanel pnlBtn = new JPanel();
		pnlBtn.add(btnFR = new JButton());
		pnlBtn.add(btnNL = new JButton());
		pnlBtn.add(btnEN = new JButton());
		JPanel pnlLbl = new JPanel();
		pnlLbl.add(lblOpen = new JLabel());
		pnlLbl.add(lblClose = new JLabel());
		add(pnlBtn, BorderLayout.NORTH);
		add(pnlLbl, BorderLayout.SOUTH);
		setSize(350, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public JButton getBtnFR() {
		return btnFR;
	}

	public JButton getBtnNL() {
		return btnNL;
	}

	public JButton getBtnEN() {
		return btnEN;
	}

	public JLabel getLblOpen() {
		return lblOpen;
	}

	public JLabel getLblClose() {
		return lblClose;
	}

	public void setBtnFR(JButton btnFR) {
		this.btnFR = btnFR;
	}

	public void setBtnNL(JButton btnNL) {
		this.btnNL = btnNL;
	}

	public void setBtnEN(JButton btnEN) {
		this.btnEN = btnEN;
	}

	public void setLblOpen(JLabel lblOpen) {
		this.lblOpen = lblOpen;
	}

	public void setLblClose(JLabel lblClose) {
		this.lblClose = lblClose;
	}
	
}
