package com.api.intranet.services;

import java.util.List;

import com.api.intranet.entities.DiaFestivo;
import com.api.intranet.repositories.DiaFestivoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaFestivoService {

    @Autowired DiaFestivoRepository diaFestivoRepository;

    public DiaFestivoService(){}

    public List<DiaFestivo> getDiasFestivos(){
        return diaFestivoRepository.findAll();
    }

    public DiaFestivo addDiaFestivo(DiaFestivo diaFestivo){
        return diaFestivoRepository.save(diaFestivo);
    }
    
}
