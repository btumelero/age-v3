package agev3.criacoes;

/**
 *
 * @author Bruno
 */
public class Posicao {
  private double x, y;
  
  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
  
  public void modificarXEm(double quantidade) {
    this.x += quantidade;
  }

  public void modificarYEm(double quantidade) {
    this.y += quantidade;
  }

  @Override
  public String toString() {
    return "Posicao{" + "x=" + x + ", y=" + y + '}';
  }
  
  public Posicao(double x, double y) {
    this.x = x;
    this.y = y;
  }
  
}
