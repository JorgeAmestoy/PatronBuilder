public class Pizzas {
    private int tipoMasa;
    private boolean relleno;
    private int tamanho;
    private boolean salsa;
    private int tipoSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean pinha;
    private boolean champinhones;
    private boolean jamon;
    // private int recogida;


    // tipo de masa
    public static final int FINA = 1;
    public static final int PAN = 2;
    public static final int INTEGRAL = 3;
    public static final int NORMAL = 4;

    // tamaño de la pizza
    public static final int PEQUENHA = 1;
    public static final int MEDIANA = 2;
    public static final int FAMILIAR = 3;

    //tipo de salsa
    public static final int BARBACOA = 1;
    public static final int SOLO_TOMATE = 2;
    public static final int SIN_GLUTEN = 3;

    // recogida
    //  public static final int TIENDA = 0;
    // public static final int PARALLEVAR = 1;




    public Pizzas() {
        this.tipoMasa=FINA;
        this.relleno=false;
        this.tamanho= MEDIANA;
        this.tipoSalsa= SOLO_TOMATE;
        this.sinGluten=false;
        this.jamon=true;
    }

    public Pizzas(int tipoMasa, boolean relleno, int tamanho, boolean salsa, int tipoSalsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean pinha, boolean champinhones, boolean jamon) {
        this.tipoMasa = tipoMasa;
        this.relleno = relleno;
        this.tamanho = tamanho;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.pinha = pinha;
        this.champinhones = champinhones;
        this.jamon = jamon;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public int getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(int tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPinha() {
        return pinha;
    }

    public void setPinha(boolean pinha) {
        this.pinha = pinha;
    }

    public boolean isChampinhones() {
        return champinhones;
    }

    public void setChampinhones(boolean champinhones) {
        this.champinhones = champinhones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }



    @Override
    public String toString() {
        return  "tipoMasa=" + tipoMasa +
                ", relleno=" + relleno +
                ", tamanho=" + tamanho +
                ", salsa=" + salsa +
                ", tipoSalsa=" + tipoSalsa +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", pinha=" + pinha +
                ", champinhones=" + champinhones +
                ", jamon=" + jamon;

    }


}
