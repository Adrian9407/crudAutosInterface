import java.util.ArrayList;
import java.util.List;

public class LogicaMetodos implements Metodos, Metodos2{
	
	List<Autos> lista = new ArrayList<Autos>();

	@Override
	public void guardar(Autos auto) {
		
		lista.add(auto);
	}

	@Override
	public List<Autos> mostrar() {
		
		
		return lista;
	}

	@Override
	public Autos buscar(int indice) {
		
		
		Autos autoEncontrado = null;
		
		autoEncontrado = lista.get(indice);
		return autoEncontrado;
	}

	@Override
	public void editar(int indice, Autos auto) {
		
		lista.set(indice, auto);
		
	}

	@Override
	public void eliminar(int indice) {
		
		lista.remove(indice);
	}

	@Override
	public int tamanoLista() {
	
		return lista.size();
	}

}
