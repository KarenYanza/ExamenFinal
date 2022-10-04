package com.example.exa_final.Apis;

public class Api {
    public static final String URL_001="https://fipo.equisd.com/api/";


    public static  ProductoService getLibroService(){
        return EqApiClient.getClient(URL_001).create(ProductoService.class);
    }
}
