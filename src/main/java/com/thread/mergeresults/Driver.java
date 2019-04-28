package com.thread.mergeresults;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Driver {

    public static void main(String[] args)  throws  Exception{

        Driver driver = new Driver();
        List list = driver.getList(3);
        CompletableFuture<List> cf1 = driver.getWorker(list);

        list = driver.getList(6);
        CompletableFuture<List> cf2 = driver.getWorker(list);

        list = driver.getList(9);
        CompletableFuture<List> cf3 = driver.getWorker(list);

        List resutl1 = cf1.get();
        List resutl2 = cf2.get();
        List resutl3 = cf3.get();

        System.out.println("resutl1 size :" + resutl1.size());
        System.out.println("resutl2 size :" + resutl2.size());
        System.out.println("resutl3 size :" + resutl3.size());

        resutl1.forEach(System.out::println);

    }

    private List getList(int size) {
        List list = new ArrayList(size);
        IntStream.range(0,size)
                .forEach(i -> list.add("dummy"));
        return list;
    }

    private CompletableFuture<List> getWorker(List list) {
        CompletableFuture c1 = new CompletableFuture();


        Supplier<List> supplier = new Worker(list);
        CompletableFuture<List> cf1;
        cf1 = CompletableFuture.supplyAsync(supplier);
        return cf1;
    }
}
