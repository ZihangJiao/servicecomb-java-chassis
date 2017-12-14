/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.metrics.core.model;

import java.util.HashMap;
import java.util.Map;

public class RegistryModel {

  private InstanceModel instanceModel;

  private final Map<String, InvocationModel> allInvocations;

  public InstanceModel getInstanceModel() {
    return instanceModel;
  }

  public Map<String, InvocationModel> getInvocations() {
    return allInvocations;
  }

  public RegistryModel() {
    this.instanceModel = new InstanceModel();
    this.allInvocations = new HashMap<>();
  }

  public RegistryModel(InstanceModel instanceModel,
      Map<String, InvocationModel> allInvocations) {
    this.instanceModel = instanceModel;
    this.allInvocations = allInvocations;
  }
}
