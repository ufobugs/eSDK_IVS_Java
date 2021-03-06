/**
 * Copyright 2015 Huawei Technologies Co., Ltd. All rights reserved.
 * eSDK is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   
 * http://www.apache.org/licenses/LICENSE-2.0
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huawei.esdk.ivs.professional.local.impl.autogen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.huawei.esdk.ivs.professional.local.bean.AlarmBriefInfos;
import com.huawei.esdk.ivs.professional.local.bean.AudioBriefInfos;
import com.huawei.esdk.ivs.professional.local.bean.CameraBriefInfos;
import com.huawei.esdk.ivs.professional.local.bean.ConfigItem;
import com.huawei.esdk.ivs.professional.local.bean.DeviceBriefInfos;
import com.huawei.esdk.ivs.professional.local.bean.DeviceGroupInfos;
import com.huawei.esdk.ivs.professional.local.bean.DeviceOperResultInfos;
import com.huawei.esdk.ivs.professional.local.bean.DomainRouteInfos;
import com.huawei.esdk.ivs.professional.local.bean.ResultInfos;

/**
 * This class was generated by Apache CXF 2.6.10
 * 2014-01-06T23:40:36.090+08:00
 * Generated source version: 2.6.10
 * 
 */
@WebService(targetNamespace = "esdk_ivs_professional_server", name = "IVSProfessional.DeviceManager")
@XmlSeeAlso({ObjectFactory.class})
public interface IVSProfessionalDeviceManager {

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "setCameraName", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.SetCameraName")
    @WebMethod(action = "esdk_ivs_professional_server.setCameraName")
    @ResponseWrapper(localName = "setCameraNameResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.SetCameraNameResponse")
    public java.lang.Integer setCameraName(
        @WebParam(name = "cameraCode", targetNamespace = "")
        java.lang.String cameraCode,
        @WebParam(name = "newCameraName", targetNamespace = "")
        java.lang.String newCameraName
    );

    @RequestWrapper(localName = "getDomainRoute", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.GetDomainRoute")
    @WebMethod(action = "esdk_ivs_professional_server.getDomainRoute")
    @ResponseWrapper(localName = "getDomainRouteResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.GetDomainRouteResponse")
    public void getDomainRoute(
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "domainRouteInfos", targetNamespace = "")
        javax.xml.ws.Holder<DomainRouteInfos> domainRouteInfos
    );

    @RequestWrapper(localName = "getDeviceList", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.bean.GetDeviceList")
    @WebMethod(action = "esdk_ivs_professional_server.getDeviceList")
    @ResponseWrapper(localName = "getDeviceListResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.bean.GetDeviceListResponse")
    public void getDeviceList(
        @WebParam(name = "deviceType", targetNamespace = "")
        java.lang.Integer deviceType,
        @WebParam(name = "indexRange", targetNamespace = "")
        com.huawei.esdk.ivs.professional.local.bean.IndexRange indexRange,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "cameraBriefInfos", targetNamespace = "")
        javax.xml.ws.Holder<CameraBriefInfos> cameraBriefInfos,
        @WebParam(mode = WebParam.Mode.OUT, name = "audioBriefInfos", targetNamespace = "")
        javax.xml.ws.Holder<AudioBriefInfos> audioBriefInfos,
        @WebParam(mode = WebParam.Mode.OUT, name = "alarmBriefInfos", targetNamespace = "")
        javax.xml.ws.Holder<AlarmBriefInfos> alarmBriefInfos
    );

