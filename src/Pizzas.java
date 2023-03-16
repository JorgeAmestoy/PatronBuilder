/**
 * @author Jorge Amestoy
 * version 16.02.2023
 */
public class Pizzas {
    /**
     * Declaro el atributo tipoMasa de tipo int que me dice el tipo de masa
     */
    private int tipoMasa;
    /**
     * Declaro el atributo relleno de tipo boolean que me dice si será rellena o no
     */
    private boolean relleno;
    /**
     * Declaro el atributo tamañho de tipo int que me dice si será grande, media o pequeña
     */
    private int tamanho;
    /**
     * Declaro el atributo salsa de tipo boolean que me dice si lleva salsa o no
     */
    private boolean salsa;
    /**
     * Declaro el atributo tipoSalsa de tipo int que me dice el tipo de salsa que puede llevar
     */
    private int tipoSalsa;
    /**
     * Declaro el atributo cebolla de tipo boolean que me dice si llevará cebolla o no
     */
    private boolean cebolla;
    /**
     * Declaro el atributo sinGluten de tipo boolean que me dice si es con gluten o no
     */
    private boolean sinGluten;
    /**
     * Declaro el atributo extraQueso de tipo boolean que me dice si llevará extra de queso o no
     */
    private boolean extraQueso;
    /**
     * Declaro el atributo pinha de tipo boolean que me dice si llevará pinha o no
     */
    private boolean pinha;
    /**
     * Declaro el atributo champinhones de tipo boolean que me dice si llevará champinhones o no
     */
    private boolean champinhones;
    /**
     * Declaro el atributo jamon de tipo boolean que me dice si llevará jamon o no
     */
    private boolean jamon;
    // private int recogida;


    /**
     * Declaro constante literal de tipo int que dice que el tipo de masa es fina
     */
    public static final int FINA = 1;
    /**
     * Declaro constante literal de tipo int que dice que el tipo de masa es de pan
     */
    public static final int PAN = 2;
    /**
     * Declaro constante literal de tipo int que dice que el tipo de masa es integral
     */
    public static final int INTEGRAL = 3;
    /**
     * Declaro constante literal de tipo int que dice que el tipo de masa es normal
     */
    public static final int NORMAL = 4;

    /**
     * Declaro constante literal de tipo int que dice que el tamaño sera pequenho
     */
    public static final int PEQUENHA = 1;
    /**
     * Declaro constante literal de tipo int que dice que el tamanho es mediano
     */
    public static final int MEDIANA = 2;
    /**
     * Declaro constante literal de tipo int que dice que el tamañnho es familiar
     */
    public static final int FAMILIAR = 3;

    /**
     * Declaro constante literal de tipo int que dice que el tipo de salsa es barbacoa
     */
    public static final int BARBACOA = 1;
    /**
     * Declaro constante literal de tipo int que dice que el tipo de salsa es de solo tomate
     */
    public static final int SOLO_TOMATE = 2;
    /**
     * Declaro constante literal de tipo int que dice que el tipo de salsa es sin gluten
     */
    public static final int SIN_GLUTEN = 3;

    /**
     * Constructor por defecto
     */
    public Pizzas() {
        this.tipoMasa = FINA;
        this.relleno = false;
        this.tamanho = MEDIANA;
        this.tipoSalsa = SOLO_TOMATE;
        this.sinGluten = false;
        this.jamon = true;
    }

    /**
     * Constructor parametrizado
     *
     * @param tipoMasa     tipo de la masa
     * @param relleno      si va rellena o no
     * @param tamanho      tamanho de la pizza
     * @param salsa        si lleva salsa o no
     * @param tipoSalsa    tipo de la salsa
     * @param cebolla      si lleva cebolla o no
     * @param sinGluten    si lleva gluten o no
     * @param extraQueso   si lleva extra de que o no
     * @param pinha        si lleva pinha o no
     * @param champinhones si lleva champinhones o no
     * @param jamon        si lleva jamon o no
     */
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

    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
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

    @Override
    public String toString() {
        return
                "tipoMasa=" + tipoMasa +
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