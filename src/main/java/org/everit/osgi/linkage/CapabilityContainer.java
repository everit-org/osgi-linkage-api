package org.everit.osgi.linkage;

import java.util.Collection;

import org.osgi.framework.Filter;
import org.osgi.resource.Capability;
import org.osgi.resource.Resource;

/**
 * Consumers of {@link CapabilityContainer} OSGi services can search capabilities of any kind. E.g.: Bundle capabilities
 * or services.
 * <p>
 * Two containers may return the same capabilities.
 * <p>
 * It can also happen that two different resources provide the same kind of capability. E.g.: A component declares a
 * capability, but a bundle also declared the same ServiceReference. In this case the two {@link Capability}s have the
 * same attributes, directives and namespace, but their {@link Capability#getResource()} function will return different
 * instances. In case multiple {@link Resource}s declare the same capability, one {@link Resource} must contain the
 * other {@link Resource}s, that means other {@link Resource}s must implement {@link EmbeddedResource} interface.
 */
public interface CapabilityContainer {

    /**
     * Finds capabilities in this container.
     *
     * @param namespace
     *            Namespace of the capability.
     * @param filter
     *            An OSGi {@link Filter} that must match the attributes of the capability.
     * @return The available {@link Capability}s that match the filter criteria.
     */
    Collection<Capability> findCapabilities(String namespace, Filter filter);
}
