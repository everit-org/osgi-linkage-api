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
 * This interface should be registered as OSGi services and provide information about {@link Resource}s that are
 * available. Multiple OSGi services may be registered with this interface.
 */
public interface ResourceContainer {

    /**
     * Get all of the resources that are held by this container.
     *
     * @return an array of resources that are held by this container.
     */
    Resource[] getResources();
}
