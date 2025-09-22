package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        int arr1 = {1,2,3,4,5};
        int arr2 = {2,3,5,6,7};
        int n = arr1.length;
        int m = arr2.length;
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<m;i++){
            if(mp.containsKey(arr2[i])){
                System.out.println(arr2[i]);
            }
        }

    }
}