
public class Futbolista extends PersonaSeleccion {
	private int dorsal;
	private Posicion posicion;
	
	Futbolista(int id, String nombre, String apellido, int edad, int dorsal, Posicion posicion)
	{
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.posicion = posicion;
	}
	
	public void jugarPartido()
	{
		System.out.println("Jugando el partido como si fuera una final, semana a semana"
				+ "con la confianza del profe");
	}
	
	public void entrenar()
	{
		System.out.println("Entrenando semana a semana"
				+ "para ganarse la confianza del profe....");
	}
	
	public void fingirLesion()
	{
		System.out.println("Piscinazo -> ouch, ojala me den penal como a la sub 20!");
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public void partidoFutbol() {
		System.out.println("En cancha, el jugador "
				+ this.getNombre() + " " + this.getApellidos()
				+ " con el numero " + this.getDorsal()
				+ " se desempena como " + this.getPosicion());
		
	}
	
	
}
