package com.sort;

import com.list.List;

import java.util.*;

public class DoubleSort {


    //第一种排序
    public void firstSortgather(){
        //将用户信息封装成对象
        PersonAttribute pa=new PersonAttribute(1,"张三","董事长");
        PersonAttribute pa1=new PersonAttribute(2,"令狐冲","监事");
        PersonAttribute pa2=new PersonAttribute(3,"任盈盈","总经理");
        PersonAttribute pa3=new PersonAttribute(4,"余则成","行政");
        PersonAttribute pa4=new PersonAttribute(5,"盛翔","董事");
        PersonAttribute pa5=new PersonAttribute(6,"曹操","助理");
        PersonAttribute pa6=new PersonAttribute(7,"孔融","null");
        PersonAttribute pa7=new PersonAttribute(8,"西瓜太郎","苹果");
        //按职务进行排序
        TreeMap<Integer,String> hashMap=new TreeMap<Integer, String>();
        hashMap.put(1,"董事长");
        hashMap.put(2,"董事");
        hashMap.put(3,"总经理");
        hashMap.put(4,"监事");
        hashMap.put(5,"行政");
        hashMap.put(6,"助理");
        hashMap.put(7,"null");
        hashMap.put(8,"苹果");
        HashMap<Integer,PersonAttribute> hashMap1=new HashMap();
        hashMap1.put(1,pa);
        hashMap1.put(2,pa1);
        hashMap1.put(3,pa2);
        hashMap1.put(4,pa3);
        hashMap1.put(5,pa4);
        hashMap1.put(6,pa5);
        hashMap1.put(7,pa6);
        hashMap1.put(8,pa7);
        //循环遍历
        for (Map.Entry<Integer,String> entry:hashMap.entrySet()){
            for (Map.Entry<Integer,PersonAttribute> key1:hashMap1.entrySet()){
                if(entry.getValue()==key1.getValue().getPost()){
                    //等级是1-6，等级越低职务越高，
                    System.out.println("公司职务权重："+entry.getKey()+"   "+"领导姓名:"+key1.getValue().getName()+"   "+"职务:"+key1.getValue().getPost());
                }
            }
        }
    }
    public static void main(String[] args) {
        DoubleSort ds=new DoubleSort();
        ds.firstSortgather();
    }
}
