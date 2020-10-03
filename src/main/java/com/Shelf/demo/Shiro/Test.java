package com.Shelf.demo.Shiro;

import java.util.ArrayList;
import java.util.List;

/**
 * Auther:ezRiel
 * Time:2020/8/21
 * for:
 */
public class Test {
    public static void main(String args[]){
//        MyShiroRealm myShiroRealm=new MyShiroRealm();
        int num=0;
        List<List> list=new ArrayList();
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    if(arr[i]+arr[j]+arr[k]==14){
                        List<Integer> integers=new ArrayList<>();
                        integers.add(arr[i]);
                        integers.add(arr[j]);
                        integers.add(arr[k]);
                        System.out.println((num++)+":"+arr[i]+" "+arr[j]+" "+arr[k]);
                        list.add(integers);
                    }
                }
            }
        }
        System.out.println("符合条件组数："+list.size());
        //其中元素中list没有重复数据的



    }
}
