package org.example;
/*
# 1
Ваша задача написать используя API https://api.imagga.com эндпоинт /text написать программу
 которая распознает текст на картинке. Для тестирования можно использовать
картинку https://cdn.javarush.com/images/article/431abcb1-71aa-4137-97bd-ad26d7aa0e00/800.jpeg
Результат для этой картинки строка: "ОТВЕЧАЮ В СПРИНГЕ ЭТО УЖЕ ЕСТЬ"

{
    "result": {
        "text": [
            {
                "coordinates": {
                    "height": 63,
                    "width": 306,
                    "xmax": 550,
                    "xmin": 244,
                    "ymax": 77,
                    "ymin": 14
                },
                "data": "ОТВЕЧАЮ"

 */

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String imgUrl =  "https://cdn.javarush.com/images/article/431abcb1-71aa-4137-97bd-ad26d7aa0e00/800.jpeg";
        String token = "Basic YWNjX2JjNWU0MWNhYmY4M2Q5YTplYmQyMjc2YjVmOGY0OWIwYTgxNmY0N2VjZDVkYTFhOQ==";
        String url = "https://api.imagga.com/v2/text";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", token);
        URI uri = UriComponentsBuilder.fromUriString(url)
                .queryParam("image_url", imgUrl)
                .build()
                .toUri();

        RequestEntity<String> request = new RequestEntity<>(headers, HttpMethod.GET, uri);
        try {
        ResponseEntity<TagsResponseDto> response = restTemplate.exchange(request, TagsResponseDto.class);
            if (response.getStatusCode() == HttpStatus.OK) {
                String resultString = response.getBody().getResult().getText().stream()
                        .map(TagDto::getData)
                        .collect(Collectors.joining(", "));
                System.out.println(resultString);
            } else {
                System.out.println("Error!");
            }
        } catch (Exception e) {
            System.out.println("Ошибка запроса");
            e.printStackTrace();
        }




    }
}

