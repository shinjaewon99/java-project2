package com.example.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReaderFileEx {

    Charset charset;

    public ReaderFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) {
        // ArrayList<>()를 안쓰는 이유는, ArrayList가 계속 생성된다.
        List<String> lines = new LinkedList<>();

        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)) {

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public Hospital parse(String str) {

        String[] splitString = str.split(",");


        Address address = new Address(splitString[10], splitString[5], splitString[7]);
        Hospital hospital = new Hospital(splitString[1], splitString[11], address);
        return hospital;
    }

    public List<Hospital> getHospital(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for(String line : lines){
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {

        ReaderFileEx rfe = new ReaderFileEx(Charset.forName("UTF-8"));
        List<String> strLines = rfe.getLines("C:\\Users\\tlswo\\OneDrive\\바탕 화면\\hospital_info_0920_utf8\\hospital_info_0920_utf8.csv");

        List<Hospital> parsedHospital = rfe.getHospital(strLines);

        for (int i = 0; i < parsedHospital.size(); i++) {
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteArr(), hospital.getAddress().getFullAddress());
        }

    }
}
