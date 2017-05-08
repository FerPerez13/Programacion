//Cuentas Proyecto Banco. Fernando Pérez Andrés

package GestionBanco;

import java.util.*;

public class Cuentas {
    
    private static class ValorNoValido extends Exception{
        public ValorNoValido(){
            System.out.println("ERROR: Los valores decimales hay que expresarlos con ','");
        }
    }
    static Scanner tcl = new Scanner(System.in);
    
    private ArrayList<Ccuenta> cuentas = new ArrayList();
    private int total=cuentas.size(); 
    
    public int menu(){
        System.out.println();
        System.out.println("======= BANCO UNIVERSAL =======");
        System.out.println();
        System.out.println("1. Alta de cuentas");
        System.out.println("2. Consulta de cuenta");
        System.out.println("3. Modificar cuenta");
        System.out.println("4. Anular cuenta");
        System.out.println("5. Listado de cuentas");
        System.out.println("0. Salir");
        System.out.println();
        System.out.println("Seleccione una opción:");
        int sel = tcl.nextInt();
        System.out.println("===============================");
        System.out.println();
        return sel;
    }
    
    public Ccuenta buscarCuenta(){
        System.out.println("===============================");
        System.out.println("¿Como quiere buscar su cuenta?");
        System.out.println("1. Nombre de cliente");
        System.out.println("2. Número de cuenta");
        int sel = tcl.nextInt();
        Ccuenta c = new Ccuenta();
        
        switch(sel){
            case 1:
                System.out.println("===============================");
                tcl.nextLine();
                System.out.println("Dime el nombre del cliente:");
                String busca = tcl.nextLine();
                c = posCuentaNombre(busca);
                break;
            case 2:
                System.out.println("===============================");
                tcl.nextLine();
                System.out.println("Dime el número de cuenta:");
                String busc = tcl.nextLine();
                c = new Ccuenta();
                c = posCuenta(busc);
                break;
        }
        return c; 
    }
    
    public Ccuenta posCuentaNombre(String nom){
        Ccuenta c = new Ccuenta();
        
        for(int i=0; i<total; i++){
            if(cuentas.get(i).getNombre().equals(nom)){
                c = cuentas.get(i);
            }
        }
        return c;
    }
    
    public Ccuenta posCuenta(String numero){
        Ccuenta c = new Ccuenta();
        
        for(int i=0; i<total; i++){
            if(cuentas.get(i).getCuenta().equals(numero)){
                c = cuentas.get(i);
            }
        }
        return c;
    }
    
    public int NuevaCuenta(){
        String nom;
        String num;
        double sald = 0;
        double inter = 0;
        boolean corr = false;
        System.out.println("===============================");
        tcl.nextLine();     // Limpiamos cualquier dato que se haya quedado en el buffer
       
        System.out.println("Nombre:");
        nom = tcl.nextLine();
        System.out.println("Número de cuenta:");
        num = tcl.nextLine();

        System.out.println("Saldo de la cuenta:");
        do{
            try{
                sald = tcl.nextDouble();
                corr = true;
            }catch(InputMismatchException e){
                System.out.println("ERROR: Introduzca el valor con una ','");
                tcl.nextLine();
            }
        }while(!corr);
        corr = false;
        System.out.println("Típo de interés:");
        
        do{
            try{
                inter = tcl.nextDouble();
                corr = true;
            }catch(InputMismatchException e){
                System.out.println("ERROR: Introduzca el valor con una ','");
                tcl.nextLine();
            }
        }while(!corr);
        Ccuenta c = new Ccuenta(nom,num,sald,inter);
        this.cuentas.add(c);
        total++;
        return cuentas.lastIndexOf(c);
    }
    
