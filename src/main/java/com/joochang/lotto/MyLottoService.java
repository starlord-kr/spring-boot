package com.joochang.lotto;

import com.joochang.config.DataSourceConfig;
import com.joochang.config.PersonnelConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyLottoService {

    private final PersonnelConfig personnelConfig;
    private final DataSourceConfig dataSourceConfig;

    @Autowired public MyLottoService(PersonnelConfig personnelConfig,
                                     DataSourceConfig dataSourceConfig) {
        this.personnelConfig = personnelConfig;
        this.dataSourceConfig = dataSourceConfig;
    }

    public String getPersonnelName() {
        return personnelConfig.getName();
    }

    public Integer getTomcatMinIdel() {
        return Integer.parseInt(dataSourceConfig.getTomcat().getMinIdle());
    }
}
