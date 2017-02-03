
public class Entrenador extends PersonaSeleccion {

	private String idFederacion;
	private EstiloEstrategia estilo;
	
	
	
	public Entrenador(int id, String nombre, String apellidos, String idFederacion, EstiloEstrategia estilo) {
		super(id, nombre, apellidos);
		this.idFederacion = idFederacion;
		this.estilo = estilo;
	}

	@Override
	public void concentrarse()
	{
		System.out.println("Analiza partidos anteriores y "
				+ "se asesora con monjes budistas!");
	}

	@Override
	public void partidoFutbol() {
		System.out.println("Dirigiendo a estos manes para ganar los 3 puntos... "
				+ "Corre HP!!! Defiende HP...");

	}



	public String getIdFederacion() {
		return idFederacion;
	}



	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}



	public EstiloEstrategia getEstilo() {
		return estilo;
	}



	public void setEstilo(EstiloEstrategia estilo) {
		this.estilo = estilo;
	}
	
	

}
