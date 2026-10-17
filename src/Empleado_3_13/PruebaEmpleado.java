import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {

        //Estas variables es para asignar un valor por si la ventana emergente esta vacia
        double salario1 = 0.0;
        double salario2 = 0.0;

        // Pedimos datos al usuario en ventanas emergentes
        // JOptionPane.showImputDialog() es el comando para la ventana emergente
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del Empleado 1:");
        String apellido1 = JOptionPane.showInputDialog("Ingrese el apellido del Empleado 1:");
        String sueldoTexto1 = JOptionPane.showInputDialog("Ingrese el salario mensual del Empleado 1:");

        // Las ventanas emergentes devuelven String OJO PARA LA PRUEBA
        // Debemos convertir ese texto a un número para poder usarlo en el constructor
        // A double porque es como debe ir segun salario1 arriba
        try {
            // Convierte el texto a double
            salario1 = Double.parseDouble(sueldoTexto1);
        } catch (NumberFormatException e) {
            // Si el usuario dejó vacío o puso letras avisa al usuario que ingreso mal y queda asigando 0,0
            JOptionPane.showMessageDialog(null, "Error: Ingresó letras o dejó vacío.");
        }


        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del Empleado 2:");
        String apellido2 = JOptionPane.showInputDialog("Ingrese el apellido del Empleado 2:");
        String sueldoTexto2 = JOptionPane.showInputDialog("Ingrese el salario mensual del Empleado 2:");

        try {
            salario2 = Double.parseDouble(sueldoTexto2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresó letras o dejó vacío");
        }

        //Creamos el empleado con sus respectivas variables
        Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);
        Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

        //Motramos por ventana emergente el nombre + apellido + salario anual
        JOptionPane.showMessageDialog(null,
                "Salario anual de " + empleado1.getPrimerNombre() +" "
                + empleado1.getApellidoPaterno() + " es: "
                + (empleado1.getSalarioMensual() * 12) + "$");

        JOptionPane.showMessageDialog(null,
                "Salario anual de " + empleado2.getPrimerNombre() +" "
                + empleado2.getApellidoPaterno() + " es: "
                + (empleado2.getSalarioMensual() * 12) + "$" );

        //Llamamos al metodo set para enviar a empleado1 que cosa?
        //Obtenemos con get el salario mensual y multiplicamos para que se guarde el aumento del 10%
        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.10);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.10);

        //Mostramos por ventana emergente el aumento del salario
        JOptionPane.showMessageDialog(null, "Salario anual CON AUMENTO de "
                + empleado1.getPrimerNombre() + ": $" + String.format("%.2f", (empleado1.getSalarioMensual() * 12)));

        JOptionPane.showMessageDialog(null, "Salario anual CON AUMENTO de "
                + empleado2.getPrimerNombre() + ": $" + String.format("%.2f", (empleado2.getSalarioMensual() * 12)));



    }
}