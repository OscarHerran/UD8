package Ejercicio4;

public class Series {
	protected String titulo;
	protected int seasons;
	protected boolean estregado;
	protected String genre;
	protected String creator;
		
	//CONSTRUCTOR POR DEFECTO
	
	public Series() {
		this.titulo = "";
		this.seasons = 3;
		this.estregado = false;
		this.genre = "";
		this.creator = "";
	}
	//CONSTRUCTOR CON PARÁMETRO CREADOR Y TÍTULO
	
	public Series(String title, String creator ) {
		this.titulo = title;
		this.seasons = 3;
		this.estregado = false;
		this.genre = "";
		this.creator = creator;
	}
	//CONSTRUCTOR CON TODOS LOS PAR{AMETROS
	
	public Series(String title, int season, String genre, String creator) {
		this.titulo = title;
		this.seasons = season;
		this.estregado = false;
		this.genre = genre;
		this.creator = creator;
	}
	
// MÉTODOS DE ACCESO
	public String getTitle() {
		return titulo;
	}
	public void setTitle(String title) {
		this.titulo = title;
	}
	public int getSeasons() {
		return seasons;
	}
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	public boolean isDelivered() {
		return estregado;
	}
	public void setDelivered(boolean delivered) {
		this.estregado = delivered;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public void deliveredVerified(String entrega) {
		if(entrega.equals("si")) {
			this.estregado = true;
		}
	}
	
	@Override
	public String toString() {
		return "Series \nTítulo = " + titulo + "\nTemporadas = " + seasons + "\nEntregado = " + estregado + "\nGénero = " + genre
				+ "\nCreador = " + creator;
	}
}