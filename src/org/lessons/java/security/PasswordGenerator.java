package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
 public static void main(String[] args) {
     // Creazione dell'oggetto Scanner
     Scanner scanner = new Scanner(System.in);
     
     // Lettura del nome
     System.out.print("Inserisci il tuo nome: ");
     String name = scanner.nextLine();
     
     // Lettura del cognome
     System.out.print("Inserisci il tuo cognome: ");
     String surname = scanner.nextLine();
     
     // Lettura del colore preferito
     System.out.print("Inserisci il tuo colore preferito: ");
     String favoritColor = scanner.nextLine();
     
     // Lettura del giorno di nascita
     System.out.print("Inserisci il giorno di nascita: ");
     int birthDay = scanner.nextInt();
     
     // Lettura del mese di nascita
     System.out.print("Inserisci il mese di nascita: ");
     int birthMonth = scanner.nextInt();
     
     // Lettura dell'anno di nascita
     System.out.print("Inserisci l'anno di nascita: ");
     int birthYear = scanner.nextInt();
     
     // Calcolo della somma di giorno, mese e anno di nascita
     int sumBirthdate = birthDay + birthMonth + birthYear;
     
     // Generazione della password
     String password = name + "-" + surname + "-" + favoritColor + "-" + sumBirthdate;
     
     // Stampa della password a video
     System.out.println("La password generata è: " + password);
     
     // Chiusura dello scanner
     scanner.close();
 }
}
