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

}
