/*
 * Copyright (C) 2015 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.osgi.linkage;

import java.util.Map;

import org.osgi.resource.Resource;

/**
 * Represents a resource that can be configured e.g.: via ConfigurationAdmin.
 */
public interface ConfigurableResource extends Resource {

  /**
   * Returns an immutable map of the configuration entries of the resource.
   * 
   * @return an immutable map of the configuration entries of the resource.
   */
  Map<String, Object> getProperties();
}
