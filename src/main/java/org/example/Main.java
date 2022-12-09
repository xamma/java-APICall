package org.example;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL myURL = new URL("https://api.imgflip.com/get_memes");
        JsonNode json = ApiCaller.get(myURL);

        System.out.println(json.get("data").get("memes"));
    }
}