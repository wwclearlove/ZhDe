package com.zd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void qMax()
    {
       int x[]={1,4,23,12,5};
       int max=x[0];
        for (int i = 0; i <x.length ; i++) {
            if(x[i]>=max){
                max=x[i];
            }
        }
        System.out.println(max);
    }

}
