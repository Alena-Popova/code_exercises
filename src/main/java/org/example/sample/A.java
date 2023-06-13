package org.example.sample;

public interface A
{
    default void foo() {
        System.out.println("Foo A");
    }
}
