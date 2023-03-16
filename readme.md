### FUNCIÓN PATRÓN  BUILDER
El patrón Builder sirve para crear un objeto sin constructores con la ayuda de una
clase auxiliar, es decir, simplifica el proceso de construcción de un objeto, permitiéndonos
tener un mayor control en el proceso de creación
de un objeto.

#### RELACIÓN CON PATRÓN FACTORY
Ambos son patrones creacionales dedicados a la creación
de instancias. <br>Por un lado, el Factory no requiere la
creación de una instancia y se puede compartir entre los
objetos que la necesitan, mientras que en el patrón
Builder, es necesario crear una instancia de Builder. 
Así también, el Builder requiere la llamada de 
varios métodos junto con el método final *build()*. En tanto, el Factory crea la instancia en un solo paso.<br>
Juntando ambos patrones, el Factory nos devolvería 
un Builder de la clase, para posteriormente,
usar el Builder con el fin de construir el número
de objetos que queramos con los atributos deseados.

#### DIAGRAMA

```mermaid
  classDiagram
  App "1" *-- "1..*" BuilderPizza : association
  class App{
      +main()
  }
  class BuilderPizza{
            
             
-_pizza: Pizzas
 +build(): Pizzas
 BuilderPizzas()
+BuilderPizzas()
+setTipoMasa(int tipoMasa)
+setRelleno(boolean relleno)
+setTamanho(int tamanho)
+setSalsa(boolean salsa)
+setTipoSalsa(int tipoSalsa)
+setCebolla(boolean cebolla)
+setSinGluten(boolean sinGluten)
+setExtraQueso(boolean extraQueso)
+setPinha(boolean pinha)
+setChampinhones(boolean champinhones)
+setJamon(boolean jamon)

  }
  BuilderPizza "1" *-- "1" Pizzas: association
  class Pizzas{
-tipoMasa: int
            -relleno: boolean
            -tamanho: int
            -salsa: boolean
            -tipoSalsa: int
            -cebolla: boolean
            -sinGluten: boolean
            -extraQueso: boolean
            -pinha: boolean
            -champinhones: boolean
            -jamon: boolean
            +Pizzas()
            +Pizzas(int, boolean, int, boolean, int, boolean, boolean, boolean, boolean, boolean, boolean)
            +getTipoMasa()
            +setTipoMasa(int)
            +isRelleno()
            +setRelleno(boolean)
            +getTamanho()
            +setTamanho(int)
            +isSalsa()
            +setSalsa(boolean)
            +getTipoSalsa()
            +setTipoSalsa(int)
            +isCebolla()
            +setCebolla(boolean)
            +isSinGluten()
            +setSinGluten(boolean)
            +isExtraQueso()
            +setExtraQueso(boolean)
            +isPinha()
            +setPinha(boolean)
            +isChampinhones()
            +setChampinhones(boolean)
            +isJamon()
            +setJamon(boolean)
            +toString()






  
  
  }
  
```

