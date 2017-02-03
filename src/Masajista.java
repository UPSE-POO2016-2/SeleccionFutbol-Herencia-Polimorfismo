
public class Masajista extends PersonaSeleccion{
	
	private int aniosExperiencia;
	private String titulo;
	
	Masajista(int id, String nombre, String apellido, int edad, int aniosExperiencia, String titulo)
	{
		super(id, nombre, apellido, edad);
		this.aniosExperiencia = aniosExperiencia;
		this.titulo = titulo;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void darMasaje()
	{
		System.out.println("Dando masaje... ohhh si por eso soy masajista!");
	}

	@Override
	public void partidoFutbol() {
		System.out.println("En el partido estoy listo "
				+ "para entrar y poner curitas "
				+ "a los que necesitan. "
				+ "Tambien doy masajes, pero no de ese tipo!");
		
	}
	
	
}
