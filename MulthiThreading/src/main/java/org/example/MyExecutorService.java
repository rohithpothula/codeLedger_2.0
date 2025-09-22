package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MyExecutorService {

    public static void main (String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(3);



//        Future<Integer> future = executor.submit(()->{
//            System.out.println("Task Completed");
//            Thread.sleep(2000);
//            return 2;
//        });

        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });

//        Integer result = future.get();
//        System.out.println(result);
        executor.shutdown();


        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Integer> finalIntegerList = new ArrayList<>();
        List<Future<Integer>> finalFutureList = new ArrayList<>();

        for(int i=0;i<10;i++){
            int finalI = i;
            Future<Integer> future1 = executorService.submit(()->{   return finalI *finalI;});
            int intermediateResult = future1.get();
            Future<Integer> future2 = executorService.submit(()->{   return intermediateResult*2;});
            finalFutureList.add(future2);
        }

        for(Future<Integer> f : finalFutureList){
            finalIntegerList.add(f.get());
        }

        System.out.println(finalIntegerList);

        executorService.shutdown();

        Integer a = CompletableFuture.supplyAsync(()-> add(2,3)).thenApplyAsync(result-> multiply(result,3)).get();
        System.out.println(a);
    }

    public static int add(int a,int b){
        return a+b;
    }

    public static int multiply(int a,int b){
        return a*b;
    }


}
