package org.example.sample;

public class C implements A, B
{
    @Override
    public void foo()
    {
        B.super.foo();
    }
}
