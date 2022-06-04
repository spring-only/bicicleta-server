package com.springonly.bicicletaserver.service.impl;

import com.springonly.bicicletaserver.model.Bicicleta;
import com.springonly.bicicletaserver.service.BicicletaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class BicicletaServiceImpl implements BicicletaService {

    @Value("${database.server}")
    private String databaseServer;

    @Value("${database.name}")
    private String databaseName;

    @Value("${database.user}")
    private String databaseUser;

    @Value("${database.password}")
    private String databasePassword;

    @Override
    public List<Bicicleta> getList() {
        // obtener parametros de conexion:
        // servidor
        // nombre de la base de datos
        // usuario
        // password

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Consultado el    : " + dateTime.format(formatter));
        System.out.println("Database Server  : " + databaseServer);
        System.out.println("Database Name    : " + databaseName);
        System.out.println("Database User    : " + databaseUser);
        System.out.println("Database Password: " + databasePassword);

        // armar cadena de conexion

        // conectarse a la base de datos
        // efectuar la consulta a la tabla

        // retornar los datos
        List<Bicicleta> bicicletas = new ArrayList<>();

        bicicletas.add(new Bicicleta("1", "La Veloz"));
        bicicletas.add(new Bicicleta("2", "La Resistente"));

        return bicicletas;
    }
}
