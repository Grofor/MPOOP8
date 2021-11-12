public class InstrumentoViento extends Object implements InstrumentoMusical{
  //Por dcefecto todos los metodos de la interfaz son publicos, por lo tanto asi deben ser implementadose

  public InstrumentoViento(){}

  @Override
  public void tocar(){
    System.out.println("Tocando instrumento de viento");
  }
  @Override
  public void afinar(){
    System.out.println("Afinando insturmento de viento");
  }
  @Override
  public String tipoInstrumento(){
    return "Instrumento de viento";
  }

  @Override
  public String toString(){
    return "InstrumentoViento{}";
  }
}