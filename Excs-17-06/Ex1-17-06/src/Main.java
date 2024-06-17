import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Contacto> contactos = new ArrayList<>();

        contactos.add(new Contacto("Vando", 919000000));
        contactos.add(new Contacto("Julio", 919000001));
        contactos.add(new Contacto("Carlos", 919000002));

        System.out.println(contactos);
        System.out.println(contactos.get(0));
        System.out.println(contactos.get(1).getNumero());

        contactos.remove(0);
        System.out.println(contactos);


        System.out.println(contactos.get(0));
        contactos.set(0, new Contacto("Oscar", 919000003));
        System.out.println(contactos);

        for(int i = 0 ; i < contactos.size() ; i++){
            if(contactos.get(i).getNome().contains("Carlos")){
                System.out.println(contactos.get(i).getNumero());

            }
        }










    }
}