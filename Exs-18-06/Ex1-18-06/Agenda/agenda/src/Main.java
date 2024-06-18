
/*

add contacto
editar contacto
remover contacto
listar

-- pesquisar <--- ?

 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Agenda ag = new Agenda();
        int sair = 1;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("[1] - Adicionar contacto");
            System.out.println("[2] - Editar contacto");
            System.out.println("[3] - Remover contacto");
            System.out.println("[4] - Listar contactos\n");
            System.out.println("[0] - Sair");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Digite o nome:");
                    String nome = scanner.next();
                    System.out.println("Digite o telefone");
                    int telefone = scanner.nextInt();
                    ag.addContacto(nome, telefone);
                    System.out.println(nome + " foi adicionado.");
                    break;
                case 2:
                    System.out.println("Digite o nome do contacto a editar:");
                    String nomec = scanner.next();
                    Contacto ct = ag.findContacto(nomec);
                    if (ct != null) {
                        System.out.println("Digite o novo nome:");
                        String novonome = scanner.next();
                        System.out.println("Digite o novo telefone:");
                        int novtele = scanner.nextInt();
                        ag.editarContacto(ct, novonome, novtele);
                        System.out.println("Contacto alterado.");
                    }else{
                        System.out.println("Contacto não existe.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do contacto a eliminar:");
                    String nomec2 = scanner.next();
                    Contacto ct2 = ag.findContacto(nomec2);
                    if (ct2 != null) {
                        ag.delContacto(ct2);
                        System.out.println("Contacto removido.");
                    }else{
                        System.out.println("Contacto não existe.");
                    }
                    break;
                case 4:
                    System.out.println("Contactos:");
                    ag.listarContactos();
                    break;
                case 0:
                    sair = 0;
                    break;
                default:
                    System.out.println("Valor inválido!");
                    break;
            }
        }while (sair == 1);



        /*Contacto ct = new Contacto("Joao", 12345);
        Contacto ct2 = new Contacto("carlos", 981231213);

      //  System.out.println(ct.equals(ct2));
       // System.out.println(ct == ct2);
        ag.addContacto(ct);
        ag.addContacto(ct2);
        ag.addContacto("Rita", 192121232);

        ag.listarContactos();

        System.out.println("-----------");
        ag.delContacto(ct);

        ag.listarContactos();


        System.out.println("---------------singleton------------");




        Agenda.myAgenda.addContacto(ct);
        Agenda.myAgenda.addContacto(ct2);
        Agenda.myAgenda.addContacto("Rita", 192121232);

        Agenda.myAgenda.listarContactos();

        System.out.println("-----------");
        Agenda.myAgenda.delContacto(ct);

        Agenda.myAgenda.listarContactos();

        System.out.println("-----------");
        Agenda.myAgenda.delContacto(55);

        Agenda.myAgenda.listarContactos();

        Agenda.myAgenda.editarContacto(0, "Novo Nome Cool");

        Agenda.myAgenda.listarContactos();


        Contacto ctx = Agenda.myAgenda.findContacto("Novo Nome Cool");

        System.out.println(ctx.toString());


    *\

        /*

        criarem um menu
        tornarem a app funcional

        int opt;
        switch(opt){


        }

         */
    }

}