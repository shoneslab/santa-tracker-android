/*
 * Copyright 2019. Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.apps.santatracker.doodles.shared;

/** A process which should be run once and then be finished. */
public abstract class CallbackProcess extends Process {
    private boolean didRun = false;

    @Override
    public void update(float deltaMs) {
        if (!didRun) {
            updateLogic(deltaMs);
            didRun = true;
        }
    }

    @Override
    public boolean isFinished() {
        return didRun;
    }
}
