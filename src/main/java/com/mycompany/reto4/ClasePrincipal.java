/* David Mejía Castaño 1007221842
   Jonathan David Ardila Gómez 101476851 */

package com.mycompany.reto4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class ClasePrincipal {

    public static void main(String[] args) {
        int confirmacion = 0; 
        Scanner lector = new Scanner(System.in);
        EmprendimientoPanel arrays = new EmprendimientoPanel();
        while (confirmacion != 7) {
            System.out.println("\n1. Agregar Panel \n2. Agregar Seguro \n3. Agregar Venta \n"
                    + "4. Lista Paneles \n5. Lista Seguros \n6. Lista Ventas \n7. Salir \n Digite la opción: " );
            confirmacion = lector.nextInt();
            switch (confirmacion) {
                case 1: 
                    System.out.println("Digite el identificador numérico del panel: ");
                    int id = lector.nextInt();
                    System.out.println("Digite el identificador de serie del panel (opcional): ");
                    lector.nextLine();
                    String identificador = lector.nextLine();
                    System.out.println("Digite la descripción del panel: ");
                    String descripcion = lector.nextLine();
                    System.out.println("Digite el tipo del panel: ");
                    String tipo = lector.nextLine();
                    System.out.println("Digite el nombre del modelo del panel: ");
                    String modelo = lector.nextLine();
                    System.out.println("Digite el año de fabricación del panel: ");
                    int año = lector.nextInt();
                    System.out.println("Digite el precio de venta: ");
                    double precio = lector.nextDouble();
                    arrays.addPaneles(new PanelesSolares(id, identificador, descripcion, tipo, modelo, año, precio));
                    break;
                case 2: 
                    lector.nextLine();
                    System.out.println("Digite el nombre de la empresa de seguros: ");
                    String nombreEmpresaSeguros = lector.nextLine();
                    System.out.println("Digite la fecha de inicio de la cobertura del seguro (AAAA-MM-DD): ");
                    LocalDate fechaInicio = LocalDate.parse(lector.next());
                    System.out.println("Digite la fecha de finalizacion de la cobertura del seguro (AAAA-MM-DD): ");
                    LocalDate fechaFinalizacionCobertura = LocalDate.parse(lector.next());
                    System.out.println("Digite la descripción del seguro: ");
                    lector.nextLine();
                    String descripcionS = lector.nextLine();
                    System.out.println("Digite el identificador numérico del panel: ");
                    int idPanelS = lector.nextInt();
                    arrays.addSeguros(new Seguro(nombreEmpresaSeguros, fechaInicio, fechaFinalizacionCobertura, descripcionS, idPanelS));
                    break;
                case 3: 
                    System.out.println("Digite el identificador numérico del panel vendido: ");
                    int idPanelV = lector.nextInt();
                    System.out.println("Digite la fecha y hora de inicio de la venta (AAAA-MM-DDThh:mm:ss): ");
                    LocalDateTime fechaHora = LocalDateTime.parse(lector.next());
                    System.out.println("Digite tipo de documento del cliente: ");
                    lector.nextLine();
                    String documento = lector.nextLine();
                    System.out.println("Digite el número de documento del cliente: ");
                    int numeroDocumento = lector.nextInt();
                    System.out.println("Digite el nombre completo del cliente: ");
                    lector.nextLine();
                    String nombre = lector.nextLine();
                    System.out.println("Digite el valor a pagar: ");
                    double valorPagar = lector.nextDouble();
                    System.out.println("Digite la descripición del uso del panel: ");
                    lector.nextLine();
                    String descripcionV = lector.nextLine();
                    arrays.addVentas(new Venta(idPanelV, fechaHora, documento, numeroDocumento, nombre, valorPagar, descripcionV));
                    break;
                case 4:
                    ArrayList <PanelesSolares> paneles = arrays.getPaneles();
                    for (int i = 0; i < paneles.size();i++) {
                        System.out.println(paneles.get(i).toString());
                        System.out.println(paneles.get(i).calcularAntiguedad());
                    }
                    break;
                case 5:
                    ArrayList <Seguro> seguro = arrays.getSeguros();
                    for (int i = 0; i < seguro.size();i++) {
                        System.out.println(seguro.get(i).toString());
                        System.out.println(seguro.get(i).calcularDiasCobertura());
                    }
                    break;
                case 6:
                    ArrayList <Venta> venta = arrays.getVentas();
                    for (int i = 0; i < venta.size();i++) {
                        System.out.println(venta.get(i).toString());
                        System.out.println(venta.get(i).calcularDiasVenta());
                    }
                    break;
            }
               
        }
    }
}
