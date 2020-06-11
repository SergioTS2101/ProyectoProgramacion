package pruebas;

import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;

import clases.Citas;

public class pruebaCita {

	public static void main(String[] args) {
		Citas c1 = new Citas();

		miMarco ventana1 = new miMarco();
		
		miMarco.setVisible(true);
		
		
				
		System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
		Scanner sc = new Scanner(System.in);
		String fecha = sc.nextLine();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date testDate = null;
		String date = fecha;
		try {
			testDate = df.parse(date);
			System.out.println("Ahora hemos creado un objeto date con la fecha indicada, " + testDate);
		} catch (Exception e) {
			System.out.println("invalid format");
		}

		if (!df.format(testDate).equals(date)) {
			System.out.println("invalid date!!");
		} else {
			System.out.println("valid date");
		}

	}
	
	class miMarco extends JFrame {
		public miMarco() {
			setBounds(500, 300, 500, 300);

			setResizable(true);

			setTitle("Citas");
			
		}
		public void paintComponent(Graphics g) {
		}
	}
}
