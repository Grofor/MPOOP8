public class Flauta extends InstrumentoViento{
//podemos sobreescribir alguin metodo y agregar funcionalidad
public Flauta(){}

public void limpiar(){
  System.out.println("Limpiando la flauta");
}
@Override
public String tipoInstrumento(){
  return "tipo: Flauta";
}
@Override
public String toString(){
  return "Flauta{}";
}
}