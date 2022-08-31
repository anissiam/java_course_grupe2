package com.java2.basic;

public class Test {
    public static void main(String[] args) {

        String[] name1 = {"sara", "ali", "samir", "reem", "khaled"};
        String[] name2 = {"moh", "ali", "harbi", "reem", "Abed"};

        for(int i = 0; i<name1.length;i++){
            for(int j=0 ; j<name2.length;j++){
                if(name1[i].equalsIgnoreCase(name2[j])){
                    System.out.println(name1[i]+ " is common");
                    break;
                }
            }
        }
        int a[] =/* new int[5];*/{4, 500, 10, 50,2};
        int sum = 0;
        int max = 0;
        int min = a[0];
        for(int i = 0; i<a.length;i++){
            //System.out.print(a[i] + " ");
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        /*for(int i = 0 ; i<10 ; i++){
            for (int j=0 ; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
