/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.sort;

import Model.Registering;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class sortRegisteringByNameDESC implements Comparator<Registering>{

    @Override
    public int compare(Registering o1, Registering o2) {
        return o2.getStudent().getFullName().compareTo(
                o1.getStudent().getFullName());
    }
}
