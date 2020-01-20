package com.docker.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lizhida on 2019/11/8
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public String home() {
        return "测试docker部署springboot项目-----------，6666成功了";
    }


//    public static void main(String[] args) {
//
//        int[] a = {1, 11, 111, 1111};
//        int max = a[0];
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            }
//        }
//
//        System.out.println("数组最大值为:" + max);
//
//    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        //随机数组
        for(int i=0;i<arr.length;i++) {
            arr[i]=(int)(Math.random()*20);
        }
        System.out.println("随机数组");
        displayArray(arr);
        System.out.println("\n 转序后数组");
        displayArray(reverse(arr));

    }
    //转序方法
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for(int i=0,j=list.length-1;i<list.length;i++,j--){
            result[j]=list[i];
        }
        return result;
    }
    //打印数组元素
    public static void displayArray(int[] bb) {
        for(int a : bb) {
            System.out.print(a+",");
        }
    }
}
