package com.joochang.lotto;

import com.joochang.config.PersonnelProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyLottoService {

    private final PersonnelProperties personnelProperties;

    @Autowired public MyLottoService(PersonnelProperties personnelProperties) {
        this.personnelProperties = personnelProperties;
    }

    public String getPersonnelName() {
        return personnelProperties.getName();
    }
}
