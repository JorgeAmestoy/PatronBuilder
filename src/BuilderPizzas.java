public class BuilderPizzas {


    /**
     * Declaro objeto de tipo pizzas, el cual va a ser construido por el Builder
     */
    private Pizzas _pizza;


    /**
     * Metodo que devuelve el objeto terminado
     * @return la pizza construida
     */
    public Pizzas build() {
        return this._pizza;
    }

    /**
     * Creo la pizza con la que voy a trabajar
     */
    public BuilderPizzas() {
        _pizza = new Pizzas();
    }

    /**
     * Metodo que devuelve el tipo de masa
     * @param tipoMasa tipo de masa fina, de pan, integral o normal
     * @return el BuilderPizzas
     */
    public BuilderPizzas setTipoMasa(int tipoMasa) {
        _pizza.setTipoMasa(tipoMasa);
        return this;
    }

    /**
     * Metodo que devuelve el tamanho de la pizza
     * @param tamanho tamaño pequeña, mediana o familiar
     * @return el BuilderPizzas
     */
    public BuilderPizzas setTamanho(int tamanho) {
        _pizza.setTamanho(tamanho);
        return this;
    }

    /**
     * Metodo que devuelve si hay relleno no
     * @param relleno
     * @return el BuilderPizzas
     */
    public BuilderPizzas setRelleno(boolean relleno) {
        _pizza.setRelleno(relleno);
        return this;
    }

    /**
     * Metodo que devuelve si hay cebolla o no
     * @param cebolla
     * @return el BuilderPizza
     */
    public BuilderPizzas setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    /**
     * Metodo que devuelve si la salsa es con gluten o no
     * @param sinGluten
     * @return el BuilderPizza
     */
    public BuilderPizzas setSinGluten(boolean sinGluten) {
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    /**
     * Metodo que devuelve si hay salsa o no
     * @param salsa
     * @return el BuilderPizza
     */
    public BuilderPizzas setSalsa(boolean salsa) {
        _pizza.setSalsa(salsa);
        return this;
    }

    /**
     * Metodo que devuelve el tipo de salsa
     * @param tipoSalsa salsa barbacoa, sin gluten o con solo tomamte
     * @return
     */
    public BuilderPizzas setTipoSalsa(int tipoSalsa) {
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }

    /**
     * Metodo que me devuelve si habrá extra de queso
     * @param extraQueso
     * @return el BuilderPizza
     */
    public BuilderPizzas setExtraQueso(boolean extraQueso) {
        _pizza.setExtraQueso(extraQueso);
        return this;
    }

    /**
     * Metodo que me devuelve si habrá pizza o no
     * @param pinha
     * @returnel el BuilderPizza
     */
    public BuilderPizzas setPinha(boolean pinha) {
        _pizza.setPinha(pinha);
        return this;
    }

    /**
     * Metodo que devuelve si habra champinhones o no
     * @param champinhones
     * @returnel el BuilderPizza
     */
    public BuilderPizzas setChampinhones(boolean champinhones) {
        _pizza.setChampinhones(champinhones);
        return this;
    }

    /**
     * Metodo que devuelve si habra jamon o no
     * @param jamon
     * @return el BuilderPizza
     */
    public BuilderPizzas setJamon(boolean jamon) {
        _pizza.setJamon(jamon);
        return this;
    }



    @Override
    public String toString() {
        return
                "_pizza= " + _pizza;
    }
}
