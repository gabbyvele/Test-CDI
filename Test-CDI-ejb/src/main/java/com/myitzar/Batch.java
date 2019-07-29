package com.myitzar;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.inject.Inject;

/**
 * Created by Gabby on 2017/03/25.
 */
@Singleton
public class Batch {
    @Inject
    InjectorClass injectorClass;

    @Schedule(second = "00", minute = "*", hour = "*")
    public void runLogger(){
        injectorClass.logTime();
    }
}
