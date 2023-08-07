package teach.aistar.day15.homework;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description TODO..
 * @Author: kevin
 * @Date: 2023-08-04
 */
public class NumToChinese {
    public static Map<String, String> NumMap = new HashMap<>();
    public static List<Character> list = new LinkedList<>();
    public static LinkedList<String> dli = new LinkedList<>();
    public static LinkedList<StringBuilder> unit = new LinkedList<>();

    static {
        NumMap.put("0", "零");
        NumMap.put("1", "壹");
        NumMap.put("2", "贰");
        NumMap.put("3", "叄");
        NumMap.put("4", "肆");
        NumMap.put("5", "伍");
        NumMap.put("6", "陆");
        NumMap.put("7", "柒");
        NumMap.put("8", "捌");
        NumMap.put("9", "玖");
        unit.push(new StringBuilder("亿"));
        unit.push(new StringBuilder("万"));
        unit.push(new StringBuilder());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        change(sc.nextLine());
    }

    public static void change(String num) {
        if (null == num) return;
        StringBuilder numString = new StringBuilder(num);
        LinkedList<StringBuilder> res = new LinkedList<>();
        LinkedList<StringBuilder> nums = new LinkedList<>();
        int len = numString.length();
        int n = (int) Math.round(len / 4.0 + 0.4);
        numString.reverse();
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                nums.add(new StringBuilder(numString.substring(i * 4)).reverse());
            } else {
                nums.add(new StringBuilder(numString.substring(i * 4, (i + 1) * 4)).reverse());
            }

        }
        AtomicInteger count = new AtomicInteger(0);
        nums.forEach(stringBuilder -> {
            if (unit.isEmpty()) initUnit();
            StringBuilder pop = unit.pop();
            System.out.println(pop);
            StringBuilder str = lessThanTenThousand(stringBuilder.toString());
            if (str.length() == 0) {
                pop = new StringBuilder();
            }
            res.push(pop);
            res.push(str);
            count.getAndIncrement();
            System.out.println(count.get());
        });
        res.forEach(System.out::print);
    }

    public static StringBuilder lessThanTenThousand(String num) {
        initDil();
        StringBuilder sb = new StringBuilder(num);
        StringBuilder res = new StringBuilder();
        sb.reverse();
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if ("0".equals(sb.substring(i, i + 1))) {
                if (i == count++) {
                    dli.pop();
                    continue;
                }
                dli.pop();
                res.append(NumMap.get(sb.substring(i, i + 1)));
                continue;
            }
            res.append(dli.pop()).append(NumMap.get(sb.substring(i, i + 1)));
        }
        res.reverse();
        while (res.toString().startsWith("零零")) {
            res.replace(0, 1, "");
        }
        while (res.toString().startsWith("壹拾")) {
            res.replace(0, 1, "");
        }
//        return res.reverse();
        return res;
    }


    public static void initDil() {
        dli.clear();
        dli.push("仟");
        dli.push("佰");
        dli.push("拾");
        dli.push("");
    }

    public static void initUnit() {
        unit.clear();
        unit.push(new StringBuilder("亿"));
        unit.push(new StringBuilder("万"));
    }


}