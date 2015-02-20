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

import org.osgi.framework.ServiceReference;
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
     * Two {@link ServiceCapability}s are the same if they hold the same {@link ServiceReference} instance and
     * {@link Capability#getResource()} function returns the same resource.
     */
    @Override
    boolean equals(Object obj);

    /**
     * Returns the {@link ServiceReference} that is held by this {@link Capability}.
     *
     * @return The {@link ServiceReference} that is held by this {@link Capability}.
     */
    ServiceReference<?> getServiceReference();

    /**
     * Two {@link ServiceCapability}s have the same hashcode if they hold the same {@link ServiceReference} instance and
     * {@link Capability#getResource()} function returns the same resource.
     */
    @Override
    int hashCode();
}
