package org.example.service;

import org.example.model.Conversion;

public interface Converter {
    Conversion convert(String from, String to, double amount);
}

