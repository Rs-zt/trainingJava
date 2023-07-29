package teach.aistar.day04;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/20 13:49
 */
public class demo3 {
    public static void main(String[] args) {
        int n=1001;
        int i=1;//表示圈数
      while (true){
          for (int j = 1; j <= n/2; j++) {
              for (int k = 1; k <= j*4; k++) {
                  i+=(2*j);
                  if ((j*8)%4==0) System.out.println(i);
              }

          }
          if (n/500==2)break;
      }
    }
}
