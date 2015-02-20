/**
 * This file is part of Everit - OSGi Linkage API.
 *
 * Everit - OSGi Linkage API is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - OSGi Linkage API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - OSGi Linkage API.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.linkage;

import org.osgi.resource.Capability;
import org.osgi.resource.Requirement;
import org.osgi.resource.Wire;

/**
 * This interface should be registered as OSGi services and provide information about {@link Wire}s between resources.
 * Multiple OSGi services may be registered with this interface.
 */
public interface WireContainer {

    /**
     * Returns all the wires this service knows about.
     *
     * @return Wires that this container knows about.
     */
    Wire[] getWires();

    /**
     * Returns all the wires known by this container where the {@link Wire#getCapability()} would return the specified
     * {@link Capability}.
     *
     * @param capability
     *            The {@link Capability} that is specified by {@link Wire#getCapability()}.
     * @return an array of wires that meet the selection criteria or an empty array if no such wires are available.
     */
    Wire[] getWiresByCapability(Capability capability);

    /**
     * Returns all the wires known by this container where the {@link Wire#getRequirement()} would return the specified
     * {@link Requirement}.
     *
     * @param requirement
     *            The {@link Requirement} that is specified by {@link Wire#getRequirement()}.
     * @return an array of the wires that meet the selection criteria or an empty array if no such wires are available.
     */
    Wire[] getWiresByRequirement(Requirement requirement);

}
