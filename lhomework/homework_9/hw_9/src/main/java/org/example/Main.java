package org.example;
/*
Ваша задача написать программу, которая получает List комментариев (объекты коллекции) comments
на сайте https://jsonplaceholder.typicode.com/
 */
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        // Создаем объект
        RestTemplate restTemplate = new RestTemplate();

        // Адрес запроса
        URI uri = new URI("https://jsonplaceholder.typicode.com/comments");

        // Задаем параметры объекту
        RequestEntity<String> request = new RequestEntity<>(HttpMethod.GET,uri);

        // Задаем параметры какой тип данных мы хотим получить
        ResponseEntity<List<PostDto>> response =
                restTemplate.exchange(request, new ParameterizedTypeReference<List<PostDto>>() { });

        List<PostDto> body = response.getBody();
        for (PostDto comment: body){
            System.out.println(comment);
            System.out.println();
        }
    }
}
