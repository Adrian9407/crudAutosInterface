
public class Principal {

	public static void main(String[] args) {
		
		//Guardar
		//Coleccion de objetos
		
		Autos auto1 = new Autos(1234, "Mazda", "tg67", 567000f);
		Autos auto2 = new Autos(7612, "Nissan", "we67", 580000f);
		Autos auto3 = new Autos(5980, "Kiar", "yu67", 787000f);
		
		//Instancia de clase-----ya tenemos acceso a todo lo que contenga esa clase
		LogicaMetodos imp = new LogicaMetodos();
		
		//Guardar
		imp.guardar(auto1);
		imp.guardar(auto2);
		imp.guardar(auto3);
		
		//Mostrar
		System.out.println(imp.mostrar());
		
		//Buscar
		Autos autoEn = imp.buscar(1);
		System.out.println("Se encontro " + autoEn);
		
		//Editar----modelo
		
		autoEn.setModelo("Corolla");
		imp.editar(1, autoEn);
		
		
		//Mostrar
         System.out.println(imp.mostrar());
         
         //Eliminar
         imp.eliminar(0);
         
       //Mostrar
 		System.out.println(imp.mostrar());
 		
 		
 		//Contar
 		System.out.println(imp.tamanoLista());
	}

}
