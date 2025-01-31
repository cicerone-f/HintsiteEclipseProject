/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.hintsite.app;

import android.os.Bundle;
import org.apache.cordova.*;

import com.parse.*;

public class Hintsite extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        super.loadUrl(Config.getStartUrl());
        //super.loadUrl("file:///android_asset/www/index.html")
        
        Parse.initialize(this, "LkaGTOk7RGUaPXM0r9HQImwPAnmqUuhjF1QttcNE", "gFGAZ5IOuiTppblG1bMNmyh5H1lD8c22oFSjRsl7");
        
        // empty string represents broadcast channel
        PushService.subscribe(this, "", Hintsite.class);
        PushService.subscribe(this, "foo", Hintsite.class);
    }
}

