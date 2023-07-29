package teach.aistar.weekday.day05;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 20:07
 */
public class TwoArraysPoem {
    public static void main(String[] args) {
        String[][] poems = {
                {"白","日","依","山","尽"},
                {"黄","河","入","海","流"},
                {"欲","穷","千","里","目"},
                {"更","上","一","层","楼"}
        };

        vv(poems);
    }

    private static void vv(String[][] poems) {
        String[][] strings = new String[5][4];
        for (int i = 0; i < poems.length; i++) {
            for (int j = 0; j < poems[i].length; j++) {
                strings[j][i]=poems[i][j];
            }
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.println(strings[i][j]);

            }
            System.out.println();

        }
    }
    private static void vvv(String[][] poems){
        //将二维数组中的每个具体字,全部放到一维数组中
        String[] arr=new String[poems.length*poems[0].length];
        //定义一个下标计数器
        int index=0;
        for (int i = 0; i < poems.length; i++) {
            for (int j = 0; j < poems[i].length; j++) {
                arr[index++]=poems[i][j];
            }
        }
        //[白, 日, 依, 山, 尽, 黄, 河, 入, 海, 流, 欲, 穷, 千, 里, 目, 更, 上, 一, 层, 楼]

//        白黄欲更
//        日河穷上
//        依入千一
//        山海里层
//        尽流目楼

        //白(0,0),(0)   黄(0,1),(5)
        //日(1,0),(1)   河(1,1),(6)  穷(1,2),(11)
        //System.out.println(Arrays.toString(arr))
        //定义一个二维数组,用来存储值
        String[][] strings = new String[5][4];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j]=arr[i+j*5];

            }
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.println(strings[i][j]);
            }
            System.out.println();
        }
    }
}
