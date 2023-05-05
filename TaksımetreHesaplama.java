package java101;

import java.util.Scanner;

public class TaksımetreHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int km;
		double perKm = 2.20, total = 10;

		Scanner input = new Scanner(System.in);
		System.out.print("Kaç KM yol gidileceğini giriniz: ");
		km = input.nextInt();

		total += (km * perKm);

		total = (total < 20) ? 20 : total;

		System.out.println("Toplam Tutar: " + total);

	}

}
