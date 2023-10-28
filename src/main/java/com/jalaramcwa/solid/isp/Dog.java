package com.jalaramcwa.solid.isp;

public interface Dog extends Pet{
    @Override
    public void feed();

    @Override
    public void groom();
}
