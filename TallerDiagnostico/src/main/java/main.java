
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edx
 *
 */







public class main {
    public static Scanner scanner = new Scanner(System.in);
    
        public static void punto1(){
           int CantidadBodega ;
   int CantidadMinima ;
   
   System.out.println("Ingrese la cantidad minima");
   
   CantidadMinima = scanner.nextInt();
   
   System.out.println("Ingrese la cantidad en bodega");

   CantidadBodega = scanner.nextInt();
   
   if(CantidadBodega > CantidadMinima){
       System.out.println("Se necesita llamar al proveedor");

} 
        
    }

    public static void punto2(){
           int CantidadBodega ;
   int CantidadMinima ;
   
   System.out.println("Ingrese la cantidad minima");
   
   CantidadMinima = scanner.nextInt();
   
   System.out.println("Ingrese la cantidad en bodega");

   CantidadBodega = scanner.nextInt();
   
   if(CantidadBodega > CantidadMinima){
       System.out.println("No se necesita llamar al proveedor");

} else  {
           System.out.println("Se necesita llamar al proveedor");

}
        
    }
    public static void punto3(){
       int CantidadBodega ;
   int CantidadMinima ;
   
   
   System.out.println("Ingrese la cantidad minima");
   
   CantidadMinima = scanner.nextInt();
   
   System.out.println("Ingrese la cantidad en bodega");

   CantidadBodega = scanner.nextInt();
   
   if(10 > CantidadBodega && CantidadBodega > CantidadMinima){
       System.out.println("No se necesita llamar al proveedor, peligro queda menos de 10 en bodega");

} else if ( CantidadBodega > CantidadMinima) {
           System.out.println("No se necesita llamar al proveedor");

} else {
         System.out.println("No queda en bodega");
}  
    }
    
    
public static void punto4(){
       int CantidadBodega ;
   int CantidadMinima ;
   int saldo;
   int compraDeseada;
   int valorDeCompra;   
   int valorEnCaja;
   
   System.out.println("Ingrese la cantidad en bodega");

   CantidadBodega = scanner.nextInt();
   
   System.out.println("Ingrese la cantidad minima");
   
   CantidadMinima = scanner.nextInt();
   
   
   saldo=CantidadBodega-CantidadMinima;
   
if (CantidadMinima<=CantidadBodega) {
    System.out.println("Puede vender");
    System.out.println("Quedan "+saldo+" por vender");
    if(saldo<10){
            System.out.println("Alerta, contactar a proveedor");
    }    
} else {
    System.out.println("pedir al proveedor");
    
    System.out.println("Ingrese la compra deseada");
    compraDeseada = scanner.nextInt();
    
    System.out.println("Ingrese el valor de compra");
    valorDeCompra = scanner.nextInt();
    
    System.out.println("Ingrese el valor en caja ");
    valorEnCaja = scanner.nextInt();
    
    if ((valorEnCaja>(compraDeseada*valorDeCompra))&&(CantidadMinima<=(compraDeseada+CantidadBodega))){ 
        //hay plata y las unidades compradas son suficientes para la cantidad requerida
        System.out.println("Puede vender haciendo pedido al proveedor");
    }
    else if (valorEnCaja<(compraDeseada*valorDeCompra)){
        System.out.println("No es posible realizar el pedido ");
    }
    else{
     System.out.println("pedir al proveedor");       
    } 
   
   
   
    
}

    }
    
    
    public static void punto5(){
        System.out.println("Ingrese el dia");
            int opcion = scanner.nextInt();
        System.out.println("Ingrese el precio");
             double precio = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Elegiste el dia 1");
                precio = precio-(precio*0.05);
                break;
            case 2:
                System.out.println("Elegiste el dia 2");
                precio = precio-(precio*0.03);
                break;
            case 3:
                System.out.println("Elegiste el dia 3");
                precio = precio-(precio*0.1);
                break;
            case 4:
                System.out.println("Elegiste el dia 4");
                precio = precio-(precio*0.04);
                break;
            case 5:
                System.out.println("Elegiste el dia 5");
                precio = precio-(precio*0.06);
                break;
            case 6:
                System.out.println("Elegiste el dia 6");
                precio = precio-(precio*0.02);
                break;
            case 7:
                System.out.println("Elegiste el dia 7");
                precio = precio-(precio*0.01);
                break;                
            default:
                System.out.println("Opción inválida");
                break;
        }
    
        
    }

public static void punto6(){
       
   int CantidadTiposProducto;
   int CantidadProductos;
   int ValorProducto;
   int TotalCompra = 0;
   
    System.out.println("Ingrese la cantidad de tipos de producto: ");
    CantidadTiposProducto = scanner.nextInt();
    
    for(int i=0;CantidadTiposProducto > i;i++){
        System.out.println("Ingrese la cantidad de productos del producto"+i+" : ");
        CantidadProductos = scanner.nextInt();
        System.out.println("Ingrese el valor del producto : ");
        ValorProducto = scanner.nextInt();        
        TotalCompra = CantidadProductos * ValorProducto + TotalCompra;
    }
        System.out.println("El total es de :"+TotalCompra);
}    
    
    public static void main(String[] args) {
   
    
    System.out.println("Ingrese la opcion a ejecutar");
   
    int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Elegiste la opción 1");
                break;
            case 2:
                System.out.println("Elegiste la opción 2");
                break;
            case 3:
                System.out.println("Elegiste la opción 3");
                break;
            case 4:
                System.out.println("Elegiste la opción 4");
                punto4();
                break;
            case 5:
                System.out.println("Elegiste la opción 5");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    

    
}

    
}
