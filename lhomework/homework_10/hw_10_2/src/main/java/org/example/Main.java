package org.example;

/*
# 2 (по желанию)
API: https://apilayer.com/marketplace/fixer-api?utm_source=apilayermarketplace&utm_medium=featured
выбираете бесплатную регистрацию
Ваша задача: используя эндпоинт /convert написать сервис конвертор валют. Т.е. пользователь вводит
 исходную валюту, сумму и валюту в которой необходим результат, программа выдает результат.


Дополнительно: можете реализовать кэш. Т.е. запрашивая конвертацию между парой валют, мы можем
 сохранить курс,
тогда следующий раз для той же пары валют нет смысла дергать API, можно считать используя внутренний
курс программы
 */

import org.example.model.Conversion;
import org.example.service.Converter;
import org.example.service.ConverterFixerImpl;
import org.example.service.cache.CachedConverterImpl;
import org.example.service.RateCacheMapImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new CachedConverterImpl(new ConverterFixerImpl(), new RateCacheMapImpl());
        while (true) {
            System.out.println("Enter currency from: ");
            String from = scanner.nextLine().trim().toLowerCase();
            System.out.println("Enter currency to: ");
            String to = scanner.nextLine().trim().toLowerCase();
            System.out.println("Enter sum: ");
            double sum = scanner.nextDouble();
            scanner.nextLine();
            try {
                Conversion result = converter.convert(from, to, sum);
                System.out.printf("%s %s = %s %s%n", result.getAmountFrom(),
                        result.getFrom(),
                        result.getAmountTo(),
                        result.getTo());
            } catch (Exception e){
                System.out.println("Error");
            }
            System.out.println("exit?");
            if (scanner.nextLine().equals("yes")){
                break;
            }
        }
    }
}