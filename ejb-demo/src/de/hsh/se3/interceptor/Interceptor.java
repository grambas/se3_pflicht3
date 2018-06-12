/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.interceptor;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author acer
 */
public class Interceptor {

    @AroundInvoke
    public Object intercept(InvocationContext ctx) throws Exception {
        Logger log = Logger.getLogger(ctx.getTarget().getClass().getName());
        log.info("Vor dem Aufruf von "
                + ctx.getTarget() + "." + ctx.getMethod().getName());
        try {
            return ctx.proceed();
        } finally {
            log.info("Nach dem Aufruf von "
                    + ctx.getTarget() + "." + ctx.getMethod().getName());
        }
    }
}
