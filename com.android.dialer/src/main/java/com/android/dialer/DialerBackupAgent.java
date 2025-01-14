/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.dialer;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

/**
 * The Dialer backup agent backs up the shared preferences settings of the
 * Dialer App. Right now it backs up the whole shared preference file. This
 * can be modified in the future to accommodate partical backup.
 */
public class DialerBackupAgent extends BackupAgentHelper
{
    private static final String SHARED_KEY = "shared_pref";

    @Override
    public void onCreate() {
        addHelper(SHARED_KEY, new SharedPreferencesBackupHelper(this,
                DialtactsActivity.SHARED_PREFS_NAME));
    }
}
