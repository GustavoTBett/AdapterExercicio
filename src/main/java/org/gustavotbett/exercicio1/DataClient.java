package org.gustavotbett.exercicio1;

import org.gustavotbett.exercicio1.service.JsonService;

public class DataClient {
    private JsonService jsonService;

    public DataClient(JsonService jsonService) {
        this.jsonService = jsonService;
    }

    public void displayData() {
        String data = this.jsonService.getJsonData();
        System.out.println("Dados recebidos: " + data);
    }
}
