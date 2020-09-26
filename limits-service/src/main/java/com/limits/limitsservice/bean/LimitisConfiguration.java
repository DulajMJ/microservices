package com.limits.limitsservice.bean;

import lombok.Data;

@Data
public class LimitisConfiguration {
    int maximun;
    int minimun;
    protected LimitisConfiguration(){}
    public LimitisConfiguration(int maximun,int minimun){
        super();
        this.maximun=maximun;
        this.minimun=minimun;
    }
}
