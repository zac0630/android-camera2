/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.camera2basic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);         //savedInstanceState保存activity上一次结束时的状态
        setContentView(R.layout.activity_camera);   //加载主view和布局
        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()      //开始操作Fragment
                    .replace(R.id.container, Camera2BasicFragment.newInstance())    //清空container中所有的fragment，实例化一个新的Camera2BasicFragment进去
                    .commit();                                  //提交事务
        }
    }

}
