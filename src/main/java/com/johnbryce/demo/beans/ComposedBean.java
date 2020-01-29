package com.johnbryce.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComposedBean {

    @Autowired
    private SingletonBean n1;

    @Autowired
    private PrototypeBean prototypeBean;

    @Autowired
    private PrototypeBean protoSix;

    public ComposedBean() {
    }

    public SingletonBean getN1() {
        return n1;
    }

    public void setN1(SingletonBean n1) {
        this.n1 = n1;
    }

    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }

    public void setPrototypeBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }

    public PrototypeBean getProtoSix() {
        return protoSix;
    }

    public void setProtoSix(PrototypeBean protoSix) {
        this.protoSix = protoSix;
    }

    @Override
    public String toString() {
        return "ComposedBean{" +
                "n1=" + n1 +
                ", prototypeBean=" + prototypeBean +
                ", protoSix=" + protoSix +
                '}';
    }
}
