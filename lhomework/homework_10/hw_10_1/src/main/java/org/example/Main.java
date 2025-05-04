package org.example;
/*
# 1
Ваша задача написать используя API https://api.imagga.com эндпоинт /text написать программу
 которая распознает текст на картинке. Для тестирования можно использовать
картинку https://cdn.javarush.com/images/article/431abcb1-71aa-4137-97bd-ad26d7aa0e00/800.jpeg
Результат для этой картинки строка: "ОТВЕЧАЮ В СПРИНГЕ ЭТО УЖЕ ЕСТЬ"


# 2 (по желанию)
API: https://apilayer.com/marketplace/fixer-api?utm_source=apilayermarketplace&utm_medium=featured
выбираете бесплатную регистрацию
Ваша задача: используя эндпоинт /convert написать сервис конвертор валют. Т.е. пользователь вводит
 исходную валюту, сумму и валюту в которой необходим результат, программа выдает результат.


Дополнительно: можете реализовать кэш. Т.е. запрашивая конвертацию между парой валют, мы можем
 сохранить курс,
тогда следующий раз для той же пары валют нет смысла дергать API, можно считать используя внутренний
курс программы

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

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class Main {
    public static void main(String[] args) {
        String imgUrl = "https://cdn.javarush.com/images/article/431abcb1-71aa-4137-97bd-ad26d7aa0e00/800.jpeg";
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

        ResponseEntity<TagsResponseDto> response = restTemplate.exchange(request, TagsResponseDto.class);
        System.out.println(response.getBody().getResult().getText());



    }
}

