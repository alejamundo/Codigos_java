package Hilo;

public class Banco_sincronizacion {

    public static void main(String[] args) {
        CreaBanco b = new CreaBanco();
        for (int i = 0; i < 100; i++) {
            EjecucionTrasferencias r = new EjecucionTrasferencias(b, i, 2000);
            Thread t = new Thread(r);
            t.start();

        }
    }
}

class CreaBanco {

    private final double cuentas[];//almacenara valores de las cuentas
    //private Lock cierre = new ReentrantLock();
    //private Condition saldoSuficeinte;//condiciones de bloqueo

    public CreaBanco() {
        //iniciar cuentas ya que es final
        cuentas = new double[100];//identifico las cuentas con la pocision
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 2000;//a cada cuenta le mando 2000 euros  
        }
        //saldoSuficeinte = cierre.newCondition();//estamosdiciendo que el bloqueo se genera en base a una condicion
    }

    public synchronized void transferencia(int cuentaOrigen, int cuentadestino, double cantidad) throws InterruptedException {
        //cierre.lock();//con esto bloqueo
        //try {
            //establecer condicion para que no hayan transferencias sin nejecutar a falata de saldr
            //crearemos un bloqueo segun una condicion con el fin de que la transferencia se aga 
            //cuando tenga dinero enla ceunta // interfaz condicion await() sigbalAll()
            while (cuentas[cuentaOrigen] < cantidad) {
                System.out.println("------------------Cantidad Ins"
                        + "ificiente------------" + cuentaOrigen + " Saldo: " + cuentas[cuentaOrigen] + " cantidad a transferir: " + cantidad);
                //return;//retorna el flujo de ecucion del programa
                //no hace nada
                //saldoSuficeinte.await();//poner el hilo a la espera se bloqueo segun la 
                wait();//se pone a la espera
            }
            System.out.println("-----------se puede transferir---------");

            System.out.println("Hilo: " + Thread.currentThread());
            cuentas[cuentaOrigen] -= cantidad;//descontar dinero de la cuneta origen
            //imprimir con u fromato determinado dos decimales,%dparametro
            System.out.printf("%10.2f de %d para %d: ", cantidad, cuentaOrigen, cuentadestino);
            cuentas[cuentadestino] += cantidad;
            //formato con dos decimales
            System.out.printf("saldo total: %10.2f%n", getsaldo());//cual es el formato que le dara a el saldo total
            System.out.println("\n");
            //le decimos que despuerte el holo bcloqueado para que revise si ya cumple
            //saldoSuficeinte.signalAll();
        //} catch (Exception e) {
            //System.out.println("Error");
        //}// finally {
            //desbloquee
           // cierre.unlock();
        //}
        notifyAll();//informa a los hilos que estan a la espera

    }

    //obtener el saldo de todas las cuentas
    public double getsaldo() {
        double sumasaldo = 0;
        //recorro el array ventas
        for (double cuenta : cuentas) {
            sumasaldo += cuenta;
        }
        return sumasaldo;
    }

}

class EjecucionTrasferencias implements Runnable {

    private CreaBanco ban;
    private int cuentaOrigen;
    private double cantidadmax;

    public EjecucionTrasferencias(CreaBanco ban, int cuentaOrigen, double cantidadmax) {
        this.ban = ban;
        this.cuentaOrigen = cuentaOrigen;
        this.cantidadmax = cantidadmax;
    }

    //Método que ejcutara cada hilo
    @Override
    public void run() {
        //transferencias de forma infinita
        try {
            while (true) {//opcion para crear un bucle infinito            
                //aleatorio random()generar cuenta destino
                int cuentaDestino = (int) (Math.random() * 100);
                double cantidadT = cantidadmax * Math.random();//numero entre 0 y 1*2000
                ban.transferencia(cuentaOrigen, cuentaDestino, cantidadT);
                Thread.sleep((int) (Math.random() * 10));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
//clase reentranlock: interfaz lock: //metdos look blochea un trozo de codigo para quesolo pueda ser 
//ejercutado solo por hilo unllock hace lo contrario desbloquea para que el siguiente hilo pueda ehecutarse
//hilo1 void lock.. holo2 cuando se termine se desbloquea con el unlocked
