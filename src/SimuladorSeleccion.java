
public class SimuladorSeleccion {

	public static void main(String args[])
	{
		System.out.println("Futbolista");
		Futbolista gaibor = new Futbolista(-1, "Fernando", "Gaibor", 22, 10, Posicion.VOLANTE);
		gaibor.entrenar();
		gaibor.concentrarse();
		gaibor.viajar();
		gaibor.jugarPartido();
		gaibor.fingirLesion();
		gaibor.partidoFutbol();
		System.out.println("");
		
		System.out.println("Masajista");
		Masajista roca = new Masajista(22, "xxx", "Roca", 22, 22, "Masajista PRO");
		roca.concentrarse();
		roca.viajar();
		roca.partidoFutbol();
		roca.darMasaje();
		System.out.println("");
		
		System.out.println("Entrenador");
		Entrenador almada = new Entrenador(252, "Guillermo", "Almada", "bsc86", EstiloEstrategia.MODERADO);
		almada.concentrarse();
		almada.partidoFutbol();
		
	}
}
