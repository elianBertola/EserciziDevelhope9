enum TipoForma {
    Rettangolo,
    Triangolo;
}

public abstract class Forma {

    private TipoForma tipo;

    public Forma(TipoForma tipo) {
        this.tipo = tipo;
    }

    public TipoForma getTipo() {
        return tipo;
    }

    public abstract void calcolaArea();
}
