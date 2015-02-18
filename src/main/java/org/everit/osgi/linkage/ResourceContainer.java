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
