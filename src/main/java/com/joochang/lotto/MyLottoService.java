package com.joochang.lotto;

import com.joochang.config.PersonnelConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyLottoService {

    private final PersonnelConfig personnelConfig;

    @Autowired public MyLottoService(PersonnelConfig personnelConfig) {
        this.personnelConfig = personnelConfig;
    }

    public String getPersonnelName() {
        return personnelConfig.getName();
    }
}
