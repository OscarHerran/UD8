package Ejercicio4;
import javax.swing.JOptionPane;


//SERIE CON ATRIBUTOS
public class SeriesApp {

	public static void main(String[] args) {
		IniProgram();
	}
	
	public static void IniProgram() {
		String text = JOptionPane.showInputDialog("Desea almacenar serie");
		
		if(text.toLowerCase().equals("si")) {
			while(text.toLowerCase().equals("si")) {
				String titulo = JOptionPane.showInputDialog("Indique nombre serie");
				String season = JOptionPane.showInputDialog("Indique temporadas de la serie");
				int seasons = Integer.parseInt(season);
				String entregado = JOptionPane.showInputDialog("Indique si tiene entregas con (si) o (no)");
				String genre = JOptionPane.showInputDialog("Indique género de serie");
				String creator = JOptionPane.showInputDialog("Indique creador de la serie");
				text = JOptionPane.showInputDialog("Desea almacenar serie");
				Series serie = new Series(titulo, seasons, genre, creator );
				serie.deliveredVerified(entregado);
				System.out.println(serie.toString());
				
				text = JOptionPane.showInputDialog("Desea almacenar serie");
			}
			JOptionPane.showMessageDialog(null, "cierre la ventana");
		}else {
			JOptionPane.showMessageDialog(null, "cierre la ventana");
		}
	}

}