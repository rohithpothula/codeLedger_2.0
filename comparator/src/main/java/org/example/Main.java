package org.example;

import java.time.LocalDate;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,5,6,7};


        int n = arr1.length;
        int m = arr2.length;
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<n;i++){
            mp.put(arr1[i],mp.getOrDefault(arr1[i],0)+1);
        }

        for(int i=0;i<m;i++){
            if(mp.containsKey(arr2[i])){
//                System.out.println(arr2[i]);
            }
        }


        int arr[]={1,2,3,4,5,6,-1};

      int slow  = 0;
      int fast = 1;

      while(arr[fast]!=-1){

          fast = fast+1;
          if(arr[fast]==-1){
              System.out.println(arr[slow+1]);
              return ;
          }
          else{
              fast=fast+1;
          }
          slow = slow+1;
      }

      System.out.println(arr[slow]);

    }

    List<String> names = Arrays.asList("pranika","alex","john","pranika","alex","pranika");

    Map<String,Integer> nameCount = new HashMap<>();

    for(int i=0;i<names.size();i++){

    }







}