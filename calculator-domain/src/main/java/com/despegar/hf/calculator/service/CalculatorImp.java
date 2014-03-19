package com.despegar.hf.calculator.service;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

public class CalculatorImp
    implements Calculator {

    @Override
    public BigDecimal add(BigDecimal t1, BigDecimal t2) {
        // TODO Auto-generated method stub
        return t1.add(t2);
    }

    @Override
    public BigDecimal subtract(BigDecimal t1, BigDecimal t2) {
        // TODO Auto-generated method stub
        return t1.subtract(t2);
    }

    @Override
    public BigDecimal divide(BigDecimal t1, BigDecimal t2) {
        // TODO Auto-generated method stub
        BigDecimal result;
        if (t2.equals(new BigDecimal("0"))) {
            throw new InvalidParameterException("Invalide parameter");
        } else {
            result = t1.divide(t2);
        }
        return result;
    }

    @Override
    public BigDecimal multiply(BigDecimal t1, BigDecimal t2) {
        // TODO Auto-generated method stub
        return t1.multiply(t2);
    }

    @Override
    public void memoryClear() {
        // TODO Auto-generated method stub
        this.m.clear();
    }

    @Override
    public BigDecimal memoryRead() {
        // TODO Auto-generated method stub
        return this.m.read();
    }

    @Override
    public void memoryStore(BigDecimal value) {
        // TODO Auto-generated method stub
        this.m.store(value);
    }

    Memory m;

    @Override
    public void setMemory(Memory memory) {
        // TODO Auto-generated method stub
        this.m = memory;
    }

    public static void main(String[] args) {
        Calculator c = new CalculatorImp();
        Memory me = new MemoryImp();
        c.setMemory(me);
        c.memoryStore(BigDecimal.valueOf(2.3));
        c.memoryClear();
        // holalala
        BigDecimal result = c.memoryRead();
        System.out.println(c.divide(BigDecimal.valueOf(2), BigDecimal.valueOf(4)));
    }

}
