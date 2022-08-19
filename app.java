package fr.michel.app;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import fr.michel.app.service.*;

public class App {

	public static void main(String[] agrs) {
	CompteCourant cc1 = new CompteCourant("Junior", 791, 4500,100);
	CompteEpargne cc2 = new CompteEpargne("pamela", 86, 810,30);
	CompteCourant a = new CompteCourant("Nadine", 39, 2100,90);
	CompteEpargne b = new CompteEpargne("Yvan", 86, 915,20);
	CompteEpargne e = new CompteEpargne("abe", 76, 915,60);
	ArrayList<Compte> tab = new ArrayList<Compte>();
	tab.add(cc2);
	tab.add(cc1);
	tab.add(a);
	tab.add(b);
	tab.add(e);
	
	
	for(Compte var: tab) {
		var.consulterSolde();
	}
	 Collections.sort(tab, new MonComparateur());
	 System.out.println("triage");
	 for(Compte var: tab) {
			var.consulterSolde();
		}
	 GestionFichier f=new GestionFichier();
	 String chemin="C:/Users/lelou/Documents/eclipse_code_java/TP6/src/teste.txt";
	 f.creerFichier(chemin);
	 f.ecrireDansFichier(chemin,tab);
	
	}
	
	
	
}
