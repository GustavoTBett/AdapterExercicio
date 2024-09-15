package org.gustavotbett.exercicio1;

import org.gustavotbett.exercicio1.service.JsonService;
import org.gustavotbett.exercicio1.service.PdfService;

public class PdfToJsonAdapter extends JsonService {
    private PdfService pdfService;

    public PdfToJsonAdapter(PdfService pdfService) {
        this.pdfService = pdfService;
    }

    @Override
    public String getJsonData() {
        String pdfData = pdfService.getPdfData();
        return pdfData;
    }
}
