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
package com.huawei.esdk.ivs.southcommu.jna.bean.usermgr;

import java.util.ArrayList;
import java.util.List;

import com.huawei.esdk.ivs.southcommu.jna.bean.commonmgr.CommonConstant;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

public class RoleInfoListSouth extends Structure
{
    // 总记录数
    public int   total;           
    // 分页信息
    public IndexRangeSouth indexRange;   
    // 保留字段
    public byte[] reserve = new byte[CommonConstant.IVS_RESERVE_32_LEN];          
    // 角色信息
    public RoleInfoSouth[] roleInfos;

    public RoleInfoListSouth()
    {
        super(Structure.ALIGN_NONE);
    }
    
    public RoleInfoListSouth(Pointer pointer)
    {
        super(pointer, Structure.ALIGN_NONE);
    }
    
    public RoleInfoListSouth(int size)
    {
        super(Structure.ALIGN_NONE);
        this.roleInfos = new RoleInfoSouth[size];
    }
    
    @Override
    protected List<String> getFieldOrder()
    {
        List<String> list = new ArrayList<String>();
        list.add("total");
        list.add("indexRange");
        list.add("reserve");
        list.add("roleInfos");
        return list;
    }   
}
