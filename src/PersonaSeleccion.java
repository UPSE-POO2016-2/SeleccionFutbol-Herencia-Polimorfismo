
public abstract class PersonaSeleccion {

	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	PersonaSeleccion(int id, String nombre, String apellidos)
	{
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	PersonaSeleccion(int id, String nombre, String apellidos, int edad)
	{
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public void concentrarse()
	{
		System.out.println(this.nombre + " " + this.apellidos + " esta Super concentrado!");
	}
	
	public void viajar()
	{
		System.out.println(this.nombre + " " + this.apellidos + " esta viajando con la seleccion.");
	}
	
	public abstract void partidoFutbol();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
