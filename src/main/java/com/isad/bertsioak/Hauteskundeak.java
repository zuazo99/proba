package com.isad.bertsioak;

import java.util.ArrayList;

public class Hauteskundeak {

	private ArrayList<String> mahaiak = new ArrayList<String>();

	@Override
	public String toString() {
		String emaitza = "";
		for (String mahai : mahaiak) {
			emaitza += mahai + " ";
		}
		return emaitza;
	}
	private void gehituMahaia(String mahai) {
			mahaiak .add(mahai);
	}

	public static void main(String[] args) {
		Hauteskundeak h2021 = new Hauteskundeak();

		h2021.gehituMahaia("Irun");
		h2021.gehituMahaia("Donostia");
		h2021.gehituMahaia("Tolosa");
		h2021.gehituMahaia("Bergara");
		h2021.gehituMahaia("Andoain");

		System.out.println(h2021);
	}

}
