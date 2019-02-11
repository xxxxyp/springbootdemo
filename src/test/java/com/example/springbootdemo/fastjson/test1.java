package com.example.springbootdemo.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.example.springbootdemo.fastjson.sljgw;
import org.junit.Test;

public class test1 {
    public static void main(String[] args) {
        String strjosn = "{'age': 11,'name':'dog'}";
        JSONObject jsonObject;
        //字符串转j'son对象
        jsonObject = JSONObject.parseObject(strjosn);
        System.out.println("age:"+jsonObject.getString("age"));
        System.out.println("age:"+jsonObject.get("age"));
        sljgw sljgw = JSON.parseObject(strjosn, new TypeReference<sljgw>() {});
        System.out.println(sljgw.getName());

    }

    @Test
    public  void main1(){
        String str = "CEB_10000007_20180117_01.txt|+|10000007|+|06629894|+|20180117|+|0117|+|6216261000000000019|+|8.00|+|0.00|+|20180117|+|902005044309|+|0492018011710000959001";
        str = str.replaceAll("\\|\\+\\|","|");
        System.out.println(str);
    }
}
