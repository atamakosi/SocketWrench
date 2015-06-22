/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketwrench.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Adam Mcnabb
 * @version 0.1
 * @date 6/22/2015
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface State {
    
    /**
     * The state to associate the method or class with.
     * @return 
     */
    String state();
}
