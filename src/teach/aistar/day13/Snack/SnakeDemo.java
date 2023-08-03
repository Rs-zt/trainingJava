package teach.aistar.day13.Snack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class SnakeDemo {

    //定义常量
    private static final int ROWS = 20;
    private static final int COLS = 20;

    //外部类可以维护snake对象
    //SnakeDemo负责snake对象的生命周期 - 整体和局部 => 组合
    private Snake snake;

    public Snake getSnake() {
        return snake;
    }

    //hashset可以存储无序不可重复的,如果有重复的,拒绝添加.
    private Set<Node> foods = new HashSet<>();

    //提供构造方法
    public SnakeDemo(){
        //初始化snake
        this.snake = new Snake();

        //初始化食物
        initFoods(3);
    }

    //负责生成食物
    private void initFoods(int n) {
        while(true){
            //1. 随机一个x坐标,y坐标 => [1,18]

            //不能让食物出现在墙上.
            int x = (int) (Math.random()*(ROWS-2)+1);
            int y = (int) (Math.random()*(ROWS-2)+1);

            //不能让食物直接出现蛇的身上
            //判断蛇身体是否包含这个Node(x,y);
            if(snake.include(x,y)){
                continue;
            }

            //如果有重复的node,拒绝添加的.
            foods.add(new Node(x,y));

            if(foods.size()==n){
                break;
            }
        }
    }

    //定义一个初始界面的方法
    public void initPanel(){
        //界面 - 空心的正方角形
        //界面元素 => 包括墙(*),食物(0表示),蛇身(#)
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if(i==0 || i==ROWS-1 || j==0 || j==COLS-1){
                    System.out.printf("%2s","*");
                }else if(snake.include(i,j)){
                    System.out.printf("%2s","#");
                } else if(foods.contains(new Node(i,j))){
                    System.out.printf("%2s","0");
                } else{
                    System.out.printf("%2s"," ");
                }
            }
            System.out.println();
        }
    }

    //定义一个成员内部类
    public class Snake{

        //蛇的坐标=>使用LinkedList来进行存储.
        private LinkedList<Node> snakes = new LinkedList<>();

        //方向技巧
        public static final int UP = -1;
        public static final int DOWN = 1;
        public static final int LEFT = -2;
        public static final int RIGHT = 2;

        private int dir;

        //可以在构造方法,初始化蛇身
        public Snake(){
            snakes.add(new Node(5,6));//x代表纵坐标[行],y横坐标[列]
            snakes.add(new Node(5,7));
            snakes.add(new Node(5,8));

            dir = LEFT;
        }

        //判断坐标点是否在蛇身=>判断snakes集合是否包含某个node
        //contains和equals有关
        public boolean include(int x,int y){
            return snakes.contains(new Node(x,y));
        }

        //走一步
        public void step(int dir){
            //不能反方向走
            if(this.dir + dir == 0){
                //游戏宣布结束了.
                throw new RuntimeException("sorry,不能反方向走!Game Over!");
            }
            //正常走一步
            //1. 蛇身的头结点获取到
            Node header = snakes.getFirst();
            int x = header.getX();
            int y  = header.getY();

            switch (dir){
                case UP:
                    x--;
                    break;
                case DOWN:
                    x++;
                    break;
                case LEFT:
                    y--;
                    break;
                case RIGHT:
                    y++;
                    break;
            }

            //利用x和y得到一个新的节点
            header = new Node(x,y);
            //将新的节点放入到蛇身的头部
            snakes.addFirst(header);

            this.dir = dir;

            //如果header正好是食物的节点
            //1. 判断食物的那个set集合中是否包含header
            //2. 食物集合中删除header节点
            if(foods.remove(header)){//header被foods包含,此处才能正确删除,并且返回true
                return;
            }

            //去除最后一个节点
            snakes.removeLast();
        }
    }
}
class StartGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SnakeDemo s = new SnakeDemo();
        SnakeDemo.Snake snake = s.getSnake();

        //System.out.printf("%-10s-%s:%d\n","hello","aa",100);
        //System.out.println("ss");
        do{
            s.initPanel();
            System.out.println("游戏规则 w->上 a->左 s->下 d->右");
            System.out.print("请输入:>");
            String dir = sc.nextLine();

            switch (dir){
                case "w":
                    snake.step(SnakeDemo.Snake.UP);
                    break;
                case "d":
                    snake.step(SnakeDemo.Snake.RIGHT);
                    break;
                case "a":
                    snake.step(SnakeDemo.Snake.LEFT);
                    break;
                case "s":
                    snake.step(SnakeDemo.Snake.DOWN);
                    break;
            }
        }while(true);
    }
}