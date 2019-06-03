package com.leetcode.bean;

public class ArraySort {
    private int[] arr;
    public ArraySort(){
        this(1);
    }
    public ArraySort(int size){
        this.arr=new int[size];
    }

    public int[] getArr() {
        return arr;
    }
    public void addArr(int index,int val) {
        this.arr[index]=val;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getArrLenght(){
        return this.getArr().length;
    }
    public void quickSort(){
        if (this.getArrLenght()<=10) {
            this.quickSort(this.getArr(), 0, this.getArr().length, 1);
        }else {
            this.quickSort(this.getArr(), 0, this.getArr().length, 2);
        }
    }
    private void quickSort(int[] arr,int startIndex,int endIndex,int tag){
        if (startIndex>endIndex){
            return;
        }
        int pivot;
        switch (tag){
            case 1 : pivot=this.partitionDoubleForeach(arr,startIndex,endIndex);break;
            case 2 : pivot=this.partitionSingleForeach(arr,startIndex,endIndex);break;
            default:pivot=this.partitionDoubleForeach(arr,startIndex,endIndex);break;
        }
        quickSort(arr,startIndex,pivot-1,tag);
        quickSort(arr,pivot+1,endIndex,tag);
    }

    /**
     * 快速排序双循环法
     * @param arr 排序数组
     * @param startIndex 开始下标
     * @param endIndex 结束下标
     * @return 返回基准元素下标int
     */
    private int partitionDoubleForeach(int[] arr,int startIndex,int endIndex){
        int povit=arr[startIndex];
        int left=startIndex;
        int right=endIndex;

        while (left!=right){

            while (left<right&&povit<arr[right]){
                right--;
            }

            while (left<right&&povit>=arr[left]){
                left++;
            }
            if (left<right){
                int p=arr[right];
                arr[right]=arr[left];
                arr[left]=p;
            }
        }
        arr[startIndex]=arr[left];
        arr[left]=povit;
        return left;
    }

    /**
     * 快速排序单边循环法
     * @param arr 排序数组
     * @param startIndex 开始下标
     * @param endIndex 结束下标
     * @return 返回基准元素下标int
     */
    private int partitionSingleForeach(int[] arr,int startIndex,int endIndex){
        int pivot=arr[startIndex];
        int mark=startIndex;
        for (int i=startIndex+1;i<=endIndex;i++){
            if (arr[i]<pivot){
                mark++;
                int p=arr[mark];
                arr[mark]=arr[i];
                arr[i]=p;
            }
        }

        arr[startIndex]=arr[mark];
        arr[mark]=pivot;
        return mark;
    }
}



