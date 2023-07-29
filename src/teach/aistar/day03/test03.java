package teach.aistar.day03;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/19 21:27
 */
public class test03 {
    public static void main(String[] args) {
        demo1();
    }
    private static void demo1(){
        int count=-1;
        for (int i = 1; i <5; i++) {
            for (int j = 1; j <5 ; j++) {
                for (int k = 1; k <5 ; k++) {
                    if (i != j && i != k && j !=k){
                        ++count;
                       if (count%6==0){
                           System.out.println();
                       }
                        System.out.print(i+","+j+","+k+"\t");
                    }
                }

            }

        }
    }
}
//System.out.print(i+","+j+","+k+"\t");