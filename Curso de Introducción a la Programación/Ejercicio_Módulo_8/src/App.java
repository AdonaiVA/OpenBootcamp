
public class App {
    public static void main(String[] args) throws Exception {
    
    class Persona{
            private int edad;
            private String name;
            private int telefono;
        
            public void setEdad(int edad) {
                this.edad = edad;
            }
            public int getEdad() {
                return edad;        
            }
            public void setName(String name){
                this.name = name;
            }
            public String getName(){
                return name;
            }
            public void setTelefono(int telefono){
                this.telefono = telefono;
            }
            public int getTelefono(){
                return telefono;
            }
        
        }
        Persona Adonai = new Persona();

        Adonai.setEdad(24);
        Adonai.setName("Adonai Vázquez Alarcón");
        Adonai.setTelefono(228405974);   


        int edad = Adonai.getEdad();
        String name = Adonai.getName();
        int telefono = Adonai.getTelefono();

        System.out.println(edad);
        System.out.println(name);
        System.out.println(telefono);
    }
}


