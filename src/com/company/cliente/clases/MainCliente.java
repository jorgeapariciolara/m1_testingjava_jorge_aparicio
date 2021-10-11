package com.company.cliente.clases;



import com.company.cliente.objetos.Cliente;
import com.company.cliente.objetos.Factura;
import com.company.cliente.objetos.Telefono;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCliente {

    public static void main(String[] args) {

        // Creo el array para introducir los datos de los clientes y, dentro de ellos, crearé los clientes con
        //su Array para Teléfonos y su Array para Facturas

        // el Array de los Clientes
        List<Cliente> clientes = new ArrayList<>();

        // el Arrray de los Teléfonos (dentro del Cliente)
        Telefono telefono1 = new Telefono ();
        telefono1.setDomicilio1("919191915");
        telefono1.setMovil1("619191915");
        telefono1.setTrabajo1("916515151");

        // el Arrray de las Facturas (dentro del Cliente)
        Factura factura1 = new Factura ();
        factura1.setComida(64.80);
        factura1.setConsulta(55.00);
        factura1.setMedicamentos(67.75);

        // y el objeto cliente
        clientes.add (new Cliente("99999999Z", "José Luis", "Flores",
                "Romero", 42, telefono1, true, factura1));

        // Creo algunos clientes de prueba
        Telefono telefono2 = new Telefono ();
        telefono2.setMovil1("619191987");
        telefono2.setTrabajo1("916515121");
        Factura factura2= new Factura ();
        factura2.setComida(14.80);
        factura2.setConsulta(25.00);
        factura2.setMedicamentos(37.75);
        clientes.add (new Cliente("88888888Y", "Mª José", "García",
                "García", 17, telefono2, true, factura2));

        Telefono telefono3 = new Telefono ();
        telefono3.setDomicilio1("919191321");
        telefono3.setMovil1("619191900");
        Factura factura3= new Factura ();
        factura3.setComida(114.80);
        factura3.setConsulta(25.00);
        factura3.setMedicamentos(77.00);
        clientes.add (new Cliente("77777777X", "Mª José", "Romero",
                "García", 37, telefono3, false, factura3));

        Telefono telefono4 = new Telefono ();
        telefono4.setMovil1("619654980");
        Factura factura4= new Factura ();
        factura4.setComida(44.80);
        factura4.setConsulta(45.00);
        factura4.setMedicamentos(37.75);
        clientes.add (new Cliente("66666666W", "Pedro", "Blanco",
                "García", 29, telefono4, true, factura4));

        Telefono telefono5 = new Telefono ();
        telefono5.setDomicilio1("919190202");
        Factura factura5= new Factura ();
        factura5.setComida(164.80);
        factura5.setConsulta(15.00);
        factura5.setMedicamentos(317.75);
        clientes.add (new Cliente("55555555V", "Lorena", "Marcos",
                "Moreno", 52, telefono5, false, factura5));



        // Con el OBJETO SCANNER puedo introducir datos a través de la consola
        Scanner scanner = new Scanner (System.in);


        while (true) {

            System.out.println("¡Bienvenido! Por favor, seleccione una opción:");
            System.out.println("0.- SALIR DE LA APLICACIÓN");
            System.out.println("1.- Ver todos los clientes");
            System.out.println("2.- Buscar un cliente (por DNI)");
            System.out.println("3.- Crear un nuevo cliente");
            System.out.println("4.- Modificar un cliente (por DNI)");
            System.out.println("5.- Borrar un cliente (por DNI)");
            System.out.println("6.- Borrar todos los clientes");
            System.out.println("7.- Calcular los gastos de un cliente (por DNI)");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 0) {
                System.out.println("Ha seleccionado la opción 0 - SALIR DE LA APLICACIÓN");
                System.out.println("¿Desea salir de la aplicación?");
                String respuesta0 = scanner.nextLine();
                if(respuesta0.equalsIgnoreCase("si")) {
                    break;
                } else {
                    continue;
                }

            } else if (opcion == 1) {
                System.out.println("Ha seleccionado la opción 1 - VER TODOS LOS CLIENTES");
                if (!clientes.isEmpty()) {
                    // Saco el número de registros
                    System.out.println("Actualmente, el número de clientes es de: " + clientes.size());
                    // Saco por pantalla la información de los clientes con un
                    // Bucle for each => para cada elemento de la clase Cliente, imprime sus datos
                    for(Cliente cliente : clientes) {
                        System.out.println(cliente);
                    }
                } else {
                    System.out.println("No existen clientes registrados");
                    continue;
                }

            } else if (opcion == 2) {
                System.out.println("Ha seleccionado la opción 2 - BUSCAR UN CLIENTE (POR DNI)");
                System.out.println("Por favor, introduzca el DNI del cliente");
                String dni = scanner.nextLine();
                boolean exists = false;
                for (Cliente cliente : clientes) {
                    if (dni.equalsIgnoreCase(cliente.getDni())) {
                        exists = true;
                        System.out.println(cliente);
                        break;
                    }
                }
                if (!exists) {
                    System.out.println("No existe ningún cliente registrado con DNI: " + dni);
                }

            } else if (opcion == 3) {
                System.out.println("Ha seleccionado la opción 3 - CREAR UN CLIENTE");
                System.out.println("Por favor, introduzca el DNI del cliente");
                String dni = scanner.next();
                boolean dniOcupado = false;
                for (Cliente cliente : clientes) {
                    if (dni.equalsIgnoreCase(cliente.getDni())) {
                        dniOcupado = true;
                        System.out.println("CLIENTE REGISTRADO" + "\n" + "DNI: " + cliente.getDni() + "\n" +
                               cliente.getNombre() + " " + cliente.getPrimerApellido() +
                                " " + cliente.getSegundoApellido());
                        break;
                    }
                }
                if (dniOcupado) {
                    continue;
                }
                Cliente cliente = new Cliente ("99999999Z", "José Luis", "Flores", "Romero", 42, telefono1, true, factura1);
                cliente.setDni(dni);
                System.out.println("Introduce el NOMBRE");
                String nombre = scanner.next();
                cliente.setNombre(nombre);
                System.out.println("Introduce el PRIMER APELLIDO");
                String primerApellido = scanner.next();
                cliente.setPrimerApellido(primerApellido);
                System.out.println("Introduce el SEGUNDO APELLIDO");
                String segundoApellido = scanner.next();
                cliente.setSegundoApellido(segundoApellido);
                System.out.println("Introduce la EDAD");
                int edad = scanner.nextInt();
                cliente.setEdad(edad);
                scanner.nextLine();
                System.out.println("¿Tiene CARNET DE SOCIO?");
                boolean carnetSocio = scanner.nextBoolean();
                cliente.setCarnetSocio(carnetSocio);
                scanner.nextLine();
                System.out.println("¿Tiene TELÉFONO FIJO?");
                boolean hasPhone = scanner.nextBoolean();
                if (hasPhone) {
                    System.out.println("¿Cuántos teléfonos tiene?");
                    int numPhones = scanner.nextInt();
                    scanner.nextLine();
                    Telefono telefono = new Telefono ();
                    for (int i = 0; i < numPhones; i++) {
                        System.out.println("Introduce el nº de teléfono " + (i+1));
                        String newTelefono = scanner.next();
                        if (i+1 == 1) {
                            telefono.setDomicilio1(newTelefono);
                        } else if (i+1 == 2) {
                            telefono.setDomicilio2(newTelefono);
                        } else if (i+1 == 3) {
                            telefono.setDomicilio3(newTelefono);
                        }
                    }
                    cliente.setTelefono(telefono);
                }
                System.out.println("¿Tiene TELÉFONO MÓVIL?");
                boolean hasMovil = scanner.nextBoolean();
                if (hasMovil) {
                    System.out.println("¿Cuántos teléfonos tiene?");
                    int numPhones = scanner.nextInt();
                    scanner.nextLine();
                    Telefono telefono = new Telefono ();
                    for (int i = 0; i < numPhones; i++) {
                        System.out.println("Introduce el nº de teléfono " + (i+1));
                        String newTelefono = scanner.next();
                        if (i+1 == 1) {
                            telefono.setMovil1(newTelefono);
                        } else if (i+1 == 2) {
                            telefono.setMovil2(newTelefono);
                        } else if (i+1 == 3) {
                            telefono.setMovil3(newTelefono);
                        }
                    }
                    cliente.setTelefono(telefono);
                }
                System.out.println("¿Tiene TELÉFONO del TRABAJO?");
                boolean hasWorkPhone = scanner.nextBoolean();
                if (hasWorkPhone) {
                    System.out.println("¿Cuántos teléfonos tiene?");
                    int numPhones = scanner.nextInt();
                    scanner.nextLine();
                    Telefono telefono = new Telefono ();
                    for (int i = 0; i < numPhones; i++) {
                        System.out.println("Introduce el nº de teléfono " + (i+1));
                        String newTelefono = scanner.next();
                        if (i+1 == 1) {
                            telefono.setTrabajo1(newTelefono);
                        } else if (i+1 == 2) {
                            telefono.setTrabajo2(newTelefono);
                        } else if (i+1 == 3) {
                            telefono.setTrabajo3(newTelefono);
                        }
                    }
                    cliente.setTelefono(telefono);
                }
                clientes.add(cliente);
                System.out.println("¿Quiere CALCULAR SU FACTURA?");
                Factura factura = new Factura();
                boolean respuesta3 = scanner.nextBoolean();
                if (respuesta3) {
                    System.out.println("Introduce los GASTOS DE COMIDA");
                    factura.setComida(scanner.nextDouble());
                    System.out.println("Introduce los GASTOS DE CONSULTA");
                    factura.setConsulta(scanner.nextDouble());
                    System.out.println("Introduce los GASTOS DE MEDICAMENTOS");
                    factura.setMedicamentos(scanner.nextDouble());
                }

            } else if (opcion ==4) {
                System.out.println("Ha seleccionado la opción 4 - MODIFICAR UN CLIENTE (POR DNI)");
                System.out.println("Por favor, introduzca el DNI del cliente");
                String dni = scanner.next();
                boolean dniOcupado = false;
                for (Cliente cliente : clientes) {
                    if (dni.equalsIgnoreCase(cliente.getDni())) {
                        dniOcupado = true;
                        cliente = new Cliente("99999999Z", "José Luis", "Flores", "Romero", 42, telefono1, true, factura1);
                        cliente.setDni(dni);
                        System.out.println("Introduce el NOMBRE" + "\n" + "NOMBRE ACTUAL: " + cliente.getNombre());
                        String nombre = scanner.next();
                        cliente.setNombre(nombre);
                        System.out.println("Introduce el PRIMER APELLIDO"+ "\n" +
                                "PRIMER APELLIDO ACTUAL: " + cliente.getPrimerApellido());
                        String primerApellido = scanner.next();
                        cliente.setPrimerApellido(primerApellido);
                        System.out.println("Introduce el SEGUNDO APELLIDO" + "\n" +
                                "SEGUNDO APELLIDO ACTUAL: " + cliente.getSegundoApellido());
                        String segundoApellido = scanner.next();
                        cliente.setSegundoApellido(segundoApellido);
                        System.out.println("Introduce la EDAD" + "\n" + "EDAD ACTUAL: " + cliente.getEdad());
                        int edad = scanner.nextInt();
                        cliente.setEdad(edad);
                        scanner.nextLine();
                        System.out.println("¿Tiene CARNET DE SOCIO?" + "ACTUALMENTE: " + cliente.getCarnetSocio());
                        boolean carnetSocio = scanner.nextBoolean();
                        cliente.setCarnetSocio(carnetSocio);
                        scanner.nextLine();
                        System.out.println("¿Quiere modificar algún TELÉFONO FIJO?");
                        boolean hasPhone = scanner.nextBoolean();
                        if (hasPhone) {
                            System.out.println("¿Cuántos teléfonos tiene?");
                            int numPhones = scanner.nextInt();
                            scanner.nextLine();
                            Telefono telefono = new Telefono ();
                            for (int i = 0; i < numPhones; i++) {
                                System.out.println("Introduce el nº de teléfono " + (i+1));
                                String newTelefono = scanner.next();
                                if (i+1 == 1) {
                                    telefono.setDomicilio1(newTelefono);
                                } else if (i+1 == 2) {
                                    telefono.setDomicilio2(newTelefono);
                                } else if (i+1 == 3) {
                                    telefono.setDomicilio3(newTelefono);
                                }
                            }
                            cliente.setTelefono(telefono);
                        }
                        System.out.println("¿Quiere modificar algún TELÉFONO MÓVIL?");
                        boolean hasMovil = scanner.nextBoolean();
                        if (hasMovil) {
                            System.out.println("¿Cuántos teléfonos tiene?");
                            int numPhones = scanner.nextInt();
                            scanner.nextLine();
                            Telefono telefono = new Telefono ();
                            for (int i = 0; i < numPhones; i++) {
                                System.out.println("Introduce el nº de teléfono " + (i+1));
                                String newTelefono = scanner.next();
                                if (i+1 == 1) {
                                    telefono.setMovil1(newTelefono);
                                } else if (i+1 == 2) {
                                    telefono.setMovil2(newTelefono);
                                } else if (i+1 == 3) {
                                    telefono.setMovil3(newTelefono);
                                }
                            }
                            cliente.setTelefono(telefono);
                        }
                        System.out.println("¿Quiere modificar algún TELÉFONO del TRABAJO?");
                        boolean hasWorkPhone = scanner.nextBoolean();
                        if (hasWorkPhone) {
                            System.out.println("¿Cuántos teléfonos tiene?");
                            int numPhones = scanner.nextInt();
                            scanner.nextLine();
                            Telefono telefono = new Telefono ();
                            for (int i = 0; i < numPhones; i++) {
                                System.out.println("Introduce el nº de teléfono " + (i+1));
                                String newTelefono = scanner.next();
                                if (i+1 == 1) {
                                    telefono.setTrabajo1(newTelefono);
                                } else if (i+1 == 2) {
                                    telefono.setTrabajo2(newTelefono);
                                } else if (i+1 == 3) {
                                    telefono.setTrabajo3(newTelefono);
                                }
                            }
                            cliente.setTelefono(telefono);
                        }
                        clientes.add(cliente);
                        System.out.println("¿Quiere CALCULAR SU FACTURA?");
                        Factura factura = new Factura();
                        boolean respuesta3 = scanner.nextBoolean();
                        if (respuesta3) {
                            System.out.println("Introduce los GASTOS DE COMIDA");
                            factura.setComida(scanner.nextDouble());
                            System.out.println("Introduce los GASTOS DE CONSULTA");
                            factura.setConsulta(scanner.nextDouble());
                            System.out.println("Introduce los GASTOS DE MEDICAMENTOS");
                            factura.setMedicamentos(scanner.nextDouble());
                        }
                        clientes.add(cliente);
                    }
                }
                if (dniOcupado) {
                    System.out.println("No existe ningún cliente registrado con DNI: " + dni);
                }

            } else if (opcion == 5) {
                System.out.println("Ha seleccionado la opción 5 - BORRAR UN CLIENTE (POR DNI)");
                System.out.println("Por favor, introduzca el DNI del cliente");
                String dni = scanner.nextLine();
                boolean exists = false;
                for (Cliente cliente : clientes) {
                    if (dni.equalsIgnoreCase(cliente.getDni())) {
                        exists = true;
                        System.out.println("¿Seguro que desea borrar el registro?");
                        String respuesta5 = scanner.nextLine();
                        if(respuesta5.equalsIgnoreCase("si")) {
                            clientes.remove(cliente);
                            exists = true;
                            System.out.println("Cliente borrado correctamente");
                        } else {
                            continue;
                        }
                        break;
                    }
                }
                if (!exists) {
                    System.out.println("No existe ningún cliente registrado con DNI: " + dni);
                }

            } else if (opcion == 6) {
                System.out.println("Ha seleccionado la opción 6 - BORRAR TODOS LOS CLIENTES");
                System.out.println("¿Seguro que desea borrar todos los registros?");
                String respuesta6 = scanner.nextLine();
                if(respuesta6.equalsIgnoreCase("si")) {
                    clientes.clear();
                } else {
                    continue;
                }

            } else if (opcion == 7) {
                System.out.println("Ha seleccionado la opción 7 - CALCULAR LA FACTURA DE UN CLIENTE (POR DNI)");
                System.out.println("Por favor, introduzca el DNI del cliente");
                String dni = scanner.nextLine();
                boolean exists = false;
                for (Cliente cliente : clientes) {
                    if (dni.equalsIgnoreCase(cliente.getDni())) {
                        exists = true;
                        com.company.cliente.clases.MetodosCliente metodosCliente =
                                new com.company.cliente.clases.MetodosCliente();
                        try {
                            metodosCliente.calcularFactura(cliente);
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("DIFICULTADES TÉCNICAS");
                        }
                    }
                }
                if (!exists) {
                    System.out.println("No existe ningún cliente registrado con DNI: " + dni);
                }



            } else {
                System.out.println("EL NÚMERO INTRODUCIDO NO ES UNA OPCIÓN VÁLIDA" + "\n" +
                        "POR FAVOR, INTRODUZCA UN NÚMERO VÁLIDO.");
            }


        }

        System.out.println("Fin del programa");

        scanner.close();


    }
}
