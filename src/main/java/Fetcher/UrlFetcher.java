package Fetcher;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.*;
import utils.HttpUtils;


public class UrlFetcher {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    static class PingBored implements Callable<BoredDTO> {
        String url;
        PingBored(String url) {
            this.url = url;
        }
        @Override
        public BoredDTO call() throws Exception {
            String joke = HttpUtils.fetchData(url);
            BoredDTO boredDTO = gson.fromJson(joke, BoredDTO.class);
            return boredDTO;
        }
    }

    static class PingCat implements Callable<CatDTO> {
        String url;
        PingCat(String url) {
            this.url = url;
        }
        @Override
        public CatDTO call() throws Exception {
            String joke = HttpUtils.fetchData(url);
            CatDTO catDTO = gson.fromJson(joke, CatDTO.class);
            return catDTO;
        }
    }

    static class PingDog implements Callable<DogDTO> {
        String url;
        PingDog(String url) {
            this.url = url;
        }
        @Override
        public DogDTO call() throws Exception {
            String joke = HttpUtils.fetchData(url);
            DogDTO dogDTO = gson.fromJson(joke, DogDTO.class);
            return dogDTO;
        }
    }

    static class PingGenderized implements Callable<GenderizeDTO> {
        String url;
        PingGenderized(String url) {
            this.url = url;
        }
        @Override
        public GenderizeDTO call() throws Exception {
            String joke = HttpUtils.fetchData(url);
            GenderizeDTO genderizeDTO = gson.fromJson(joke, GenderizeDTO.class);
            return genderizeDTO;
        }
    }

    public static OurDTO runParrallel() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        List<String> urls = new ArrayList<>();
        urls.add("https://www.boredapi.com/api/activity");
        urls.add("https://catfact.ninja/fact");
        urls.add("https://dog.ceo/api/breeds/image/random");
        urls.add("https://api.genderize.io/?name=luc");

        Future future1 = executor.submit(new PingBored(urls.get(0)));
        Future future2 = executor.submit(new PingCat(urls.get(1)));
        Future future3 = executor.submit(new PingDog(urls.get(2)));
        Future future4 = executor.submit(new PingGenderized(urls.get(3)));

        OurDTO jokes = new OurDTO((BoredDTO) future1.get(), (CatDTO) future2.get(), (DogDTO) future3.get(), (GenderizeDTO) future4.get());

        return jokes;
    }
}