package teach.aistar.day16;

import teach.aistar.day15.PurcaseX;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/7 11:19
 */
public class FinalyDemo {
    public static void main(String[] args) {
//        System.out.println(f(10));
        System.out.println(f());
    }
    public static int f(int i){
        int a=10;
        try{
            a+=1;
            return a;
        }finally {
            a+=3;
            return a;
        }
    }
    public static PurcaseX f(){
        PurcaseX x = new PurcaseX();
        try {
            x.setBrand("jack");
            return x;
        }finally {
            x.setBrand("kang");
            return x;
        }
    }
}
