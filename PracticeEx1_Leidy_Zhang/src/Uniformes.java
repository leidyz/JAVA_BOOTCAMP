
public class Uniformes {
/*
 * - Otra llamada uniformidades, que dispondrá de los atributos id, nombre y unidades.
También aparte de los métodos propios getter y setter, debe disponer de un método para
añadir una unidad al atributo correspondiente y otra para restar una unidad al atributo
correspondiente.
 */
	
	//atributos
	private int uniformeID;
	static private int siguienteUniformeID = 1;
	private String tipoUniforme;
	private int unidades;
	
	
	//cosntructor
	public Uniformes (String tipoUniforme, int unidades ) {
		this.uniformeID = this.siguienteUniformeID;
		this.siguienteUniformeID = (++this.uniformeID);
		this.tipoUniforme = tipoUniforme;
		this.unidades = unidades;
	}
	//getter
	public int getUniformeID() {
		return this.uniformeID;
	}
	public String getTipoUniforme() {
		return this.tipoUniforme;
	}
	
	public int getUnidades() {
		return this.unidades;
	}
	//setter
	
	public void setUniformeID(int uniformeID) {
		this.uniformeID = uniformeID;
	}
	
	public void setTipoUniform(String tipoUniforme) {
		this.tipoUniforme = tipoUniforme;
	}
	
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	//metodos generales
	//debe disponer de un método para
	//añadir una unidad al atributo correspondiente y otra para restar una unidad al atributo
	//correspondiente.
	public void agregarAtributo(String tipoUniforme, int unidades) {
		this.unidades = this.unidades + unidades; 
	}
	
	public void restarAtributo(int uniformeID, String tipoUniforme) {
		--this.unidades;
	}
	//metodos propios
	
}
