public class Main {
    public static void main(String[] args) {


        BuilderPizzas nuevoBuilder = new BuilderPizzas();//Creo builder
        Pizzas pizzaDefault2 = new Pizzas();
        pizzaDefault2 = nuevoBuilder.build();
        System.out.println(pizzaDefault2);


        Pizzas nuevaPizza = new BuilderPizzas().setSinGluten(true).setRelleno(true).setCebolla(true).build();
        System.out.println(nuevaPizza);

        Pizzas nuevaPizza2 = new BuilderPizzas()
                .setJamon(false)
                .setPinha(false)
                .setChampinhones(true)
                .setTipoMasa(Pizzas.FINA)
                .build();
        System.out.println(nuevaPizza2);


    }
}