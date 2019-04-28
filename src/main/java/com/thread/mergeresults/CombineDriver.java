package com.thread.mergeresults;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CombineDriver {

    public static void main(String[] args) throws Exception {

        CombineDriver driver = new CombineDriver();
        List list = driver.getList(3);
        CompletableFuture<List> cf1 = driver.getWorker(list);

        list = driver.getList(6);
        CompletableFuture<List> cf2 = driver.getWorker(list);

        list = driver.getList(9);
        CompletableFuture<List> cf3 = driver.getWorker(list);


//        List combined =
//        CompletableFuture.allOf(cf1, cf2, cf3)
//                .thenApply( ignoredVoid ->
//                {
//                    List temp = null;
//                    try {
//                        temp = cf1.get();
//                        temp.add(cf2.get());
//                        temp.add(cf3.get());
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } catch (ExecutionException e) {
//                        e.printStackTrace();
//                    }
//                    return CompletableFuture.completedFuture(temp);
//                });

        List<CompletableFuture<List>> allFutures = new ArrayList<>();
        allFutures.add(cf1);
        allFutures.add(cf2);
        allFutures.add(cf3);

        CompletableFuture combined =

                        CompletableFuture.allOf(cf1, cf2, cf3)
                .thenApply(voidIgnore -> allFutures
                    .stream()
                    .flatMap( f -> f.join().stream())
                    .collect(Collectors.toList()));

        List combinedList = (List)combined.join();
        System.out.println("Combined list:"+ combinedList);

    }

    private List getList(int size) {
        List list = new ArrayList(size);
        IntStream.range(0, size)
                .forEach(i -> list.add(" - dummy"));
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
