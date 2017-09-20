package com.madhav.ejbs;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
/**
 * Session Bean implementation class MyEJBBean
 */
@Stateless
@LocalBean
public class MyEJBBean {

    /**
     * Default constructor. 
     */
    public MyEJBBean() {
    	System.out.println("MyEJBBean constructor");
    }

}
