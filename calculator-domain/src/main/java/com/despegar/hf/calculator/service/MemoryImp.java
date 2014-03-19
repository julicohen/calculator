package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public class MemoryImp
    implements Memory {

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        this.Value = null;
    }

    @Override
    public BigDecimal read() {
        // TODO Auto-generated method stub
        return this.Value;
    }

    BigDecimal Value;

    @Override
    public void store(BigDecimal value) {
        // TODO Auto-generated method stub
        this.Value = value;
    }

}
