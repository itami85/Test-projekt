package com.aws.codestar.projecttemplates.model;

public class SpielerErgebnisse {

	private String name;

	private int spiele;

	private int siege;

	private int niederlagen;

	private int punkte;

	public SpielerErgebnisse(String name, int spiele, int siege, int niederlagen, int punkte) {
		this.name = name;
		this.spiele = spiele;
		this.siege = siege;
		this.niederlagen = niederlagen;
		this.punkte = punkte;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpiele() {
		return spiele;
	}

	public void setSpiele(int spiele) {
		this.spiele = spiele;
	}

	public int getSiege() {
		return siege;
	}

	public void setSiege(int siege) {
		this.siege = siege;
	}

	public int getNiederlagen() {
		return niederlagen;
	}

	public void setNiederlagen(int niederlagen) {
		this.niederlagen = niederlagen;
	}

	public int getPunkte() {
		return punkte;
	}

	public void setPunkte(int punkte) {
		this.punkte = punkte;
	}
}
