/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj;

/**
 *
 * @author Estudiantes
 */
public class Proj {
int Año;
  String Marca;
  int Cilindraje;
  int Precio;

  public Proj(int year, String name, int cc) {
    Año = year; 
    Marca = name;
    Cilindraje = cc;
  }

  public int actualizarPrecio(int prize){
      Precio = prize;
      return Precio;
  }

    public static void main(String[] args) {
       Proj myCar = new Proj(1969, "Mustang", 1400);
    System.out.println(myCar.Año + " " + myCar.Marca + " " + myCar.Cilindraje +" " + myCar.Precio);
    System.out.println("Nuevo precio: " + myCar.actualizarPrecio(1500));
  }
    }
    
}
