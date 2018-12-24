package com.github.eskorpado.writer.auto;

import com.github.eskorpado.stack.DummyStack;
import com.github.eskorpado.writer.VectorWriter;

public class Main {

    public static void main(String[] args) {
        DummyStack<String> stack = new DummyStack<>();
        stack.push("first item");
        stack.push("second item");
        stack.push("third item");
        String popped = stack.pop();
        System.out.println(String.format("%s popped", popped));
        new VectorWriter(stack, System.out);
    }
}