public abstract class PoligonoA{
  public abstract double area();
  public abstract double perimetro();
  //metodos concretos

  @Override //se pone override porque hereda de la clase object
  public String toString(){
    return "PoligonoA{}";
  }
}