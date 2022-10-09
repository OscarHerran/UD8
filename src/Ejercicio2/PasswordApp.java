package Ejercicio2;
import javax.swing.JOptionPane;

//Password


		public class PasswordApp {	


		public static void main(String[] args) {
			
			startProgram();
		}

		public static void startProgram() {
			String contraseña = JOptionPane.showInputDialog("Desea genererar contraseña ? \nMarque 1 para generar contraeña \nMarque 2 para salir del programa ");
			int response = Integer.parseInt(contraseña);
			boolean continu = false;
			
			if(response == 1) {
				continu = true;
				do {
					String longi = JOptionPane.showInputDialog("Indique la longitud que desea = ?");
					int longitude = Integer.parseInt(longi);
					Password password = new Password(longitude);
					JOptionPane.showConfirmDialog(null, "La nueva contraseñ@ es = " + password.createPassword());
					contraseña = JOptionPane.showInputDialog("Desea genererar contraseña ? \nMarque 1 para generar contraeña \nMarqe 2 para salir del programa ");
					response = Integer.parseInt(contraseña);
				}while(continu);
			} else {
				JOptionPane.showMessageDialog(null, "hasta luego " );
			}
		}
	}