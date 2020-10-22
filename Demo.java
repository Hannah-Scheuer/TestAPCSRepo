public class Demo{
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

  public static String arrToString(int[]arr){
    if (arr.length==0){
      return "{}";
    }
    String total = "{";
    for (int i=0;i<arr.length-1;i++){
      total = total + Integer.toString(arr[i]) + ", ";
    }
    return total +Integer.toString(arr[arr.length-1])+"}";
  }

  public static String arrayDeepToString(int[][]arr){
    if (arr.length==0){
      return "{}";
    }
    String total = "{";
    for (int i=0;i<arr.length-1;i++){
      total = total + arrToString(arr[i]) + ", ";
    }
    return total + arrToString(arr[arr.length-1])+"}";
  }

  public static int randomNum(int max){
    return (int) Math.round(Math.random() * max);
  }

 public static int[][] create2DArray(int rows, int cols, int maxValue){
   int[][] hello = new int[rows][cols];
   for (int i = 0; i<rows;i++){
     for (int j = 0; j<cols;j++){
       hello[i][j]= randomNum(maxValue);
     }
   }
   return hello;
 }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] arr = new int[rows][0];
    for (int i = 0; i<rows;i++){
      arr[i] = new int[randomNum(cols)];
      for (int j = 0; j<arr[i].length; j++){
        arr[i][j]= randomNum(maxValue);
      }
    }
    return arr;
  }


}
