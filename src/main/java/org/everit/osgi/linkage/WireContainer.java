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

import java.util.List;

import org.osgi.resource.Capability;
import org.osgi.resource.Requirement;
import org.osgi.resource.Wire;

/**
 * This interface should be registered as OSGi services and provide information about {@link Wire}s between resources.
 * Multiple OSGi services may be registered with this interface.
 */
public interface WireContainer {

    /**
     * Adding a {@link WireTracker} that will be notified about {@link Wire} changes in the container.
     *
     * @param wireTracker
     *            The {@link WireTracker} that will be registered in the container.
     */
    void addWireTracker(WireTracker wireTracker);

    /**
     * Returns all the wires this service knows about.
     *
     * @return The list of wires this service knows about.
     */
    List<Wire> getWires();

    /**
     * Returns all the wires known by this container where the {@link Wire#getCapability()} would return the specified
     * {@link Capability}.
     *
     * @param capability
     *            The {@link Capability} that is specified by {@link Wire#getCapability()}.
     * @return an immutable list of the wires that meet the selection criteria or an empty list if no such wires are
     *         available.
     */
    List<Wire> getWiresByCapability(Capability capability);

    /**
     * Returns all the wires known by this container where the {@link Wire#getRequirement()} would return the specified
     * {@link Requirement}.
     *
     * @param requirement
     *            The {@link Requirement} that is specified by {@link Wire#getRequirement()}.
     * @return an immutable list of the wires that meet the selection criteria or an empty list if no such wires are
     *         available.
     */
    List<Wire> getWiresByRequirement(Requirement requirement);

    /**
     * Removing a {@link WireTracker} from the {@link WireContainer}. The tracker will not be notified about any more
     * events.
     *
     * @param wireTracker
     *            The {@link WireTracker} that will be removed from the container.
     */
    void removeWireTracker(WireTracker wireTracker);

}
