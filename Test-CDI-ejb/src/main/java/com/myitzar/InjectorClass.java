package com.myitzar;

import javax.ejb.EJB;
import java.util.Date;

/**
 * Created by Gabby on 2017/03/25.
 */
public class InjectorClass {
    public void logTime(){
        System.out.println("System log at " + new Date());
    }
}
