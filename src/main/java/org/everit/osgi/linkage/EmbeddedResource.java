package org.everit.osgi.linkage;

import org.osgi.resource.Resource;

/**
 * A {@link Resource} that is embedded in another {@link Resource}. E.g.: A component, that is implemented within a
 * bundle, will return the BundleRevision as parent resource.
 *
 */
public interface EmbeddedResource extends Resource {

    /**
     * Returns the {@link Resource} that declared this instance.
     *
     * @return the {@link Resource} that declared this instance.
     */
    Resource getDeclaringResource();
}
