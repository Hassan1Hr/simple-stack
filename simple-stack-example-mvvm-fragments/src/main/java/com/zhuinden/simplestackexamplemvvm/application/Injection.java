package com.zhuinden.simplestackexamplemvvm.application;

/**
 * Created by Zhuinden on 2017.07.25..
 */

public class Injection {
    public static ApplicationComponent get() {
        return CustomApplication.get().applicationComponent;
    }
}