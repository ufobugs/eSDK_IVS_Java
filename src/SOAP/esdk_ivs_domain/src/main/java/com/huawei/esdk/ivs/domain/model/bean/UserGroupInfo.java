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
package com.huawei.esdk.ivs.domain.model.bean;

public class UserGroupInfo
{
    private String domainCode;
    
    private int groupID;
    
    private String groupName;
    
    private int parentGroupID;
    
    private int level;
    
    private String groupDesc;
    
    private String reserve;

    public String getDomainCode()
    {
        return domainCode;
    }

    public void setDomainCode(String domainCode)
    {
        this.domainCode = domainCode;
    }

    public int getGroupID()
    {
        return groupID;
    }

    public void setGroupID(int groupID)
    {
        this.groupID = groupID;
    }

    public String getGroupName()
    {
        return groupName;
    }

    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public int getParentGroupID()
    {
        return parentGroupID;
    }

    public void setParentGroupID(int parentGroupID)
    {
        this.parentGroupID = parentGroupID;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public String getGroupDesc()
    {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc)
    {
        this.groupDesc = groupDesc;
    }

    public String getReserve()
    {
        return reserve;
    }

    public void setReserve(String reserve)
    {
        this.reserve = reserve;
    }
    
}
