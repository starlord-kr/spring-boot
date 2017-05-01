package com.joochang.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyLottoController {

    private MyLottoService myLottoService;

    @Autowired MyLottoController(MyLottoService myLottoService) {
        this.myLottoService = myLottoService;
    }


}
