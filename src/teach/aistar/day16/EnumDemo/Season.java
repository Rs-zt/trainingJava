package teach.aistar.day16.EnumDemo;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/7 16:33
 * 枚举类型可以有抽象方法,每个枚举常量都要去实现抽象方法
 *
 */
public enum Season {
    SPRING{
        @Override
        public Season next(){
            return SUMMER;
        }
    },
    SUMMER{
        @Override
        public Season next(){
            return SPRING;
        }
    };
    public  abstract Season next();
}
