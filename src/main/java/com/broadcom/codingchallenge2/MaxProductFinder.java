package com.broadcom.codingchallenge2;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class MaxProductFinder {

    public MaxProductFinder() {

    }

    private List<List<Integer>> splitNumber( int num )
    {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (num == 0)
            return lists;
        List<Integer> c = new ArrayList<Integer>();
        c.add(num);
        lists.add(c);

        for(int part = num - 1 ; part > 0; part--)
        {

            List<List<Integer>> childLists =  splitNumber( num - part );
            for(List<Integer> cl : childLists)
            {                    
                cl.add(0, part);
                lists.add(cl);
            }

        }

        return lists;
    }   
    
    public int getMaxProduct(int N) {
        List< List<Integer> > addons = splitNumber(N);

        int maxProduct = 0;
       
        for( List<Integer> c : addons)
        {
            int product = 1;
            for( int a : c)
            {
                product *= a;
            }
            if (product > maxProduct)
                maxProduct = product;
        }
       
        return maxProduct;

    }

}