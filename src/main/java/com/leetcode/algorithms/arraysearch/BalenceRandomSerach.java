package com.leetcode.algorithms.arraysearch;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author myshenx
 */
public class BalenceRandomSerach<T> {
    /**
     * 查找个数
     */
    private int searchNum;
    /**
     * 结果list
     */
    private List<T> balenceRandomList;
    /**
     * 源数组
     */
    private T[] array;

    /**
     * 取数步长
     * @return
     */
    private int getStep() {
        if (this.asN()){
            return (int) Math.ceil(this.arrayLength() / (this.getSearchNum() + 1.0));
        }else {
            return (int) Math.ceil(this.arrayLength() /(this.getBucketNum()+1.0));
        }
    }

    /**
     * 判断是否超过源数组的半
     * @return
     */
    private boolean asN(){
        return this.searchNum<=this.arrayLength()/2;
    }

    /**
     * 分桶数，BucketNum=n+1
     * @return
     */
    private int getBucketNum() {
        if (this.asN()){
            return this.getSearchNum();
        }else {
            return (this.arrayLength()-this.getSearchNum());
        }
    }

    private int getSearchNum() {
        return searchNum;
    }

    public void setSearchNum(int searchNum) {
        this.searchNum = searchNum;
    }

    private int arrayLength(){
        return this.array.length;
    }


    public BalenceRandomSerach(T[] arry,int searchNum){
        this.array=arry;
        this.searchNum=searchNum;
        this.balenceRandomList=new ArrayList<>();
        /**
         * 取数超过一半时，采用移除法，从源数组中移除不取的数
         */
        if (searchNum>arry.length/2){
            this.balenceRandomList=new ArrayList<>(Arrays.asList(array));
        }
    }

    public BalenceRandomSerach(){
        this(null,0);
    }

    /**
     * 取数超过一半时，采用移除法，从源数组中移除不取的数
     * @return
     */
    public List<T> getBalenceRandomList() {
        if (this.getSearchNum()>this.arrayLength()||this.getSearchNum()<=0) {
            return null;
        }
        int index=this.getStep()-1;
        for (int i=0;i<this.getBucketNum();i++){
            if (asN()){
                this.balenceRandomList.add(array[index]);
                index+=this.getStep();
            }else {
                this.balenceRandomList.remove(index);
                index+=this.getStep()-1;
            }

        }
        return balenceRandomList;
    }

    public void printBalenceNum(){
        for (T t : this.getBalenceRandomList()) {
            System.out.println(t);
        }
    }
}
