package com.hibenettest.persistance;

import com.hibenettest.business.Lonly;

import java.util.List;

public interface LPersonDAO {
    public void sayHello(Lonly p);

    List<Lonly> getAll();
}
