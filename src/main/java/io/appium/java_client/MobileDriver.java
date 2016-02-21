/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appium.java_client;

import org.openqa.selenium.ContextAware;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.LocationContext;
import org.openqa.selenium.remote.Response;

import java.util.Map;

public interface MobileDriver extends WebDriver,
        PerformsTouchActions,
        ContextAware, Rotatable, FindsByAccessibilityId<WebElement>, LocationContext,
        DeviceActionShortcuts, TouchShortcuts, InteractsWithFiles,
        InteractsWithApps, ScrollsTo<WebElement>, HasAppStrings {
    Response execute(String driverCommand, Map<String, ?> parameters);
}