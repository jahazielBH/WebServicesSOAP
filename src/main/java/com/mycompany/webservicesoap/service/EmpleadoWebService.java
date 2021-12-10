/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservicesoap.service;

import com.mycompany.webservicesoap.dao.EmpleadoDAO;
import com.mycompany.webservicesoap.entity.Empleado;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

/**
 *
 * @author JAHAZIEL BH
 */
@WebService(serviceName = "EmpleadoWebService")
public class EmpleadoWebService {

    /**
     * Web service operation
     * @param empleado
     * @return 
     */
    @WebMethod(operationName = "create")
    public boolean create(@WebParam(name = "empleado") Empleado empleado) {
        try {
            EmpleadoDAO dao = new EmpleadoDAO();
            return dao.guardar(empleado);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Web service operation
     * @param empleado
     * @return 
     */
    @WebMethod(operationName = "update")
    public boolean update(@WebParam(name = "empleado") Empleado empleado) {
        try {
            EmpleadoDAO dao = new EmpleadoDAO();
            return dao.actualizar(empleado);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "delete")
    public boolean delete(@WebParam(name = "id") long id) {
        try {
            EmpleadoDAO dao = new EmpleadoDAO();
            return dao.eliminar(id);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "findbyid")
    public Empleado findbyid(@WebParam(name = "id") long id) {
        try {
            EmpleadoDAO dao = new EmpleadoDAO();
            return dao.buscarById(id);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "findAll")
    public List<Empleado> findAll() {
        try {
            EmpleadoDAO dao = new EmpleadoDAO();
            return dao.buscarAll();
        } catch (Exception e) {
            return null;
        }
    }
    
}
