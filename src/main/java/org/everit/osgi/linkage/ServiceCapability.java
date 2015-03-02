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

import org.osgi.framework.ServiceReference;
import org.osgi.framework.wiring.BundleRevision;
import org.osgi.resource.Capability;

/**
 * A {@link Capability} that represents and OSGi service.
 */
public interface ServiceCapability extends Capability {

  /**
   * Namespace that is returned if the {@link Capability} is a {@link ServiceCapability}.
   */
  String SERVICE_CAPABILITY_NAMESPACE = "osgi.service";

  /**
   * Two {@link ServiceCapability}s are the same if they hold the same {@link ServiceReference}
   * instance and {@link Capability#getResource()} function returns the same resource.
   */
  @Override
  boolean equals(Object obj);

  /**
   * Returns the service properties.
   */
  @Override
  Map<String, Object> getAttributes();

  /**
   * Always returns an immutable empty {@link Map}.
   */
  @Override
  Map<String, String> getDirectives();

  /**
   * Always returns {@value #SERVICE_CAPABILITY_NAMESPACE}.
   */
  @Override
  String getNamespace();

  /**
   * Returns the {@link BundleRevision} that was used to register the OSGi service.
   */
  @Override
  BundleRevision getResource();

  /**
   * Returns the {@link ServiceReference} that is held by this {@link Capability}.
   *
   * @return The {@link ServiceReference} that is held by this {@link Capability}.
   */
  ServiceReference<?> getServiceReference();

  /**
   * Two {@link ServiceCapability}s have the same hashcode if they hold the same
   * {@link ServiceReference} instance and {@link Capability#getResource()} function returns the
   * same resource.
   */
  @Override
  int hashCode();
}
