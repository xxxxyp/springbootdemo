package com.example.springbootdemo.test;

/**
 * ArrayList底层原理
 * 手写一个ArrayList，加深对集合的理解。
 * Don
 */
public class ArrayListDon {

    //定义一个数组
    private Object[] arry;
    //数组下标
    private int size = 0;

    public ArrayListDon(){
        this.arry = new Object[10];
    }

    public ArrayListDon(int size) throws Exception{
        if(size>0){
            this.arry = new Object[size];
        }else {
            throw new Exception("数组长度不能小于0");
        }
    }

    public void add(Object value){
        if(size>= arry.length){
            int length = arry.length;
            Object[] newArry = new Object[length];
            for(int i=0; i<arry.length; i++){
                newArry[i] = arry[i];
            }
            //更新数组长度
            length = (length*3)/2+1;
            //对原有数组进行扩容
            arry = new Object[length];
            for(int j=0; j<newArry.length; j++){
                arry[j] = newArry[j];
            }
            //释放该数组
            newArry = null;
        }
        arry[size] = value;
        size++;
    }

    public Object get(int index)  throws Exception{
        if(index>=0){
            return arry[index];
        }
        throw new Exception("下标不符合要求！");
    }

    public int size(){
        return size;
    }
}
