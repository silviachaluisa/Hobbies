public class Senderismo extends Hobbie {
    public Senderismo(String Nombre, String Dias, String Creatividad){
        super(Nombre,Dias,Creatividad);
    }
    //METODO PERSONALIZADO
    public void saludoSenderismo(){
        System.out.println("Este es mi saludo desde Senderismo");
        System.out.println("Mi nombre es: ");
        System.out.println(this.getnombre());
        System.out.println("Voy de Senderismo los dias: ");
        System.out.println(this.getdias());
        System.out.println("La creatividad depende de lo que tenga ganas de hacer: ");
        System.out.println(this.getcreatividad());
    }
}
