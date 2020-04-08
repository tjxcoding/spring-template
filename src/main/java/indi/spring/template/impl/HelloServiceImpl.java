package indi.spring.template.impl;

import indi.spring.template.api.HelloService;
import indi.spring.template.common.LayoutPrint;
import org.springframework.stereotype.Service;

/**
 * @author tjx
 * @since 2020-4-9
 */
@Service
public class HelloServiceImpl implements HelloService {

    public void say(String msg) {
        LayoutPrint.printMsg(msg);
    }
}
