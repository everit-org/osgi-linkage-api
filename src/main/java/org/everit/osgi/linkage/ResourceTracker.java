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

import org.osgi.resource.Resource;

/**
 * In case a {@link ResourceTracker} is attached to a {@link ResourceContainer}, its functions will be called by the
 * {@link ResourceContainer} implementation to notify about changes in the container.
 */
public interface ResourceTracker {

    /**
     * A {@link Resource} is being added to the tracker.
     *
     * @param resource
     *            The {@link Resource}.
     * @param replay
     *            In case this is a replay event, the {@link Resource} was created before the {@link ResourceTracker}
     *            was registered otherwise the tracker is called synchronously.
     */
    void addingResource(Resource resource, boolean replay);

    /**
     * The {@link Resource} that was already added by calling {@link #addingResource(Resource, boolean)} is modified
     * somehow.
     *
     * @param resource
     *            The {@link Resource} that was modified.
     */
    void modifiedResource(Resource resource);

    /**
     * The {@link Resource} no longer exists in the {@link ResourceContainer}.
     *
     * @param resource
     *            The {@link Resource} that was removed.
     */
    void removedWire(Resource resource);
}
