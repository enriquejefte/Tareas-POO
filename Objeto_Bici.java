//Enrique Pereira
//No. de cuenta: 201710030084
//Tarea #4

public class Main {

public static void main(String[] args) {

    //Creando el objeto lavadora

    Lavadora lavadora = new Lavadora();
    lavadora.setMarca("Whirlpool");
    lavadora.setModelo("WLS500");
    lavadora.setPrecio (2000);
    

System.out.println("Marca: " + lavadora.getMarca() );
System.out.println("Modelo: " + lavadora.getModelo() );
System.out.println("Precio: " + lavadora.getPrecio() );

}

public static class Lavadora{

    //Private hace que los atributos sean accedidos dentro de la clase

    private String marca;
    private String modelo;
    private int precio;    

    //Métodos públicos para acceder a los datos

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getPrecio(){
        return precio;
    }


    //Métodos públicos para establecer los datos

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    //Haciendo una cambio para este archivo probando GitHub
   }
  }