    @RequestWrapper(localName = "addDevice", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.AddDevice")
    @WebMethod(action = "esdk_ivs_professional_server.addDevice")
    @ResponseWrapper(localName = "addDeviceResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.AddDeviceResponse")
    public void addDevice(
        @WebParam(name = "domainCode", targetNamespace = "")
        java.lang.String domainCode,
        @WebParam(name = "deviceNum", targetNamespace = "")
        java.lang.Integer deviceNum,
        @WebParam(name = "deviceOperInfos", targetNamespace = "")
        com.huawei.esdk.ivs.professional.local.bean.DeviceOperInfoList deviceOperInfos,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "deviceOperResultInfos", targetNamespace = "")
        javax.xml.ws.Holder<DeviceOperResultInfos> deviceOperResultInfos
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "rebootDevice", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.RebootDevice")
    @WebMethod(action = "esdk_ivs_professional_server.rebootDevice")
    @ResponseWrapper(localName = "rebootDeviceResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.RebootDeviceResponse")
    public java.lang.Integer rebootDevice(
        @WebParam(name = "deviceCode", targetNamespace = "")
        java.lang.String deviceCode,
        @WebParam(name = "rebootType", targetNamespace = "")
        java.lang.Integer rebootType
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "stopSearchDevice", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.StopSearchDevice")
    @WebMethod(action = "esdk_ivs_professional_server.stopSearchDevice")
    @ResponseWrapper(localName = "stopSearchDeviceResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.StopSearchDeviceResponse")
    public java.lang.Integer stopSearchDevice(
        @WebParam(name = "domainCode", targetNamespace = "")
        java.lang.String domainCode,
        @WebParam(name = "searchInfo", targetNamespace = "")
        java.lang.String searchInfo
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "startSearchDevice", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.StartSearchDevice")
    @WebMethod(action = "esdk_ivs_professional_server.startSearchDevice")
    @ResponseWrapper(localName = "startSearchDeviceResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.StartSearchDeviceResponse")
    public java.lang.Integer startSearchDevice(
        @WebParam(name = "domainCode", targetNamespace = "")
        java.lang.String domainCode,
        @WebParam(name = "searchInfo", targetNamespace = "")
        java.lang.String searchInfo
    );

    @RequestWrapper(localName = "getDeviceConfig", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.GetDeviceConfig")
    @WebMethod(action = "esdk_ivs_professional_server.getDeviceConfig")
    @ResponseWrapper(localName = "getDeviceConfigResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.GetDeviceConfigResponse")
    public void getDeviceConfig(
        @WebParam(name = "deviceCode", targetNamespace = "")
        java.lang.String deviceCode,
        @WebParam(name = "configType", targetNamespace = "")
        java.lang.Integer configType,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "configItem", targetNamespace = "")
        javax.xml.ws.Holder<ConfigItem> configItem
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "setMainDeviceName", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.SetMainDeviceName")
    @WebMethod(action = "esdk_ivs_professional_server.setMainDeviceName")
    @ResponseWrapper(localName = "setMainDeviceNameResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.SetMainDeviceNameResponse")
    public java.lang.Integer setMainDeviceName(
        @WebParam(name = "deviceCode", targetNamespace = "")
        java.lang.String deviceCode,
        @WebParam(name = "newDeviceName", targetNamespace = "")
        java.lang.String newDeviceName
    );

    @RequestWrapper(localName = "deleteDevice", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.DeleteDevice")
    @WebMethod(action = "esdk_ivs_professional_server.deleteDevice")
    @ResponseWrapper(localName = "deleteDeviceResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.DeleteDeviceResponse")
    public void deleteDevice(
        @WebParam(name = "domainCode", targetNamespace = "")
        java.lang.String domainCode,
        @WebParam(name = "deviceNum", targetNamespace = "")
        java.lang.Integer deviceNum,
        @WebParam(name = "deviceCodeList", targetNamespace = "")
        com.huawei.esdk.ivs.professional.local.bean.DeviceCodeList deviceCodeList,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultInfos", targetNamespace = "")
        javax.xml.ws.Holder<ResultInfos> resultInfos
    );

    @RequestWrapper(localName = "getDeviceGroup", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.GetDeviceGroup")
    @WebMethod(action = "esdk_ivs_professional_server.getDeviceGroup")
    @ResponseWrapper(localName = "getDeviceGroupResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.GetDeviceGroupResponse")
    public void getDeviceGroup(
        @WebParam(name = "domainCode", targetNamespace = "")
        java.lang.String domainCode,
        @WebParam(name = "deviceGroupCode", targetNamespace = "")
        java.lang.Integer deviceGroupCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "deviceGroupInfos", targetNamespace = "")
        javax.xml.ws.Holder<DeviceGroupInfos> deviceGroupInfos
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "setDeviceConfig", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.SetDeviceConfig")
    @WebMethod(action = "esdk_ivs_professional_server.setDeviceConfig")
    @ResponseWrapper(localName = "setDeviceConfigResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.SetDeviceConfigResponse")
    public java.lang.Integer setDeviceConfig(
        @WebParam(name = "deviceCode", targetNamespace = "")
        java.lang.String deviceCode,
        @WebParam(name = "configType", targetNamespace = "")
        java.lang.Integer configType,
        @WebParam(name = "configItem", targetNamespace = "")
        com.huawei.esdk.ivs.professional.local.bean.ConfigItem configItem
    );

    @RequestWrapper(localName = "queryDeviceList", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.bean.QueryDeviceList")
    @WebMethod(action = "esdk_ivs_professional_server.queryDeviceList")
    @ResponseWrapper(localName = "queryDeviceListResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.bean.QueryDeviceListResponse")
    public void queryDeviceList(
        @WebParam(name = "domainCode", targetNamespace = "")
        java.lang.String domainCode,
        @WebParam(name = "deviceType", targetNamespace = "")
        java.lang.Integer deviceType,
        @WebParam(name = "queryFormat", targetNamespace = "")
        com.huawei.esdk.ivs.professional.local.bean.QueryUnifiedFormat queryFormat,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "deviceBriefInfos", targetNamespace = "")
        javax.xml.ws.Holder<DeviceBriefInfos> deviceBriefInfos
    );

    @RequestWrapper(localName = "verifyDevice", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.VerifyDevice")
    @WebMethod(action = "esdk_ivs_professional_server.verifyDevice")
    @ResponseWrapper(localName = "verifyDeviceResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.VerifyDeviceResponse")
    public void verifyDevice(
        @WebParam(name = "domainCode", targetNamespace = "")
        java.lang.String domainCode,
        @WebParam(name = "verifyInfo", targetNamespace = "")
        java.lang.String verifyInfo,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "responseXML", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> responseXML
    );
    
    @RequestWrapper(localName = "getVideoDiagnose", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.GetVideoDiagnose")
    @WebMethod(action = "esdk_ivs_professional_server.getVideoDiagnose")
    @ResponseWrapper(localName = "getVideoDiagnoseResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.GetVideoDiagnoseResponse")
    public void getVideoDiagnose(
        @WebParam(name = "domainCode", targetNamespace = "")
        java.lang.String domainCode,
        @WebParam(name = "cameraCode", targetNamespace = "")
        java.lang.String cameraCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "resultCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> resultCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "diagnoseXML", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> diagnoseXML
    );

    @WebResult(name = "resultCode", targetNamespace = "")
    @RequestWrapper(localName = "setVideoDiagnose", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.SetVideoDiagnose")
    @WebMethod(action = "esdk_ivs_professional_server.setVideoDiagnose")
    @ResponseWrapper(localName = "setVideoDiagnoseResponse", targetNamespace = "esdk_ivs_professional_server", className = "com.huawei.esdk.ivs.professional.local.impl.autogen.SetVideoDiagnoseResponse")
    public int setVideoDiagnose(
        @WebParam(name = "diagnoseXML", targetNamespace = "")
        java.lang.String diagnoseXML
    );
}
