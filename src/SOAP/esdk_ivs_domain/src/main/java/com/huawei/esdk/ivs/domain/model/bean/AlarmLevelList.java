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

import java.util.List;

/**
 * 告警级别列表
 * <p>
 * @author  cWX191990
 * @see  [相关类/方法]
 * @since  [eSDK IVS V100R001C10B001]
 */
public class AlarmLevelList
{
    /**
     * 告警级别列表
     */
    private List<AlarmLevel> alarmLevels;
    
    /**
     * 告警级别个数
     */
    private int alarmLevelNum;

    public List<AlarmLevel> getAlarmLevels()
    {
        return alarmLevels;
    }

    public void setAlarmLevels(List<AlarmLevel> alarmLevels)
    {
        this.alarmLevels = alarmLevels;
    }

    public int getAlarmLevelNum()
    {
        return alarmLevelNum;
    }

    public void setAlarmLevelNum(int alarmLevelNum)
    {
        this.alarmLevelNum = alarmLevelNum;
    }
    
}
