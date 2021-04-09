package com.binnursen.carfactory.service;

import com.binnursen.carfactory.entity.Cabrio;
import com.binnursen.carfactory.entity.Sedan;
import com.binnursen.carfactory.repository.CarInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private CarInterface carInterface;

    public String getCar(String carName){
        if(carName.equals("sedan")){
            Sedan sedan = new Sedan();
            return sedan.getType();
        }else if(carName.equals("cabrio")){
            Cabrio cabrio = new Cabrio();
            return cabrio.getType();
        }else{
            return "Type not found";
        }
    }


}
