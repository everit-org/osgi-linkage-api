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

import org.osgi.resource.Resource;

/**
 * A {@link Resource} that is embedded in another {@link Resource}. E.g.: A component, that is
 * implemented within a bundle, will return the BundleRevision as parent resource.
 *
 */
public interface EmbeddedResource extends Resource {

  /**
   * Returns the {@link Resource} that declared this instance.
   *
   * @return the {@link Resource} that declared this instance.
   */
  Resource getDeclaringResource();
}