    public void ModificarCuenta(){
        Ccuenta c = new Ccuenta();
        
        c = buscarCuenta();
        
            System.out.println("===============================");
            System.out.println();
            System.out.println("**** Cuenta encontrada satisfactoriamente ****");
            System.out.println();
            System.out.println("===============================");
            System.out.println("¿Que desea modificar?");
            System.out.println("1. Nombre");
            System.out.println("2. Número");
            System.out.println("3. Saldo");
            System.out.println("4. Interés");
            System.out.println("5. Salir");
            int num = tcl.nextInt();
            System.out.println();
            switch(num){
                case 1:
                    System.out.println("===============================");
                    tcl.nextLine();
                    System.out.println("Nombre nuevo:");
                    String nom = tcl.nextLine();
                    c.setNombre(nom);
                    System.out.println("**** Nombre modificado correctamente ****");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("===============================");
                    tcl.nextLine();
                    System.out.println("Número de cuenta nuevo:");
                    String nume = tcl.nextLine();
                    c.setCuenta(nume);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("===============================");
                    System.out.println("¿Que desea hacer?");
                    System.out.println("1. Ingreso");
                    System.out.println("2. Reintegro");
                    System.out.println("3. Determinar saldo");
                    int sel = tcl.nextInt();
                    System.out.println();
                    double cant = 0;
                    switch(sel){
                        case 1:
                            boolean corr = false;
                            System.out.println("-------------------------------");
                            System.out.println("Cantidad:");
                            do{
                                try{
                                    cant = tcl.nextDouble();
                                    corr = true;
                                }catch(InputMismatchException e){
                                    System.out.println("ERROR: Introduzca el valor con una ','");
                                    tcl.nextLine();
                                }
                            }while(!corr);
                            
                            c.ingreso(cant);
                            System.out.println();
                            break;
                        case 2:
                            corr = false;
                            System.out.println("-------------------------------");                            
                            System.out.println("Cantidad:");
                            do{
                                try{
                                    cant = tcl.nextDouble();
                                    corr = true;
                                }catch(InputMismatchException e){
                                    System.out.println("ERROR: Introduzca el valor con una ','");
                                    tcl.nextLine();
                                }
                            }while(!corr);
                            c.reintegro(cant);
                            System.out.println();
                            break;
                        case 3:
                            corr = false;
                            System.out.println("-------------------------------");                            
                            System.out.println("Cantidad:");
                            do{
                                try{
                                    cant = tcl.nextDouble();
                                    corr = true;
                                }catch(InputMismatchException e){
                                    System.out.println("ERROR: Introduzca el valor con una ','");
                                    tcl.nextLine();
                                }
                            }while(!corr);                            
                            System.out.println();
                            c.setSaldo(cant);
                            break;
                    }
                    break;
                case 4: 
                    boolean corr = false;
                    double inte =0;
                    System.out.println("===============================");
                    System.out.println("Interés nuevo:");
                    do{
                        try{
                            inte = tcl.nextDouble();
                            corr = true;
                        }catch(InputMismatchException e){
                            System.out.println("ERROR: Introduzca el valor con una ','");
                            tcl.nextLine();
                        }
                    }while(!corr);
                    c.setInteres(inte);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("===============================");
                    System.out.println("Saliendo...");
                    System.out.println();
                    break;
            }                    
    }
    
    public void AnularCuenta(){
        Ccuenta c = new Ccuenta();
        c = buscarCuenta();
        cuentas.remove(c);
        total--;
                
    }
    
    public void ConsultarCuenta(){
        Ccuenta c = new Ccuenta();
        c = buscarCuenta();
        System.out.println();
        System.out.println("*******************************");
        System.out.println("Nombre: "+c.getNombre());
        System.out.println("Número: "+c.getCuenta());
        System.out.println("Saldo: "+c.getSaldo()+"€");
        System.out.println("Interés: "+c.getInteres()+"%");
        System.out.println("*******************************");
    }
    
    public void verCuenta(Ccuenta cta){
        System.out.println();
        System.out.println("*******************************");        
        System.out.println("Nombre: "+cta.getNombre());
        System.out.println("Número: "+cta.getCuenta());
        System.out.println("Saldo: "+cta.getSaldo()+"€");
        System.out.println("Interés: "+cta.getInteres()+"%");
        System.out.println("*******************************");
        
    }
    
    public void visualizarCuentas(){
        System.out.println("*********** CUENTAS ***********");
        for(int i=0; i<total; i++){
            System.out.println();
            System.out.println("*******************************");
            System.out.println("Nombre: "+cuentas.get(i).getNombre());
            System.out.println("Nº Cuenta: "+cuentas.get(i).getCuenta());
            System.out.println("Saldo: "+cuentas.get(i).getSaldo()+"€");
            System.out.println("Interés: "+cuentas.get(i).getInteres()+"%");
            System.out.println("*******************************");
        }
    }
                  
                
    
}
