public class APLine
{
  private int a;
  private int b;
  private int c;
  public APLine(x, y, z){
    a = x;
    b = y;
    c = z;
  }
  public double getSlope(){
    return -((double)a/b);
  }
  public boolean isOnLine(x, y){
    if((a*x) + (b*y) + c == 0){
      return true;
    }
    return false;
  }
}
