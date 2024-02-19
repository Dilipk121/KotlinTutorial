package com.mine.kotlintutorial;

public class myJavaFile {

    public static void main(String[] args){

        int sum = MyKotlinFileKt.addTwo(10,20);
        System.out.println("Printing kotlin method inside java file: "+ sum);
    }

    public static int getArea(int l, int b){
        return l*b;
    }

}
