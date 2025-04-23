public class APLine
{
  private int a;
  private int b;
  private int c;
  public APLine(int x, int y, int z){
    a = x;
    b = y;
    c = z;
  }
  public double getSlope(){
    return -((double)a/b);
  }
  public boolean isOnLine(int x, int y){
    if((a*x) + (b*y) + c == 0){
      return true;
    }
    return false;
  }
}
