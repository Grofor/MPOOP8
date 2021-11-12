public class Triangulo extends Poligono{
  private int alfa, beta, gama;//angulos
  private float a,b,c;//lados
  private float base, altura;

  public Triangulo(){}

  public void setBase(float base){
    this.base=base;
  }
  public float getBase(){
    return base;
  }

  public void setAltura(float altura){
    this.altura=altura;
  }
  public float getAltura(){
    return altura;
  }

  @Override
  public double area(){
  return base*altura/2;
  }

  @Override
  public double perimetro(){
    return a+b+c;
  }

  @Override
  public String toString(){
    return "Triangulo{base="+base+" altura="+altura+"}";
  }
}