public class Hobbie {
    String Nombre;
    String Dias;
    String Creatividad;

    //CONSTRUCTOR
    public Hobbie(String Nombre, String Dias, String Creatividad){
        this. Nombre=Nombre;
        this.Dias=Dias;
        this.Creatividad=Creatividad;
    }
    //GETTERS
    public String getnombre(){
        return Nombre;
    }
    public String getdias(){
        return Dias;
    }

    public String getcreatividad(){
        return Creatividad;
    }

    //SETTERS
    public void setnombre(String Nombre){
        this.Nombre=Nombre;
    }
    public void setdias(String Dias){
        this.Dias=Dias;
    }
    public void setcreatividad(String Creatvidad){
        this.Creatividad=Creatividad;
    }

    //METODO PERSONALIZADA
    public void saludo(){
        System.out.println("Hola a todos desde Hobbie");
    }
}
