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

import org.osgi.resource.Wire;

/**
 * In case a {@link WireTracker} is attached to a {@link WireContainer}, its functions will be called by the
 * {@link WireContainer} implementation to notify about changes.
 */
public interface WireTracker {

    /**
     * A {@link Wire} is being added to the tracker.
     *
     * @param wire
     *            The {@link Wire}.
     * @param replay
     *            In case this is a replay event, the {@link Wire} was created before the {@link WireTracker} was
     *            registered otherwise the tracker is called synchronously.
     */
    void addingWire(Wire wire, boolean replay);

    /**
     * The {@link Wire} that was already added by calling {@link #addingWire(Wire, boolean)} is modified somehow.
     *
     * @param wire
     *            The {@link Wire} that was modified.
     */
    void modifiedWire(Wire wire);

    /**
     * The {@link Wire} no longer exists in the {@link WireContainer}.
     *
     * @param wire
     *            The {@link Wire} that was removed.
     */
    void removedWire(Wire wire);
}
