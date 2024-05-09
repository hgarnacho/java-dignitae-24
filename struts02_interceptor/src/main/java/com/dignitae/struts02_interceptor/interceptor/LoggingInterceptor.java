package com.dignitae.struts02_interceptor.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoggingInterceptor implements Interceptor {

    @Override
    public void destroy() {
        // Método requerido, no lo necesitaremos en este ejemplo.
    }

    @Override
    public void init() {
        // Método requerido, no lo necesitaremos en este ejemplo.
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        // Antes de la ejecución de la acción
        System.out.println("MENSAJE ANTES DE EJECTUAR ACTION: " + invocation.getAction().getClass().getName());

        // Ejecutar la acción
        String result = invocation.invoke();

        // Después de la ejecución de la acción
        System.out.println("MENSAJE DESPUES DE EJECTUAR ACTION: " + invocation.getAction().getClass().getName());

        return result;
    }
}