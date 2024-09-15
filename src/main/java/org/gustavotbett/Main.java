package org.gustavotbett;

import org.gustavotbett.exercicio1.DataClient;
import org.gustavotbett.exercicio1.PdfToJsonAdapter;
import org.gustavotbett.exercicio1.service.JsonService;
import org.gustavotbett.exercicio1.service.PdfService;
import org.gustavotbett.exercicio2.ClientRectangle;
import org.gustavotbett.exercicio2.LegacyRectangle;
import org.gustavotbett.exercicio2.LegacyToClientAdapter;

public class Main {
    public static void main(String[] args) {
        //exercicio 1
        PdfService pdfService = new PdfService();
        JsonService adapter = new PdfToJsonAdapter(pdfService);

        DataClient client = new DataClient(adapter);
        client.displayData();

        //exercicio 2
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        LegacyToClientAdapter adapter2 = new LegacyToClientAdapter(legacyRectangle, 50, 30);

        adapter2.displayRectangle();
    }
}