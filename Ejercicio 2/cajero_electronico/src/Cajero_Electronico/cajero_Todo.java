package Cajero_Electronico;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class cajero_Todo {

    private static Map<Integer, Double> cuentas = new HashMap<>();

    public static void main(String[] args) {
        CargarCuentas();

        JOptionPane.showMessageDialog(null, "Inserta tu Tarjeta.");
        String numeroCuenta = JOptionPane.showInputDialog("Número de la cuenta?");

        int opcion;

        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    // Opción 1: Consulta tu saldo
                    consultatuSaldo(numeroCuenta);
                    break;
                case 2:
                    // Opción 2: Retiro
                    retiro(numeroCuenta);
                    break;
                case 3:
                    // Opción 3: Consignaciónes
                    consignaciones(numeroCuenta);
                    break;
                case 4:
                    // Opción 4: Transferencias
                    transferencias(numeroCuenta);
                    break;
                case 5:
                    // Opción 5: Salir
                    if (confirmarSalida()) {
                        JOptionPane.showMessageDialog(null, "Hasta la Proxima!!");
                        return; // Salir del programa
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. " + "POR FAVOR, elige una opción que sea válida.");
            }

        } while (true);

    }

    private static void CargarCuentas() {
        try (BufferedReader reader = new BufferedReader(new FileReader("cuentas.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int cuenta = Integer.parseInt(parts[0]);
                double saldo = Double.parseDouble(parts[1]);
                cuentas.put(cuenta, saldo);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la cuentas: " + e.getMessage());
        }
    }

    private static int mostrarMenu() {
        String opcion = JOptionPane.showInputDialog("    Opciones:\n"
                + "1. Consulta tu saldo\n"
                + "2. Retiros\n"
                + "3. Consignación\n"
                + "4. Transferencia\n"
                + "5. Salir\n");

        return Integer.parseInt(opcion);
    }

    private static void consultatuSaldo(String numeroCuenta) {
        int cuenta = Integer.parseInt(numeroCuenta);
        Double saldo = cuentas.get(cuenta);
        if (saldo != null) {
            JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta: " + cuenta + " es $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Cuenta no encontrada");
        }
    }

    private static void retiro(String numeroCuenta) {
        int cuenta = Integer.parseInt(numeroCuenta);
        Double saldo = cuentas.get(cuenta);

        if (saldo != null) {
            String montoStr = JOptionPane.showInputDialog("Cantidad a Retirar:");
            double monto = Double.parseDouble(montoStr);

            String mensaje = "Retiro Exitoso " + monto + " dólares.";
            int opcion = JOptionPane.showConfirmDialog(null, mensaje +
                    "\n¿Deseas confirmar? ", "Confirmar Retiro", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                cuentas.put(cuenta, saldo - monto);
                JOptionPane.showMessageDialog(null, "El saldo actual de La cuenta es!!: " + cuenta + " es $" + cuentas.get(cuenta));
            } else {
                JOptionPane.showMessageDialog(null, "Transacción cancelada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cuenta no encontrada");
        }

    }

    private static void consignaciones(String numeroCuenta) {
        int cuenta = Integer.parseInt(numeroCuenta);
        Double saldo = cuentas.get(cuenta);

        if (saldo != null) {
            String montoStr = JOptionPane.showInputDialog("Ingresa la cantidad a consignar:");
            double monto = Double.parseDouble(montoStr);

            cuentas.put(cuenta, saldo + monto);
            JOptionPane.showMessageDialog(null, "Consignación Exitosa!!. Saldo actual de la cuenta es: " + cuenta + " es $" + cuentas.get(cuenta));
        } else {
            JOptionPane.showMessageDialog(null, "Cuenta no encontrada");
        }
    }

    private static void transferencias(String numeroCuenta) {
        int cuentaOrigen = Integer.parseInt(numeroCuenta);
        Double saldoOrigen = cuentas.get(cuentaOrigen);

        String cuentaDestinoStr = JOptionPane.showInputDialog("Ingresa el número de cuenta de destino:");
        if (cuentaDestinoStr == null) {
            return;
        }
        int cuentaDestino = Integer.parseInt(cuentaDestinoStr);
        Double saldoDestino = cuentas.get(cuentaDestino);


        String montoStr = JOptionPane.showInputDialog("Cantidad a Transferir:");
        if (montoStr == null){
            transferencias(numeroCuenta);
            return;
        }
        double monto = Double.parseDouble(montoStr);

        if (saldoOrigen != null && saldoDestino != null){
            if (saldoOrigen >= monto) {
                cuentas.put(cuentaOrigen, saldoOrigen - monto);
                cuentas.put(cuentaDestino, saldoDestino + monto);
                JOptionPane.showMessageDialog(null, "Transferencia éxito a la cuenta cuenta: " + cuentaDestino);

            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente en la cuenta de origen.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Una o ambas cuentas no fueron encontradas.");
        }
    }

    private static boolean confirmarSalida() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Realmente deseas salir?", "Confirmar Salida",
                JOptionPane.YES_NO_OPTION);

        return respuesta == JOptionPane.YES_OPTION;
    }
}
