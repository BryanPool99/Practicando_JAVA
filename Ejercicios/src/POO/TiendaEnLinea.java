package POO;
/*
	Crear una clase "Tienda en línea" con atributos como productos y carrito de compras, 
	y métodos para agregar, eliminar y comprar productos.
*/
import java.util.ArrayList;
public class TiendaEnLinea {
	private ArrayList<String> productos;
	private ArrayList<String> carritoDeCompras;
	
	public TiendaEnLinea() {
		productos=new ArrayList<String>();
		carritoDeCompras=new ArrayList<String>();
	}
	//metodo para agregar producto
	public void agregarProducto(String producto) {
		productos.add(producto);
		System.out.println(producto+" ha sido agregado a la tienda");
	}
	//metodo para eliminar producto
	public void eliminarProducto(String producto) {
		if(productos.remove(producto)) {
			System.out.println(producto+" ha sido eliminado de la tienda");
		}else {
			System.out.println(producto+" no se encuentra disponible");
		}
	}
	//metodo para agregar al carrito
	public void agregarAlCarrito(String producto) {
		if(productos.contains(producto)) {
			carritoDeCompras.add(producto);
			System.out.println(producto + " ha sido agregado al carrito.");
		}else {
			System.out.println(producto+" no se encuentra disponible en la tienda");
		}
	}
	//metodo para eliminar del carrito
	public void eliminarDelCarrito(String producto) {
		if(carritoDeCompras.remove(producto)) {
			System.out.println(producto+" ha sido eliminado del carrito");
		}else {
			System.out.println(producto+" no se encontro en el carrito");
		}
	}
	//metodo para comprar productos
	public void comprar() {
		if(carritoDeCompras.isEmpty()) {
			System.out.println("No hay productos en el carrito de compras");
		}else {
			System.out.println("Compra realizada.Usted compro los siguientes productos :");
			for (String producto : carritoDeCompras) {
				System.out.println("- " + producto);
                productos.remove(producto);
			}
			carritoDeCompras.clear();
		}
	}
	//Test
	public static void main(String[] args) {
		TiendaEnLinea tienda = new TiendaEnLinea();
		 tienda.agregarProducto("Camisa");
	     tienda.agregarProducto("Pantalón");
	     tienda.agregarAlCarrito("Camisa");
	     tienda.agregarAlCarrito("Pantalón");
	     tienda.agregarAlCarrito("Zapatos");
	     tienda.eliminarDelCarrito("Camisa");
	     tienda.comprar();
	}
}
