package com.CompleteableFutureExercise;

import com.Executors.LongTask;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightService {

    public Stream<CompletableFuture<Quote>> getQuotes() {
        var sites = List.of("site1", "site2", "site3");
        return sites.stream().map(this::getQuote);
    }

    public CompletableFuture<Quote> getQuote(String site) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from: " + site);

            var random = new Random();

            LongTask.simulate(1000+ random.nextInt(2000));

            var price = random.nextInt(10) + 100;

            return new Quote(site, price);
        });
    }

}
