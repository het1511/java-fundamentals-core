package com.learning.day5;

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
//       Why NOT ArrayList<int>?
//       Because ArrayList works with objects, not primitives
//       AutoBOXing → put primitive INTO box → object
//		 UnBOXing → take value OUT of box → primitive


       ArrayList<Integer> list = new ArrayList<>();
       list.add(10);

    }
}
