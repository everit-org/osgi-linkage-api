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

import org.osgi.resource.Capability;
import org.osgi.resource.Requirement;
import org.osgi.resource.Wire;

/**
 * This interface should be registered as OSGi services and provide information about {@link Wire}s
 * between resources. Multiple OSGi services may be registered with this interface.
 */
public interface WireContainer {

  /**
   * Returns all the wires this service knows about.
   *
   * @return Wires that this container knows about.
   */
  Wire[] getWires();

  /**
   * Returns all the wires known by this container where the {@link Wire#getCapability()} would
   * return the specified {@link Capability}.
   *
   * @param capability
   *          The {@link Capability} that is specified by {@link Wire#getCapability()}.
   * @return an array of wires that meet the selection criteria or an empty array if no such wires
   *         are available.
   */
  Wire[] getWiresByCapability(Capability capability);

  /**
   * Returns all the wires known by this container where the {@link Wire#getRequirement()} would
   * return the specified {@link Requirement}.
   *
   * @param requirement
   *          The {@link Requirement} that is specified by {@link Wire#getRequirement()}.
   * @return an array of the wires that meet the selection criteria or an empty array if no such
   *         wires are available.
   */
  Wire[] getWiresByRequirement(Requirement requirement);

}
