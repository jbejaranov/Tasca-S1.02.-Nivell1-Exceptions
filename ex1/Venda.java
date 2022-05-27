package ex1;

import java.io.IOException;
import java.util.ArrayList;

public class Venda {

	static ArrayList<Producte> arrayListProductes = new ArrayList<Producte>();

	// private static ArrayList<Producte> arrayListProductes;
	private static double preuTotal;

	// Constructor
	public Venda(ArrayList<Producte> producte, int preuTotal) {

		this.arrayListProductes = new ArrayList<Producte>();
		this.preuTotal = 0;

	}

//		if (arrayListProductes.size() != 0) {
//			calcularTotal();
//		} else {
//			calcularTotal();
//		}
//	}

//Getters i Setters
	public ArrayList<Producte> getProductes() {
		return arrayListProductes;
	}

	public static ArrayList<Producte> getArrayListProductes() {
		return arrayListProductes;
	}

	public static void setArrayListProductes(ArrayList<Producte> arrayListProductes) {
		Venda.arrayListProductes = arrayListProductes;
	}

	public static void setPreuTotal(double preuTotal) {
		Venda.preuTotal = preuTotal;
	}

	public void setProductes(ArrayList<Producte> arrayListProductes) {
		this.arrayListProductes = arrayListProductes;
	}

	public double getPreuTotal() {
		return preuTotal;
	}

	public void setPreuTotal(int preuTotal) {
		this.preuTotal = preuTotal;
	}

//Altres metodes
	public static void calcularTotal() throws VendaBuidaException {

		if (arrayListProductes.size() != 0) {
			for (int i = 0; i < arrayListProductes.size(); i++) {
				preuTotal += arrayListProductes.get(i).preu;
			}

			System.out.println("El preu total dels productec es: " + preuTotal);

		} else {
			throw new VendaBuidaException(getMessage());
		}

	}

//		try {
//			for (int i = 0; i < arrayListProductes.size(); i++) {
//				preuTotal += arrayListProductes.get(i).preu;
//			}
//
//			System.out.println("El preu total dels productec es: " + preuTotal);
//		} catch (VendaBuidaException e) {
//			System.out.println(getMessage());
//
//		}
//	}

//		if (arrayListProductes.size() == 0) {
//			System.out.println(getMessage());
//
//			// throw new VendaBuidaException(getMessage());
//
//		} else {
//			for (int i = 0; i < arrayListProductes.size(); i++) {
//				preuTotal += arrayListProductes.get(i).preu;
//			}
//
//			System.out.println("El preu total dels productec es: " + preuTotal);
//		}
//	}

	public static String getMessage() {
		return "Per fer una venda primer has d’afegir productes";
	}

	public static void main(String[] args) {

//		Producte producte1 = new Producte("Aigua", 0.60);
//		arrayListProductes.add(producte1);
//
//		Producte producte2 = new Producte("Suc", 2.50);
//		arrayListProductes.add(producte2);
//
//		Producte producte3 = new Producte("Vi", 3.75);
//		arrayListProductes.add(producte3);

		try {
			calcularTotal();
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());

		}
	}
}
