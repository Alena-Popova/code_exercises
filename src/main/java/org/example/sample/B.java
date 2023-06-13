package org.example.sample;

public interface B
{
    default void foo() {
        System.out.println("Foo B");
    }
}
