import java.util.ArrayList;

public class Proyecto {
	private String nombreProyecto;
	private String descripcion;
	public ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	public GerenteProyecto gerente;
	public Empresa cantidadProyectos;

	public String getNombreProyecto() {
		return this.nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}