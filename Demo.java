public class printLoop{
  public static void main(String arg[]){
    if (arg.length>0){
      printLoop(Integer.parseInt(arg[0]));
    }
    else{
      printLoop(5);
    }
  }

  public static void printLoop(int n){
    for(int i=1;i<=n;i++){
      for(int j=((n+1)-i); j>0;j--){
         System.out.print(i);
      }
      System.out.println();
    }
  }
}
