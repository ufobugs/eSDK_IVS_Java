package com.huawei.esdk.demo.gen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.10
 * 2014-02-17T19:55:03.856+08:00
 * Generated source version: 2.6.10
 * 
 */
@WebService(targetNamespace = "esdk_ivs_professional_server", name = "IVSProfessional.ClusterManager")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IVSProfessionalClusterManager {

    @WebResult(name = "getNVRListResponse", targetNamespace = "esdk_ivs_professional_server", partName = "parameters")
    @WebMethod(action = "esdk_ivs_professional_server.getNVRList")
    public GetNVRListResponse getNVRList(
        @WebParam(partName = "parameters", name = "getNVRList", targetNamespace = "esdk_ivs_professional_server")
        GetNVRList parameters
    );
}
