package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //registrar-buscar todos-buscar uo-modificar un estudiante
        //estudiante tiene id-nombre-cedula

        //ENTRADAS
        Scanner lea = new Scanner(System.in);
        ArrayList<HashMap<String, Object>>estudiantes=new ArrayList<>();

        System.out.println("menu");
        System.out.println("1-registar");
        System.out.println("2-buscarlos");
        System.out.println("3-buscar por nombre");
        System.out.println("4-modificar");
        int opcion;
        do {
            HashMap<String,Object>estudiante = new HashMap<>();
            System.out.print("Digite una opcion");
            opcion=lea.nextInt();
            lea.nextLine();

            if (opcion==1){
                System.out.println("Digite el nombre del estudiante: ");
                String nombreStudiante = lea.nextLine();

                System.out.println("Digite la cedula: ");
                String cedulaEstudiante = lea.nextLine();

                int idEstudiante = new Random().nextInt(100);

                estudiante.put("id",idEstudiante);
                estudiante.put("nombre",nombreStudiante);
                estudiante.put("cedula",cedulaEstudiante);

                estudiantes.add(estudiante);
            }
            else if (opcion==2){}
            else if (opcion==3){}
            else if (opcion==4){}
            else if (opcion==5);
            else{}
        }while (opcion != 0);
        
    }
}