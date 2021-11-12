class Main {
  public static void main(String[] args) {
    System.out.println("############clases concretas#############");

    Poligono poligono1= new Poligono();
    Triangulo triangulo1= new Triangulo();
    Cuadrilatero cuadrilatero1 = new Cuadrilatero();

    System.out.println(poligono1);
    System.out.println(triangulo1);
    System.out.println(cuadrilatero1);
    System.out.println(poligono1.area());
    System.out.println(triangulo1.area());
    System.out.println(cuadrilatero1.area());//todos dan 0 porque cada atributo se inicializa con 0

    System.out.println("############clases abstractas#############");
    //PoligonoA pol = new PoligonoA(); ESTO ES INCORRECTO, no s epuede instanciar porque es una clase abstractas
    TrianguloA triangulo2 = new TrianguloA();
    CuadrilateroA cuadrilatero2 = new CuadrilateroA();
    System.out.println(triangulo2);
    System.out.println(cuadrilatero2);
    System.out.println(triangulo2.perimetro());
    System.out.println(cuadrilatero2.perimetro());
    //con todo esto de arriba, nos ahorramos el codigo del poligono
  //
  System.out.println("########implemento#######");
  //InstrumentoMusical im = new InstrumentoMusical(); //No se puede hacer!
  InstrumentoViento iv = new InstrumentoViento();
  Flauta flauta = new Flauta();
  System.out.println(iv);
  System.out.println(flauta);
  
  System.out.println("########Atributos en Interfaces#######");
  //Meses meses = new Meses();->no se puede instanciar porque es una interfaz
  System.out.println("El mes "+Meses.NUEVE+" corresponde a:");
  System.out.println(Meses.NOMBRES_MESES[Meses.NUEVE]);

  System.out.println("El valor de pi es: "+Math.PI);
  System.out.println("El valor de pi es: "+(float)Math.PI);//haciendo casteo
  System.out.println("El valor de pi es: "+(int)Math.PI);
  }
}
//queda de tarea: hacer el diagrama y explicar el código