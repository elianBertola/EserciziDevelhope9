public class Rettangolo extends Forma{
    private double base;
    private double altezza;

    public Rettangolo(int base, int altezza) {
        super(TipoForma.Rettangolo);
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("L'area del " + getTipo() + " e: " + area + "cm");
    }
}
