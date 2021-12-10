/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservicesoap.service;

import com.mycompany.webservicesoap.dao.DepartamentoDAO;
import com.mycompany.webservicesoap.entity.Departamento;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author JAHAZIEL BH
 */
@WebService(serviceName = "DepartamentoWebService")
public class DepartamentoWebService {

    /**
     * Web service operation
     * @param departamento
     * @return 
     */
    @WebMethod(operationName = "create")
    public boolean create(@WebParam(name = "departamento") Departamento departamento) {
        try {
            DepartamentoDAO dao = new DepartamentoDAO();
            return dao.guardar(departamento);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Web service operation
     * @param departamento
     * @return 
     */
    @WebMethod(operationName = "update")
    public boolean update(@WebParam(name = "departamento") Departamento departamento) {
        try {
            DepartamentoDAO dao = new DepartamentoDAO();
            return dao.actualizar(departamento);
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
            DepartamentoDAO dao = new DepartamentoDAO();
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
    public Departamento findbyid(@WebParam(name = "id") long id) {
        try {
            DepartamentoDAO dao = new DepartamentoDAO();
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
    public List<Departamento> findAll() {
        try {
            DepartamentoDAO dao = new DepartamentoDAO();
            return dao.buscarAll();
        } catch (Exception e) {
            return null;
        }
    }
}
