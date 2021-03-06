/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.containerregistry;

import com.microsoft.azure.management.apigeneration.LangDefinition;

/**
 * Defines an overriding argument that overrides arguments passed in for RegistryDockerTaskStep and RegistryDockerTaskRunRequest.
 */
@LangDefinition
public class OverridingArgument {
    private final String value;
    private final boolean isSecret;

    /**
     * Constructor that defines an OverridingArgument.
     *
     * @param value the value of the overriding argument.
     * @param isSecret whether the overriding argument will be secret.
     */
    public OverridingArgument(String value, boolean isSecret) {
        this.value = value;
        this.isSecret = isSecret;
    }

    /**
     * @return the value of the overriding argument.
     */
    public String value() {
        return this.value;
    }

    /**
     * @return whether the overriding argument is secret or not.
     */
    public boolean isSecret() {
        return this.isSecret;
    }
}
