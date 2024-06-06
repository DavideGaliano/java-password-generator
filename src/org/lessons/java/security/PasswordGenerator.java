package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
 public static void main(String[] args) {
     // Creazione dell'oggetto Scanner
     Scanner scanner = new Scanner(System.in);
     
     // Lettura del nome
     System.out.print("Inserisci il tuo nome: ");
     String nome = scanner.nextLine();
     
     // Lettura del cognome
     System.out.print("Inserisci il tuo cognome: ");
     String cognome = scanner.nextLine();
     
     // Lettura del colore preferito
     System.out.print("Inserisci il tuo colore preferito: ");
     String colorePreferito = scanner.nextLine();
     
     // Lettura del giorno di nascita
     System.out.print("Inserisci il giorno di nascita: ");
     int giornoNascita = scanner.nextInt();
     
     // Lettura del mese di nascita
     System.out.print("Inserisci il mese di nascita: ");
     int meseNascita = scanner.nextInt();
     
     // Lettura dell'anno di nascita
     System.out.print("Inserisci l'anno di nascita: ");
     int annoNascita = scanner.nextInt();
     
     // Calcolo della somma di giorno, mese e anno di nascita
     int sommaDataNascita = giornoNascita + meseNascita + annoNascita;
     
     // Generazione della password
     String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataNascita;
     
     // Stampa della password a video
     System.out.println("La password generata è: " + password);
     
     // Chiusura dello scanner
     scanner.close();
 }
}
