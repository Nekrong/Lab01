package org.dstu;

import org.dstu.domain.Furniture;
import org.dstu.domain.Сhair;
import org.dstu.domain.Table;
import org.dstu.util.CsvReader;
import org.dstu.util.SerializeUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You must specify data file name and serialize file name!");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];

        List<String[]> strings = CsvReader.readCsvFile(sourceFile, ";");
        List<Furniture> furn = new ArrayList<>();
        for (String[] line: strings) {
            if (line[0].equals("0")) {
                furn.add(new Сhair(line));
            } else {
                furn.add(new Table(line));
            }
        }

        furn.forEach(System.out::println);

        SerializeUtils.serialize(furn, binFile);
        List<Furniture> newFurn = (List<Furniture>) SerializeUtils.deserialize(binFile);
        System.out.println("Новая мебель:");
        newFurn.forEach(System.out::println);
    }
}
