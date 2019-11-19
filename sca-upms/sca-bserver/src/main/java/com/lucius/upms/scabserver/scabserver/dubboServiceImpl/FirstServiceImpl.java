package com.lucius.upms.scabserver.scabserver.dubboServiceImpl;

import com.lucius.scadubbointerface.serrvice_interface.FirstService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class FirstServiceImpl  implements FirstService {

    @Override
    public String getName(String msg) {
        return "hello " + msg;
    }
}
