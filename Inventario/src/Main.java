import java.util.Scanner;

public class Main {
    public static int index =1;
    public static void main(String[] args) {
        Scanner objScan = new Scanner(System.in);

        System.out.printf("""
                         * 1. Agregar
                         * 2. Eliminar
                         * 3. Buscar por nombre
                         * 4. Buscar por categoria
                         * 5. Listar inventario
                         * 6. Salir
                """);

        int option = objScan.nextInt();
        Inventario objInventario = new Inventario();

        do {
            switch (option){
                case 1:
                    objScan.nextLine();
                    System.out.println("Ingresa el nombre del nuevo producto");
                    String name = objScan.nextLine();
                    System.out.println("Ingresa el precio del nuevo producto");
                    double price = Double.parseDouble(objScan.nextLine());
                    System.out.println("Ingresa la categoria del nuevo producto");
                    String category = objScan.nextLine();
                    System.out.println("Ingresa la marca del nuevo producto");
                    String brand = objScan.nextLine();
                    ProductoEspecifico objProduct = new ProductoEspecifico(index,name,price,category,brand);
                    index++;
                    objInventario.agregarProducto(objProduct);
                    break;
                case 2:
                    objInventario.listarProductos();
                    System.out.println("Ingresa el ID del producto que deseas eliminar");
                    int codigo = objScan.nextInt();
                    objInventario.eliminarProducto(codigo);
                    System.out.println("Eliminado correctamente");
                    break;
                case 3:
                    objScan.nextLine();
                    System.out.println("Ingresa el nombre del producto que deseas buscar");
                    String searchName = objScan.nextLine();
                    if (objInventario.buscarPorNombre(searchName) == null) {
                        System.out.println("No se encontró");
                    } else {
                        System.out.println(objInventario.buscarPorNombre(searchName));
                    }
                    break;
                case 4:
                    objScan.nextLine();
                    System.out.println("Ingresa el nombre del producto que deseas buscar");
                    String searchCategory = objScan.nextLine();
                    if (objInventario.buscarPorNombre(searchCategory) == null) {
                        System.out.println("No se encontró");
                    } else {
                        System.out.println(objInventario.buscarPorNombre(searchCategory));
                    }
                    break;
                case 5:
                    objInventario.listarProductos();
                    break;
                case 6:
                    break;
            }
        }while(option!=6);





    }




}