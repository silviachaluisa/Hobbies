public class Leer extends Senderismo{
    public Leer (String Nombre, String Dias, String Creatividad){
        super(Nombre,Dias,Creatividad);
    }
    //METODO PERSONALIZADO
    public void saludoLeer(){
        System.out.println("Este saludo es desde Leer");
        System.out.println("Mi nombre es: ");
        System.out.println(this.getnombre());

    }
}
