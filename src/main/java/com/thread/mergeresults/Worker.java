package com.thread.mergeresults;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Worker  implements Supplier<List> {
    private ExecutorService executorService = Executors.newFixedThreadPool(3);

    List list;

    public Worker(List list) {
        this.list = list;
    }

    @Override
    public List get()  {
        try {
            System.out.println("waiting " + list.size() + " secs");
            TimeUnit.SECONDS.sleep(list.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (List<String>) list.stream()
                .map( value -> value + " - processed")
                .collect(Collectors.toList());
    }
}
