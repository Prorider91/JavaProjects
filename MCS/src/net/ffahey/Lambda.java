package net.ffahey;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

    static <T, R> void processValues(T[] values, Function<T, R> f)
    {
        for (T v :values)
        {
            System.out.print(f.apply(v) + " ");
        }
    }

    static String sypply()
    {
        return "Hello from sypply";
    }

    static void comsume(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        processValues(new Integer[]{0, 1, 2, 3, 4, 5, 6}, n -> n * n);
        System.out.println();
        processValues(new String[]{"Allo", "Hello", "Bonjour"}, String::length);
        System.out.println();

        Supplier<String> ss = () -> Lambda.sypply();
        System.out.println(ss.get());
        ss = Lambda::sypply;
        System.out.println(ss.get());
        Consumer<String> cc;
        cc = Lambda::comsume;
        cc.accept("Test");
    }
}
