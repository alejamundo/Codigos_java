package Reto_2;

public class Computadores {

    //Atribitos
    private final Integer PESO_BASE = 5;
    private final char CONSUMO_W = 'F';
    private final double PRECIO_BASE = 100.0;
    private Integer peso;
    private char consumoW;
    private double precioBase;

    //constructores
    public Computadores() {
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W;
    }

    public Computadores(double precioBase, Integer peso) {
        this.peso = peso;
        this.precioBase = precioBase;
        this.consumoW = CONSUMO_W;
    }

    public Computadores(double precioBase, Integer peso, char consumoW) {
        this.peso = peso;
        this.consumoW = consumoW;
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    //Métodos
    public double calcularPrecio() {
        double adiccionp = 0;
        //CALCULAR PESO
        if (peso >= 0 && peso < 19) {
            adiccionp = 10;
        } else if (peso >= 20 && peso < 49) {
            adiccionp = 50;
        } else if (peso >= 50 && peso <= 79) {
            adiccionp = 80;
        } else if (peso >= 80) {
            adiccionp = 100;
        }
        //calcular consumo
        double adiccion = 0;
        switch (consumoW) {
            case 'A':
                adiccion = 100;
                break;
            case 'B':
                adiccion = 80;
                break;
            case 'C':
                adiccion = 60;
                break;
            case 'D':
                adiccion = 50;
                break;
            case 'E':
                adiccion = 30;
                break;
            case 'F':
                adiccion = 10;
                break;
            default:
                adiccion = 0;
                break;
        }
        return adiccion + adiccionp + precioBase;
    }
}

class ComputadoresMesa extends Computadores {

    //atributos
    private final int ALMACENAMIENTO_BASE = 50;
    private int almacenamiento;
    //constructor

    public ComputadoresMesa() {
        almacenamiento = ALMACENAMIENTO_BASE;
    }

    public ComputadoresMesa(double precioBase, Integer peso) {
        super(precioBase, peso);
        almacenamiento = ALMACENAMIENTO_BASE;
    }

    public ComputadoresMesa(double precioBase, Integer peso, char consumoW, int almacenamiento) {
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    //Métodos
    @Override
    public double calcularPrecio() {
        double adicionM = 0;
        if (almacenamiento > 100) {
            adicionM = 50;
        }
        return adicionM + super.calcularPrecio();
    }
}

class ComputadoresPortatiles extends Computadores {

    //atributos
    private final int PULGADAS_BASE = 20;
    private int pulgadas;
    private boolean camaraITG;
    //Constructor

    public ComputadoresPortatiles() {
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }

    public ComputadoresPortatiles(double precioBase, Integer peso) {
        super(precioBase, peso);
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }

    public ComputadoresPortatiles(double precioBase, Integer peso, char consumoW, int pulgadas, boolean camaraITG) {
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }

    //metodos
    @Override
    public double calcularPrecio() {
        double adicion = 0;
        double valor;
        if (pulgadas > 40) {
            valor = getPrecioBase() * 30 / 100;
            adicion += valor;
            //agrega 30% del valor sobre precio base    
        }
        if (camaraITG) {
            adicion += 50;
            //adiiciona 50
        }
        return adicion + super.calcularPrecio();
    }
}

class PrecioTotal {

    //atributos
    private double totalComputadores = 0;
    private double totalComputadoresMesa = 0;
    private double totalComputadoresPortatiles = 0;
    private Computadores[] listaComputadores;
    //Constructor

    public PrecioTotal(Computadores[] listaComputadores) {
        this.listaComputadores = listaComputadores;
    }

    //Metodos
    public void mostrarTotales() {
        //sumar el precio de todos los pc
        for (int i = 0; i < listaComputadores.length; i++) {
            totalComputadores += listaComputadores[i].calcularPrecio();
            //sumar pc mesa
            if (listaComputadores[i] instanceof ComputadoresMesa) {
                totalComputadoresMesa += listaComputadores[i].calcularPrecio();
            }
            if (listaComputadores[i] instanceof ComputadoresPortatiles) {
                totalComputadoresPortatiles += listaComputadores[i].calcularPrecio();

            }
        }

        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.println("La suma del precio de los computadores de portátiles es de " + totalComputadoresPortatiles);
    }
}

class principal {

    public static void main(String[] args) {
        Computadores computadores[] = new Computadores[6];
        computadores[0] = new Computadores(150.0, 70, 'A');
        computadores[1] = new ComputadoresMesa(70.0, 40);
        computadores[2] = new ComputadoresPortatiles(600.0, 70, 'D', 50, false);
        computadores[3] = new Computadores();
        computadores[4] = new Computadores(500.0, 60, 'A');
        computadores[5] = new Computadores(700.0, 50, 'D');
        PrecioTotal solucion1 = new PrecioTotal(computadores);
        solucion1.mostrarTotales();
        System.out.println();

        Computadores computadores1[] = new Computadores[4];
        computadores1[0] = new Computadores(60.0, 10, 'D');
        computadores1[1] = new ComputadoresMesa(300.0, 40, 'Z', 40);
        computadores1[2] = new ComputadoresPortatiles(50.0, 10, 'A', 70, false);
        computadores1[3] = new Computadores(50.0, 10);
        PrecioTotal solucion12 = new PrecioTotal(computadores1);
        solucion12.mostrarTotales();
    }
}
