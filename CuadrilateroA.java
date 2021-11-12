public class CuadrilateroA extends PoligonoA{
  private int alfa,beta;//grados internos
  private float a,b,base,altura;//lados
  public CuadrilateroA(){}

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
    return base*altura;
  }//se utiliza override porque se esta utilizando un metodo heredado, pero cambia en algo, ya sean sus parametros o lo que regresa
  public double perimetro(){
    return 2*(a+b);
  }

  @Override
  public String toString(){
    return "CuadrilateroA{base="+base+" altura ="+altura+"}";
  }

}