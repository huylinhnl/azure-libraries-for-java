/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration of the partition key to be used for partitioning data into
 * multiple partitions.
 */
public class ContainerPartitionKey {
    /**
     * List of paths using which data within the container can be partitioned.
     */
    @JsonProperty(value = "paths")
    private List<String> paths;

    /**
     * Indicates the kind of algorithm used for partitioning. Possible values
     * include: 'Hash', 'Range'.
     */
    @JsonProperty(value = "kind")
    private PartitionKind kind;

    /**
     * Get list of paths using which data within the container can be partitioned.
     *
     * @return the paths value
     */
    public List<String> paths() {
        return this.paths;
    }

    /**
     * Set list of paths using which data within the container can be partitioned.
     *
     * @param paths the paths value to set
     * @return the ContainerPartitionKey object itself.
     */
    public ContainerPartitionKey withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    /**
     * Get indicates the kind of algorithm used for partitioning. Possible values include: 'Hash', 'Range'.
     *
     * @return the kind value
     */
    public PartitionKind kind() {
        return this.kind;
    }

    /**
     * Set indicates the kind of algorithm used for partitioning. Possible values include: 'Hash', 'Range'.
     *
     * @param kind the kind value to set
     * @return the ContainerPartitionKey object itself.
     */
    public ContainerPartitionKey withKind(PartitionKind kind) {
        this.kind = kind;
        return this;
    }

}
