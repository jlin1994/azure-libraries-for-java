/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.implementation;

import com.microsoft.azure.management.batchai.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A REST API operation.
 * Details of a REST API operation.
 */
public class OperationInner {
    /**
     * The operation name.
     * This is of the format {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The object that describes the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * The intended executor of the operation.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private String origin;

    /**
     * Properties of the operation.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get this is of the format {provider}/{resource}/{operation}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the object that describes the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the object that describes the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin value.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

}
