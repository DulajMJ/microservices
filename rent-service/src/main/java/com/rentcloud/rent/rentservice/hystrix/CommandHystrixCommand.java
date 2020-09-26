package com.rentcloud.rent.rentservice.hystrix;

import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.function.Supplier;

public class CommandHystrixCommand{


//    Supplier<T> execute;
//    Supplier<T> fallback;
//
//    public CommandHystrixCommand(String group, Supplier<T> execute) {
//        super(HystrixCommandGroupKey.Factory.asKey(group));
//        this.execute = execute;
//    }
//    public CommandHystrixCommand(String config,Supplier<T> execute){
//        super(config);
//        this.execute=execute;
//
//    }
}
